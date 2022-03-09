<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/alteraEmpresa" var="linkServletNovaEmpresa" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>


<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Title</title>
</head>
<body>


<form action="${linkServletNovaEmpresa}" method="post">
	Nome: <input type="text" name="nome" value="${empresa.nome}"/>
	<br>

	Data Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>"/>
	<input type="hidden" name="id" value="${empresa.id}"/>
	<input type="submit" />
</form>

</body>
</html>