package it.televisoreweb.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.televisoreweb.model.Televisore;
import it.televisoreweb.service.MyServiceFactory;
import it.televisoreweb.service.TelevisoreService;



@WebServlet("/PrepareDeleteTelevisoreServlet")
public class PrepareDeleteTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idDeltelevisoreCheVoglioEliminare = request.getParameter("idDaPassareComeParametro");
		
		TelevisoreService televisoreServiceInstance = (TelevisoreService) MyServiceFactory.getTelevisoreServiceInstance();
		
		Televisore  result = null;
		
		try {
			result = televisoreServiceInstance.get(Long.parseLong(idDeltelevisoreCheVoglioEliminare));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.setAttribute("tvDaEliminare", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
		rd.forward(request, response);
	}

	

}
