/**
 * Clase encargada de ser el molde para los personajes de nuestro 
 * videojuego de peleas. Es abstracta con el fin de encapsular 
 * ciertos comportamientos  relacionados a la capacidad de ataque \
 * y de defensa asociados a cada peleador permitido. 
 **/
abstract class Personaje {

	/**	
	 * Atributos de clase
	 * Por practicidad, elegimos trabajar con valores enteros.
	 * Nos permite evitar el uso de decimales y asignarle valores concretos 
	 * a los ataques, defensa y vida del personaje 
	 **/
	private int vida;
	private int ataque;
	private int defensa;

	/**
	 * Constructor 
	 * Necesitamos un constructor del que las clases hijas se puedan nutrir (Prometemos que esti 
	 * no lo escribio una IA aunque parezca), mas bien es nuestra manera de entender la utilidad de un 
	 * constructor para una clase abstracta.
	 **/
	public Personaje(int vida, int ataque, int defensa) {

		if ( (vida < 0) || (ataque < 0) || (defensa < 0) )
			throw new IllegalArgumentException("Ninguno de los elementos de entrada puede ser vacio y/o nulo!!!!");

		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
	}

	/**
	 * Metodos de edicion de elementos 
	 * En algunas de las clases hijas, necesitaremos editar ataque, defensa o vida, 
	 * por eso necesitaremos algunos setters 
	 **/

	/**SETTERS**/
	public void setVida(int vida) {
		/**
		 *Si el usuario ingresa vida negativa, arrojamos una excepcion 
		 **/
		if(vida < 0)
			throw new IllegalArgumentException("No puedes ingresar un valor de vida menor a cero o nulo");
		this.vida = vida;
	}

	public void setAtaque(int ataque) {
		/**
		 * Excepcion en caso de entrada no valida
		 **/
		if(ataque < 0)
			throw new IllegalArgumentException("No uedes ingresar un ataque menor a cero o nulo");
		this.ataque = ataque; 
	}

	public void setDefensa(int defensa) {
		/**
		 * Excepcion en caso de entrada no valida
		 **/
		if(defensa < 0)
			throw new IllegalArgumentException("No se puede ingresar un valor de defensa menor a cero o nulo");
		this.defensa = defensa; 
	}

	/**
	 * Metodos para obtener acceso a la variable 
	 * En clases de lectura, necesitaremos poder visualizar los valores que tengamos
	 **/ 

	/**GETTERS**/
	public int getVida() {	
		return vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	
}
