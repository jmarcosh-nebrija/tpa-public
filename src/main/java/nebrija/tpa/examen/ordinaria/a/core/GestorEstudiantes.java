package nebrija.tpa.examen.ordinaria.a.core;

import java.util.ArrayList;
import java.util.List;

public class GestorEstudiantes {

    private ArrayList<Estudiante> listaEstudiantes;

    public GestorEstudiantes() {
        listaEstudiantes = new ArrayList<>();
    }

    public Estudiante buscarEstudiante(String matricula) throws AppException {
        Estudiante returnEstudiante = null;
        if (matricula != null) {
            for (Estudiante estudiante : listaEstudiantes) {
                if (estudiante.getNumeroMatricula().equals(matricula)) {
                    returnEstudiante = estudiante;
                }
            }
        }
        if (returnEstudiante == null) {
            throw new AppException("Estudiante no encontrado");
        } else {
            return returnEstudiante;
        }
    }

    /**
     * Calcula
     * @return 0 si no hay estudiantes o su media de edad si hay estudiantes.
     */
    public double calcularEdadMedia() {
        int sumaEdades = 0;
        for (Estudiante estudiante : listaEstudiantes) {
            sumaEdades += estudiante.getEdad();
        }
        if (listaEstudiantes.isEmpty()) {
            return 0;
        }
        return sumaEdades / listaEstudiantes.size();
    }

    public List<Estudiante> getEstudiantes() {
        return listaEstudiantes;
    }

    public void addEstudiante(Estudiante estudiante) {
        this.listaEstudiantes.add(estudiante);
    }
}
