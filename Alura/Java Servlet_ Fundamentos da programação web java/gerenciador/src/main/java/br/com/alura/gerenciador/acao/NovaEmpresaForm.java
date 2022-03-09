package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NovaEmpresaForm implements Acao{
	public String executa (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		return "forward:formNovaEmpresa.jsp";
		
	}
}

