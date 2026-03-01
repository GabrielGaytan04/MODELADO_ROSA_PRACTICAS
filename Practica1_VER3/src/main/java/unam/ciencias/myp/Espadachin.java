/**
 * Primer poder permitido de Korby 
 * Implementa la interfaz objetoEspecialKorby. 
 **/
public class Espadachin implements ObjetoEspecialKorby{

	/**
	 * Atributos de clase que espero poder relacionar en las 
	 * mecanicas de combate 
	 **/
			
	/** Ataque **/ 
	private int a = 50;
	/** Defensa **/ 
	private int d = 50;
			
	/**
	 * Escritura del metodo proveniente de la interfaz
	 **/
	public void ocupa(){
		System.out.println("Ahora Kirby tiene una espada!");
	}
			
	public void aplicarPoder(Personaje p) { 
		p.setAtaque(a); 
		p.setDefensa(d); 
	}
}
