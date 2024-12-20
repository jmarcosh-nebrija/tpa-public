package nebrija.tpa.examen.ejercicio2.participante;


/**
 * Clase que representa a un participante VIP.
 * Los participantes VIP tienen acceso preferente a la fiesta.
 */
public class ParticipanteVIP extends Participante {

    /**
     * Constructor de la clase ParticipanteVIP.
     *
     * @param nombre El nombre del participante VIP.
     * @param edad La edad del participante VIP.
     */
    public ParticipanteVIP(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getAcceso() {
        return "acceso VIP";
    }
}