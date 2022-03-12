package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.acao.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String paramAcao = req.getParameter("acao");
		
//		HttpSession sessao = req.getSession();
//		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado")==null);
//		boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login")||paramAcao.equals("LoginForm"));
//
//		if(ehUmaAcaoProtegida && usuarioNaoEstaLogado){
//			resp.sendRedirect( "entrada?acao=LoginForm");
//			return;
//		}
		
		
		
		String nomeDaClasse =  "br.com.alura.gerenciador.acao."+ paramAcao;
		String nome;
		
		try {
			Class classe = Class.forName(nomeDaClasse);
			Acao acao = (Acao) classe.newInstance();
			
			 nome = acao.executa(req,resp);
		} catch (ClassNotFoundException | IllegalAccessException|InstantiationException  e) {
			throw new ServletException(e);
			
		}
		String[] tipoEEndereco = nome.split(":");
		
		if (tipoEEndereco[0].equals("forward")){
			RequestDispatcher rd =  req.getRequestDispatcher("WEB-INF/view/"+ tipoEEndereco[1]);
			rd.forward(req,resp);
		}
		else {
			resp.sendRedirect(tipoEEndereco[1]);
		}
		
		
	}
}

//
//		String nome = null;
//		if (paramAcao.equals("ListaEmpresas")){
//
//			ListaEmpresas acao = new ListaEmpresas();
//			  nome = acao.executa(req, resp);
//
//		}
//		else if (paramAcao.equals("RemoveEmpresa")){
//
//
//			RemoveEmpresa acao = new RemoveEmpresa();
//			nome = acao.executa(req, resp);
//
//		}
//		else if (paramAcao.equals("MostraEmpresa")){
//
//			MostraEmpresa acao = new MostraEmpresa();
//			nome = acao.executa(req, resp);
//		}else if (paramAcao.equals("AlteraEmpresa")){
//
//			AlteraEmpresa acao = new AlteraEmpresa();
//			nome = acao.executa(req, resp);
//		}
//
//		else if (paramAcao.equals("NovaEmpresa")){
//
//			NovaEmpresa acao = new NovaEmpresa();
//			 nome =  acao.executa(req, resp);
//		}
//		else if (paramAcao.equals("NovaEmpresaForm")){
//
//			NovaEmpresaForm acao = new NovaEmpresaForm();
//			nome =  acao.executa(req, resp);
//		}
		

