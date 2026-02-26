/**
 * Clase encargada de ejecutar el codigo del programa
 * En este momento el programa solo puede hacer un par de propiedades basicas de los personajes.  
 **/

public class App{

	/**
	 * NOTA: Temporalmente estamos probando que las piezas del programa funcionen bien.
	 * Por lo cual podras notar variables de un tipo de datos que servira mas en otra 
	 * clase. Agradecemos su comprension. 
	 **/

	/**
	 * METODO MAIN: Encargado de ejecutar el codigo 
	 **/
	public static void main(String[] args) {
	
	
		/**
	 	 * SALTO DE LINEA  
		 **/
		
		System.out.println("\n-------------------------------------------------------------------"+
				    "\n--------------------------------------------------------------------"+
				    "\n--------------------------------------------------------------------");
		
		/**
		 * REVISION PROPIEDADES DE 
		 * KORBY 
		 **/
		 

		/** Creacion de un objeto Korby **/
		Korby a = new Korby(100,10,10);
		
		/** Recuperacion datos basicos korby **/
		System.out.println("Hola, mi nombre es:  " + a.getNombre() + "!");
		System.out.println("Mi vida es de: " + a.getVida() + " puntos!");
		System.out.println("Mi capacidad de ataque es de: " + a.getAtaque() + " puntos!");
		System.out.println("Mi capacidad de defensa es de: " + a.getDefensa() + " puntos!");
		
		/** Edicion de stats **/
		a.setVida(10);
		System.out.println("Tras un pequenio ajuste mi vida es: " + a.getVida() + " puntos!");
		
		/** Revision de un objeto korby sin objeto y quiera usarlo**/
		//a.ocupaObjeto();//Arroja una null pointer exception y ua no ejecuta el resto del codigo.
		
		/**Revision del funcionamiento de la espada**/
		System.out.println("\nAhora korby procede a conseguir un objeto...");
		a.consigueObjeto(new Espadachin());
		a.ocupaObjeto();
		
		/**Revision del funcionamiento del peleador**/
		System.out.println("\nPero ahora Korby se transforma en otra cosa...");
		a.consigueObjeto(new Peleador());
		a.ocupaObjeto();
		
		/**Revision del funcionamiento de la bola de fuego**/
		System.out.println("\nFinalmente, Korby consume algo inesperado!!!!");
		a.consigueObjeto(new bolaFuego());
		a.ocupaObjeto();
		
		/**
	 	 * SALTO DE LINEA  
		 **/
		
		System.out.println("\n-------------------------------------------------------------------"+
				    "\n--------------------------------------------------------------------"+
				    "\n--------------------------------------------------------------------");
		
		/**
		 * REVISION PROPIEDADES DE 
	  	 * MEGANMAN
	         **/
	         
		//Creacion de un objeto MeganMan
                MeganMan b = new MeganMan(70,70,70);
                //Recuperacion datos MeganMan
                System.out.println("\n\nHola, mi nombre es:  " + b.getNombre() + "!");
                System.out.println("Mi vida es de: " + b.getVida() + " puntos!");
                System.out.println("Mi capacidad de ataque es de: " + b.getAtaque() + " puntos!");
                System.out.println("Mi capacidad de defensa es de: " + b.getDefensa() + " puntos!");
                
                //Edicion de stats
                b.setVida(100);
                System.out.println("Tras un pequenio ajuste mi vida es: " + b.getVida() + " puntos!");

                
              	/**Revision del funcionamiento del MegaBuster**/
		System.out.println("\nAhora MeganMan procede a conseguir un objeto...");
		b.consigueObjeto(new megaBuster());
		b.ocupaObjeto();
		
		/**Revision del funcionamiento del Arma electrica**/
		System.out.println("\nPero ahora MeganMan encuentra otra arma...");
		b.consigueObjeto(new armaElectrica());
		b.ocupaObjeto();
		
		/**Revision del funcionamiento del Escudo de Hojas**/
		System.out.println("\nFinalmente, MeganMan necesita defenderse de algo inesperado!!!!");
		b.consigueObjeto(new escudoHojas());
		b.ocupaObjeto();
		
		
		/**
	 	 * SALTO DE LINEA  
		 **/
		
		System.out.println("\n-------------------------------------------------------------------"+
				    "\n--------------------------------------------------------------------"+
				    "\n--------------------------------------------------------------------");
		
		/**
		 * REVISION DE PROPIEDADES 
		 * DITTU 
	         **/
	         
		//Creacion de un objeto Dittu
                Dittu c = new Dittu(99,99,99);
                //Recuperacion datos Dittu
                System.out.println("\n\nHola, mi nombre es:  " + c.getNombre() + "!");
                System.out.println("Mi vida es de: " + c.getVida() + " puntos!");
                System.out.println("Mi capacidad de ataque es de: " + c.getAtaque() + " puntos!");
                System.out.println("Mi capacidad de defensa es de: " + c.getDefensa() + " puntos!");
                //Edicion de stats
                c.setVida(1);
                System.out.println("Tras un pequenio ajuste mi vida es: " + c.getVida() + " puntos!");
                
                  
              	/**Revision del funcionamiento del MegaBuster**/
		System.out.println("\nAhora Dittu procede a conseguir un objeto...");
		c.consigueObjeto(new transformacionMew());
		c.ocupaObjeto();
		
		/**Revision del funcionamiento del Arma electrica**/
		System.out.println("\nPero ahora Dittu se aburre y cambia de forma...");
		c.consigueObjeto(new transformacionPikachu());
		c.ocupaObjeto();
		
		/**Revision del funcionamiento del Escudo de Hojas**/
		System.out.println("\nFinalmente, Dittu tiene mala suerte!");
		c.consigueObjeto(new transformacionMagikarp());
		c.ocupaObjeto();
		
                
                


	}
}
