import java.util.ArrayList;
import java.util.List;

/**
 * Sujeto Concreto (Patrón Observer). Mantiene el estado y notifica.
 */
public class Combate implements Sujeto {
    private List<Observador> observadores;
    private String estadoSujeto;

    public Combate() {
        observadores = new ArrayList<>();
    }

    @Override
    public void registrar(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void remover(Observador obs) {
        observadores.remove(obs);
    }

    @Override
    public void notificar() {
        for (Observador obs : observadores) {
            obs.actualizar();
        }
    }

    // Cambia el estado y automáticamente notifica a los observadores
    public void setEstado(String nuevoEstado) {
        this.estadoSujeto = nuevoEstado;
        System.out.println(nuevoEstado); // Para verlo en la terminal
        notificar();
    }

    public String getEstado() {
        return estadoSujeto;
    }

    // Lógica interna para que peleen usando sus stats de la Estrategia
    public void procesarAtaque(Personaje atacante, Personaje victima) {
        if (atacante.getVida() <= 0 || victima.getVida() <= 0) return;

        int dano = atacante.getAtaque() - victima.getDefensa();
        if (dano <= 0) dano = 5; // Daño mínimo para que la pelea avance
        
        victima.setVida(victima.getVida() - dano);
        setEstado("> " + atacante.getNombre() + " ataca a " + victima.getNombre() + " causando " + dano + " de daño. (HP " + victima.getNombre() + ": " + victima.getVida() + ")");
    }
}