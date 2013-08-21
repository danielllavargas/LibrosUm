package co.edu.um.LibrosUm.vista;

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
public class modificarLibro  extends JFrame implements ActionListener {

    /*Se crea una lista de la clase listaBlioteca. Esta lista sera la misma para
     *all the programa, de modo que los datos ha modificar sean los mismos.
     */

    listaBiblioteca <String> Lista;

    /*
     * Se defienen los JLabel
     * Los JLabel me permiten mostrar texto en la ventana del programa.
     */

    JLabel isbnMoficar;
    JLabel tituloMoficar;
    JLabel fechaPublicacionMoficar;
    JLabel autorMoficar;
    JLabel indicacionMoficar;
    JLabel  indicacionMoficar1;
    JLabel isbnBuscarMoficar;
    JLabel errorMoficar;

    /*
     * Se defienen los JButtons.
     * Estos son los botones de la clase elimar libro que me permiten
     * interactuar con acciones al programa.
     */

    JButton buscarMoficar;
    JButton okMoficar;
    JButton cancelarMoficar;

    /*
     * Se definen los JTextFierds que le permite al usuario introducir la informacion requerida
     * para el funcionamiento del programa.
     */

    JTextField isbnMoficarTF;
    JTextField tituloMoficarTF;
    JTextField fechaPublicacionMoficarTF;
    JTextField autorMoficarTF;
    JTextField isbnRefMoficarTF;

    /*
     * Se crea una variable de la clase JDesktopPane llamada fondoPrincipal.
     * Esta clase me permite poner iconos y fondos a las ventanas del programa
     */
    private JDesktopPane fondoPrincipal;


    public modificarLibro(listaBiblioteca<String> lista) {

        Lista=lista;

        /* PARTE VISUAL.
         * Se realizan las configuraciones correspondientes a la estetica de la ventana.
         * Se define tamaño, fondo, iconos de los botones entre otras.
         * Inicializa configuracion de las ventana principal
         *
         */
        setLayout(null);
        setLocation(290,120);
        setSize(700,570);

        /*
         *    Creo iconos para los botones agregarLibro, buscarLibro, eliminarLibro, modificarLibro
         *    Los iconos los creo gracias a la clase Desktop con fondo.
         */

        Icon agregarlibroicon= new ImageIcon(getClass().getResource("/Images/plus.png"));
        Icon buscarlibroicon = new ImageIcon(getClass().getResource("/Images/search.png"));
        Icon cancelarlibroicon = new ImageIcon(getClass().getResource("/Images/home.png"));

        /*
         *  Agrego fondo a la ventana
         */

        fondoPrincipal= new DesktopConFondo();
        ((DesktopConFondo)fondoPrincipal).setImagen("/Images/fondoverde.jpg");
        setContentPane(fondoPrincipal);



        indicacionMoficar= new JLabel("Para modificar la informacion de un libro");
        indicacionMoficar1= new JLabel("introduce su ISBN");

        isbnBuscarMoficar= new JLabel("Isbn");
        buscarMoficar=new JButton("Buscar",buscarlibroicon);


        isbnMoficar= new JLabel("Nuevo isbn");
        fechaPublicacionMoficar= new JLabel("Nueva fecha de publicacion");
        autorMoficar= new JLabel("Nueno autor");
        tituloMoficar= new JLabel("Nuevo titulo");
        errorMoficar=new JLabel("blah");

        okMoficar=new JButton("Añadir",agregarlibroicon);
        cancelarMoficar= new JButton("Volver",cancelarlibroicon);

        isbnRefMoficarTF=new JTextField();
        isbnMoficarTF = new JTextField();   //le doy al JTextField una asignación y un nombre.
        tituloMoficarTF = new JTextField();   //le doy al JTextField una asignación y un nombre.
        fechaPublicacionMoficarTF = new JTextField();   //le doy al JTextField una asignación y un nombre.
        autorMoficarTF = new JTextField();   //le doy al JTextField una asignación y un nombre.



        //MODIFICACIONES DE LA LETRA

        Font font1= new Font("Britannic Bold",Font.BOLD, 30);

        indicacionMoficar.setFont(font1);
        indicacionMoficar1.setFont(font1);

        Color colorTitulo= new Color(0, 139 ,139);

        indicacionMoficar.setForeground(colorTitulo);
        indicacionMoficar1.setForeground(colorTitulo);

        //Defino posiciones de variables

        indicacionMoficar.setBounds(80,65,700,50);
        indicacionMoficar1.setBounds(80,95,700,50);

        isbnBuscarMoficar.setBounds(180,165,200,30);
        isbnRefMoficarTF.setBounds(260,165,200,30);
        buscarMoficar.setBounds(470,165,130,30);
        errorMoficar.setBounds(380,200,300,30);

        isbnMoficar.setBounds(80,255,200,30);
        isbnMoficarTF.setBounds(260,255,200,30);
        tituloMoficar.setBounds(80,295,200,30);
        tituloMoficarTF.setBounds(260,295,200,30);
        autorMoficar.setBounds(80,335,200,30);
        autorMoficarTF.setBounds(260,335,200,30);
        fechaPublicacionMoficar.setBounds(80,375,200,30);
        fechaPublicacionMoficarTF.setBounds(260,375,200,30);

        okMoficar.setBounds(230,435,130,40);
        cancelarMoficar.setBounds(365,435,130,40);



        //añado las variables a la ventana.

        add( indicacionMoficar);
        add(indicacionMoficar1);
        add(isbnBuscarMoficar);
        add(isbnRefMoficarTF);
        add(buscarMoficar);
        add(errorMoficar);
        add( isbnMoficar);
        add( isbnMoficarTF);
        add(fechaPublicacionMoficarTF);
        add(fechaPublicacionMoficar);
        add(tituloMoficar);
        add(tituloMoficarTF);
        add(autorMoficar);
        add(autorMoficarTF);
        add(cancelarMoficar);
        add(okMoficar);

        // Escondo el formulario

        isbnMoficarTF.setVisible(false);
        isbnMoficar.setVisible(false);

        fechaPublicacionMoficarTF.setVisible(false);
        fechaPublicacionMoficar.setVisible(false);

        tituloMoficarTF.setVisible(false);
        tituloMoficar.setVisible(false);

        autorMoficarTF.setVisible(false);
        autorMoficar.setVisible(false);

        errorMoficar.setVisible(false);

        okMoficar.setVisible(false);

        //Añado action listener a botones
        okMoficar.addActionListener(this);
        cancelarMoficar.addActionListener(this);
        buscarMoficar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String referencia= isbnRefMoficarTF.getText();
        controladorModificar cm= new controladorModificar(Lista);


        if(actionEvent.getSource()==cancelarMoficar)
        {
            controladorVentanas n= new controladorVentanas(Lista);
            n.cerrarVentana();
            this.setVisible(false);
        }
        if(actionEvent.getSource()==okMoficar)
        {
            String Nisbn= isbnMoficarTF.getText();
            String Nautor= autorMoficarTF.getText();
            String Nfecha=fechaPublicacionMoficarTF.getText();
            String Ntitulo= tituloMoficarTF.getText();

            if (Nisbn.length()!= 0 &&  Nautor.length()!=0 && Nfecha.length() !=0 && Ntitulo.length() != 0 ) {

                cm.modificarListaVentana(referencia,Nisbn,Ntitulo,Nfecha,Nautor);

                controladorVentanas control=new controladorVentanas(Lista);
                control.cerrarVentana();
                this.setVisible(false);
            } else {

                errorMoficar.setText("Debe llenar todas las casillas" );
                errorMoficar.setVisible(true);

            }
        }


       if(actionEvent.getSource()==buscarMoficar){

           if (referencia.length()!=0) {

               if(cm.validarListaVentana(referencia)=="ok"){

                   isbnMoficarTF.setVisible(true);
                   isbnMoficar.setVisible(true);

                   fechaPublicacionMoficarTF.setVisible(true);
                   fechaPublicacionMoficar.setVisible(true);

                   tituloMoficarTF.setVisible(true);
                   tituloMoficar.setVisible(true);

                    autorMoficarTF.setVisible(true);
                    autorMoficar.setVisible(true);

                    errorMoficar.setVisible(false);

                    okMoficar.setVisible(true);


               } else{

                   if(cm.validarListaVentana(referencia)=="error" && referencia.length()!=0)
                   {

                       errorMoficar.setText("El libro que busca no se encuentra en la lista");
                       errorMoficar.setVisible(true);

                   }
         }
           } else {


               if(referencia.length()==0) {

                   errorMoficar.setText("Introdusca un valor" );
                   errorMoficar.setVisible(true);

               }
           }
    }


}

}
