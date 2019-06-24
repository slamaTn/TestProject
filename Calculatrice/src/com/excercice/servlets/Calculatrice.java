package com.excercice.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.excercice.beans.Calculateur;


/**
 * Servlet implementation class Calculatrice
 */
@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final List<String> operandes = Arrays.asList("+","-","*","/") ;


	public Calculatrice() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/calcul.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operande1 = (String)request.getParameter("operande1");
		String operande2 = (String)request.getParameter("operande2");
		String operateur = (String)request.getParameter("operateur");
		String result = "";

		if(!isNullOrEmpty(operande1) & !isNullOrEmpty(operande2) & !isNullOrEmpty(operateur) ) {
			Calculateur calculateur = new Calculateur();
			calculateur.setOperande1(operande1);
			calculateur.setOperande2(operande2);
			int index = Integer.parseInt(operateur);
			calculateur.setOperation(index);
			result = operande1+" "+operandes.get(index)+" "+operande2+" = "+calculateur.calcul() ;
		}

		request.setAttribute("resultat", result);
		this.getServletContext().getRequestDispatcher("/WEB-INF/calcul.jsp").forward(request, response);
	}

	public static boolean isNullOrEmpty(String str) {
		if(str != null && !str.isEmpty())
			return false;
		return true;
	}

}
