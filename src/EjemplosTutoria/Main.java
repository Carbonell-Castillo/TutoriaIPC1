/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosTutoria;

/**
 *
 * @author aleja
 */
public class Main {
    public static void main(String[] args) {
    Libros1 libro1 = new Libros1("Harry Potter", "J.K Rowling", 1997, true);
    Libros1 libro2 = new Libros1("El Principito", "Antoine de Saint-Exupéry", 1943, true);
        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());
        System.out.println(libro1.getDatos());
    }
    
}
