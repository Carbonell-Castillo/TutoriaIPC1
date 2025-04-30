
package EjemplosTutoria;

import java.util.Scanner;

public class Libros {
    public static void main(String[] args) {
      Scanner leerDatos = new Scanner(System.in);  
      int opcion = 0;
      String[] Libros = new String[0];
      int Prestados = 0;
      int Disponibles = 0;
      String[] librosPrestados = new String[0];
      do{
        System.out.println("Ingresa la opcion que quiera ejecutar:");
        System.out.println("1. Agregar libro");
        System.out.println("2. Prestar libros");
        //En el de arriba es donde se van a buscar los libros por medio de un for y así puedan ser prestados.
        //Preguntando, "¿Que libro desea tomar prestado?"
        System.out.println("3. Libros disponibles ");
        System.out.println("4. Mostrar libros prestados");
        System.out.println("5. Cantidad de libros");
        opcion = leerDatos.nextInt();
        //libros totales incluyendo prestados como disponibles
          switch (opcion) {
              case 1:
                  System.out.println("Ingrese la cantidad de libros a agregar:");
                  //No se especificaron tamaño de las palabras
                  int cantidadLibros = leerDatos.nextInt();
                  leerDatos.nextLine();
                  Libros = new String[cantidadLibros];
                  for(int i=0; i<cantidadLibros;i++){
                      System.out.println("Ingrese el Libro No. "+(i+1));
                      String Libro = leerDatos.nextLine();
                      Libros[i]=Libro;
                          System.out.println("Libro Agregado!");
                  }
  //Que cuando le de agregar otra vez me muestre unicamente los que aun están disponibles
 //Y de los que se muestren me deje agregar más y el vector se modifique, que tal si agrego otro que ya está prestado??? error??
                  break;
              case 2:
                  System.out.println("Se muestran los Libros Disponibles:");
                  for(int i=0; i<Libros.length;i++){
                      System.out.println(Libros[i]);
                  }
                      System.out.println("Ingresa el Libro que quieres Tomar Prestado");
                      leerDatos.nextLine();
                      String libroBuscar = leerDatos.nextLine();
                     
                              
                  //    boolean existe = false;
                     for(int i=0;i<Libros.length; i++){
                     if(Libros[i].equals(libroBuscar)){
                    //     existe = true;
                      //if(existe){
                     System.out.println("Libro Encontrado, Haz Tomado el Libro...");
                         //hagamos un codigo similar al de eliminar. veamos que pedo
                        int cantidadPrestados = Libros.length - 1;
                        librosPrestados = new String[cantidadPrestados];
                        int indice = 0;
                        Prestados++;
                        for(int j = 0; j < Libros.length; j++){
                            if(j != i){
                                librosPrestados[indice] = Libros[j];
                                indice++;
                            }
                        }
                         //DECREMENTO DE ALGUNA VARIABLE
                         
                    // }
                     
                       
                         //DUDA SOBRE INCREMENTOS Y DECREMENTOS ENTRE PRESTADOS Y DISPONIBLES
                         
                     }
                     }
                     
                  
                  break;
              case 3:
                  System.out.println("Los Libros Disponibles son:");
                  System.out.println(librosPrestados.length);
                  break;
              case 4:
                  System.out.println("Los Libros Que se Prestaron Son:");
                  System.out.println(Prestados);
                  break;
              case 5:
                  System.out.println("La Cantidad de Libros es:");
                  System.out.println(Libros.length);
              default:
                  
          }
      }while(opcion<6);
    }
}
