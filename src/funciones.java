
import java.util.Scanner;

public class funciones {
    static Scanner Datos = new Scanner(System.in);
    
    public static void main(String[] args){
    double numero1, numero2;
    
        System.out.println("Ingrese numero 1:");
        numero1 = Datos.nextInt();
        
        System.out.println("Ingrese numero 2:");
        numero2 = Datos.nextInt();
       double resultadoresta = resta(numero1, numero2);
       double resultadomultiplicacion = multiplicacion(numero1, numero2);
       double resultadodivision = division(numero1, numero2);
       //Resultados de las operaciones:
        System.out.println("El resultado de la resta es: "+resultadoresta);
        System.out.println("El resultado de la multiplicacion es: "+ resultadomultiplicacion);
        System.out.println("El resultado de la division es: "+resultadodivision);
        despedida();
    }
    //Implementacion de Funciones:
    public static double multiplicacion(double valor1, double valor2){
        return valor1*valor2;
    }
    public static double division(double valor1, double valor2){
        return valor1/valor2;
    }
    public static double resta(double valor1, double valor2){
        return valor1-valor2;
    }
    //Implementacion de metodo:
           public static void despedida(){
               System.out.println("Los resultados se mostraron correctamente, Adios! :D");   
           }
    }