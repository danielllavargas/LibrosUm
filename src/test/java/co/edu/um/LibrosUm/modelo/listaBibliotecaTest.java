package co.edu.um.LibrosUm.modelo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Autora: Daniela Vargas Patino
 * Fecha: 16/08/13
 * Hora: 19:58
 *Test de los metodos listaBiblioteca
 *
 * Se hereda JFrame que permite la creacion de interfaz grafica y el action Listener
 * que permite a los botones intefactuar con los requerimientos del usuario.
 */
public class listaBibliotecaTest {


    @Test
    public void testPosicion() throws Exception {

    }

    /**
     * Test del metodo insertarLibrosDePrimero. Me permite determinar si el metodo
     * funciona segun lo esperado.
     * @throws Exception
     */

    @Test
    public void testInsertarLibroDePrimero() throws Exception {

        listaBiblioteca<String> l=new listaBiblioteca<String>();

        l.insertarLibroDePrimero("1234","El primer libro","25/03/2012","Fasti");
        l.insertarLibroDePrimero("3214","El segundo libro","25/03/2012","Fasti");
        //l.insertarLibroDeUltimo("3314","El cuarto libro","25/03/2012","Fasti",0);
        l.insertarLibroDePrimero("8964","El tercer libro","25/03/2012","Fasti");
        Assert.assertNotNull(l);
        System.out.println("la lista es" + "\n" + l.toString());

    }
    /**
     * Test del metodo insertarLibrosDeUltimo. Me permite determinar si el metodo
     * funciona segun lo esperado.
     * @throws Exception
     */

    @Test
    public void testInsertarLibroDeUltimo() throws Exception {

        listaBiblioteca<String> l=new listaBiblioteca<String>();
        l.insertarLibroDeUltimo("12345","El primer libro","25/03/2012","Fasti",0);
        l.insertarLibroDeUltimo("23234","El segundo libro","25/03/2012","Fasti",0);
        l.insertarLibroDeUltimo("8964","El tercer libro","25/03/2012","Fasti",0);
        //System.out.println("\n"+ "la lista al final" + "\n" + l.toString());

    }
    /**
     * Test del metodo EliminarLibro. Me permite determinar si el metodo
     * funciona segun lo esperado.
     * @throws Exception
     */


    @Test
    public void testEliminarLibro() throws Exception {

        listaBiblioteca<String> l=new listaBiblioteca<String>();
        l.insertarLibroDePrimero("1234","El primer libro","25/03/2012","Fasti");
        l.insertarLibroDePrimero("3214","El segundo libro","25/03/2012","Fasti");
        l.insertarLibroDePrimero("8964","El tercer libro","25/03/2012","Fasti");
        //System.out.println("\n"+ "la lista antes de eliminar es" + "\n" + l.toString());

        Assert.assertNotNull(l);
        l.eliminarLibro("8964");

        //System.out.println("\n"+ "la lista es" + "\n" + l.toString());

       // System.out.println("\n"+ "la lista despues de eliminar es" + "\n" + l.toString());
    }
    /**
     * Test del metodo buscar. Me permite determinar si el metodo
     * funciona segun lo esperado.
     * @throws Exception
     */

    @Test
    public void testBuscar() throws Exception {

        listaBiblioteca<String> l=new listaBiblioteca<String>();
        l.insertarLibroDePrimero("1234","El primer libro","25/03/2012","Fasti");
        l.insertarLibroDePrimero("3214","El segundo libro","25/03/2012","Fasti");
        l.insertarLibroDePrimero("8964","El tercer libro","25/03/2012","Fasti");

        System.out.println("el libro es : " + l.buscar("3214").getIsbn().toString());


    }
    /**
     * Test del metodo anadirLibroDespuesDeOtro. Me permite determinar si el metodo
     * funciona segun lo esperado.
     * @throws Exception
     */

    @Test
    public void testAnadirLibroDespuesDeOtro() throws Exception {

        listaBiblioteca<String> l=new listaBiblioteca<String>();
        l.insertarLibroDePrimero("1234","El primer libro","25/03/2012","Fasti");
        l.insertarLibroDePrimero("3214","El segundo libro","25/03/2012","Fasti");
        l.insertarLibroDePrimero("8964","El tercer libro","25/03/2012","Fasti");

       // System.out.println("\n"+ "la lista antes de añadir despues de es" + "\n" + l.toString());

        l.anadirLibroDespuesDeOtro("8964","23444","El cuarto libro","25/03/2012","Fasti",0);
      //  System.out.println("\n"+ "la lista despues de añadir despues de otro es" + "\n" + l.toString());

    }
    /**
     * Test del metodo AnadirLibroAntesDeLOtro. Me permite determinar si el metodo
     * funciona segun lo esperado.
     * @throws Exception
     */

    @Test
    public void testAnadirLibroAntesDeOtro() throws Exception {

        listaBiblioteca<String> l=new listaBiblioteca<String>();
        l.insertarLibroDePrimero("1234","El primer libro","25/03/2012","Fasti");
        l.insertarLibroDePrimero("3214","El segundo libro","25/03/2012","Fasti");
        l.insertarLibroDePrimero("8964","El tercer libro","25/03/2012","Fasti");

        System.out.println("\n"+ "la lista antes de añadir antes de es" + "\n" + l.toString());

        l.anadirLibroAntesDeOtro("8964","12264","El cuarto libro","25/03/2012","Fasti",0);

        System.out.println("\n"+ "la lista despues de añadir antes de es" + "\n" + l.toString());

    }
    /**
     * Test del metodo modificar. Me permite determinar si el metodo
     * funciona segun lo esperado.
     * @throws Exception
     */

    @Test
    public void testmodificar() throws Exception {

        listaBiblioteca<String> l=new listaBiblioteca<String>();
        l.insertarLibroDePrimero("1234","El primer libro","25/03/2012","Fasti");
        l.insertarLibroDePrimero("3214","El segundo libro","25/03/2012","Fasti");
        l.insertarLibroDePrimero("8964","El tercer libro","25/03/2012","Fasti");

        l.modificar("1234", "", "el primer libro modificado", "", "Fasti y Fasti" );
        System.out.println("\n"+ "la lista modificada es" + "\n" + l.toString());

    }



}
