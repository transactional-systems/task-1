package uniandes.edu.co.parranderos.modelo;
import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class SirvenPK implements Serializable {
 
    @ManyToOne
    @JoinColumn(name = "id_bar", referencedColumnName = "id")
    private Bar id_bar;

    @ManyToOne
    @JoinColumn(name = "id_bebida", referencedColumnName = "id")
    private Bebida id_bebida;

    private String horario;

    public SirvenPK()
    {
        super();
    }

    public SirvenPK(Bar id_bar, Bebida id_bebida, String horario)
    {
        super();
        this.id_bar = id_bar;
        this.id_bebida = id_bebida;
        this.horario = horario;
    }

    public Bar getId_bar() {
        return id_bar;
    }

    public Bebida getId_bebida() {
        return id_bebida;
    }

    public String getHorario() {
        return horario;
    }

    public void setId_bar(Bar id_bar) {
        this.id_bar = id_bar;
    }

    public void setId_bebida(Bebida id_bebida) {
        this.id_bebida = id_bebida;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }


}
