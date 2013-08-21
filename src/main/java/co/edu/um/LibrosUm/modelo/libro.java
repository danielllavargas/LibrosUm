package co.edu.um.LibrosUm.modelo;

/**
 * Creado con Intellij Idea
 * Autora Daniela Vargas Patino
 * Fecha 16/08/13
 * Hora 19:58
 * Paquete Modelo
 * Clase Libro
 * Pertenece al paquete modelo.
 *
 * Esta sería la clase "nodo" en una lista.
 **/
public class libro <E> {

    /*
     * Se declaran las variables en la clase libro.
     * isbn me hace refenrecia a el código UNICO de cada libro.
     * titulo es el nombre de los libros.
     * fechaPublicacion es la fecha en la que fue publicado un libro
     * autor es el nombre y apellido de quien escribio los libros
     * numeroEjemplares es la cantidad de libros que hay por titulo
     * siguiente me permite determinar la posicion del nodo.
     */
       private E isbn;
       private E titulo;
       private E fechaPublicacion;
       private E autor;
       int numeroEjemplares;

     //Creo un libro o nodo siguiente
       libro siguiente;

    /**
     * Metodo que me permite obtener el valor de Isbn. Es necesario ya que se
     * trata de objeto privado.
     * @return el valor de isbn
     */

    public E getIsbn() {
        return isbn;
    }

    /**
     * Metodo que me permite dar a isbn el valor que me pasen el en parametro
     * del mismo. Es necesario ya que isbn es un objeto privado.
     * @param isbn que me indica el valor que deseo para Isbn
     */

    public void setIsbn(E isbn) {
        this.isbn = isbn;
    }

    /**
     * Metodo que me permite obtener el valor del titulo. Es necesario ya que se
     * trata de objeto privado.
     * @return el valor de titulo
     */

    public E getTitulo() {
        return titulo;
    }

    /**
     * Metodo que me permite dar a titulo el valor que me pasen el en parametro
     * del mismo. Es necesario ya que titulo es un objeto privado.
     * @param titulo que me indica el valor que deseo para Titulo
     */

    public void setTitulo(E titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo que me permite obtener el valor de la fecha de publicacion.
     * Es necesario ya que se trata de objeto privado.
     *
     * @return el valor de la fecha de publicacion
     */
    public E getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Metodo que me permite dar a la fechaPublicacion el valor que me pasen el
     * en parametrodel mismo. Es necesario ya que fechaPublicacion es un objeto privado.
     *
     * @param fechaPublicacion  que me indica el valor que deseo
     *                          para la fecha de publicacion
     */

    public void setFechaPublicacion(E fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * Metodo que me permite obtener el valor del autor.
     * Es necesario ya que se trata de objeto privado.
     * @return el valor del autor
     */

    public E getAutor() {
        return autor;
    }

    /**
     * Metodo que me permite dar a el autor el valor que me pasen el
     * en parametrodel mismo. Es necesario ya que el valor es un objeto privado.
     *
     * @param autor  que me indica el valor que deseo para el autor
     */

    public void setAutor(E autor) {
        this.autor = autor;
    }

    /**
     * Metodo que me permite obtener el valor del numero de ejemplares
     *
     * @return  el valor del numero del numero de ejemplares
     */
    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    /**
     * Metodo que me permite dar a numeroEjemplares el valor que me pasen el
     *
     * @param numeroEjemplares
     */

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }


    /**
     * Constructor que me obtiene los datos de un libro y que no necesita.
     * Los parametros me sirven para tener una posibilidad infinita de las variables libro, siempre y cuando se respeten
     * las reglas establecidas para las mismas.
     * @param isbn El parametro isbn en el costructor, me permite asignar el valor que me den para isbn a isbn.
     * @param titulo El parametro titulo en el costructor, me permite asignar el valor que me den para titulo a titulo.
     * @param fechaPublicacion El parametro fechaPublicacion en el costructor, me permite asignar el valor que me den para publicacion a publicacion.
     * @param autor  El parametro autor en el costructor, me permite asignar el valor que me den para autor a autor.
     * numeroEjemplares El valor numero de ejemplares, al ser un contador, se inicializa en 0. Al agrgar un libro de determinado tipo, dicho contador aumenta en +1.
     */

    public libro(E isbn, E titulo, E fechaPublicacion, E autor) {
        this(isbn,titulo,fechaPublicacion,autor,null);
    }

    /**
     * Constructor que me permite darle valor a las variables del libro.
     * Los parametros me sirven para tener una posibilidad infinita de las variables libro, siempre y cuando se respeten
     * las reglas establecidas para las mismas.
     * Requiero la referencia del libro siguiente de la lista
     * @param isbn   El parametro isbn en el costructor, me permite asignar el valor que me den para isbn a isbn.
     * @param titulo El parametro titulo en el costructor, me permite asignar el valor que me den para titulo a titulo.
     * @param fechaPublicacion  El parametro fechaPublicacion en el costructor, me permite asignar el valor que me den para publicacion a publicacion.
     * @param autor El parametro autor en el costructor, me permite asignar el valor que me den para autor a autor.
     * @param siguiente Siguiente me permite determinar la posicion del nodo dentro de la lista.
     * numeroEjemplares El valor numero de ejemplares, al ser un contador, se inicializa en 0. Al agrgar un libro de determinado tipo, dicho contador aumenta en +1.
     */


    public libro(E isbn, E titulo, E fechaPublicacion, E autor, libro<E> siguiente) {

        /*
         * A las variables definidas inicialmente, les asigno el valor que me pasen en el constructor.
         */
        this.isbn = isbn;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.numeroEjemplares = 0;
        this.siguiente = siguiente;
    }

}
