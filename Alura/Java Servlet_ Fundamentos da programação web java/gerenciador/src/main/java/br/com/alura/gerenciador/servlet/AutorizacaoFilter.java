package br.com.alura.gerenciador.servlet;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/entrada")
public class AutorizacaoFilter implements Filter {
	
	
	
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws ServletException, IOException {
		
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		String paramAcao = request.getParameter("acao");
		
		HttpSession sessao = request.getSession();
		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado")==null);
		boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login")||paramAcao.equals("LoginForm"));
		
		if(ehUmaAcaoProtegida && usuarioNaoEstaLogado){
			response.sendRedirect( "entrada?acao=LoginForm");
			return;
		}
		
		chain.doFilter(request, response);
	}
	
}
