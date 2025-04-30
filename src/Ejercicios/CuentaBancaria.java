/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author aleja
 */
public class CuentaBancaria {
    String numeroCuenta = "";
    String nombreTitular = "";
    double saldo = 0;
    
    //IMPLEMENTANDO CONSTRUCTOR.
    public CuentaBancaria(String NoCuenta, String NTitular, int Saldo){
        this.numeroCuenta = NoCuenta;
        this.nombreTitular = NTitular;
        this.saldo = Saldo;
    }
    //METODOS
    
    public void setDepositar(double deposito){
        this.saldo += deposito;
    }
    
    public void setRetiro(double Cantidad){
        this.saldo -= Cantidad;
    }
    
    public void setTitular(String Titular){
        this.nombreTitular= Titular;
    }
    
    public void setNoCuenta(String Cuenta){
        this.numeroCuenta = Cuenta;
    }
    //GETS
    public String getDatos(){
       return "Saldo Final: "+saldo ;
    }
}
