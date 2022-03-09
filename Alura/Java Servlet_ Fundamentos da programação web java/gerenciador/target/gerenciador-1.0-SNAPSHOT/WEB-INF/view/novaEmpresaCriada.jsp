<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html>

<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<c:import url="logout-parcial.jsp"></c:import>

<c:if test="${not empty empresa}">
  Empresa  ${ empresa }  criada com sucesso!


</c:if>
<c:if test="${empty empresa}">
  Nenhuma empresa cadastrada!


</c:if>
</body>
</html>
