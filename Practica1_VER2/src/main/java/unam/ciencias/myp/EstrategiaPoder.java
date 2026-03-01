/**
 * Estrategia: Interfaz común para la familia de algoritmos (Poderes).
 */
public interface EstrategiaPoder {
    void ocupa();
    void aplicarPoder(Personaje p); // Inyecta los stats al personaje
}