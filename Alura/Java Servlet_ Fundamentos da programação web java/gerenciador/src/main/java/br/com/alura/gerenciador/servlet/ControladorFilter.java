package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.acao.Acao;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/entrada")
public class ControladorFilter implements Filter {
	
	
	
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws ServletException, IOException {
		System.out.println("Controlador Filter");
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String paramAcao = request.getParameter("acao");
		
		String nomeDaClasse =  "br.com.alura.gerenciador.acao."+ paramAcao;
		String nome;
		
		try {
			Class classe = Class.forName(nomeDaClasse);
			Acao acao = (Acao) classe.newInstance();
			
			nome = acao.executa(request,response);
		} catch (ClassNotFoundException | IllegalAccessException|InstantiationException  e) {
			throw new ServletException(e);
			
		}
		String[] tipoEEndereco = nome.split(":");
		
		if (tipoEEndereco[0].equals("forward")){
			RequestDispatcher rd =  request.getRequestDispatcher("WEB-INF/view/"+ tipoEEndereco[1]);
			rd.forward(request,response);
		}
		else {
			response.sendRedirect(tipoEEndereco[1]);
		}
		
		
	}
	
}
