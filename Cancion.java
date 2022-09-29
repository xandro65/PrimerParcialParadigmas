/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Musica;

/**
 *
 * @author eduardoalejandrolopezlopez
 */
    public class Cancion extends Musica {

    @Override
    public void cancion(String titulo, String artista, String genero, String album, String año, String disquera, String compositor) {
        System.out.println("La cancion es: " + titulo + "\n"
                + "Del artista: " + artista + "\n"
                + "Es del genero: " + genero + "\n"
                + "Del album:  " + album + "\n"
                + "Que fue lanzado en el año : " + año + "\n"
                + "Perteneciente a la disquera: " + disquera + "\n"
                + "Que compuso: " + compositor + "\n");
    }

    void Cancion(String titulo, String artista, String genero, String album, String año, String disquera, String compositor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}


