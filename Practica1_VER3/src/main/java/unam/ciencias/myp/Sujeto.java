/**
 * Interfaz para registrar y remover observadores (Patrón Observer).
 */
public interface Sujeto {
    void registrar(Observador obs);
    void remover(Observador obs);
    void notificar();
}