
package logica;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona {
//    private int id_odontologo;
    private String especialidad;
    @OneToMany(mappedBy="odonto") // variable "odonto" relacionada en turnos
    private List <Turno> listaTurnos; // relacion bidireccional: 1-N
    @OneToOne
    private Horario unHorario; // relacion 1-1
    @OneToOne
    private Usuario unUsuario; // relacion 1-1

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> listaTurnos, Horario unHorario, Usuario unUsuario, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecah_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecah_nac);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.unHorario = unHorario;
        this.unUsuario = unUsuario;
    }

   
    

//    public int getId_odontologo() {
//        return id_odontologo;
//    }
//
//    public void setId_odontologo(int id_odontologo) {
//        this.id_odontologo = id_odontologo;
//    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }
    
    
}
