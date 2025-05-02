/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioInicioSesion;

import java.util.ArrayList;

/**
 *
 * @author bcastillo
 */
public class Usuarios {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    
    public Usuarios(){
        listaUsuarios = new ArrayList<>();
    }
    
    public void IniciarSesion(String correo, String contrasenia){
        boolean valida = false;
        for (int i = 0; i < listaUsuarios.size(); i++) {
           String correoUsuario = listaUsuarios.get(i).getCorreo();
           String contraseniaUsuario = listaUsuarios.get(i).getContrasena();
           
            if (correoUsuario.equals(correo) && contraseniaUsuario.equals(contrasenia)) {
                
                valida = true;
            }
           
        }
        if(valida){
            System.out.println("Bienvenido, inicio de sesion Sastisfactoriamente");
        }else{
            System.out.println("Correo inexistente");
        }
    }
    
    public void agregarUsuario(Usuario usuario){
        if(usuario.getEdad()> 18){
            listaUsuarios.add(usuario);
        }else{
            System.out.println("No es mayor de edad");
        }
        
    }
}
