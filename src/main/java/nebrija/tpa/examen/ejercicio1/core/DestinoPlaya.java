package nebrija.tpa.examen.ejercicio1.core;

/**
 * Clase que representa un destino vacacional de tipo playa.
 * Extiende la clase abstracta {@link Destino} y proporciona una implementación
 * específica para los destinos que son playas.
 */
public class DestinoPlaya extends Destino {

    /**
     * Constructor que inicializa un destino de tipo playa con su nombre y descripción.
     *
     * @param nombre El nombre de la playa.
     * @param descripcion La descripción del destino de tipo playa.
     */
    public DestinoPlaya(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

}