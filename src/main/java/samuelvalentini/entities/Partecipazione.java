package samuelvalentini.entities;


import jakarta.persistence.*;
import samuelvalentini.enumeration.StatoPartecipazione;

import java.util.UUID;

@Entity
@Table(name = "partecipazioni")

public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_partecipazione")
    private UUID idPartecipazione;
    @Column(name = "id_persona", nullable = false, unique = true)
    private UUID idPersona;
    @Column(name = "id_evento", nullable = false, unique = true)
    private UUID idEvento;
    @Column(name = "stato_partecipazione", length = 30, nullable = false)
    @Enumerated(EnumType.STRING)
    private StatoPartecipazione statoPartecipazione;

    public Partecipazione(UUID idPersona, UUID idEvento, StatoPartecipazione statoPartecipazione) {
        this.idPersona = idPersona;
        this.idEvento = idEvento;
        this.statoPartecipazione = statoPartecipazione;
    }

    protected Partecipazione() {
    }

    public UUID getIdPartecipazione() {
        return idPartecipazione;
    }

    public UUID getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(UUID idPersona) {
        this.idPersona = idPersona;
    }

    public UUID getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(UUID idEvento) {
        this.idEvento = idEvento;
    }

    public StatoPartecipazione getStatoPartecipazione() {
        return statoPartecipazione;
    }

    public void setStatoPartecipazione(StatoPartecipazione statoPartecipazione) {
        this.statoPartecipazione = statoPartecipazione;
    }
}
