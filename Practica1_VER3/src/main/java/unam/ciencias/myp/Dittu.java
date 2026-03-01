/**
 * Clase encargada de representar al tercer personaje disponible del catalogo. 
 * Dittu es un personaje de la saga Chinpokomon.
 **/

public class Dittu extends Personaje{

	/**
	 * Referencia al objeto interfaz
	 **/
	private ObjetoEspecialDittu objeto;

    /**
     * Constructor de la clase.
     **/
    public Dittu(int vida, int ataque, int defensa) {
        super("Dittu", vida, ataque, defensa);
    }

    /**
	 * Metodo para conseguir objeto especial. 
	 * @param o objeto especial.
	 **/
	public void consigueObjeto(ObjetoEspecialDittu o){
		objeto = o; 
		objeto.aplicarPoder(this);
	}
	
	/**
	 * Metodo para ocupar el objeto recien conseguido.
	 **/
	public void ocupaObjeto(){
		if(objeto == null){
			System.out.println("DITTU ESTA DESPROTEGIDO Y NO PUEDE USAR OBJETO!!! QUE DIOS SE APIADE DE EL!!!");
		}
		objeto.ocupa();
	}
}
