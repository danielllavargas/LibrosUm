package co.edu.um.LibrosUm.vista;

import co.edu.um.LibrosUm.controlador.controladorConsultar;
import co.edu.um.LibrosUm.controlador.controladorModificar;
import co.edu.um.LibrosUm.controlador.controladorVentanas;
import co.edu.um.LibrosUm.modelo.listaBiblioteca;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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
public class consultarLibro extends JFrame implements ActionListener,ChangeListener {

    /* Se crea una lista de la clase listaBlioteca. Esta lista sera la misma para
     *all the programa, de modo que los datos ha modificar sean los mismos.
     */

    listaBiblioteca<String> Lista;

    /*
     * Se defienen los JLabel tituloDelete, isbnDelete y errorDelete.
     * Los JLabel me permiten mostrar texto en la ventana del programa.
     */

    JLabel indicacionBUSCAR;
    JLabel isbnBuscar;
    JLabel TituloInformacion;
    JLabel errorBuscar;
    JLabel isbnBuscarInf;
    JLabel tituloBuscarInf;
    JLabel fechaPublicacionBuscarInf;
    JLabel autorBuscarInf;
    JLabel numeroEjemplaresInf;

    /*
     * Se define el JTextFierd que le permite al usuario introducir la informacion requerida
     * para el funcionamiento del programa.
     */
    JTextField isbnBuscarTF;

    /*
     * Se defienen los JButtons.
     * Estos son los botones de la clase elimar libro que me permiten
     * interactuar con acciones al programa.
     */
    JButton okAddBuscar;
    JButton cancelarAddBuscar;
    JButton buscarBuscar;

    /*
     * Se crea una variable de la clase JDesktopPane llamada fondoPrincipal.
     * Esta clase me permite poner iconos y fondos a las ventanas del programa
     */


    private JDesktopPane fondo;

    public consultarLibro(listaBiblioteca<String> lista){

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

        fondo=new JDesktopPane();



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
        Icon buscarlibroicon = new ImageIcon(getClass().getResource("/Images/search.png"));


       indicacionBUSCAR=new JLabel("Para saber mas acerca de un libro");
       isbnBuscar=new JLabel("Isbn");
       isbnBuscarTF= new JTextField();
        errorBuscar= new JLabel("error Buscando");

       TituloInformacion=new JLabel("Informacion");
       okAddBuscar=new JButton("Aceptar",agregarlibroicon);
       cancelarAddBuscar= new JButton("Cancelar",cancelarlibroicon);
       buscarBuscar = new JButton("Buscar",buscarlibroicon);

        isbnBuscarInf=new JLabel("isbn");
        tituloBuscarInf=   new JLabel("titulo");
        fechaPublicacionBuscarInf=   new JLabel("fecha de Publicacion");
        autorBuscarInf=   new JLabel("autor");
        numeroEjemplaresInf=    new JLabel("numero de Ejemplares");

        /*
         * MODIFICACIONES DE LA LETRA
         */

        Font font1= new Font("Verdana",Font.BOLD, 20);
        indicacionBUSCAR.setFont(font1);
        TituloInformacion.setFont(font1);
        Color colorTitulo= new Color(0, 139 ,139);
        indicacionBUSCAR.setForeground(colorTitulo);
        TituloInformacion.setForeground(colorTitulo);

        fondo=new DesktopConFondo();
       ((DesktopConFondo)fondo).setImagen("/Images/fondoverde.jpg");
        setContentPane(fondo);

        /*
         * Defino posiciones de variables
         */

        indicacionBUSCAR.setBounds(160,75,700,50);
        isbnBuscar.setBounds(80,145,200,30);
        isbnBuscarTF.setBounds(150,145,150,30);
        buscarBuscar.setBounds(310,145,100,30);
        errorBuscar.setBounds(320,175,350,30);

        TituloInformacion.setBounds(300,200,200,30);

        isbnBuscarInf.setBounds(300,235,200,30);
        tituloBuscarInf.setBounds(300,255,200,30);
        fechaPublicacionBuscarInf.setBounds(300,275,300,30);
        autorBuscarInf.setBounds(300,295,200,30);
        numeroEjemplaresInf.setBounds(300,315,200,30);


        okAddBuscar.setBounds(220,435,120,40);
        cancelarAddBuscar.setBounds(320,435,120,40);


        /*
         * Añado las variables a las ventanas
         */

        add(TituloInformacion);
        add(indicacionBUSCAR);
        add(isbnBuscar);
        add(isbnBuscarTF);
        add(buscarBuscar);
        add(isbnBuscarInf);
        add(tituloBuscarInf);
        add(fechaPublicacionBuscarInf);
        add(autorBuscarInf);
        add(numeroEjemplaresInf);
        add(errorBuscar);
        add(okAddBuscar);
        add(cancelarAddBuscar);

        /*
         *Escondo los elementos
         */

         TituloInformacion.setVisible(false);
         isbnBuscarTF.setVisible(true);
         tituloBuscarInf.setVisible(false);
         fechaPublicacionBuscarInf.setVisible(false);
         autorBuscarInf.setVisible(false);
         numeroEjemplaresInf.setVisible(false);
         errorBuscar.setVisible(false);
         okAddBuscar.setVisible(false);
        isbnBuscarInf.setVisible(false);


        /*
         * Añado action listeners
         */

        cancelarAddBuscar.addActionListener(this);
        okAddBuscar.addActionListener(this);
        buscarBuscar.addActionListener(this);

        cancelarAddBuscar.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        String referencia= isbnBuscarTF.getText();

        controladorConsultar cm= new controladorConsultar(Lista);
        controladorModificar  x= new controladorModificar(Lista);

        if(actionEvent.getSource()==cancelarAddBuscar)
        {
            controladorVentanas n= new controladorVentanas(Lista);
            n.cerrarVentana();
            this.setVisible(false);
        }

        if(actionEvent.getSource()==buscarBuscar)
        {

          if( referencia.length()!=0)
          {
              if (x.validarListaVentana(referencia)=="ok") {

                  String datos[]=cm.consultaVentana(referencia);
                  TituloInformacion.setVisible(true);

                  isbnBuscarInf.setText("Isbn:" + datos[0]);
                  tituloBuscarInf.setText("Titulo:"+ datos[1]);
                  fechaPublicacionBuscarInf.setText("Fecha de publicacion: " + datos[3]);
                  autorBuscarInf.setText("Autor: " + datos[2]);
                  numeroEjemplaresInf.setText("Número de ejemplares: " + datos[4]);


                  fechaPublicacionBuscarInf.setVisible(true);
                  tituloBuscarInf.setVisible(true);
                  autorBuscarInf.setVisible(true);
                  numeroEjemplaresInf.setVisible(true);
                  errorBuscar.setVisible(false);
                  okAddBuscar.setVisible(false);
                  isbnBuscarInf.setVisible(true);

              } else {
                  if(x.validarListaVentana(referencia)=="error" && referencia.length()!=0)
                  {

                      errorBuscar.setText("El libro que busca no se encuentra en la lista");
                      errorBuscar.setVisible(true);

                  }
              }


          }  else
          {
              if (x.validarListaVentana(referencia)=="error" && referencia.length()==0) {
                  errorBuscar.setText("Introdusca un valor");
                  errorBuscar.setVisible(true);
              }

          }






        }
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
