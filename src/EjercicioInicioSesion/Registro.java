/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioInicioSesion;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author aleja
 */
public class Registro {
    
    public static Scanner Datos = new Scanner(System.in);
    
    public static void main(String[] args) {

        
        System.out.println("Bienvenido, Registrando Datos...");
        
        boolean ejecutar = true;
        
        while (ejecutar) {
            System.out.println("------Ingrese los Datos Solicitados------");
            Usuario usuario = new Usuario();
            
            System.out.println("Ingrese el Nombre de la Persona:");
            String nombre = Datos.nextLine();
            System.out.println("Ingrese la fecha de nacimiento (EN LETRAS):");
            String nacimiento = Datos.nextLine();
            System.out.println("Ingrese El Genero:");
            String genero = Datos.nextLine();
            System.out.println("Ingrese la Nacionalidad:");
            String nacionalidad = Datos.nextLine();
            System.out.println("Ingrese la Edad:");
            int edad = Datos.nextInt();
            Datos.nextLine();
            System.out.println("Correo:");
            String correo = Datos.nextLine();
            System.out.println("Contrasenia:");
            String contra = Datos.nextLine();
            
            //ALMACENAMOS Y FORMAMOS NUESTRO OBJETO PERSONA.
            
           usuario.setNombre(nombre);
           usuario.setFechaNacimiento(nacimiento);
           usuario.setGenero(genero);
           usuario.setNacionalidad(nacionalidad);
           usuario.setEdad(edad);
           usuario.setContrasena(contra);
           usuario.setCorreo(correo);
            //LO ALMACENAMOS A NUESTRA LISTA.
            
            
            
            
           SG.listaUsuarios.agregarUsuario(usuario);
           
           
         
           
            
            System.out.println("Ingresa -1 para salir");
            String validacion = Datos.nextLine();
            
            if (validacion.equals("-1")) {
                ejecutar = false;
            }
        }
        System.out.println("Ingresar correo:");
        String correoEntrante = Datos.nextLine();
        System.out.println("Ingresar contra:");
        String contraEntrante = Datos.nextLine();
        boolean valida = false;
        
        SG.listaUsuarios.IniciarSesion(correoEntrante, contraEntrante);
      
    }
}
