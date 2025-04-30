/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploHerenciaClases;

/**
 *
 * @author bcastillo
 */
public class Libro {
    private String titulo, autor;
    private int noPaginas;
    // CONSTRUCTOR
    public Libro(){
        this.titulo = "";
        this.autor ="";
        this.noPaginas = 0;
    }
    
    
    //metodos get
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getNoPaginas(){
        return noPaginas;
    }
    
    //metodos set
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
 
    public void setNoPaginas(int noPaginas){
        this.noPaginas = noPaginas;
    }
    
    
    public String getDatos(){
        return autor+ " "+titulo+ " "+ noPaginas;
    }
    
}
