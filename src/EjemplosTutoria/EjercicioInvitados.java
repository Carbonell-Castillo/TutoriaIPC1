
package EjemplosTutoria;

import java.util.Scanner;

public class EjercicioInvitados {
    public static void main(String[] args){
        Scanner leerDatos = new Scanner(System.in);
        String[] invitados = new String[0];
       int opcion = 0;
       
        System.out.println("Bienvenido al cumpleaños, que desea hacer?");
      do{
          
          System.out.println("1. Ingresar Invitados");
          System.out.println("2. Buscar Invitados");
          opcion = leerDatos.nextInt();
          switch (opcion) {
              case 1:
                  System.out.println("Cuantos invitados desea ingresar?");
                  int numeroInvitados = leerDatos.nextInt();
                  leerDatos.nextLine();
                  invitados = new String[numeroInvitados];
                  
                  for(int i=0; i<numeroInvitados;){
                      System.out.println("Ingresa el invitado No. "+(i+1));    
                      //Se van a leer los invitados para luego almacenarlos.
                      String invitado = leerDatos.nextLine();
                      if(invitado.length()>=5 && invitado.length()<=10){
                      invitados[i]=invitado;
                      i++;
                          System.out.println("Invitado Registrado!");
                  }else{
                          System.out.println("Error con la longitud del nombre del invitado.");
                      }
                  }
                  break;
              case 2:
                  for(int i=0; i<invitados.length;i++){
                      System.out.println(invitados[i]);
                  }
                leerDatos.nextLine();
                  System.out.println("Ingresa el invitado a Buscar");
                   String invitadoBuscar = leerDatos.nextLine();
                   boolean existe = false;
                   //acá XD
                   for(int i=0; i<invitados.length;i++){
                   if(invitados[i].equals(invitadoBuscar)){
                  //     System.out.println("Bienvenido");
                       existe = true;
                       break;
                   }
                  }
                   if(existe){
                       System.out.println("Bienvenido");
                   }else{
                       System.out.println("Invitado Incorrecto");
                   }
                   break;
              default:
                  System.out.println("Opcion Incorrecta");
          }
      }while (opcion<3);
        
    }
}
