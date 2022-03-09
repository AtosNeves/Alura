package br.com.alura.gerenciador.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.LogRecord;

@WebFilter(urlPatterns = "/entrada")
public class MonitoramentoFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		 throws IOException, ServletException {
		
		long antes = System.currentTimeMillis();
		String acao = request.getParameter("acao");
		//executa a acao
		chain.doFilter(request,response);
		
		
		
		long depois = System.currentTimeMillis();
		System.out.println("Tempo de execução :" + acao + " -> " +(depois - antes));
		
		
	}
	
}
