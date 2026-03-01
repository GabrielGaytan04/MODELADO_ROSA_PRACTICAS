/**
 * Segundo poder permitido de Korby 
 * Implementa la interfaz objetoEspecialKorby. 
 **/
public class Peleador implements ObjetoEspecialKorby{

		/**
		 * Atributos de clase que espero poder relacionar en las 
	 	 * mecanicas de combate 
		 **/
		 
		/** Ataque **/ 
		private int a = 100;
		/** Defensa **/ 
		private int d = 30;
		
		/**
		 * Escritura del metodo proveniente de la interfaz
		 **/
		public void ocupa(){
			System.out.println("Ahora Kirby pega MUY fuerte!!!!");
		}
		
		public void aplicarPoder(Personaje p) { 
		p.setAtaque(a); 
		p.setDefensa(d); 
	}
}
