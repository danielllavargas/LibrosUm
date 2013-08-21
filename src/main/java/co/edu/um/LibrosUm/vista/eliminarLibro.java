package co.edu.um.LibrosUm.vista;

import co.edu.um.LibrosUm.controlador.controladorEliminar;
import co.edu.um.LibrosUm.controlador.controladorModificar;
import co.edu.um.LibrosUm.controlador.controladorVentanas;
import co.edu.um.LibrosUm.modelo.listaBiblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Autora: Daniela Vargas Patino
 * Fecha: 16/08/13
 * Hora: 19:58
 * Clase eliminarLibro perteneciente al paquete vista. Su funcion consiste en permitir eliminar
 * un libro de la lista de la biblioteca.
 *
 * Se hereda JFrame que permite la creacion de interfaz grafica y el action Listener
 * que permite a los botones intefactuar con los requerimientos del usuario.
 */

public class eliminarLibro extends JFrame implements ActionListener {


    /*Se crea una lista de la clase listaBlioteca. Esta lista sera la misma para
     *all the programa, de modo que los datos ha modificar sean los mismos.
     */
     listaBiblioteca <String> Lista;

    /*
     * Se defienen los JLabel tituloDelete, isbnDelete y errorDelete.
     * Los JLabel me permiten mostrar texto en la ventana del programa.
     */
    JLabel tituloDelete;
    JLabel isbnDelete;
    JLabel errorDelete;

    /*
     * Se defienen los JButtons okDelete y cancelarDelete.
     * Estos son los botones de la clase elimar libro que me permiten
     * interactuar con acciones al programa.
     */
    JButton okDelete;
    JButton cancelarDelete;

    /*
     * Se define el JTextFierd que le permite al usuario introducir la informacion requerida
     * para el funcionamiento del programa.
     */
    JTextField isbnDeleteTF;
    /*
     * Se crea una variable de la clase JDesktopPane llamada fondoPrincipal.
     * Esta clase me permite poner iconos y fondos a las ventanas del programa
     */
    private JDesktopPane fondoPrincipal;

    public eliminarLibro(listaBiblioteca<String> lista){

        /*
         * Se que la lista que me pasaron como parametro es igual a la lista local.
         * Esto es con el fin de poder manejar la misma lista en todo el programa.
         */

        Lista=lista;

        /* PARTE VISUAL.
         *
         * Se realizan las configuraciones correspondientes a la estetica de la ventana.
         * Se define tamaño, fondo, iconos de los botones entre otras.
         * Inicializa configuracion de las ventana principal
         *
         */

        /*
        *Creo iconos para los botones agregarLibro, buscarLibro, eliminarLibro, modificarLibro
        *Los iconos los creo gracias a la clase Desktop con fondo.
         */

        Icon agregarlibroicon= new ImageIcon(getClass().getResource("/Images/plus.png"));
        Icon cancelarlibroicon = new ImageIcon(getClass().getResource("/Images/home.png"));

        /*
         *  Agrego fondo a la ventana
         */

        fondoPrincipal= new DesktopConFondo();
        ((DesktopConFondo)fondoPrincipal).setImagen("/Images/fondoverde.jpg");
        setContentPane(fondoPrincipal);


        // Me define la configuracion de las ventanas.

        setLayout(null);
        setTitle("Eliminar libro");
        setLocation(290,120);
        setSize(650,450);


       //Defino las variables

        tituloDelete=new JLabel(" Puedes eliminar un libro  por medio de su ISBN");
        isbnDelete=new JLabel("Isbn");
        errorDelete=new JLabel("blah");
        isbnDeleteTF=new JTextField();

        okDelete= new JButton("Aceptar",agregarlibroicon);
        cancelarDelete=new JButton("Volver",cancelarlibroicon);


        //MODIFICACIONES DE LA LETRA

        Font font1= new Font("Britannic Bold",Font.BOLD, 20);
        tituloDelete.setFont(font1);
        Color colorTitulo= new Color(0, 139 ,139);
        tituloDelete.setForeground(colorTitulo);

        //Defino posiciones de variables

        tituloDelete.setBounds(80,85,700,50);
        isbnDelete.setBounds(170,165,200,30);
        isbnDeleteTF.setBounds(220,165,200,30);
        errorDelete.setBounds(340,300,300,30);

        okDelete.setBounds(220,245,100,40);
        cancelarDelete.setBounds(320,245,100,40);

        //Añado las variables a la ventana.

        add(tituloDelete);
        add(isbnDelete);
        add(isbnDeleteTF);
        add(okDelete);
        add(cancelarDelete);
        add(errorDelete);

        errorDelete.setVisible(false);
        //Action Listener
        okDelete.addActionListener(this);
        cancelarDelete.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource()==cancelarDelete)
        {
            controladorVentanas n= new controladorVentanas(Lista);
            n.cerrarVentana();
            this.setVisible(false);
        }

        if(actionEvent.getSource()==okDelete)
        {
            String referencia= isbnDeleteTF.getText();

            if(referencia.length()!=0)
            {
                controladorModificar m= new controladorModificar(Lista);

                if (m.validarListaVentana(referencia)=="ok") {

                    controladorEliminar e= new controladorEliminar(Lista);
                    e.eliminarLibroVentana(referencia);
                    controladorVentanas n= new controladorVentanas(Lista);
                    n.cerrarVentana();
                    this.setVisible(false);

                } else {
                    errorDelete.setText("El libro que busca no se encuentra en la lista");
                    errorDelete.setVisible(true);

                }

            } else
            {
                errorDelete.setText("Introduzca un valor");
                errorDelete.setVisible(true);
            }
        }
    }
}
