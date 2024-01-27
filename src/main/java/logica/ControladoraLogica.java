package logica;
import persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public ControladoraLogica() {
    }
    
    public void crearUsuario(int id,  String nombreUsu,String contrasenia, String rol){
        Usuario usu = new Usuario(id,nombreUsu,contrasenia,rol);
        controlPersis.crearUsuario(usu);
    }
}

