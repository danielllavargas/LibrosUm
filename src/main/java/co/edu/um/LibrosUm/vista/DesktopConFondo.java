package co.edu.um.LibrosUm.vista;

import javax.swing.*;
import java.awt.*;


/**
 * Creado con Intellij Idea
 * Autora: danielavargas
 * Fecha: 16/08/13
 * Hora: 20:06
 */

/**
 * Clase que me permite obtener imagenes
 */
public class DesktopConFondo  extends JDesktopPane {

    //Creo una nueva imagen
    private Image imagen;

    /**
     * Constructor
     */
    public DesktopConFondo() {
    }

    /**
     * Metodo que permite imnportar una imagen con la clase ImageIcon
     * @param nombreImagen
     */
    public DesktopConFondo(String nombreImagen) {
        if (nombreImagen != null) {
            imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
        }
    }

    /**
     * metodo que permite "reutilizar" una imagen previamente definida
     * @param imagenInicial nombre de la imagen previamente definida
     */
    public DesktopConFondo(Image imagenInicial) {

        if (imagenInicial != null) {
            imagen = imagenInicial;
        }
    }

    /**
     * Metodo que me permite definir la imagen
     * @param nombreImagen previamente creada
     */

    public void setImagen(String nombreImagen) {
        if (nombreImagen != null) {
            imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
        } else {
            imagen = null;
        }

        repaint();
    }

    /**
     * Set de la imagen creada
     * @param nuevaImagen
     */
    public void setImagen(Image nuevaImagen) {
        imagen = nuevaImagen;

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
        } else {
            setOpaque(true);
        }

        super.paint(g);
    }
}
