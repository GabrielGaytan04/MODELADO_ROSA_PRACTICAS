
/**
 * Clase que representa al primero de los 3 personajes permitidos en el videojuego 
 * Korby es un personaje de la empresa Nientiendo
 **/

public class Korby extends Personaje {

	/**
	 * Atributos de clase 
	 *
	 * Para diferenciar un poco mas al personaje de la super clase, 
	 * agregamos un atributo nombre que sera fijo y no cambiara
	 **/

	private String nombre = "Korby";
	
	/**
	 * Referencia al objeto interfaz
	 **/
	 private objetoEspecialKorby objeto;

	/**
	 * Constructor de la clase 
	 **/
	public Korby(int vida, int ataque, int defensa) {
		super(vida,ataque,defensa);
	}
	
	/**
	 * Metodo para conseguir objeto especial. Recibe como parametro de entrada un
	 * objetoEspecialKorby. No tiene regreso. 
	 **/
	public void consigueObjeto(objetoEspecialKorby o){
		objeto = o; 
	}
	/**
	 * Metodo para ocupar el objeto recien conseguido
	 **/
	 public void ocupaObjeto(){
	 	if(objeto == null){
	 		System.out.println("KORBY ESTA DESPROTEGIDO Y NO PUEDE USAR OBJETO!!! QUE DIOS SE APIADE DE EL!!!");
	 	}
	 	objeto.ocupa();
	 }

	/**
	 * Recuperamos el nombre del personaje 
	 **/

	public String getNombre() {
		return nombre;
	}
}
