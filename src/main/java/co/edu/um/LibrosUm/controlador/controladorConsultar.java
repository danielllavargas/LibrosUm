package co.edu.um.LibrosUm.controlador;

import co.edu.um.LibrosUm.modelo.libro;
import co.edu.um.LibrosUm.modelo.listaBiblioteca;

/**
 * Creado con Intellij Idea
 * Autora Daniela Vargas Patino
 * Fecha 16/08/13
 * Hora 19:58
 *
 *Paquete Controlador
 *Clase controladorConsultar
 */

public class controladorConsultar {

    //Se define un objeto lista de la clase listaBiblioteca.
    listaBiblioteca lista= new listaBiblioteca();


    /**
     * Constructor de la clase controladorConsultar.
     * Me permite definir al objeto de la clase Lista como la lista
     * creada en toodo el programa. Esto se hace para poder usar la misma
     * lista en todas partes.
     * @param lista
     *        proviene de la clase consultat libro del paquete vista.
     *        me permite "pasar" los valores de la lista que se utiliza en la clase
     *        consultarlibro al controlador.
     */
    public controladorConsultar(listaBiblioteca lista) {
        this.lista = lista;
    }

    /**
     * Metodo que me permite 1. Buscar un libro de la clase libro por medio
     *                          del metodo buscar presente en la clase listaBiblioteca.
     *                          Ambas clases son del paquete modelo.
     *                       2. Del libro encontrado, obtener la informacion del mismo e
     *                          introducirla en un array.
     * @param ref
     *            valor que me indica el isbn de un libro que se desee encontrar en
     *            la listaLibros.
     * @return String[]
     *        datosLibro con 5 posiciones. El vector contiene la informacion
     *        del libro encontrado. Las 5 posiciones contienen isbn, titulo, autor, fecha
     *        de publicacion y numero de ejemplares. Si no se encuentra el libro, se retorna
     *        un vector con posiciones null.
     */

    public String[] consultaVentana(String ref)
    {
        String datosLibro[]=new String[5]; //Crea array de tipo String y se asignan 5 posiciones
        libro booksito=lista.buscar(ref);  //Se crea un libro de la clase libro. Se le asigna el
                                           //valor un libro de la listaLibros cuyo isbn corresponda al
                                           //al valor de la referencia.

        datosLibro[0]=booksito.getIsbn().toString();
        datosLibro[1]=booksito.getTitulo().toString();
        datosLibro[2]=booksito.getAutor().toString();
        datosLibro[3]=booksito.getFechaPublicacion().toString();
        datosLibro[4]=String.valueOf(booksito.getNumeroEjemplares());

        return datosLibro;
    }
}
