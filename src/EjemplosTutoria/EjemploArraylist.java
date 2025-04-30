/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosTutoria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bcastillo
 */
public class EjemploArraylist {
    public static Scanner leerDatos = new Scanner(System.in);
 
    public static void main(String[] args) {
        
        /*String[] nombres = new String[infinito];
        
        nombres[0]= "Juanito";
        nombres[1]= "Pedrito";
        nombres[2]= "Santiago";
        
        System.out.println(nombres[0]);
        */
        
        /*ArrayList<String> nombres = new ArrayList<>();
        
        nombres.add("Juanito");
        nombres.add("Pedrito");
        nombres.add("Santiago");
        nombres.add("Fernando");
        
        System.out.println(nombres);
        System.out.println(nombres.size());
        */
        
        
        //Se desea crear un programa que almacene un listado de libros
        
        ArrayList<String> listadoLibros = new ArrayList<>();
        
        boolean ejecutarMenu = true;
        
        while(ejecutarMenu){
            System.out.println("Ingrese el nombre del libro (-1 para salir)");
            String dato = leerDatos.nextLine();
            
            if(dato.equals("-1")){
                ejecutarMenu = false;
            }else{
                listadoLibros.add(dato);
            }
            
        }
        
        System.out.println(listadoLibros);
        
        //Metodos del arraylist
        
        //Metodo para obtener el tamaño
        int tamaño = listadoLibros.size();
        
        //Metodo para obtener respecto a un indice
        String libro1 = listadoLibros.get(0);
        
        //Metodo para eliminar
        listadoLibros.remove(1);
        
        //Metodo para eliminar todos
        listadoLibros.removeAll(listadoLibros);
        
        //Metodo para buscar y sustituir por indice
        
        listadoLibros.set(0, "Harry");
        
        //Ayuda a validar si esta vacio
        listadoLibros.isEmpty();
        
        //Obtener la sublista
        listadoLibros.subList(0, 2);
        
       
        
        
    }
}
