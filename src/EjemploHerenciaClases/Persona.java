/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploHerenciaClases;

/**
 *
 * @author bcastillo
 */
public class Persona {
    private String pelo;
    private String torso;
    private String cara;
    
  
    //Primer constructor crea el boceto en blanco
    Persona(){
        this.pelo = "";
        this.torso = "";
        this.cara = ":)";
    }
    
    //Segundo contructor, crea el boceto de una persona completa, ya sabiendo los datos
    public Persona(String pelo, String torso, String cara){
        this.pelo = pelo;
        this.torso = torso;
        this.cara = cara;
    }
    
    //Metodos
    
    //Asigna uno por uno
    public void setCara(String cara){
        this.cara = cara;
    }
    
    
    //asigna uno por uino
    public void setTorso(String torso){
        this.torso = torso;
    }
    
    
    //asigna uno por uno
    public void setPelo(String pelo){
        this.pelo = pelo;
    }
    
    //Get que sirven para obtener los datos respectivamente uno por uino
    
    public String getCara(){
        return cara;
    }
    
    public String getTorso(){
        return torso;
    }
}
