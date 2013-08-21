package co.edu.um.LibrosUm.controlador;

import co.edu.um.LibrosUm.modelo.listaBiblioteca;
import co.edu.um.LibrosUm.vista.*;

/**
 * Creado con Intellij Idea
 * Autora Daniela Vargas Patino
 * Fecha 16/08/13
 * Hora 19:58
 *
 *Paquete Controlador.
 *Clase controladorVentanas
 *       Me permite gestionar el abrir y cerrar de las ventanas.
 */

public class controladorVentanas {

    //Se define un objeto lista de la clase listaBiblioteca.
    listaBiblioteca <String> Lista;

    /**
     * Constructor de la clase controladorVentanas.
     * Me permite definir al objeto de la clase Lista como la lista
     * creada en toodo el programa. Esto se hace para poder usar la misma
     * lista en todas partes.
     * @param lista proviene de la todas las ventanas del paquete vista.
     */

    public controladorVentanas(listaBiblioteca<String> lista) {

       Lista=lista;
    }


    /**
     * Funcion controladora que me permite gestionar el evento del boton añadirLibro.
     * La idea es poder abrir una ventana nueva cuando el boton añadirLibro sea accionado desde
     * la ventana principal.
     */

    public void abrirVentanaAdd()
    {
    anadirLibro ventana= new anadirLibro(Lista);
        ventana.setVisible(true);
    }

    /**
     * Funcion controladora que me permite gestionar el evento del boton consultar .
     * La idea es poder abrir una ventana nueva cuando el boton consultar sea accionado desde
     * la ventana principal.
     */

    public void abrirVentanaConsultar()
    {

        consultarLibro ventana= new consultarLibro(Lista);
        ventana.setVisible(true);
    }

    /**
     * Funcion controladora que me permite gestionar el evento del boton eliminar.
     * La idea es poder abrir una ventana nueva cuando el boton eliminar sea accionado desde
     * la ventana principal.
     */

    public void abrirVentanaEliminar()
    {


        eliminarLibro ventana= new eliminarLibro(Lista);
        ventana.setVisible(true);

    }

    /**
     * Funcion controladora que me permite gestionar el evento del boton modificar.
     * La idea es poder abrir una ventana nueva cuando el boton modificar sea accionado desde
     * la ventana principal.
     */
    public void abrirVentanaModificar()
    {

        modificarLibro ventana= new modificarLibro(Lista);
        ventana.setVisible(true);

    }

    /**
     * Funcion controladora que me permite gestionar el evento del boton salir.
     * La idea es poder abrir una ventana nueva cuando el boton salir sea accionado desde
     * la ventana principal.
     */
    public void cerrarVentana()
    {
        principal p=new principal(Lista);
        p.show();
    }



}
