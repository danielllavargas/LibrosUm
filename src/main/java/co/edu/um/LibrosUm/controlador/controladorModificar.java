package co.edu.um.LibrosUm.controlador;

import co.edu.um.LibrosUm.modelo.listaBiblioteca;

/**
 * Creado con Intellij Idea
 * Autora Daniela Vargas Patino
 * Fecha 16/08/13
 * Hora 19:58
 *
 *Paquete Controlador.
 *Clase controladorMdificar
 */
public class controladorModificar {

    //Se define un objeto lista de la clase listaBiblioteca.
    listaBiblioteca lista= new listaBiblioteca();

    /**
     * Constructor de la clase controladorModificar.
     * Me permite definir al objeto de la clase Lista como la lista
     * creada en toodo el programa. Esto se hace para poder usar la misma
     * lista en todas partes.
     * @param lista proviene de la clase modificarLibro del paquete vista.
     *        me permite "pasar" los valores de la lista que se utiliza en la clase
     *        mopdificarLibro al controlador.
     */
    public controladorModificar(listaBiblioteca lista) {
        this.lista = lista;
    }

    /**
     * Metodo que me permite gestionar la validacion de si se ha encontrado o no un libro en la lista
     * de libros.
     * @param isbnref
     *                me indica el ISBN del libro que se desea encontrar en la lista de libros.
     *                Dicho parametro se obtiene de la ventana que desee utilizar. (dicho metodo
     *                no solo se utiliza en la ventana modificarLibro ya que su gestion es necesaria
     *                en eliminarLibro y consultarLibro)
     * @return String
     *                que me indica 1. Si se encuentra el libro el return es ok
     *                              2. Si no se encuentra el return es error
     */

    public String validarListaVentana(String isbnref)
    {
        String error= "error";
        String ok="ok";

        if(lista.buscar(isbnref)!=null){
            return ok;
        }else
        {
           return error;
        }

    }

    /**
     * Metodo que me permite gestionar la modificacion de la informacion de un libro.
     * EL metodo me permite llamar de la clase libroBiblioteca el metodo modificar().
     * Dicho metodo es aplicado a la lista definida para toodo el programa.
     *
     * @param isbnref
     *                parametro que me va a permitir saber a cual libro deseo modificar sus
     *                datos
     * @param isbn
     *               parametro que me indica el isbn del  libro que deseo modificar
     * @param titulo
     *               parametro que me indica el titulo del libro que deseo modificar
     * @param autor
     *              parametro que me indica el autor del libro que deseo modificar
     * @param fecha
     *              parametro que me indica la fecha del libro que deseo modificar
     *
     *               Los parametros se obtienen de la clase modificarLibro del paquete vista
     */

    public void  modificarListaVentana(String isbnref, String isbn,String titulo, String fecha, String autor){

        lista.modificar(isbnref,isbn,titulo,fecha,autor);

    }



}
