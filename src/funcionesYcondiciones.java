import java.util.Scanner;

public class funcionesYcondiciones {
    static Scanner Datos2 = new Scanner(System.in);
    
    public static void main(String[] args) {
    double numero1, numero2;
        System.out.println("Ingrese el numero 1:");
        numero1 = Datos2.nextInt();
        
        System.out.println("Ingrese el numero 2:");
        numero2 = Datos2.nextInt();
        int opcion = 0;
        //menú que se irá repitiendo.
        while(opcion<5){
            System.out.println("Elije una de las Siguientes Opciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            opcion = Datos2.nextInt();
            switch(opcion){
                case 1:
                    System.out.println(funciones.suma(numero1, numero2)); 
                    
                    break;
                case 2:
                    System.out.println(funciones.resta(numero1, numero2));
                    break;   
                case 3: 
                    System.out.println(funciones.multiplicacion(numero1, numero2));
                break;
                case 4:
                  double  resultado = funciones.division(numero1, numero2);           
                break;
                
            }
        }
    }
    
}
