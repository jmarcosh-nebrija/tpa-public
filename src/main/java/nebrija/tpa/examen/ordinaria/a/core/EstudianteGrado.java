package nebrija.tpa.examen.ordinaria.a.core;

/**
 * Clase que representa a un estudiante de grado.
 */
public class EstudianteGrado extends Estudiante {
    private String carrera;

    /**
     * Constructor para la clase Estudiante Grado
     *
     * @param nombre el nombre del estudiante
     * @param edad la edad del estudiante
     * @param numeroMatricula el numero de matricula del estudiante
     * @param carrera la carrera del estudiante
     */
    public EstudianteGrado(String nombre, int edad, String numeroMatricula, String carrera) {
        super(nombre, edad, numeroMatricula);
        this.carrera = carrera;
    }

    /**
     * Método para obtener la información del estudiante.
     *
     * @return Información del estudiante en formato String.
     */
    @Override
    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Matrícula: " + numeroMatricula + ", Carrera: " + carrera;
    }
}