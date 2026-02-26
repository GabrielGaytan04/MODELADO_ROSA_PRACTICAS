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
         * Constructor de la clase 
         **/
        public MeganMan(int vida, int ataque, int defensa) {
                super(vida,ataque,defensa);
        }

        /**
         * Recuperamos el nombre del personaje 
         **/

        public String getNombre() {
                return nombre;
        }


}
