package nebrija.tpa.examen.ordinaria.a.core;

/**
 * Clase base para estudiantes
 */
public abstract class Estudiante {
    protected String nombre;
    protected int edad;
    protected String numeroMatricula;

    /**
     * Constructor base para la clase Estudiante.
     *
     * @param nombre el nombre del estudiante
     * @param edad la edad del estudiante
     * @param numeroMatricula el numero de matricula del estudiante
     */
    public Estudiante(String nombre, int edad, String numeroMatricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMatricula = numeroMatricula;
    }

    /**
     * Getter para el numero de matricula del estudiante.
     *
     * @return el numero de matricula
     */
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    /**
     * Getter para la edad del estudiante.
     *
     * @return la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método abstracto para obtener la información del estudiante.
     *
     * @return Información del estudiante en formato String.
     */
    public abstract String obtenerInformacion();
}