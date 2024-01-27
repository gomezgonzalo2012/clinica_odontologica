
package logica;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona {
//    private int id_paciente;
    private boolean tiene_OS; // tiene obra social?
    private String tipoSanguineo;
    @OneToOne
    private Responsable unResponsable; // relacion 1-1
    @OneToMany(mappedBy="pacien")
    private List<Turno> listaTurnos; // relacion 1-N

    public Paciente() {
    }

    public Paciente(boolean tiene_OS, String tipoSanguineo, Responsable unResponsable, List<Turno> listaTurnos, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecah_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecah_nac);
        this.tiene_OS = tiene_OS;
        this.tipoSanguineo = tipoSanguineo;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }

    

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable resp) {
        this.unResponsable = resp;
  }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
    

    /*public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }*/

    public boolean isTiene_OS() {
        return tiene_OS;
    }

    public void setTiene_OS(boolean tiene_OS) {
        this.tiene_OS = tiene_OS;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    
    
    
}
