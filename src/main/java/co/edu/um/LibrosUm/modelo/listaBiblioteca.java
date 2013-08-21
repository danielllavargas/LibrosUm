package co.edu.um.LibrosUm.modelo;

/**
 * Creado con Intellij Idea
 * Autora: Daniela Vargas Patino
 * Fecha: 16/08/13
 * Hora: 19:58
 * Paquete: Modelo
 * Clase: listaBiblioteca
 *
 * Esta clase contine los metodos que me permiten gestionar la lista de libros de la
 * biblioteca.
 * Esta sería la clase "lista"
 **/
public class listaBiblioteca<E> {

    /*
     * Defino las variables de la clase listaBiblioteca
     */
     libro<E> primero;


    /**
     * Constructor que me sirve para manejar el primer elemento de la listaBiblioteca.
     */
    public listaBiblioteca()
    {
        primero=null;
    }


    /**
     * Permite añadir un libro en la primera posición en la lista de libros
     * de la biblioteca. Es necesario realizar un "cambio" de valores,
     * ya que no es posible devolverse en las listas que no sean doblemente
     * enlazadas
     * @param isbn   Me indica la referencia isbn del libro
     * @param titulo   Me indica el titulo del libro
     * @param fechaPublicacion  Me indica la fecha de publicacion del libro
     * @param autor  Me indica el autor del libro
     *
     */
    public void insertarLibroDePrimero(E isbn, E titulo, E fechaPublicacion, E autor)
    {

        libro<E> aux= buscar(isbn);

        if (aux==null) {
            //Con esta linea, creo un nuevo libro en la lista de libros
            libro<E> nuevoLibro =new libro<E>(isbn,titulo,fechaPublicacion,autor);
            //Con esta line "intercambio" la posicion del nuevo libro, con el libro que había anteriormente.
            nuevoLibro.siguiente=primero;
            //ya teniendo al nuevo libro en la posicion anterior, ahora pongo al libro anterior en la
            //posicion siguiente a nuevo libro,cambiando asi las posiciones.
            primero=nuevoLibro;
            //Aumento el numero de ejemplares en +1
            nuevoLibro.numeroEjemplares++;

        } else {
            //aumento el numero de ejemplares en 1. Como ya existe el libro, solo incremento
            //ese numero de ejemplares y no necesito realizar el intercambio de variables.
            aux.numeroEjemplares++;
        }
    }


    /**
     * Me permite añadir un libro al final de la lista de la biblioteca. Es necesario
     * definir un condicional para poder determinar de que manera introduzco el libro.
     * @param isbn   Me indica la referencia isbn del libro
     * @param titulo   Me indica el titulo del libro
     * @param fechaPublicacion  Me indica la fecha de publicacion del libro
     * @param autor  Me indica el autor del libro
     * @param numeroEjemplares aumenta el numero de ejemplares en +1
     */

    public void insertarLibroDeUltimo(E isbn, E titulo, E fechaPublicacion, E autor, int numeroEjemplares)
    {
        libro<E> aux1= buscar(isbn);

        //si el libro no existe en la lista.
        if (aux1==null) {
            //Con esta linea, creo un nuevo libro en la lista de libros
            libro<E> nuevoLibro =new libro<E>(isbn,titulo,fechaPublicacion,autor);

            //Creo un nodo auxiliar de manera que pueda realizar el intercambio

            libro<E> aux=primero;

            /*
             * Condicional que me permite definir como insertal nodo de ultimo.
             */
            if(aux==null){
              //Si no existen libros en la lista, indico que el primer elemento
              //es el nuevo.
                primero=nuevoLibro;
            }
            else{
                //while que recorre la lista hasta que se encuentre con su ultimo
                //libro.
                while (aux.siguiente!=null)
                {
                    //mientras que el libro auxiliar no sea el ultimo, se le da a aux
                    //el valor de siguiente para que siga recorriendo la lista
                    aux=aux.siguiente;

                }

                //Como aux ya esta en la ultima posicion, yo digo que el nuevoLibro
                //sera el siguiente nodo.
                aux.siguiente=nuevoLibro;
                //Aumento el numeroEjemplares en +1 indicando que añadi un nuevo libro
                nuevoLibro.numeroEjemplares++;
            }
        } else {
            //si el libro existe en la lista, solo aumento el numero de ejemplares
            //y se conserva la posicion
            aux1.numeroEjemplares++;
        }

    }

    /**
     * Metodo que me permite eliminar un libro de la lista.
     * Eliminar un libro solamente requeriere conocer el isbn del libro que se desea
     * borrar.
     *
     *
     * @param Isbn es el unico parametro encesario para eliminar un libro, ya que el mismo es
     *        unico para cada ejemplar. Solo necesito conocer este parametro, ya que las demas
     *        pueden repetirse y no seria logico.
     * @return  la variable res, que me indica si fue posible eliminar el nodo.
     */

    public void eliminarLibro(E Isbn)
    {
        //Con esta linea, creo un nuevo libro en la lista de libros
            libro<E> aux= primero, ant=null;

        //while que me permite recorrer la lista y buscar.
        //El while para si se llega al final de la lista o se encuentra el libro
            while(aux !=null && !aux.getIsbn().equals(Isbn))
            {
                //intercambio de variables que permiten recorrer la lista
                //y evitar perdida de valores
                ant=aux;
                aux=aux.siguiente;
            }

            // si el libro aux es diferente de null
            if(aux!=null)
            {
                //si hay mas de un libro, solo se resta al numero de ejemplares.
                if (aux.numeroEjemplares != 1) {
                    aux.numeroEjemplares--;
                } else {

                    //Si solo hay un ejemplar es necesario realozar cambio de posiciones
                    //y desreferenciar el libro para que no quede un espacios en la lista

                    if(ant==null)    //si el libro es el primero en la lista
                    {
                        primero=aux.siguiente;
                    } else    //si hay otro libro por delante
                    {
                        ant.siguiente=aux.siguiente;
                    }
                }
            }
        }


    /**
     * Metodo que me permite encontrar un libro en la lista de libros de la biblioteca
     * @param isbn me indica cual libro estoy buscando.
     * @return el libro que estoy buscando, que es el que coincide con el isbn indicado
     */

    public libro<E> buscar(E isbn)
    {
        //Se crea un libro aux que lo defino en la primera posicion de la lista.
        libro<E> aux=primero;

        //Recorre la lista hasta que se llegue a la ultima posicion o hasta que se
        //encuentre el libro buscado.
        while(aux!=null && !aux.getIsbn().equals(isbn))
        {
            //Se indica al libro auxiliar como la proxima posicion
            aux=aux.siguiente;
        }
        return aux;
    }


    /**
     * Con este metodo, puedo añadir un libro despues de otro libro. Para añadir,
     * necesito crear un objeto de la clase libro para poder realizar el intercambio
     * y ademas, necesito todos los parametros para crear un nuevo libro.
     * @param ref Es un libro que me permitirá ubicar el nuevo libro
     * @param isbn   Me indica la referencia isbn del libro
     * @param titulo   Me indica el titulo del libro
     * @param fechaPublicacion  Me indica la fecha de publicacion del libro
     * @param autor  Me indica el autor del libro
     * @param numeroEjemplares aumenta el numero de ejemplares en +
     */

   public void anadirLibroDespuesDeOtro(E ref ,E isbn, E titulo, E fechaPublicacion, E autor,int numeroEjemplares)
   {
       //Se crea un libro aux que lo defino en la primera posicion de la lista
       libro<E> aux1= buscar(isbn);

       //Si el libro no está en la lista, se crea un nuevo libro.
       if (aux1==null) {

           //Se crean 2 nuevos libros.
           // Uno me recibe los parametros, el otro me sirve para buscar
           libro<E> nuevoLibro =new libro<E>(isbn,titulo,fechaPublicacion,autor);
           libro<E> librito= buscar(ref);

           //si el libro "despues" no existe, el nuevo libro se el ultimo de la lista
           if(librito.siguiente==null)
           {
               librito.siguiente=nuevoLibro;
           }
           //si el libro despues no es el ultimo, se realiza intercambio de variables.
           else
           {
               nuevoLibro.siguiente=librito.siguiente;
               librito.siguiente=nuevoLibro;
           }
           //Al añadir un libro, incremento el numero de ejemplares
           nuevoLibro.numeroEjemplares++;
       } else {
           //Al añadir un libro, incremento el numero de ejemplares
           aux1.numeroEjemplares++;
       }

   }

    /**
     * Con este metodo, puedo añadir un libro antes de otro libro.
     * Para añadir, necesito crear un objeto de la clase libro para poder realizar el intercambio
     * y ademas, necesito todos los parametros para crear un nuevo libro.
     * @param ref Me indica la referencia isbn del libro
     * @param isbn Me indica el nuevo isbn del libro
     * @param titulo  Me indica el titulo del libro
     * @param fechaPublicacion  Me indica la fecha de publicacion del libro
     * @param autor  Me indica el autor del libro
     * @param numeroEjemplares aumenta el numero de ejemplares en +
     */

   public void anadirLibroAntesDeOtro(E ref ,E isbn, E titulo, E fechaPublicacion, E autor,int numeroEjemplares)
   {
       //Se crea un libro aux que lo defino en la primera posicion de la lista
       libro<E> aux1= buscar(isbn);

       //Si la busqueda no da ningun resultado, es decir no existe el libro en la lista
       if (aux1==null) {
           //se crea un nuevo libro librito, y se busca la referencia
           libro<E> librito= buscar(ref);

           //Se llama el isbn de librito y a librito, le asigno el nuevo isbn
           E tempisbn=librito.getIsbn();
           librito.setIsbn(isbn);

           //Se llama el titulo de librito y a librito, le asigno el nuevo titulo
           E temptitulo=librito.getTitulo();
           librito.setTitulo(titulo);

           //Se llama la fecha de publicacion de librito y
           // a librito, le asigno la nueva fecha
            E tempfechapublicacion=librito.getFechaPublicacion();
           librito.setFechaPublicacion(fechaPublicacion);

           //Se llama el autor de librito y a librito, le asigno el nuevo autor
           E tempautor=librito.getAutor();
           librito.setAutor(autor);

           //Se llama el numero de ejemplares de librito y a librito,
           // le asigno el nuevo valor de ejemplares

           int tempNumeroEjemplares=librito.getNumeroEjemplares();
           librito.setNumeroEjemplares(numeroEjemplares +1);

           //llamo el metodo anadirLibroAntes
           anadirLibroDespuesDeOtro(librito.getIsbn(),tempisbn,temptitulo,tempfechapublicacion,tempautor,tempNumeroEjemplares);
       } else {

           //incremento el numero de ejemplares
           aux1.numeroEjemplares++;
       }

   }

    /**
     * Metodo que me permite imprimir todos los datos de un libro
     * @return res: un string con todos los datos de un libro especifico
     */
    public String toString()
    {
        String res="";
        for(libro<E> aux=primero;aux!=null;aux=aux.siguiente )
        {
            res += aux.getIsbn().toString() + "\n" + aux.getAutor().toString()+ "\t" + aux.getFechaPublicacion().toString() + "\t"+ aux.getNumeroEjemplares() + "\t" + aux.getTitulo().toString() + "\t"  ;
        }

        return res;
    }

    public String DatosTabla()
    {
        String res="";

        for(libro<E> aux=primero;aux!=null;aux=aux.siguiente )
        {
            res += aux.getIsbn().toString() + "\t" + aux.getTitulo().toString() + "\n";
        }
        return res;
    }


    /**
     * Metodo que me permite modificar la informacion de un libro.
     * Es necesario reemplazar los valores existentes por los dados
     * en los parámetros. No es necesario incrementar el numero de ejemplares.
     *
     * @param ref me indica el nlibro al que deseo modificarle cosas
     * @param isbn  me indica el nuevo posible valor para el isbn
     * @param titulo  me indica el nuevo posible valor para el titulo
     * @param fechaPublicacion  me indica el nuevo posible valor para la fecha de publicacion
     * @param autor  me indica el nuevo posible valor para el autor
     */

    public void modificar(E ref, E isbn, E titulo, E fechaPublicacion, E autor)
    {
        // Se crea un librito de la clase libro y por medio del metodo buscar,
        // busco si el libro ya existe.

        libro<E> librito= buscar(ref);

        //Si el valor del parametro existe, se reemplaza el valor existente del libro
        //por el del parametro
        if(isbn.toString().length() != 0)
        {
            librito.setIsbn(isbn);
        }
        if(titulo.toString().length() != 0)
        {
            librito.setTitulo(titulo);
        }
        if(fechaPublicacion.toString().length() != 0)
        {
            librito.setFechaPublicacion(fechaPublicacion);
        }
        if(autor.toString().length() != 0)
        {
            librito.setAutor(autor);
        }

    }

}
