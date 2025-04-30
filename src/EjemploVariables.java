/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bcastillo
 */

import java.util.Random;

public class EjemploVariables {
    
    static int tamanioTablero = 14;
    static char[][] tablero = new char[tamanioTablero][tamanioTablero];
    static String[] palabras = {"Libro", "Cuaderno", "Lapiz", "Lapicero"};
    
    public static void main (String[] args){       
        
        inicilizarTablero();
       
        Random rand = new Random();
        
        for (int i = 0; i < palabras.length; i++) {
            String palabraAgregar = palabras[i];
            System.out.println(palabraAgregar);
            boolean palabraColocada = false;
            
            while (!palabraColocada) {                
                int fila = rand.nextInt(tamanioTablero);
                int columna = rand.nextInt(tamanioTablero);
                boolean horizontal = rand.nextBoolean();
                
                if (horizontal && columna + palabraAgregar.length() <= tamanioTablero) {
                    for (int j = 0; j < palabraAgregar.length(); j++) {
                        tablero[fila][columna+j] =Character.toLowerCase(palabraAgregar.charAt(j));
                    }
                    palabraColocada = true;
                }else if(!horizontal && fila + palabraAgregar.length() <= tamanioTablero){
                     for (int j = 0; j < palabraAgregar.length(); j++) {
                        tablero[fila+j][columna] = Character.toLowerCase(palabraAgregar.charAt(j));
                    }
                    palabraColocada = true;
                }
                
            }
 
        }
                mostrarTablero();
        
    }
    
    
    public static void inicilizarTablero(){
        //Genera las letras aleatorias en el tablero
          Random rnd = new Random();
        for (int filas = 0; filas < tamanioTablero; filas++) {
            for (int columnas = 0; columnas < tamanioTablero; columnas++) {
                char letraRandom = (char)(rnd.nextInt(26) + 65);
                tablero[filas][columnas] = letraRandom;
            }
        }
    }
    
    public static void mostrarTablero(){
        
        //Imprime o muestrnextBooleana en pantalla el tablero respectivo 
         for (int filas = 0; filas < tamanioTablero; filas++) {
            for (int columnas = 0; columnas < tamanioTablero; columnas++) {
                System.out.print(tablero[filas][columnas]+" ");
            }
           System.out.println("");
        }
    }
    
}
