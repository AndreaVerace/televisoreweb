package it.televisoreweb.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.televisoreweb.service.MyServiceFactory;



@WebServlet("/ExecuteSearchTelevisoreServlet")
public class ExecuteSearchTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String marcaDaPagina = request.getParameter("marcaInput");
		String modelloDaPagina = request.getParameter("modelloInput");
		
		request.setAttribute("ListaTvAttributeName", MyServiceFactory.getTelevisoreServiceInstance().cercaPerMarcaEModello(marcaDaPagina, modelloDaPagina));
		
		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
	}

}
