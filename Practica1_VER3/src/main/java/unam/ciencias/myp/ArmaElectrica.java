/**
 * Primer poder permitido de MeganMan
 * Implementa la interfaz objetoEspecialMeganMan. 
 **/
public class ArmaElectrica implements ObjetoEspecialMeganMan {

                /**
                 * Atributos de clase que espero poder relacionar en las 
                 * mecanicas de combate 
                 **/

                /** Ataque **/ 
                private int a = 100;
                /** Defensa **/ 
                private int d = 20;

                /**
                 * Escritura del metodo proveniente de la interfaz
                 **/
                public void ocupa(){
                        System.out.println("Ahora MeganMan dispara un rayo electrico!");
                }

              public void aplicarPoder(Personaje p) { 
		       p.setAtaque(a); 
		       p.setDefensa(d); 
	       }
}






