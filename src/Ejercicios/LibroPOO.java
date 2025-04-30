/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author aleja
 */
public class LibroPOO {
String titulo, autor;
    int anioPublicacion =0;
    String disponible;
    //LO VOY HACER CON LA FORMA DE LOS GETS Y SETS. SE PUEDE HACER MANDANDO COMO PARAMETROS EN EL CONSTRUCTOR??
    public LibroPOO(){
     this.titulo = "";
     this.autor= "";
     this.disponible= "";
     this.anioPublicacion = 0;
    }
    //Metodos gets.
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getDisponible(){
        return disponible;
    }
    
    public int getAnioPublicacion(){
        return anioPublicacion;
    }
    
    //Metodos sets.
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setDisponible(String disponible){
        this.disponible = disponible;
    }
    
    public void setAnioPublicacion(int anio){
        this.anioPublicacion = anio;
    }
    
    public String getDatos(){
    
        System.out.println("Los datos son los siguientes:");
        return "Titulo: "+titulo+" "+" Autor: "+autor+" "+" Año: "+anioPublicacion+" Disponible: "+disponible;
    }
    
    public void mostrarDatos(){
        System.out.println("Los datos son los siguientes:");
        System.out.println("Titulo: "+titulo+" "+" Autor: "+autor+" "+" Año: "+anioPublicacion+" Disponible: "+disponible);
    }
}
