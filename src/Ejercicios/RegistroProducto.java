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
public class RegistroProducto {
    
    public static Scanner Datos = new Scanner(System.in);
    
    public static void main(String[] args) {
        //ACÁ SE VA CREAR LA LISTA Y SUS ATRIBUTOS QUE TENDRÁN ENLACE CON EL SG
        
        System.out.println("Bienvenido. Por favor, Ingresa los Datos del Producto...");
        
        boolean ejecutar = true;
        
        while(ejecutar){
            System.out.println("----Ingresar los Datos Solicitados----");
            Producto producto = new Producto();
            
            System.out.println("Ingresar el Codigo del Producto:");
            String Codigo = Datos.nextLine();
            System.out.println("Ingresa la Categoria que Pertenece el Producto:");
            //LACTEOS, EMBUTIDOS, ETC.
            String Categoria = Datos.nextLine();
            System.out.println("Ingresa la Cantidad de ese Producto:");
            int Cantidad = Datos.nextInt();
            System.out.println("Ingresa el Precio del Producto:");
            double Precio = Datos.nextDouble();
            System.out.println("Ingresa el Peso en Kilogramos (kg) de ese Producto:");
            double Peso = Datos.nextDouble();
            Datos.nextLine();
            //ALMACENAMOS LOS DATOS DEL PRODUCTO
            
            producto.setCodigoProducto(Codigo);
            producto.setCategoria(Categoria);
            producto.setCantidad(Cantidad);
            producto.setPrecio(Precio);
            producto.setPeso(Peso);
            
            //LO ALMACENAMOS EN NUESTRA LISTA DE TIPO Productos
            
            SGProducto.listaProductos.AgregarProducto(Codigo, producto);
            
            System.out.println("Ingresa -1 para salir");
            String validacion = Datos.nextLine();
            
            if(validacion.equals("-1")){
            ejecutar = false;
        } 
        }
        
        //BUSCAR POR CODIGO
        System.out.println("Ingresa el Codigo del Producto para Verificar Si Existe:");  
        String CProducto = Datos.nextLine();
       //PENDIENTE PARA BUSCAR CON CODIGO
        SGProducto.listaProductos.BuscarProducto(CProducto);
            
        }
    }

