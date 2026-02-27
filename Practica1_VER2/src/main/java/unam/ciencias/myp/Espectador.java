import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Observador Concreto (Patrón Observer). Tiene referencia al Sujeto Concreto.
 */
public class Espectador implements Observador {
    private String id;
    private String personajeFavorito;
    private Combate sujeto; // Referencia al Sujeto Concreto
    private List<String> bitacora;
    private String estadoObservador;

    public Espectador(String id, String personajeFavorito, Combate sujeto) {
        this.id = id;
        this.personajeFavorito = personajeFavorito;
        this.sujeto = sujeto;
        this.bitacora = new ArrayList<>();
        this.sujeto.registrar(this); // Se auto-registra
    }

    @Override
    public void actualizar() {
        // Consistencia con el estado del sujeto
        this.estadoObservador = sujeto.getEstado();
        bitacora.add(estadoObservador);
    }

    public void generarArchivo(String ganador) {
        String nombreArchivo = "bitacora_" + id + ".txt";
        try (PrintWriter out = new PrintWriter(new FileWriter(nombreArchivo))) {
            out.println("=== BITÁCORA DE COMBATE ===");
            out.println("Espectador ID: " + id);
            out.println("Apoyando a: " + personajeFavorito);
            out.println("-------------------------------------------------");
            for (String evento : bitacora) {
                out.println(evento);
            }
            out.println("-------------------------------------------------");
            if (personajeFavorito.equals(ganador)) {
                out.println("MENSAJE: ¡Genial! Tu personaje " + personajeFavorito + " ha GANADO.");
            } else {
                out.println("MENSAJE: Lástima, " + personajeFavorito + " fue derrotado. El ganador fue " + ganador + ".");
            }
        } catch (IOException e) {
            System.err.println("Error al escribir " + nombreArchivo);
        }
    }
}