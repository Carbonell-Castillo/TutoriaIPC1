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
public class EjemploTryCatch {
    
    public static Scanner leerDatos = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        
        //Ejemplo 1, vamos a sumar 2 numeros
         int numero1=0, numero2=0;    
        int total = 0;
        
        boolean validacion = false;
        
        while (validacion == false) {            
            try {
                
            System.out.println("Ingrese el numero 1");
            numero1 = leerDatos.nextInt();
            
             System.out.println("Ingrese el numero 2");
             numero2 = leerDatos.nextInt();
             
             total = numero1+numero2;
             validacion = true;
             
        } catch (Exception error) {
            System.out.println("Numero invalido, ingrese uno correcto "+error);
            leerDatos.nextLine();
        }
        
        }
        
        
        System.out.println("Resultado: "+total);        
       
        
        
        
        
    }
}
