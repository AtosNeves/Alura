package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Banco {
	private static Integer chaveSequencial =0;
	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		
		
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		
		lista.add(empresa);
		lista.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("atos");
		u1.setSenha("12345");
		Usuario u2 = new Usuario();
		u2.setLogin("nico");
		u2.setSenha("12345");
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
	}
	
	public void adciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()){
			
			Empresa emp = it.next();
			if (emp.getId()==id){
				it.remove();
			}
		}
		
		
	}
	
	public Empresa buscaEmpresaPelaId(Integer id) {
		for (Empresa empresa: lista) {
			if (Objects.equals(empresa.getId(), id)){
				return empresa;
			}
		}
		return null;
	}
	
	public Usuario existeUsuario(String login, String senha) {
		
		for (Usuario usuario: listaUsuarios) {
			if (usuario.ehIgual(login,senha)){
				return usuario;
			}}
		return null;
	}
	

}
