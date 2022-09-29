/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Musica;

/**
 *
 * @author eduardoalejandrolopezlopez
 */
public class TipoMusica {

    private String nombre;
    private String edad;
    private String gusto;

    public TipoMusica() {
        this.nombre = null;
        this.edad = null;
        this.gusto = null;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the gusto
     */
    public String getGusto() {
        return gusto;
    }

    /**
     * @param gusto the gusto to set
     */
    public void setGusto(String gusto) {
        this.gusto = gusto;
    }
    
}

