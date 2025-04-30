/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class MainLibroPOO {
     public static Scanner DatosIG = new Scanner(System.in);
    public static void main(String[] args) {
        LibroPOO nuevoLibro1 = new LibroPOO();
        //ACÁ VOY A PONER TODO LÓ QUE YO QUIERA MOSTRAR PERO DE MI CLASE LIBRO
       //String Autor, Titulo;
       //int Aniopublicacion;
      // boolean disponible;
            System.out.println("Ingrese el Titulo del Libro:");
        String TituloLibro = DatosIG.nextLine();
        
        System.out.println("Ingrese el Autor del Libro:");
       String AutorLibro = DatosIG.nextLine();
       
        System.out.println("En que año Fue Publicado:");
        int AnioLibro = DatosIG.nextInt();
        DatosIG.nextLine();
        System.out.println("Esta Disponible actualmente?");
        String Disponible = DatosIG.nextLine();
             boolean disponible = false;
        if (Disponible.equals("Si") || Disponible.equals("si")) {
            disponible = true;
            //CREO QUE ACÁ NO HAY NECESIDAD DE COLOCAR LA PARTE NEGATIVA DEL IF
        }
        String Validacion ="";
        if(disponible = true){
            Validacion = "Si";
        }else{
            Validacion = "No";
        }
        
        //ACA SE COLOCAN LAS COSAS
        nuevoLibro1.setAutor(AutorLibro);
        nuevoLibro1.setTitulo(TituloLibro);
        nuevoLibro1.setDisponible(Validacion);
        nuevoLibro1.setAnioPublicacion(AnioLibro);
        
       //ACÁ SE MUESTRAN LOS DATOS.
        System.out.println(nuevoLibro1.getDatos());
        
          
        //SEGUNDO OBJETO
        LibroPOO nuevoLibro2 = new LibroPOO();
        
         System.out.println("Ingrese el Titulo del Nuevo Libro:");
        String TituloLibro2 = DatosIG.nextLine();
        
        System.out.println("Ingrese el Autor del Nuevo Libro:");
       String AutorLibro2 = DatosIG.nextLine();
       
        System.out.println("En que año Fue Publicado el Nuevo Libro:");
        int AnioLibro2 = DatosIG.nextInt();
        DatosIG.nextLine();
        System.out.println("Esta Disponible actualmente?");
        String Disponible2 = DatosIG.nextLine();
             boolean disponible2 = false;
        if (Disponible2.equals("Si") || Disponible.equals("si")) {
            disponible = true;
            //CREO QUE ACÁ NO HAY NECESIDAD DE COLOCAR LA PARTE NEGATIVA DEL IF
        }
        String Validacion2 ="";
        if(disponible = true){
            Validacion = "Si";
        }else{
            Validacion = "No";
        }
        
        //ACA SE COLOCAN LAS COSAS
        nuevoLibro2.setAutor(AutorLibro);
        nuevoLibro2.setTitulo(TituloLibro);
        nuevoLibro2.setDisponible(Validacion);
        nuevoLibro2.setAnioPublicacion(AnioLibro);
        
        //ACÁ SE MUESTRAN LOS DATOS.
        System.out.println(nuevoLibro1.getDatos());
        
    }
    //TERMINADO PERO CON DUDAS XDXD
}
