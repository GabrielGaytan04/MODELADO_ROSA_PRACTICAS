/**
 * Segundo poder permitido de Dittu  
 * Implementa la interfaz objetoEspecialDittu. 
 **/
public class TransformacionPikachu implements ObjetoEspecialDittu{

       /**
        * Atributos de clase que espero poder relacionar en las 
        * mecanicas de combate 
        **/

       /** Ataque **/ 
       private int a = 50;
       /** Defensa **/ 
       private int d = 25;

       /**
        * Escritura del metodo proveniente de la interfaz
        **/
       public void ocupa(){
              System.out.println("Ahora Dittu es el personaje mas rentable de la franquicia!!! PIKA PIKA ");
       }

       public void aplicarPoder(Personaje p) { 
		p.setAtaque(a); 
		p.setDefensa(d); 
	}
}




