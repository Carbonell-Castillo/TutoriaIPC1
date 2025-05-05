/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.ArrayList;


/**
 *
 * @author aleja
 */
public class Productos {
    //DUDA PORQUE SE LE COLOCA PRIVATE?
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    
    public Productos(){
        listaProductos = new ArrayList<>();
    }
    
    //MIS METODOS DE PRODUCTOS
    
    public void AgregarProducto(String CodigoProd, Producto producto){
        boolean validacion = false;
        for (int i = 0; i < listaProductos.size(); i++) {
            String codigoProducto = listaProductos.get(i).getCodigoProducto();
            if (codigoProducto.equals(CodigoProd)) {
                validacion = true;
                break;
                //PARA QUE SE SALGA UNA VEZ HAYA ENCONTRADO LA QUE ERA.
            }
        }
        if (validacion) {
            System.out.println("El Producto Ya Existe...");
            System.out.println("Ingresa un Codigo Distinto."); 
        }else if(!validacion && producto.getPrecio()>0){
            System.out.println("Producto Disponible. Agregado");
            listaProductos.add(producto);
        }else{
            System.out.println("No se Pudo Colocar Producto");
        }
    }
    
    public void BuscarProducto(String Codigo){
        boolean validacion = false;
        for (int i = 0; i < listaProductos.size(); i++) {
            String ProductoCodigo = listaProductos.get(i).getCodigoProducto();
            if (ProductoCodigo.equals(Codigo)) {
                validacion = true;
                System.out.println("Producto Encontrado. Mostrando Producto...");
               listaProductos.get(i).mostrarDatos();
                //DUDA EXISTENCIAL
            }
        }
    }
}
