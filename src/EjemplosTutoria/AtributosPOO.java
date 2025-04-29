
package EjemplosTutoria;

public class AtributosPOO {
    //Se define la clase y posteriormente sus atributos.
    //Duda en los constructores, podmeos crear varios? referente a los atributos de la clase.
    
    public class CuentaBancaria{
        String numeroCuenta;
        String nombreTitular;
        double saldo;
       
        public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldo){
            this.numeroCuenta = numeroCuenta;
            this.nombreTitular = nombreTitular;
            this.saldo = saldo;
        }
        public void depositar(double cantidad){
            //En este caso decidí que aumentara de 50 en 50.
           double saldo += cantidad;
            return saldo;

}
public void retirar(double cantidad){
    saldo 
        }
    }
    public static void main(String[] args) {
        System.out.println(libro1);
        System.out.println(libro2);
    }
}
