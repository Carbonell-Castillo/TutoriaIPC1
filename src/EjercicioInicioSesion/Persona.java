/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioInicioSesion;

/**
 *
 * @author bcastillo
 */
public class Persona {
    private String nombre, fechaNacimiento, genero, nacionalidad;
    private int edad;
    
    public Persona(){
        this.nombre= "";
        this.fechaNacimiento= "";
        this.genero = "";
        this.nacionalidad = "";
        this.edad = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
public void mostrarDatos() {
    System.out.println("Los Datos Son:");
    System.out.println("Nombre: "+nombre+" Fecha Nacimiento: "+fechaNacimiento+" Edad: "+edad+" Genero: "+genero+" Nacionalidad: "+nacionalidad);
}
}
