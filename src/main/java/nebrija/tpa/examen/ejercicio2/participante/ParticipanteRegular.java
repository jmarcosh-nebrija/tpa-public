package nebrija.tpa.examen.ejercicio2.participante;

/**
 * Clase que representa a un participante regular.
 * Los participantes regulares tienen un acceso limitado a la fiesta.
 */
public class ParticipanteRegular extends Participante {

    /**
     * Constructor de la clase ParticipanteRegular.
     *
     * @param nombre El nombre del participante regular.
     * @param edad La edad del participante regular.
     */
    public ParticipanteRegular(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getAcceso() {
        return "acceso regular";
    }
}

