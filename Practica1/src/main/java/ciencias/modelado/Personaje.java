
/**
 * Clase abstracta encargada de definir el molde de un personaje.
 **/
abstract class Personaje{

	/**
	 * Atributos universales 	
	 **/

	private int saludActual;
	private int ataque;
	private int defensa; 

	/**
	 * Constructor por defecto
	 * Cada personaje inicia con una barra de vida llena y con ataques bajos 
	 * El limite de la salud es 100, asi como del ataque y defensa.
	 **/
	 
	public Personaje(){
		saludActual = 100;
		ataque = 10;
		defensa = 10;		
	}
	
	
	/**
	 * SETTERS
	 * En otra clase vamos a necesitar modificar los atributos de hp, defensa y 
	 * ataque basandonos en los objetos que estos adquieran o si reciben un ataque 
	 **/
	 
	 /**
	  *Ajustar salud
	  **/
	 public void setHP(int saludActual){
	 	/**
		 * Excepcion si se coloca un valor mayor a 100 o menor a cero 
		 **/
	 	if(saludActual > 100 || saludActual < 0)
	 		throw new IllegalArgumentException("La salud del personaje no puede ser mayor a 100");	 		
	 	this.saludActual = saludActual;
	 }
	 /**
	  * Ajustar ataque 
	  **/
	 public void setAtaque(int ataque){
	 	/**
		 * Excepcion si se coloca un valor mayor a 100 o menor a cero
		 **/
		if(ataque > 100 || ataque < 0)
		 	throw new IllegalArgumentException("El ataque del personaje no puede ser mayor a 100");
	 	this.ataque = ataque;
	 }
	 //Ajustar defensa 
	 public void setDefensa(int defensa){
	 	/**
		 * Excepcion si se coloca un valor mayor a 100 
		 **/
		if(defensa > 100 || ataque < 0)
		 	throw new IllegalArgumentException("El ataque del personaje no puede ser mayor a 100");
	 	this.defensa = defensa;
	 }
	 
}
