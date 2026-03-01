/**
 * Estrategia: Interfaz común para la familia de algoritmos (Poderes).
 */
public interface EstrategiaPoder {
    public void ocupa();
    public void aplicarPoder(Personaje p); // Inyecta los stats al personaje
}