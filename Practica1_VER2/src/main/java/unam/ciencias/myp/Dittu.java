/**
 * Clase encargada de representar al tercer personaje disponible del catalogo. 
 * Dittu es un personaje de la saga Chinpokomon 
 **/

public class Dittu extends Personaje{

	 /** Atributos de clase 
         * Para diferenciar un poco mas al personaje de la super clase, 
         * agregamos un atributo nombre que sera fijo y no cambiara
         **/

        private String nombre = "Dittu";

	 /**
	 * Referencia al objeto interfaz
	 **/
	 private objetoEspecialDittu objeto;


        /**
         * Constructor de la clase 
         **/
        public Dittu(int vida, int ataque, int defensa) {
                super(vida,ataque,defensa);
        }
        
        /**
	 * Metodo para conseguir objeto especial. Recibe como parametro de entrada un
	 * objetoEspecialMeganMan. No tiene regreso. 
	 **/
	public void consigueObjeto(objetoEspecialDittu o){
		objeto = o; 
	}
	
	/**
	 * Metodo para ocupar el objeto recien conseguido
	 **/
	 public void ocupaObjeto(){
	 	if(objeto == null){
	 		System.out.println("MEGANMAN ESTA DESPROTEGIDO Y NO PUEDE USAR OBJETO!!! QUE DIOS SE APIADE DE EL!!!");
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
