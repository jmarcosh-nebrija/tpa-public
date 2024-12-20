package nebrija.tpa.examen.ejercicio2.participante;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona una lista de participantes.
 * Implementa la serialización y deserialización para guardar y cargar la lista de participantes desde un archivo.
 */
public class ListaParticipantes implements Serializable {

    private static final long serialVersionUID = 1L;

    // Lista de participantes.
    private List<Participante> participantes;

    // Ruta del archivo de serialización
    private static final String ARCHIVO_REGISTRO = "ListaParticipantes.dat";

    /**
     * Constructor que inicializa la lista de participantes.
     * Crea una lista vacía de participantes.
     */
    public ListaParticipantes() {
        this.participantes = new ArrayList<>();
    }

    /**
     * Agrega un participante a la lista.
     *
     * @param participante El participante a agregar.
     */
    public void agregarParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    /**
     * Serializa el objeto ListaParticipantes a un archivo para guardar el registro de participantes.
     *
     * @throws IOException Si ocurre un error al escribir en el archivo.
     */
    public void serializar() {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ARCHIVO_REGISTRO))) {
            salida.writeObject(this);
            System.out.println("Registro guardado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Deserializa el archivo de registro y devuelve un objeto ListaParticipantes con los participantes cargados.
     *
     * @return Un objeto ListaParticipantes con los participantes cargados desde el archivo.
     * @throws IOException Si ocurre un error al leer desde el archivo.
     * @throws ClassNotFoundException Si la clase ListaParticipantes no se encuentra durante la deserialización.
     */
    public static ListaParticipantes deserializar() throws IOException, ClassNotFoundException {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ARCHIVO_REGISTRO))) {
            return (ListaParticipantes) entrada.readObject();
        }
    }

    /**
     * Imprime la lista de participantes.
     */
    public void mostrarParticipantes() {
        for (Participante participante : this.participantes) {
            System.out.println(participante.getNombre() + " tiene " + participante.getAcceso() + ".");
        }
    }
}
