/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bcastillo
 */

import java.util.Scanner;

public class ScannerEjemplo {
    public static void main(String[] args) {
        
        //Esto es obligatorio para definir una lectura de datos
        Scanner leerDatos = new Scanner(System.in);
        
        System.out.println("Bienvenido");
        
        
        //out -> salida
        //in -> entrada
        
        //Para leer los datos se necesita usar el siguiente comando o linea de codigo
        //Si es texto o cadena se utiliza nextLine
        //Si se va a ingresar un numero se utiliza nextInt
        //Si se va ingresar un numero decimal cual nextDouble
        
        
        //Leer el nombre de juanito
        
        String nombre;
        
        System.out.println("Ingrese su nombre: ");
        
        nombre = leerDatos.nextLine();
        
        System.out.println("El nombre es: "+nombre);
        
        
        
        funciones.suma(0, 0);
        
        
    }
    
    
    public static int suma(int numero1,int numero2, int numero3){
        return numero1+numero2+numero3;
    }
    
    
    
}
