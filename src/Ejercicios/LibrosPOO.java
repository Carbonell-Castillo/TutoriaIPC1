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
public class LibrosPOO {
        private ArrayList<LibroPOO> listaLibros = new ArrayList<>();
        
 public LibrosPOO(){
     listaLibros = new ArrayList<>();
 }
 public void agregarLibros(LibroPOO libro){
     listaLibros.add(libro);
 }
 public void mostrarDatos(){
     for (int i = 0; i < listaLibros.size(); i++) {
      String titulo = listaLibros.get(i).getTitulo();
         System.out.println(titulo);
     }
     
 }
}
