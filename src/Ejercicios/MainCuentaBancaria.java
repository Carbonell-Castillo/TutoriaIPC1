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
public class MainCuentaBancaria {
    
    public static Scanner DatosIG = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese el nombre del Titular:");
        String Nombre = DatosIG.nextLine();
        System.out.println("Ingresa el numero de Cuenta:");
        String NoCuenta = DatosIG.nextLine();
        System.out.println("Ingresa la cantidad a depositar:");
        double Cantidad = DatosIG.nextDouble();
        System.out.println("Ingresa la cantidad a debitar:");
        double Debito = DatosIG.nextDouble();
        
       // CuentaBancaria cuenta1 = new CuentaBancaria(NoCuenta, NTitular, 0);
    }
    
}
