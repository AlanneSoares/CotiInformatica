package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Aluno;
import entity.Disciplina;

/**
 * Servlet implementation class ControllerAluno
 */
@WebServlet("/ControllerAluno")
public class ControllerAluno extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public ControllerAluno() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*doGet(request, response);*/
		
		Aluno a = new Aluno();
		a.setNome(request.getParameter("nome"));
		a.setEmail(request.getParameter("email"));
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina(request.getParameter("disciplinaa"));
		disciplina1.setNota1(new Double(request.getParameter("nota1a")));
		disciplina1.setNota2(new Double(request.getParameter("nota2b")));
		disciplina1.gerarMedia().gerarSitucao();
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina(request.getParameter("disciplinab"));
		disciplina2.setNota1(new Double(request.getParameter("nota1b")));
		disciplina2.setNota2(new Double(request.getParameter("nota2b")));
		disciplina2.gerarMedia().gerarSitucao();
		
		a.adicionar(disciplina1);
		a.adicionar(disciplina2);
		
		request.setAttribute("resposta", a.toString());
		request.getRequestDispatcher("aluno.jsp").forward(request, response); // foward método para 
	}
}
