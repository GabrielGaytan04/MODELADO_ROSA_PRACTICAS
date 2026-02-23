/**
 * Clase encargada de guardar los poderes asociados a la saga de Korby 
 * Implementa la interfaz Poderes
 **/
 
 public class poderesSagaKorby implements Poderes{
 
 	/**
	 * PODER DE FUEGO
	 **/
 
 	@Override
 	public void poder1(){
 		System.out.println("Ahora Korby es un dragon de fuego!");
 	}
 	
 	/**
	 * PODER DE HIELO
	 **/
	 
 	@Override
 	public void poder2(){
 		System.out.println("Ahora Korby puede congelar a sus enemigos!");
 	}
 	
 	/**
	 * PODER DE PELEADOR
	 **/
 	
 	@Override
 	public void poder3(){
 		System.out.println("Ahora Korby es un peleador fuerte!");
 	}
 
 
 }
