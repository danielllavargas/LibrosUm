package co.edu.um.LibrosUm.controlador;

import co.edu.um.LibrosUm.modelo.listaBiblioteca;

/**
 * Creado con Intellij Idea
 * Autora Daniela Vargas Patino
 * Fecha 16/08/13
 * Hora 19:58
 *
 *Paquete Controlador.
 *Clase controladorEliminar
 */

public class controladorEliminar {

    //Se define un objeto lista de la clase listaBiblioteca.
    listaBiblioteca lista= new listaBiblioteca();

    /**
     * Constructor de la clase controladorEliminar.
     * Me permite definir al objeto de la clase Lista como la lista
     * creada en toodo el programa. Esto se hace para poder usar la misma
     * lista en todas partes.
     * @param lista
     *        proviene de la clase consultar libro del paquete vista.
     *        me permite "pasar" los valores de la lista que se utiliza en la clase
     *        eliminarlibro al controlador.
     */
    public controladorEliminar(listaBiblioteca lista) {
        this.lista = lista;
    }
    /**
     * eliminarLibroVentana es un metodo que me permite gestionar la eliminacion de libros
     * de la lista de libro. Obtengo un valor referencia (que corresponde al isbn del libro
     * que se desea eliminar) de la clase eliminarLibro y por medio del metodo eliminarLibro
     * de la clase listaBiblioteca, elimino el libro correspondiente al isbn mensionado.
     * @param isbn
     */

    public void eliminarLibroVentana(String isbn)
    {
        lista.eliminarLibro(isbn);
    }
}
