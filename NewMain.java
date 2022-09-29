/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Musica;

import java.util.Scanner;

/**
 *
 * @author eduardoalejandrolopezlopez
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creamos los objetos para el menu
        Scanner sc = new Scanner(System.in);
        TipoMusica persona = new TipoMusica();
        Cancion rola = new Cancion();
        //creacion del menu

        System.out.println("Hola, por favor ingresa tus datos");
        System.out.println("Ingresa tu nombre: ");
        String nombre2 = sc.nextLine();
        persona.setNombre(nombre2);
        System.out.println("Ahora ingresa tu edad: ");
        String edad = sc.nextLine();
        persona.setEdad(edad);
        System.out.println("Ingresa el nombre de la cancion que te gusta");
        String titulo = sc.nextLine();
        System.out.println("Ingresa el artista: ");
        String artista = sc.nextLine();
        System.out.println("Ingresa el genero de la cancion: ");
        String genero = sc.nextLine();
        System.out.println("ingresa el album: ");
        String album = sc.nextLine();
        System.out.println("Ingresa el año: ");
        String año = sc.nextLine();
        System.out.println("Ingresa la disquera: ");
        String disquera = sc.nextLine();
        System.out.println("Ingresa el compositor: ");
        String compositor = sc.nextLine();
        System.out.println("como te hace sentir esa cancion?");
        String emocion = sc.nextLine();
        persona.setGusto(emocion);
        System.out.println("A " + persona.getNombre() + " con " + persona.getEdad() + " se siente " + persona.getGusto() + " con la siguiente cancion ->");
        rola.cancion(titulo, artista, genero, album, año, disquera, compositor);

    }

}
