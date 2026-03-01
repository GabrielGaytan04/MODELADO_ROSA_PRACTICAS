/**
 * Clase encargada de ser el molde para los personajes de nuestro 
 * videojuego de peleas. Es abstracta con el fin de encapsular 
 * ciertos comportamientos relacionados a la capacidad de ataque 
 * y de defensa asociados a cada peleador permitido. 
 **/
abstract class Personaje {

	/*	
	 * Atributos de clase:
	 * Por practicidad, elegimos trabajar con valores enteros.
	 * Nos permite evitar el uso de decimales y asignarle valores concretos 
	 * a los ataques, defensa y vida del personaje.
	 */
	/** Vida del personaje. */
	private int vida;
	/** Valor de ataque del personaje. */
	private int ataque;
	/** Valor de defensa del personaje. */
	private int defensa;
	/** Nombre del personaje. */
	private String nombre;

	/**
	 * Constructor de la clase. 
	 * @param nombre nombre del personaje.
	 * @param vida vida del personaje.
	 * @param ataque valor de ataque del personaje.
	 * @param defensa valor de defensa del personaje.
	 **/
	public Personaje(String nombre, int vida, int ataque, int defensa) {
        if (vida < 0 || ataque < 0 || defensa < 0)
            throw new IllegalArgumentException("Ninguno de los elementos puede ser negativo.");
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

	/*
	 * Metodos de edicion de elementos 
	 * En algunas de las clases hijas, necesitaremos editar ataque, defensa o vida, 
	 * por eso necesitaremos algunos setters 
	 */

	/** Metodo encargado de ajustar la vida de nuestro personaje.
	 * @param vida valor para ajustar la vida.
	 */
	public void setVida(int vida) {
		/*
		 * Si el usuario ingresa vida negativa, arrojamos una excepcion.
		 */
		if(vida < 0)
			throw new IllegalArgumentException("No puedes ingresar un valor de vida menor a cero o nulo");
		this.vida = vida;
	}

	/** Metodo encargado de ajustar el valor de ataque de nuestro personaje.
	 * @param ataque valor para ajustar el valor de ataque.
	 */
	public void setAtaque(int ataque) {
		/*
		 * Excepcion en caso de entrada no valida
		 */
		if(ataque < 0)
			throw new IllegalArgumentException("No uedes ingresar un ataque menor a cero o nulo");
		this.ataque = ataque; 
	}

	/** Metodo encargado de ajustar el valor de defensa de nuestro personaje.
	 * @param ataque valor para ajustar el valor de defensa.
	 */
	public void setDefensa(int defensa) {
		/*
		 * Excepcion en caso de entrada no valida
		 */
		if(defensa < 0)
			throw new IllegalArgumentException("No se puede ingresar un valor de defensa menor a cero o nulo");
		this.defensa = defensa; 
	}

	/*
	 * Metodos para obtener acceso al valor de las variables.
	 * En clases de lectura, necesitaremos poder visualizar los valores que tengamos.
	 */ 

	/** Metodo encargado de otorgar el valor actual de vida de nuestro personaje. 
	 * @return el valor actual de vida de nuestro personaje. 
	 */
	public int getVida() {	
		return vida;
	}

	/** Metodo encargado de otorgar el valor actual de ataque de nuestro personaje. 
	 * @return el valor actual de ataque de nuestro personaje. 
	 */
	public int getAtaque() {
		return ataque;
	}

	/** Metodo encargado de otorgar el valor actual de defensa de nuestro personaje. 
	 * @return el valor actual de defensa de nuestro personaje. 
	 */
	public int getDefensa() {
		return defensa;
	}

	/** Metodo encargado de otorgar el nombre de nuestro personaje. 
	 * @return el nombre de nuestro personaje. 
	 */
	public String getNombre() { 
		return nombre; 
	}
	
}
