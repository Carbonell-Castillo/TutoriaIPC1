
package EjemplosTutoria;
//Ejemplo de sopa de letras

import static java.lang.Math.random;
import java.util.Random;
public class EjemploSopaLetras {
    public static void main(String []args){
     char[][] tablero = new char[14][14];
     Random random = new Random();
     for(int fila = 0; fila < 14; fila++){
         for(int columna = 0; columna < 14; columna++){
             System.out.println(tablero[fila][columna] = (char)(random.nextInt(26) +65));
             
         }
     }
    }
}
