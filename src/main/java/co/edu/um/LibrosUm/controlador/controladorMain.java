package co.edu.um.LibrosUm.controlador;

import co.edu.um.LibrosUm.modelo.listaBiblioteca;
import co.edu.um.LibrosUm.vista.principal;

/**
 * Creado con Intellij Idea
 * Autora Daniela Vargas Patino
 * Fecha 16/08/13
 * Hora 19:58
 *
 *Paquete Controlador.
 *Clase controladorMain
 */
public class controladorMain {

    /**
     *  public static void me permite ejecutar el programa, pues con el
     *  defino el Main del programa.
     *  Ademas, me permite mostrar las ventanas.
     * @param args
     *             representa un metodo que siempre tendra acceso desde afuera
     *             sin necesidad de crear una instancia del mismo.
     *             String args recibe cualquier argumento de tipo string que sea
     *             enviado al ejecutar el programa.
     */

    public static void main(String[] args) {

        //Se define un objeto lista de la clase listaBiblioteca.
        listaBiblioteca lista= new listaBiblioteca();

        /*
         * Creo libros en la lista de la biblioteca
         */
        lista.insertarLibroDePrimero("9876","A fasti lo tortura un minion","19/11/2012","Minion Feliz");
        lista.insertarLibroDePrimero("456","Fasti se traba en Canada","09/09/2011/","Miss Moño Banana");
        lista.insertarLibroDePrimero("987","Fasti se cae en la piscima del prom","08/072011", "Moño babana y demas presentes");
        lista.insertarLibroDePrimero("234","Fasti descubre que querian una niña","23/04/2000","Moño babana");
        lista.insertarLibroDePrimero("123456","Fasti se enamora de la profesora de transicion", "12/01/1999","Fasti Daniela");
        lista.insertarLibroDePrimero("12345","Fasti se vuelve crespo","07/09/1996","Fasti Daniela");
        lista.insertarLibroDePrimero("1234","Ha nacido fasti bebe","25/08/1994","Fasti Daniela");

        /*
         * creo un objeto de la clase principal del paquete vista. Se pasa como
         * parametro la lista creada en esta parte a la ventana principal.
         *
         * Esta parte es escencial, ya que la misma es la que me asegura poder
         * trabajar con la misma lista en todas las ventanas.
         */
        principal p= new principal(lista);
        p.setVisible(true);
    }
}
