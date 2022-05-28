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

/**
 * Servlet implementation class ExecuteShowTelevisoreServlet
 */
@WebServlet("/ExecuteShowTelevisoreServlet")
public class ExecuteShowTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		long idDaRecuperare = Long.parseLong(request.getParameter("idDaPassareComeParametro"));
		
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		
		Televisore result = null;
		
		try {
			result = televisoreServiceInstance.get(idDaRecuperare);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("tvDettaglio", result);
		RequestDispatcher rd = request.getRequestDispatcher("dettaglio.jsp");
		rd.forward(request, response);
		
	}

	

}
