/**
 * Clase encargada de representar al segundo personaje de los 3 personajes principales 
 * MeganMan es un personaje de la compania Copcam. 
 **/


public class MeganMan extends Personaje{
	
        /** Atributos de clase 
         * Para diferenciar un poco mas al personaje de la super clase, 
         * agregamos un atributo nombre que sera fijo y no cambiara
         **/

        private String nombre = "MeganMan";
        
        /**
	 * Referencia al objeto interfaz
	 **/
	 private ObjetoEspecialMeganMan objeto;


        /**
         * Constructor de la clase 
         **/
        public MeganMan(int vida, int ataque, int defensa) {
                super("MeganMan", vida, ataque, defensa);
        }
        
        /**
	 * Metodo para conseguir objeto especial. Recibe como parametro de entrada un
	 * objetoEspecialMeganMan. No tiene regreso. 
	 **/
	public void consigueObjeto(ObjetoEspecialMeganMan o){
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
