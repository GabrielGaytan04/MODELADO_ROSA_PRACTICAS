/**
 * Clase que representa al primero de los 3 personajes permitidos en el videojuego 
 * Korby es un personaje de la empresa Nientiendo.
 **/
public class Korby extends Personaje {

	/**
	 * Referencia al objeto interfaz
	 **/
	private ObjetoEspecialKorby objeto;

	/**
	 * Constructor de la clase.o
	 **/
	public Korby(int vida, int ataque, int defensa) {
        super("Korby", vida, ataque, defensa);
    }
	
	/**
	 * Metodo para conseguir objeto especial. 
	 * @param o objeto especial. 
	 **/
	public void consigueObjeto(ObjetoEspecialKorby o){
		objeto = o; 
		objeto.aplicarPoder(this);
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
}
