package nebrija.tpa.examen.ejercicio2.participante;

import java.io.Serializable;

/**
 * Clase abstracta que representa a un participante en la fiesta.
 * Define los atributos comunes y los métodos para acceder a los datos del participante.
 */
public abstract class Participante implements Serializable {
    private String nombre;
    private int edad;

    /**
     * Constructor de la clase Participante.
     *
     * @param nombre El nombre del participante.
     * @param edad La edad del participante.
     */
    public Participante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre del participante.
     *
     * @return El nombre del participante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la edad del participante.
     *
     * @return La edad del participante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo abstracto para obtener el tipo de acceso del participante.
     *
     * @return El tipo de acceso del participante.
     */
    public abstract String getAcceso();
}
