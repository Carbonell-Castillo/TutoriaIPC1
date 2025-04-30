
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

    }
}
