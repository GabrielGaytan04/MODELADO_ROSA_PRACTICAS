/**
 * Clase encargada de representar al tercer personaje disponible del catalogo. 
 * Dittu es un personaje de la saga Chinpokomon 
 **/

public class Dittu extends Personaje{

	 /** Atributos de clase 
         * Para diferenciar un poco mas al personaje de la super clase, 
         * agregamos un atributo nombre que sera fijo y no cambiara
         **/

        private String nombre = "Dittu";


        /**
         * Constructor de la clase 
         **/
        public Dittu(int vida, int ataque, int defensa) {
                super(vida,ataque,defensa);
        }

        /**
         * Recuperamos el nombre del personaje 
         **/

        public String getNombre() {
                return nombre;
        }

}
