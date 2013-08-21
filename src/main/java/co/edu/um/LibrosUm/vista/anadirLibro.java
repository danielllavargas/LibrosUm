package co.edu.um.LibrosUm.vista;

import co.edu.um.LibrosUm.controlador.controladorAnadir;
import co.edu.um.LibrosUm.controlador.controladorVentanas;
import co.edu.um.LibrosUm.modelo.listaBiblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Autora Daniela Vargas Patino
 * Fecha 16/08/13
 * Hora 19:58
 * Clase eliminarLibro perteneciente al paquete vista. Su funcion consiste en permitir eliminar
 * un libro de la lista de la biblioteca.
 *
 * Se hereda JFrame que permite la creacion de interfaz grafica y el action Listener
 * que permite a los botones intefactuar con los requerimientos del usuario.
 */
public class anadirLibro extends JFrame implements ActionListener,ItemListener {


    /*Se crea una lista de la clase listaBlioteca. Esta lista sera la misma para
     all the programa, de modo que los datos ha modificar sean los mismos*/
    listaBiblioteca<String> Lista;

    /*
     * Se defienen los JLabel.
     * Los JLabel me permiten mostrar texto en la ventana del programa.
     */

    JLabel isbnAdd;
    JLabel tituloAdd;
    JLabel fechaPublicacionAdd;
    JLabel autorAdd;
    JLabel indicacionAdd;
    JLabel isbnRef;
    JLabel errorAnadir;
    JLabel posicionAdd;

    /*
     * Se defienen los JButtons.
     * Estos son los botones de la clase elimar libro que me permiten
     * interactuar con acciones al programa.
     */

    JButton okAdd;
    JButton cancelarAdd;

    /*
     * Se define el JTextFierd que le permite al usuario introducir la informacion requerida
     * para el funcionamiento del programa.
     */

    JTextField isbnAddTF;
    JTextField tituloAddTF;
    JTextField fechaPublicacionAddTF;
    JTextField autorAddTF;
    JTextField isbnRefTF;

    /*
     * Se define el comboBox que me permite elegir la posicion del libro en la lista
     */

    JComboBox posicionAddCB;

    /*
     * Se crea una variable de la clase JDesktopPane llamada fondoPrincipal.
     * Esta clase me permite poner iconos y fondos a las ventanas del programa
     */
    private JDesktopPane fondoPrincipal;


    /**
     * Constructo de la clase añadirLista
     * @param lista lista que proviene de la clase ventana principal. Me permite
     *             trabajar con la misma lista en todas las ventanas
     */
    public anadirLibro(listaBiblioteca<String> lista){

        //Defino la Lista creada en esta lista con el valor de la lista que me pasan en el
        //parametro
        Lista=lista;

        /* PARTE VISUAL.
         * Se realizan las configuraciones correspondientes a la estetica de la ventana.
         * Se define tamaño, fondo, iconos de los botones entre otras.
         * Inicializa configuracion de las ventana principal
         *
         */
        setLayout(null);
        setSize(700,570);
        setLocation(290,120);

        /*
         *    Creo iconos para los botones agregarLibro, buscarLibro, eliminarLibro, modificarLibro
         *    Los iconos los creo gracias a la clase Desktop con fondo.
         */
        Icon agregarlibroicon= new ImageIcon(getClass().getResource("/Images/plus.png"));
        Icon cancelarlibroicon = new ImageIcon(getClass().getResource("/Images/home.png"));

        /*
         *  Agrego fondo a la ventana
         */

        fondoPrincipal= new DesktopConFondo();
        ((DesktopConFondo)fondoPrincipal).setImagen("/Images/fondoverde.jpg");
        setContentPane(fondoPrincipal);



        //Defino las variables

        indicacionAdd= new JLabel("INGRESA LOS DATOS PARA AÑADIR UN LIBRO");
        isbnAdd= new JLabel("Isbn");
        tituloAdd= new JLabel("Titulo");
        fechaPublicacionAdd= new JLabel("Fecha de publicacion");
        autorAdd= new JLabel("Autor");
        posicionAdd= new JLabel("Posicion");
        isbnRef= new JLabel("Isbn Referencia");
        errorAnadir=new JLabel("blah");

        okAdd=new JButton("Añadir",agregarlibroicon);
        cancelarAdd= new JButton("Cancelar",cancelarlibroicon);

        isbnAddTF = new JTextField();   //le doy al JTextField una asignación y un nombre.
        tituloAddTF = new JTextField();   //le doy al JTextField una asignación y un nombre.
        fechaPublicacionAddTF = new JTextField();   //le doy al JTextField una asignación y un nombre.
        autorAddTF = new JTextField();   //le doy al JTextField una asignación y un nombre.
        posicionAddCB=new JComboBox();   // le dot al comboBox una asignacion
        isbnRefTF= new JTextField();


        //Agrego las variables al comboBox
        posicionAddCB.addItem("Al inicio de la lista");
        posicionAddCB.addItem("Al final de la lista");
        posicionAddCB.addItem("Antes de un libro");
        posicionAddCB.addItem("Despues de un libro");

        //MODIFICACIONES DE LA LETRA

        Font font1= new Font("Britannic Bold",Font.BOLD, 20);
        indicacionAdd.setFont(font1);
        Color colorTitulo= new Color(0, 139 ,139);
        indicacionAdd.setForeground(colorTitulo);

        //Defino posiciones de variables

        indicacionAdd.setBounds(80,85,700,50);
        isbnAdd.setBounds(80,165,200,30);
        isbnAddTF.setBounds(220,165,200,30);
        tituloAdd.setBounds(80,205,200,30);
        tituloAddTF.setBounds(220,205,200,30);
        fechaPublicacionAdd.setBounds(80,245,200,30);
        fechaPublicacionAddTF.setBounds(220,245,200,30);
        autorAdd.setBounds(80,285,200,30);
        autorAddTF.setBounds(220,285,200,30);
        posicionAdd.setBounds(80,325,200,30);
        posicionAddCB.setBounds(220,325,200,30);
        isbnRef.setBounds(225,365,200,30);
        isbnRefTF.setBounds(322,365,100,30);
        errorAnadir.setBounds(350,410,300,30);

        okAdd.setBounds(220,435,100,40);
        cancelarAdd.setBounds(320,435,100,40);

        //añado las variables a la ventana.

        add(indicacionAdd);
        add(isbnAddTF);
        add(isbnAdd);
        add(tituloAdd);
        add(tituloAddTF);
        add(autorAdd);
        add(autorAddTF);
        add(fechaPublicacionAdd);
        add(fechaPublicacionAddTF);
        add(posicionAdd);
        add(posicionAddCB);
        add(isbnRef);
        add(isbnRefTF);
        add(okAdd);
        add(cancelarAdd);
        add(errorAnadir);

        //Esconder lo que no se puede ver
        isbnRefTF.setVisible(false);
        isbnRef.setVisible(false);
        errorAnadir.setVisible(false);

        //Añado action listener a botones
        okAdd.addActionListener(this);
        cancelarAdd.addActionListener(this);
        posicionAddCB.addItemListener(this);


    }

    /**
     * Control de acciones de los botones.
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        //Si el usuario cancela.
        if(actionEvent.getSource()==cancelarAdd)
        {
            //creo un objeto de la clase controladorVentanas para gestionar
            //el cerrada de la ventana
            controladorVentanas n= new controladorVentanas(Lista);
            n.cerrarVentana();
            this.setVisible(false);
        }

        //Si el usuario presiona ok
        if(actionEvent.getSource()==okAdd)
        {

            String isbn= isbnAddTF.getText();
            String titulo=tituloAddTF.getText();
            String fecha=fechaPublicacionAddTF.getText();
            String autor=autorAddTF.getText();
            String isbnRef= isbnRefTF.getText();

            //Valido que los TextFields estén llenos.
            if(isbn.length() !=0 && titulo.length() != 0 && fecha.length() != 0 && fecha.length() != 0 )
            {
                if(posicionAddCB.getSelectedItem()=="Antes de un libro")
                {
                    controladorAnadir controlador= new controladorAnadir(Lista);
                    controlador.anadirAntesVentana(isbnRef,isbn,titulo,fecha,autor);

                    controladorVentanas c= new controladorVentanas(Lista);
                    c.cerrarVentana();
                    this.setVisible(false);


                }

                if(posicionAddCB.getSelectedItem()=="Despues de un libro")
                {
                    controladorAnadir controlador= new controladorAnadir(Lista);
                    controlador.anadirDespuesVentana(isbnRef,isbn,titulo,fecha,autor);

                    controladorVentanas c= new controladorVentanas(Lista);
                    c.cerrarVentana();
                    this.setVisible(false);
                }

                if(posicionAddCB.getSelectedItem()=="Al inicio de la lista")
                {
                    controladorAnadir controlador= new controladorAnadir(Lista);
                    controlador.anadirInicioVentana(isbn,titulo,fecha,autor);

                    controladorVentanas c= new controladorVentanas(Lista);
                    c.cerrarVentana();
                    this.setVisible(false);
                }

                if(posicionAddCB.getSelectedItem()=="Al final de la lista")
                {
                    controladorAnadir controlador= new controladorAnadir(Lista);
                    controlador.anadirFinalVentana(isbn,titulo,fecha,autor);

                    controladorVentanas c= new controladorVentanas(Lista);
                    c.cerrarVentana();
                    this.setVisible(false);
                }

                controladorVentanas n= new controladorVentanas(Lista);
                n.cerrarVentana();
                this.setVisible(false);
            }else
            {
                errorAnadir.setText("Debe introducir todos los datos.");
                errorAnadir.setVisible(true);

            }

        }
    }


    @Override
    public void itemStateChanged(ItemEvent itemEvent) {

        if(itemEvent.getSource()==posicionAddCB)
        {
            if(posicionAddCB.getSelectedItem()=="Antes de un libro")
            {
                isbnRefTF.setVisible(true);
                isbnRef.setVisible(true);

            }
            if(posicionAddCB.getSelectedItem()=="Despues de un libro")
            {
                isbnRefTF.setVisible(true);
                isbnRef.setVisible(true);

            }
            if(posicionAddCB.getSelectedItem()=="Al inicio de la lista")
            {
                isbnRefTF.setVisible(false);
                isbnRef.setVisible(false);

            }
            if(posicionAddCB.getSelectedItem()=="Al final de la lista")
            {
                isbnRefTF.setVisible(false);
                isbnRef.setVisible(false);
            }

        }
    }
}
