package br.edu.ifpr.servelet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet ("/app")

public class Aplicacao {

	
		protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			ArrayList<Livros> livro = new ArrayList<Livros>();
			
			Livros livro1 = new Livros();
			livro1.setTitulo("A Abadia de Northager");
			livro1.setAno(1818);
			livro1.setAutor("Jane Austen");
			
			Livros livro2 = new Livros();
			livro2.setTitulo("Homo Deus");
			livro2.setAno(2015);
			livro2.setAutor("Yuval Harari");
			
			Livros livro3 = new Livros() ;
			livro3.setTitulo("Sapiens: uma breve história da humanidade");
			livro3.setAno(2011);
			livro3.setAutor("Yuval Harari"); 
			
			Livros livro4 = new Livros() ;
			livro4.setTitulo("O Morro dos Ventos Uivantes");
			livro4.setAno(1847);
			livro4.setAutor("Emily Bronte"); 
			
			livro.add(livro1);
			livro.add(livro2);
			livro.add(livro3);
			livro.add(livro4);
			
			req.setAttribute("livro", livro);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("lista.jsp");
			dispatcher.forward(req, resp);
		}

	}