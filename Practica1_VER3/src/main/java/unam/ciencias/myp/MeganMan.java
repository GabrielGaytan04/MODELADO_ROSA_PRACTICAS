/**
 * Clase encargada de representar al segundo personaje de los 3 personajes principales 
 * MeganMan es un personaje de la compania Copcam.
 **/
public class MeganMan extends Personaje {

	/**
	 * Referencia al objeto interfaz
	 **/
	private ObjetoEspecialMeganMan objeto;

	/**
	 * Constructor de la clase.
	 **/
	public MeganMan(int vida, int ataque, int defensa) {
        super("MeganMan", vida, ataque, defensa);
    }
	
	/**
	 * Metodo para conseguir objeto especial. 
     * @param o objeto especial. 
	 **/
	public void consigueObjeto(ObjetoEspecialMeganMan o){
		objeto = o; 
		objeto.aplicarPoder(this);
	}

	/**
	 * Metodo para ocupar el objeto recien conseguido.
	 **/
	public void ocupaObjeto(){
		if(objeto == null){
			System.out.println("MEGANMAN ESTA DESPROTEGIDO Y NO PUEDE USAR OBJETO!!! QUE DIOS SE APIADE DE EL!!!");
		}
		objeto.ocupa();
	}
}
