<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>


<form action="${linkEntradaServlet}" method="post">
    Login: <input type="text" name="login" />
    Senha: <input type="password" name="senha" />
    <br>


    <input type="hidden" name="acao" value="Login">
    <input type="submit">
</form>

</body>
</html>