package com.octest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.thp.project.vintud.dao.controller.DAOfactory;


public class SignInController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SignInController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        this.getServletContext().getRequestDispatcher("/WEB-INF/signIn.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        String email = request.getParameter("email");
        String password = request.getParameter("password");       
        DAOfactory factory = new DAOfactory();        
		boolean resultat= DAOfactory.getUtilisateurDAO().connecter(email,passe);

        request.setAttribute("resultat",resultat );



        this.getServletContext().getRequestDispatcher("/WEB-INF/sigIn.jsp").forward(request,response);     

	}

}
