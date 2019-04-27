package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Usuario;
import manager.ManagerBean;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public Controller() {}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario u = new Usuario();
		
		try {
			u.setEmail(request.getParameter("email")); // parametro exatamente igual ao 'name' do determinado input
			u.setSenha(request.getParameter("senha"));
			
			Usuario resposta = ManagerBean.validarLoginSenha(u);
			//response.getWriter().print(resposta);;
			
			request.setAttribute("usuario", resposta);
			request.getRequestDispatcher("detail.jsp").forward(request,response);// setar para outra página)
			
		} catch(Exception ex) {
			//response.getWriter().print("Error : " + ex.getMessage());
			request.setAttribute("msg", ex.getMessage());
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}
}
