package nebrija.tpa.examen.ejercicio1.core;

/**
 * Clase que representa un destino vacacional de tipo ciudad.
 * Extiende la clase abstracta {@link Destino} y proporciona una implementación
 * específica para los destinos que son ciudades.
 */
public class DestinoCiudad extends Destino {

    /**
     * Constructor que inicializa un destino de tipo ciudad con su nombre y descripción.
     *
     * @param nombre El nombre de la ciudad.
     * @param descripcion La descripción del destino de tipo ciudad.
     */
    public DestinoCiudad(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

}