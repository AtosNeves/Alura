package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/empresas")
public class EmpresaService extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		List<Empresa> empresas =  new Banco().getEmpresas();
		
		
		Gson gson = new Gson();
		String json = gson.toJson(empresas);

		response.setContentType("application/json");

		response.getWriter().print(json);

	}

}


