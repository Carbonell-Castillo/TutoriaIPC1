/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bcastillo
 */
public class Condiciones {
    public static void main(String[] args) {
     
        //if
        
        //Si una perosna tiene mas de 18 años es mayor de edad en caso contrario es menor de edad
        
        int edad = 12;
        
        
        if (edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        
     
        
        //Si una persona tiene menos de 12 años es un niño, si tiene menos de 18 años es adolecente, si tiene mas de 18 es adulto
        
        int edad2=15;
        
        if(edad2<12){
            System.out.println("Es un niño");
        }else if(edad<18){
            System.out.println("Es un adolecente");
        }else if(edad>18){
            System.out.println("Es un adulto");
        }
     
        
        
        
    }
}
