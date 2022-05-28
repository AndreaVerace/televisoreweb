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
 * Servlet implementation class ExecuteInsertTelevisoreServlet
 */
@WebServlet("/ExecuteInsertTelevisoreServlet")
public class ExecuteInsertTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String marca = request.getParameter("marcaInput");
		String modello = request.getParameter("modelloInput");
		int prezzo = Integer.parseInt(request.getParameter("prezzoInput"));
		int numeroPollici = Integer.parseInt(request.getParameter("numeropolliciInput"));
		String codice = request.getParameter("coidceInput");
		
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		
		Televisore result = new Televisore(marca,modello,prezzo,numeroPollici,codice);
		
		try {
			televisoreServiceInstance.inserisciNuovo(result);
			request.setAttribute("ListaTvAttributeName", televisoreServiceInstance.elencoTutti());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
		
	}

}
