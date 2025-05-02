/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bcastillo
 */
public class mainListaLibros {
    
    public static Scanner leerDatos = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        ArrayList<LibroPOO> listaLibros = new ArrayList<>();
        
        System.out.println("Bienvenido");
        
        boolean ejecutarMenu = true;
        
        while (ejecutarMenu) {            
            System.out.println("---Ingrese los datos del libro---");
            LibroPOO libro = new LibroPOO();
            
            System.out.println("Ingrese el titulo");
            String tituloLibro = leerDatos.nextLine();
            
            System.out.println("Ingrese el autor");
            String nombreAutor = leerDatos.nextLine();
            
            System.out.println("Ingrese el año de publicacion");
            int anio = leerDatos.nextInt();
            
            //Almacenar y formar nuestro objeto libro
            
            libro.setTitulo(tituloLibro);
            libro.setAutor(nombreAutor);
            libro.setAnioPublicacion(anio);
            libro.setDisponible("Si");
            
            //Almacenamos en la lista
            
            listaLibros.add(libro);
            
            leerDatos.nextLine();
            System.out.println("Ingrese -1 para salir");
            String datoValidador = leerDatos.nextLine();
            
            if (datoValidador.equals("-1")) {
                ejecutarMenu= false;
            }
            
            
        }
        
        
        for (int i = 0; i < listaLibros.size(); i++) {
                listaLibros.get(i).mostrarDatos();    
        }
        
        
    }
}
