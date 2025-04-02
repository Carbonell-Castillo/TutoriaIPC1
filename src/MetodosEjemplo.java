/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bcastillo
 */
import java.util.Scanner;

public class MetodosEjemplo {
    
    static Scanner leerDatos = new Scanner(System.in);
    
    public static void main(String[] args) {
        
       
        
        System.out.println("Metodos123");
        int resultadoFinal = obtenerSuma(3, 4);
        
        System.out.println("Sums total: "+resultadoFinal);
    }
    
    public static void saludar(){
        System.out.println("Hola Juanito,. ¿Como estas?");
    }
    

    public static int obtenerSuma(int valor1, int valor2){
 
        return valor1+valor2;
    }
}

