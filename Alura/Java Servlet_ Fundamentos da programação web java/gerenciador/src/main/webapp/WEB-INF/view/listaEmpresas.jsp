<%@ page import="java.util.List" %>
<%@ page import="br.com.alura.gerenciador.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<%--

  Created by IntelliJ IDEA.
  User: atos
  Date: 19/02/2022
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Java Standard Taglib</title>
</head>
<body>
<c:import url="logout-parcial.jsp"></c:import>
Usuario Logado: ${usuarioLogado.login}<br><br>



Lista de empresas<br />

<ul>
	<c:forEach items="${empresas}" var="empresa" >

		<li>${empresa.nome} <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/> </li>
		<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">Edita   </a>

		<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">Remove</a>

	</c:forEach>
</ul>



</body>
</html>
