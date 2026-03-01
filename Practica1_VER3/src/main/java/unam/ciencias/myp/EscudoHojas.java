/**
 * Segundo poder permitido de MeganMan
 * Implementa la interfaz objetoEspecialMeganMan. 
 **/
public class EscudoHojas implements ObjetoEspecialMeganMan{

                /**
                 * Atributos de clase que espero poder relacionar en las 
                 * mecanicas de combate 
                 **/

                /** Ataque **/ 
                private int a = 15;
                /** Defensa **/ 
                private int d = 100;

                /**
                 * Escritura del metodo proveniente de la interfaz
                 **/
                public void ocupa(){
                        System.out.println("Ahora el escudo proteje a Meganman de un ataque enemigo!");
                }

              public void aplicarPoder(Personaje p) { 
		p.setAtaque(a); 
		p.setDefensa(d); 
	       }
}





