
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bcastillo
 */
public class Problema {
    static Scanner leerDatos = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion =0 ;
         int cantidadNombres=0;
         
        String[] nombres = new String[0];
        
         while(opcion<6){
     
        System.out.println("Bienvenidos");
        System.out.println("1. Ingresar nombre");
        System.out.println("2. Mostrar nombres");
        System.out.println("3. Tabla de multiplicar");
        System.out.println("4. Suma");
        System.out.println("5. Resta");
        System.out.println("6. Salir");
        
        
        opcion = leerDatos.nextInt();
  
             switch (opcion) {
                 case 1:
                     System.out.println("----Ingreso de nombres----");
                     System.out.println("Ingrese la cantidad de nombres");
                     cantidadNombres = leerDatos.nextInt();
                     
                    //Definimos el array de nombres con la cantidad de nombres 
                       nombres = new String[cantidadNombres];
                      leerDatos.nextLine();
                       
                       for(int i =0; i<cantidadNombres; i++){
                           System.out.println("Ingrese el nombre: "+(i+1));
                           nombres[i] = leerDatos.nextLine();
                       }
                    
                     
                     System.out.println("Cantidad de nombres: "+cantidadNombres);
                     
                     break;
                 case 2:
                     System.out.println("----Mostrar nombres----");
                     for (int i = 0; i < cantidadNombres; i++) {
                         System.out.println("Nombre: "+nombres[i]);
                     }
                     
                     break;
                 default:
                     System.out.println("Error, opcion incorrecta");
             }
     
        
        System.out.println("Opcion: "+opcion);
        
           
        }
        
        
    }
}
