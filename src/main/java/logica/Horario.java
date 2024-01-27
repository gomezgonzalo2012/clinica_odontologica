
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id_horario;
    private String hoea_inicio;
    private String hora_fin;

    public Horario() {
    }

    public Horario(String id_horario, String hoea_inicio, String hora_fin) {
        this.id_horario = id_horario;
        this.hoea_inicio = hoea_inicio;
        this.hora_fin = hora_fin;
    }

    public String getId_horario() {
        return id_horario;
    }

    public void setId_horario(String id_horario) {
        this.id_horario = id_horario;
    }

    public String getHoea_inicio() {
        return hoea_inicio;
    }

    public void setHoea_inicio(String hoea_inicio) {
        this.hoea_inicio = hoea_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }
    
    
    
}
