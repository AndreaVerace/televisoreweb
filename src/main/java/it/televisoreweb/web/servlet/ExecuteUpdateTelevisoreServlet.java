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
 * Servlet implementation class ExecuteUpdateTelevisoreServlet
 */
@WebServlet("/ExecuteUpdateTelevisoreServlet")
public class ExecuteUpdateTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long id = Long.parseLong(request.getParameter("idInput"));
		String marca = request.getParameter("marcaInput");
		String modello = request.getParameter("modelloInput");
		int prezzo = Integer.parseInt(request.getParameter("prezzoInput"));
		int numeroPollici = Integer.parseInt(request.getParameter("numeropolliciInput"));
		String codice = request.getParameter("codiceInput");
		
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		
		Televisore result = null;
		
		try {
			result = televisoreServiceInstance.get(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		result.setMarca(marca);
		result.setModello(modello);
		result.setPrezzo(prezzo);
		result.setNumeroPollici(numeroPollici);
		result.setCodice(codice);
		
		try {
			televisoreServiceInstance.update(result);
			request.setAttribute("ListaTvAttributeName", televisoreServiceInstance.elencoTutti());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
		
	}

}
