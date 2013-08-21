package co.edu.um.LibrosUm.controlador;

import co.edu.um.LibrosUm.modelo.listaBiblioteca;

/**
 * Creado con Intellij Idea
 * Autora Daniela Vargas Patino
 * Fecha 16/08/13
 * Hora 19:58
 *
 *Paquete Controlador.
 *Clase controladorInfoTabla
 */

public class controladorInfoTabla {

    //Se define un objeto lista de la clase listaBiblioteca.
    listaBiblioteca lista= new listaBiblioteca();

    /**
     * Constructor de la clase controladorInfoTabla.
     * Me permite definir al objeto de la clase Lista como la lista
     * creada en toodo el programa. Esto se hace para poder usar la misma
     * lista en todas partes.
     * @param lista proviene de la clase principal del paquete vista.
     *        me permite "pasar" los valores de la lista que se utiliza en la clase
     *        principal al controlador.
     */
    public controladorInfoTabla(listaBiblioteca lista) {
        this.lista = lista;
    }

    /**
     * Metodo que me permite gestiona el uso de la funcion DatosTabla() de la listaBiblioteca
     * del paquete modelo en la lista. Esto es lo que me permite obtener valores para
     * mostrar en el JTextArea de la ventana principal del paquete vista
      *
     * @return la lista con los valores de los libros listos para imprimir en la ventana
     *         principal. El metodo DatosTabla() solo imprime el Isbn y el titulo de los
     *         libros de la lista.
     */
    public String llenarDatos()
    {
        return lista.DatosTabla();
    }
}
