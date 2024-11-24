package uniandes.edu.co.parranderos.modelo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "sirven")
public class Sirven {

    @EmbeddedId
    private SirvenPK pk;

    public Sirven() {
        ;
    }

    public Sirven(Bar id_bar, Bebida id_bebida, String horario) {
        super();
        this.pk = new SirvenPK(id_bar, id_bebida, horario);
    }

    public SirvenPK getPk() {
        return pk;
    }

    public void setPk(SirvenPK pk) {
        this.pk = pk;
    }
}
