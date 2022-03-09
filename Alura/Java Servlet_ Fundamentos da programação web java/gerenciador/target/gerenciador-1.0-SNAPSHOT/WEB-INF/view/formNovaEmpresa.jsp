<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<c:import url="logout-parcial.jsp"></c:import>


<form action="${linkEntradaServlet}" method="post">
    Nome: <input type="text" name="nome" />
    <br>

    Data Abertura: <input type="text" name="data" />
    <input type="hidden" name="acao" value="NovaEmpresa">
    <input type="submit">
</form>

</body>
</html>