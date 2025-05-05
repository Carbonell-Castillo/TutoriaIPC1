/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author aleja
 */
public class Producto {
 //ACÁ VA IR LO DE LOS CONSTRUCTORES Y METODOS
    String CodigoProducto = "", Categoria = "";
    int cantidad = 0;
    double Precio = 0, Peso = 0;
    
    public Producto(){
    this.CodigoProducto = "";
    this.Categoria = "";
    this.cantidad = 0;
    this.Precio = 0;
    this.Peso = 0;
}
    //METODOS DE MI CLASE PRODUCTO
    //SETTERS
    
    public void setCodigoProducto(String CProducto){
        this.CodigoProducto = CProducto;
    }
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    
//GETTERS
    
    public String getCodigoProducto() {
        return CodigoProducto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public double getPeso() {
        return Peso;
    }
   
    public void mostrarDatos(){
        System.out.println("Codigo: "+CodigoProducto);
        System.out.println("Categoria: "+Categoria);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Precio: "+Precio);
        System.out.println("Peso: "+Peso);
    }
}

