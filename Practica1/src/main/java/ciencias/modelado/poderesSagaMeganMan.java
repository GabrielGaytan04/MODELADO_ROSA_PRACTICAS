/**
 * Clase encargada de guardar los poderes asociados a la saga de Korby 
 * Implementa la interfaz Poderes
 **/
 
 public class poderesSagaMeganMan implements Poderes{
 
 	/**
	 * LANZAR TIJERAS
	 **/

	@Override
 	public void poder1(){
 	 	System.out.println("Ahora Meganman puede lanzar Tijeras!");
 	}
 	
 	/**
	 * ESCUDO DE HOJAS
	 **/
 	
 	@Override
 	public void poder2(){
 		System.out.println("Ahora Meganman tiene un escudo de hojas!");
 	}
 	
 	/**
	 * RAYO ELECTRICO
	 **/
 	
 	@Override
 	public void poder3(){
 		System.out.println("Ahora Meganman puede lanzar un rayo electrico");
 	}
 	
 }
