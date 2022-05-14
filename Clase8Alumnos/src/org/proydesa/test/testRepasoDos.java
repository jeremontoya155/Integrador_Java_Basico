
package org.proydesa.test;

import java.util.Scanner;


public class testRepasoDos {

    
    public static void main(String[] args) {
        
        
//        int a=10;
//        int b=11;
//        
//        while(a>b){
//        
//        
//            System.out.println("Hola");
//        
//        }
//        
//        do {         
//            
//            System.out.println("Hola");
//            
//        } while (a>b);
        
        //Condicion simple
        
//        int contador=0;
//        
//        while(contador<5){
//        
//        
//            System.out.println(contador);
//            contador++;
//            
//        
//        }
        

        //Con break
//        int contador=0;
//        
//        while(true){
//        
//        
//            System.out.println(contador);
//            contador++;
//            
//            if (contador==5) {
//                break;
//                
//            } 
//            
//        
//        }
        
        //Condicion doble 
        
        //Cargue marcos
        //pero tiene 2 intentos sino se cierra
        
        
        //== para numerico o boolean
        //equals String
        // String.equals(otroString)
        /*int contador=0;
        String nombre;*/
        /*while(contador<2){
        
            nombre=cargarTexto("Ingrese marcos");
           contador++;
            if (nombre.equals("marcos")) {
                System.out.println("INGRESO CORRECTO");
                break;
            }
        
        }*/
        
//        boolean ban=true;
//        String nombre;
//        while(ban){
//        
//           nombre=cargarTexto("Ingrese si para salir");
//           
//            if (nombre.equals("si")) {
//                
//                System.out.println("Gracias por usar el programa");
//                ban=false;
//            } else {
//                
//                System.out.println("No ingreso un si ");
//            }
//            
//        
//        }
        
    
        boolean ban=retornar();
        if (ban) {
            
            System.out.println("Se ingreso martin");
            
        } else {
            System.out.println("No se ingreso o supero los 3 intetnos"
                    + "");
        }

        
        
    }

    
    
         public static String cargarTexto(String texto){
    
        Scanner sn=new Scanner(System.in);
        System.out.println(texto);
        String retorno=sn.nextLine();
        
        return retorno;
        
        
    }
         
         
         public static boolean retornar(){
         
         
            String comparar;
            int contador=0; 
            while(true){
                comparar=cargarTexto("Cargar Martin");
                contador++;
                
                if (comparar.equals("Martin")) {
                    
                    return true;
                    
                } 
                
                if (contador==3) {
                    return false;
                    
                }
            
            }
            
         
         
         }
    
 
}
