package nebrija.tpa.examen.ordinaria.a.core;

/**
 * Clase que representa a un estudiante de posgrado.
 */
public class EstudiantePosgrado extends Estudiante {
    private String lineaInvestigacion;

    /**
     * Constructor para la clase Estudiante Grado
     *
     * @param nombre el nombre del estudiante
     * @param edad la edad del estudiante
     * @param numeroMatricula el numero de matricula del estudiante
     * @param lineaInvestigacion la lineaInvestigacion del estudiante
     */
    public EstudiantePosgrado(String nombre, int edad, String numeroMatricula, String lineaInvestigacion) {
        super(nombre, edad, numeroMatricula);
        this.lineaInvestigacion = lineaInvestigacion;
    }

    /**
     * Método para obtener la información del estudiante.
     *
     * @return Información del estudiante en formato String.
     */
    @Override
    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Matrícula: " + numeroMatricula + ", Línea de Investigación: " + lineaInvestigacion;
    }
}
