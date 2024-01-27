<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>
<div class="container-fluid">
    <h3>Alta Usuarios</h3>
    <form class="user" action="SvUsuario" method="POST">
        <div class="form-group col  ">
            <div class="col-sm-6 mb-3  ">
                <input type="text" class="form-control form-control-user" id="nombreusu" name="nombreusu"
                       placeholder="Nombre de usuario">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                       placeholder="Contraseña">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="rol" name="rol"
                       placeholder="Rol">
            </div>
            
        </div>
        
        <button class="btn btn-primary btn-user btn-block" type="submit">
            Crear Usuario
        </button> 
       
    </form>
    <hr>
</div>
<%@include file="components/bodyfinal.jsp" %>