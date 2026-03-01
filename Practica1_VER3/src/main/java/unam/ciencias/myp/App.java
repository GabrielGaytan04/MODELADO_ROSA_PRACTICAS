import java.util.Random;

/**
 * Clase encargada de ejecutar la logica principal del programa.
 **/
public class App{

	/**
	 * METODO MAIN: Encargado de ejecutar el codigo.
	 **/
	public static void main(String[] args) {

		/**
	 	 * SALTO DE LINEA  
		 **/
		System.out.println("\n-------------------------------------------------------------------"+
				    "\n-------- INICIANDO SIMULACIÓN DE LA ROSA ---------------------------" +
                    "\n--------------------------------------------------------------------");
		
		// Configurar Sujeto (Combate) y Observadores (4 Espectadores)
        Combate arena = new Combate();
        Espectador e1 = new Espectador("espectador123", "Korby", arena);
        Espectador e2 = new Espectador("fanBoy_99", "MeganMan", arena);
        Espectador e3 = new Espectador("master_poke", "Dittu", arena);
        Espectador e4 = new Espectador("invitado001", "Korby", arena);

		// Configurar Personajes (Contextos)
        Korby korby = new Korby(100, 10, 10);
        MeganMan megan = new MeganMan(100, 10, 10);
        Dittu dittu = new Dittu(100, 10, 10);

		// Seleccionar Caso de Prueba al Azar
        Random rand = new Random();
        int caso = rand.nextInt(3) + 1;
        arena.setEstado("+++ CARGANDO CASO DE PRUEBA #" + caso + " +++");

		String ganador = "";

		// Lógica de los 3 combates
        if (caso == 1) {
            arena.setEstado("Korby obtiene una espada.");
            korby.consigueObjeto(new Espadachin()); korby.ocupaObjeto();
            arena.setEstado("MeganMan obtiene un Buster.");
            megan.consigueObjeto(new MegaBuster()); megan.ocupaObjeto();
            arena.setEstado("Dittu se transforma en Mew.");
            dittu.consigueObjeto(new TransformacionMew()); dittu.ocupaObjeto();

            arena.procesarAtaque(dittu, megan);
            arena.procesarAtaque(korby, megan);
            arena.setEstado("MeganMan ha sido derrotado.");
            megan.setVida(0);

            arena.procesarAtaque(dittu, korby);
            arena.setEstado("Korby ha sido derrotado.");
            korby.setVida(0);
            
            ganador = dittu.getNombre();

        } else if (caso == 2) {
            arena.setEstado("Korby se vuelve un peleador.");
            korby.consigueObjeto(new Peleador()); korby.ocupaObjeto();
            arena.setEstado("MeganMan saca el Escudo de Hojas.");
            megan.consigueObjeto(new EscudoHojas()); megan.ocupaObjeto();
            arena.setEstado("Dittu se transforma en Magikarp por error.");
            dittu.consigueObjeto(new TransformacionMagikarp()); dittu.ocupaObjeto();

            arena.procesarAtaque(korby, dittu);
            arena.setEstado("Dittu fue derrotado fácilmente.");
            dittu.setVida(0);

            arena.procesarAtaque(korby, megan);
            arena.procesarAtaque(korby, megan);
            arena.setEstado("La defensa de MeganMan cedió y fue derrotado.");
            megan.setVida(0);

            ganador = korby.getNombre();

        } else {
            arena.setEstado("Korby lanza Bolas de Fuego.");
            korby.consigueObjeto(new BolaFuego()); korby.ocupaObjeto();
            arena.setEstado("MeganMan carga el Arma Eléctrica.");
            megan.consigueObjeto(new ArmaElectrica()); megan.ocupaObjeto();
            arena.setEstado("Dittu es un Pikachu.");
            dittu.consigueObjeto(new TransformacionPikachu()); dittu.ocupaObjeto();

            arena.procesarAtaque(megan, korby);
            arena.setEstado("Korby ha sido paralizado y derrotado.");
            korby.setVida(0);

            arena.procesarAtaque(megan, dittu);
            arena.setEstado("Dittu no resistió el alto voltaje.");
            dittu.setVida(0);

            ganador = megan.getNombre();
        }

        // Finalizar y generar archivos
        arena.setEstado("\n¡EL COMBATE HA TERMINADO! El ganador es: " + ganador);
        e1.generarArchivo(ganador);
        e2.generarArchivo(ganador);
        e3.generarArchivo(ganador);
        e4.generarArchivo(ganador);
        
        System.out.println("\nBitácoras de los espectadores generadas exitosamente en la carpeta del proyecto.");
    }

}
