package co.edu.um.LibrosUm.vista;

import co.edu.um.LibrosUm.controlador.controladorInfoTabla;
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

public class principal extends JFrame implements ActionListener {

  /*Se crea una lista de la clase listaBlioteca. Esta lista sera la misma para
   *all the programa, de modo que los datos ha modificar sean los mismos.
   */
     listaBiblioteca <String> Lista;


        JLabel titulo;
        JLabel descripcion;

        JTextArea mostrarLista;
        JScrollPane scroll;
        JButton AnadirLibro;
        JButton eliminarLibro;
        JButton consultarLibro;
        JButton modificarLibro;
        JButton salir;




   /*
    * Se crea una variable de la clase JDesktopPane llamada fondoPrincipal.
    * Esta clase me permite poner iconos y fondos a las ventanas del programa
    */
    private JDesktopPane fondoPrincipal;

   public principal(listaBiblioteca<String> lista )

   {

        Lista=lista;

       /* PARTE VISUAL.
        * Se realizan las configuraciones correspondientes a la estetica de la ventana.
        * Se define tamaño, fondo, iconos de los botones entre otras.
        * Inicializa configuracion de las ventana principal
        *
        */
              setLayout(null);

              setLocation(200,100);                      //Me permite determinar donde quiero que esté la ventana al
                                                         // momento de runnear el programa.
              setTitle("Biblioteca Virtual");            //Me permite indicar el titulo de la ventana */
              setDefaultCloseOperation(EXIT_ON_CLOSE);   //me indica que cuando cierre la ventana que se
                                                         //ejecuta al compilar el programa, este cierre del all.
              setSize(900,570);                          //Me define el tamaño de la ventana.

       /*
        *    Creo iconos para los botones agregarLibro, buscarLibro, eliminarLibro, modificarLibro
        *    Los iconos los creo gracias a la clase Desktop con fondo.
        */
               Icon agregarlibroicon= new ImageIcon(getClass().getResource("/Images/smiley.png"));
               Icon buscarlibroicon = new ImageIcon(getClass().getResource("/Images/search.png"));
               Icon eliminarlibroicon= new ImageIcon(getClass().getResource("/Images/smiley1.png"));
               Icon modificarlibroicon= new ImageIcon(getClass().getResource("/Images/penwrite.png"));
               Icon salirLibroIcon=  new ImageIcon(getClass().getResource("/Images/shutdown.png"));
       /*
        *  Agrego fondo a la ventana
        */

                fondoPrincipal= new DesktopConFondo();
                ((DesktopConFondo)fondoPrincipal).setImagen("/Images/3017490fondo-web.jpg");
                setContentPane(fondoPrincipal);

       /*
        * PARTE CONFIGURACION DE POSICIONES DE ELEMENTOS.
        * En esta parte, configuramos las posiciones de las variables/elementos visuales que hacen
        * parte de las ventanas.
        */


       //asignacion de las variables.

       titulo=new JLabel("GESTION DE BIBLIOTECA");                  //le doy al Jlabel titulo una asignación y un nombre.
       mostrarLista=new JTextArea();                    //le doy al textArea mostrarL una asignacion.
       scroll=new JScrollPane(mostrarLista);            //añado scroll(cosita que hace que uno pueda bajar en el
                                                        //campito blanco) al mostralL (campito blanco).
       AnadirLibro=new JButton("Añadir Libro",agregarlibroicon);
       eliminarLibro=new JButton("Eliminar Libro",eliminarlibroicon);
       consultarLibro=new JButton("Consultar Libro",buscarlibroicon);
       modificarLibro=new JButton("Modificar Libro",modificarlibroicon);
       salir= new JButton("Salir",salirLibroIcon);

       descripcion= new JLabel("Libros actuales");

       //MODIFICACIONES DE LA LETRA

       Font font= new Font("Verdana", Font.ITALIC, 15);
       mostrarLista.setFont(font);

       Font font2= new Font("Britannic Bold",Font.PLAIN ,25);
       descripcion.setFont(font2);

       Font font1= new Font("Britannic Bold",Font.BOLD, 60);
       titulo.setFont(font1);

       Color colorTitulo= new Color(0, 154, 205);
       titulo.setForeground(colorTitulo);
       descripcion.setForeground(colorTitulo);

       // INDICO LAS POSCIONES DE LAS VARIABLES.

       titulo.setBounds(120,30,800,60);
       descripcion.setBounds(20,150,200,30);
       scroll.setBounds(20,200,540,300);
       AnadirLibro.setBounds(580,200,160,40);
       eliminarLibro.setBounds(580,250,160,40);
       consultarLibro.setBounds(580,300,160,40);
       modificarLibro.setBounds(580,350,160,40);
       salir.setBounds(580,400,160,40);

       //AÑADO LAS VARIABLES A LA VENTANA.

       add(titulo);
       add(scroll);
       add(AnadirLibro);
       add(eliminarLibro);
       add(consultarLibro);
       add(modificarLibro);
       add(salir);
       add(descripcion);

       //AÑADO LOS LISTENERS A LAS VARIABLES.

       AnadirLibro.addActionListener(this);
       eliminarLibro.addActionListener(this);
       consultarLibro.addActionListener(this);
       modificarLibro.addActionListener(this);
       salir.addActionListener(this);


       mostrarLista.setEditable(false);    //Hago que el textField no sea editable.Que solo sirva para
       //mostrar la lista, mas no permite añadir texto.


       /*
        * LLeno el text area
        */
       controladorInfoTabla mostrar= new controladorInfoTabla(Lista);
       mostrarLista.setText(mostrar.llenarDatos());

   }

    @Override


    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource()==salir){
          System.exit(0);
        }

        /*
         * Funcion que llama al controlador para desde la ventana principal, mostrar la ventana
         * Añadir libro
         */
        if(actionEvent.getSource()==AnadirLibro)
        {


            controladorVentanas x = new controladorVentanas(Lista);
            x.abrirVentanaAdd();
        }

        if(actionEvent.getSource()==eliminarLibro)
        {

            controladorVentanas x = new controladorVentanas(Lista);
            x.abrirVentanaEliminar();
        }

        if(actionEvent.getSource()==consultarLibro)
        {

            controladorVentanas x = new controladorVentanas(Lista);
            x.abrirVentanaConsultar();
        }

        if(actionEvent.getSource()==modificarLibro)
        {

            controladorVentanas x = new controladorVentanas(Lista);
            x.abrirVentanaModificar();
        }




    }


}
