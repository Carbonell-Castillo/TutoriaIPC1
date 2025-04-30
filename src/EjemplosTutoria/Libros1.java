/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosTutoria;

/**
 *
 * @author aleja
 */
public class Libros1 {
 
    String titulo;
    String autor;
    int anioPublicacion;
    boolean disponible;
    
    public Libros1(String titulo, String autor, int anioPublicacion, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
} 
    public String getTitulo(){
        return titulo;
    }
    public String getDatos(){
        return titulo + " "+ autor +" "+ anioPublicacion +" "+ disponible;
    }
}
