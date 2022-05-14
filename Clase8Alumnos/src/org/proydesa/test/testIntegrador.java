
package org.proydesa.test;

import java.util.Scanner;


public class testIntegrador {
    
    
    
    
    
/*

Para implementar todos los casos de manera completa vamos a realizar lo siguiente 

un programa que realize la carga del array de String de manera dinamica

para el mismo vamos a hacer verificacion siguiendo los pasos que vamos a aclarar 

1-Para la cargar del array debemos pasarle la cantidad de elementos que van a componer al mismo 

2-una vez definido el array con la cantidad de elementos vamos a tener tambien una variable opcion

la cual va a preguntar si se quiere cargar el array ingresado con String de manera dinamica (en este caso nombres) con un "SI"

3-en este caso vamos a ver si la respuesta es correcta dejando posibilidad a que la persona se equivoque 3 veces , en caso de que esto ocurra el programa finalizaria aqui

4-si la persona cargo de manera correcta el arreglo vamos a preguntar si quiere mostrar el mismo con un si o un no indicando que ingrese (1) para si y (2) para no 

5-en caso de que ingrese 2 se termina el programa con un saludo , caso de ingresar 1 mostramos una por una la lista, para cualquier otro ingreso simplemente finalizamos diciendo que hubo un error

CONDICION 

SE DEBE USAR IF ELSE SWITCH FORE FORI WHILE y NO SE DEBE REPETIR NINGUNO DE ELLOS MAS DE UNA VEZ A EXCEPCION DEL IFELSE

funcion consultar cagar (texto){
    
    
    3 veces ban false retornas 
    
    retornar boolean
    }
    






*/
    
    public static void main(String[] args) {
        
        int cantidad = cargarNumero("Ingrese la cantidad de elementos para el arreglo");
        
        String[] nombres=new String[cantidad];
        
        boolean ban=confirmar();
        
        cargar(nombres,ban);
        finalizar(ban,nombres);
        
        
        
    }
    
    
    public static int  cargarNumero(String texto){
    
    
        Scanner sn= new Scanner(System.in);
        System.out.println(texto);
        int retorno=sn.nextInt();
        return retorno;
    }
  
      public static String  cargarString(String texto){
    
    
        Scanner sn= new Scanner(System.in);
        System.out.println(texto);
        String retorno=sn.nextLine();
        return retorno;
    }

      public static boolean confirmar(){
      
      
          String confirmacion;
          int contador=1;
          while(true){

              confirmacion=cargarString("Ingrese SI para confirmar la carga");
              if (confirmacion.equals("SI")) {
                  
                  return true;
              }
              
              if (contador==3) {
                  
                  return false;
                  
              }
              contador++;
              
                   
          
              
          
          
          }
      
      }


      public static void cargar(String[] array,boolean bandera){
      
      
          if (bandera) {
              
              
              for (int i = 0; i < array.length; i++) {
                  
                  String indicacion="Ingrese el nombre para la persona("+(i+1)+")";
                  array[i]=cargarString(indicacion);
                  
              }
              
          } 
      
      
      
      
      }

      
      public static void finalizar(boolean ban,String[] array){
      
      
          if (ban) {
              
              int numero=cargarNumero("Ingrese (1) para mostrar lista o (2) para no mostrarla");
              
              switch(numero){
              
                  case 1:
                      for (String elemento : array) {
                          System.out.println(elemento);
                      }
                      break;
                  case 2:
                      System.out.println("Se finaliza el programa sin mostrar la lista");
                      break;
                  default:
                      System.out.println("Error");
              
              
              }
              
          } else {
              
              System.out.println("Gracias por usar el programa");
              
          }
      
      }
}
