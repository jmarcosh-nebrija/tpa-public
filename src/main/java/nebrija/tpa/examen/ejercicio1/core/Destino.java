package nebrija.tpa.examen.ejercicio1.core;

/**
 * Clase abstracta que representa un destino vacacional.
 * Contiene información básica como el nombre y la descripción del destino.
 */
public abstract class Destino {
    private String nombre;
    private String descripcion;

    /**
     * Constructor que inicializa un destino con su nombre y descripción.
     *
     * @param nombre El nombre del destino.
     * @param descripcion La descripción del destino.
     */
    public Destino(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el nombre del destino.
     *
     * @return El nombre del destino.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del destino.
     *
     * @param nombre El nombre del destino.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del destino.
     *
     * @return La descripción del destino.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del destino.
     *
     * @param descripcion La descripción del destino.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}