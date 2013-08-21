package co.edu.um.LibrosUm.controlador;

import co.edu.um.LibrosUm.modelo.listaBiblioteca;

/**
 * Creado con Intellij Idea
 * Autora Daniela Vargas Patino
 * Fecha 16/08/13
 * Hora 19:58
 *
 *Paquete Controlador.
 *Clase controladorAñadir
 */

public class controladorAnadir {

    //Se define un objeto lista de la clase listaBiblioteca.
    listaBiblioteca lista= new listaBiblioteca();


    /**
     * Constructor de la clase controladorAnadir.
     * Me permite definir al objeto de la clase Lista como la lista
     * creada en toodo el programa. Esto se hace para poder usar la misma
     * lista en todas partes.
     * @param lista proviene de la clase añadir libro del paquete vista.
     *        me permite "pasar" los valores de la lista que se utiliza en la clase añadir
     *              libro al controlador.
     */
    public controladorAnadir(listaBiblioteca lista) {
        this.lista = lista;
    }

    /**
     * anadirAntesVentana Metodo del controlador que me va a permitir  gestionar la adicion de
     * libros en la listaLibros. Su funcion es de la clase añadirLibro de la vista, recoger la
     * informacion y por medio del metodo  definido en la clase listaBiblioteca del paquete modelo
     * anadirLibroAntesDeOtro crear un libro antes de otro libro indicado.
     *
     * @param isbnRef parametro que me va a permitir saber antes de cual libro quiero añadir
     *                el nuevo elemento
     * @param isbn   parametro que me indica el isbn del nuevo libro
     * @param titulo parametro que me indica el titulo del nuevo libro
     * @param autor  parametro que me indica el autor del nuevo libro
     * @param fecha  parametro que me indica la fecha del nuevo libro
     * El 1 me indica que se a añadido un nuevo elemento.
     */
    public void anadirAntesVentana(String isbnRef, String isbn,String titulo, String autor, String fecha){
        lista.anadirLibroAntesDeOtro(isbnRef,isbn,titulo,fecha,autor,1);
    }

    /**
     * anadirDespuesVentana: Metodo del controlador que me va a permitir  gestionar la adicion de
     * libros en la listaLibros. Su funcion es de la clase añadirLibro de la vista, recoger la
     * informacion y por medio del metodo  definido en la clase listaBiblioteca del paquete modelo
     * anadirLibroDespuesDeOtro crear un libro despues de otro libro indicado.
     *
     *@param isbnRef parametro que me va a permitir saber despues de cual libro quiero añadir
     *                el nuevo elemento
     * @param isbn   parametro que me indica el isbn del nuevo libro
     * @param titulo parametro que me indica el titulo del nuevo libro
     * @param autor  parametro que me indica el autor del nuevo libro
     * @param fecha  parametro que me indica la fecha del nuevo libro
     * El 1 me indica que se a añadido un nuevo elemento.
     */
    public void anadirDespuesVentana(String isbnRef, String isbn,String titulo, String autor, String fecha){
        lista.anadirLibroDespuesDeOtro(isbnRef,isbn,titulo,fecha,autor,1);
    }

    /**
     * añadirInicioVentana: Metodo del controlador que me va a permitir  gestionar la adicion de
     * libros en la listaLibros. Su funcion es de la clase añadirLibro de la vista, recoger la
     * informacion y por medio del metodo definido en la clase listaBiblioteca del paquete modelo
     * insertarLibroDePrimero crear un libro al inicio de la lista de libros.
     *
     * @param isbn   parametro que me indica el isbn del nuevo libro
     * @param titulo parametro que me indica el titulo del nuevo libro
     * @param autor  parametro que me indica el autor del nuevo libro
     * @param fecha  parametro que me indica la fecha del nuevo libro
     */

    public void anadirInicioVentana(String isbn,String titulo, String autor, String fecha){
        lista.insertarLibroDePrimero(isbn,titulo,autor,fecha);
    }
    /**
     * añadirFinalVentana: Metodo del controlador que me va a permitir  gestionar la adicion de
     * libros en la listaLibros. Su funcion es de la clase añadirLibro de la vista, recoger la
     * informacion y por medio del metodo definido en la clase listaBiblioteca del paquete modelo
     * insertarLibroDePrimero crear un libro al final de la lista de libros.
     *
     * @param isbn   parametro que me indica el isbn del nuevo libro
     * @param titulo parametro que me indica el titulo del nuevo libro
     * @param autor  parametro que me indica el autor del nuevo libro
     * @param fecha  parametro que me indica la fecha del nuevo libro
     */

    public void anadirFinalVentana(String isbn,String titulo, String autor, String fecha){
        lista.insertarLibroDeUltimo(isbn,titulo,autor,fecha,1);
    }
}

