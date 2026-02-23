/**
 * Clase encargada de guardar los poderes asociados a la saga de ChinPokomon
 * Implementa la interfaz Poderes
 **/
 
 public class poderesSagaChinPokomon implements Poderes{
 
 	/**
	 * TRANSFORMARSE EN UNA RATA ELECTRICA
	 **/
	 
 	@Override
 	public void poder1(){
 		System.out.println("Ahora tu chinpokomon se transforma en Chikapu! Chika! Chika!");
 	}
 	
 	/**
	 * TRANSFORMARSE EN UN LEGENDARIO 
	 **/
 	
 	@Override
 	public void poder2(){
 		System.out.println("Ahora tu chinpokomon se transforma en maw!!! Legenario!!!!!");
 	}
 	
 	/**
	 * SIN TRANSFORMARSE
	 **/	
 	
 	@Override
 	public void poder3(){
 		System.out.println("Tu chinpokomon no se pudo transformar!!!! Que dios se apiade de el!!!!!");
 	}

}
