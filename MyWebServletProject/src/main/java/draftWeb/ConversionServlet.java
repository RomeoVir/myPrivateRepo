package draftWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ConversionServlet")
public class ConversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String tipoSorgente = (request.getParameter("daGradi"));
		String tipoDestinazione = (request.getParameter("aGradi"));		
		String temperatura = (request.getParameter("valore"));
		double tempDouble = Double.parseDouble(temperatura);
		double risultato = 0;
		
		if(tipoSorgente.equals("celsius")){
			if (tipoDestinazione.equals("kelvin")){
				risultato = tempDouble * 2;
				
			}
		}
		System.out.println("La temperatura è di " + risultato);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.println("La temperatura è di " + risultato);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
