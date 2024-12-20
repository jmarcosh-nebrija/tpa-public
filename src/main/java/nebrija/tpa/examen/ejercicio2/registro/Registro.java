package nebrija.tpa.examen.ejercicio2.registro;

import examen.ejercicio2.participante.ListaParticipantes;
import examen.ejercicio2.participante.Participante;

import java.io.IOException;

/**
 * Clase Singleton que gestiona el registro de participantes.
 * Implementa la serialización para guardar y cargar los participantes registrados.
 */
public class Registro {

    // Instancia de la clase para el singleton
    private static volatile Registro instance = null;

    // Lista de participantes
    private ListaParticipantes listaParticipantes;

    /**
     * Constructor privado para implementar el patrón Singleton.
     */
    private Registro() {
        this.listaParticipantes = new ListaParticipantes();
    }

    /**
     * Obtiene la instancia única de la clase Registro.
     *
     * @return La instancia de Registro.
     */
    public static Registro getInstancia() {
        if (instance == null) {
            synchronized (Registro.class) {
                // Double check
                if (instance == null) {
                    instance = new Registro();
                }
            }
        }
        return instance;
    }

    /**
     * Agrega un participante al registro.
     *
     * @param participante El participante a agregar al registro.
     */
    public void agregarParticipante(Participante participante) {
        this.listaParticipantes.agregarParticipante(participante);
    }

    /**
     * Guarda el registro de participantes en un archivo mediante serialización.
     */
    public void guardarRegistro() {
        this.listaParticipantes.serializar();
    }

    /**
     * Carga el registro de participantes desde un archivo mediante deserialización.
     *
     * @throws IOException Si ocurre un error de entrada/salida durante la deserialización.
     * @throws ClassNotFoundException Si no se encuentra la clase del objeto serializado.
     */
    public void cargarRegistro() throws IOException, ClassNotFoundException {
        this.listaParticipantes = ListaParticipantes.deserializar();
        System.out.println("Registro cargado correctamente.");
    }

    /**
     * Muestra los participantes registrados y su tipo de acceso.
     */
    public void mostrarParticipantes() {
        this.listaParticipantes.mostrarParticipantes();

    }
}
