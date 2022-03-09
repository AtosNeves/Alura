package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MostraEmpresa implements Acao{
	
	public String executa(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
		
		System.out.println("Mostrando dados da empresa");
		
		
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPelaId(id);
		System.out.println(empresa.getNome());
		
		req.setAttribute("empresa",empresa);
		RequestDispatcher rd = req.getRequestDispatcher("/formAlteraEmpresa.jsp");
		
		return "forward:formAlteraEmpresa.jsp";
		
		
		
		
		
		
	}
	
	
}
