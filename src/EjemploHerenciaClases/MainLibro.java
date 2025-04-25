/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploHerenciaClases;

import java.util.Scanner;

/**
 *
 * @author bcastillo
 */
public class MainLibro {

    public static Scanner leerDatos = new Scanner(System.in);

    public static void main(String[] args) {
        Libro nuevoLibro = new Libro();

        System.out.println("Ingrese el titulo del libro");
        String tituloLibro = leerDatos.nextLine();

        System.out.println("Ingrese el autor del libro");
        String autorLibro = leerDatos.nextLine();

        //Leer los numero de pagina
        int noPaginas = 0;
        boolean validacion = false;

        while (validacion == false) {
            try {
                System.out.println("Ingrese la cantidad de paginas");
                noPaginas = leerDatos.nextInt();
                validacion = true;
            } catch (Exception e) {
                System.out.println("Error, numero invalido");
                leerDatos.nextLine();
            }
        }
        
        nuevoLibro.setAutor(autorLibro);
        nuevoLibro.setTitulo(tituloLibro);
        nuevoLibro.setNoPaginas(noPaginas);
        
        System.out.println("Datos del libro");
        System.out.println(nuevoLibro.getDatos());

    }
}
