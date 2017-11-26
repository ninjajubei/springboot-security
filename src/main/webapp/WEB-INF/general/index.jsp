<!DOCTYPE html>
<html>
    <body>	
        <h1>Bienvenido a la Tienda de Comercio Electrónico</h1>
        <h2>${mensaje}</h2>	
        <h4><a href="<%=request.getContextPath()%>/ventas/index">Vendedor</a></h4>
        <h4><a href="<%=request.getContextPath()%>/admin/index">Administrador</a></h4>


        <hr/>
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <h3><a href="<%=request.getContextPath()%>/logout">Cerrar sesión</a></h3>  
    </c:if>
</body>
</html>
