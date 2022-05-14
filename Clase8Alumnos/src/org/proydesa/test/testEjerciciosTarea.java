package org.proydesa.test;

import java.util.Scanner;
import org.proydesa.clases.Perros;

public class testEjerciciosTarea {


    public static void main(String[] args) {
        
         int cantidad=cargarNumero("Ingrese la cantidad de Perros");
        
         Perros[] ingresoPerros = new Perros[cantidad];
         
         
         cargarArray(ingresoPerros);
         accionMostrar(ingresoPerros);
         
         
    }
    
    public static int cargarNumero(String texto){
    
    
        Scanner sn= new Scanner(System.in);
        System.out.println(texto);
        int  numero=sn.nextInt();
        return numero;
    }
    
    public static String cargaTexto(String texto){
        
        Scanner sn= new Scanner(System.in);
        System.out.println(texto);
        String nombre=sn.nextLine();
        
        return nombre;
    }
    
    public static void accionMostrar(Perros[] array){
        
            for (Perros p1 : array) {
            
            if (p1.getEdad()>10) {
                System.out.println(p1.toString()+" requiere cuidado especial");
               
                
            } else {if (p1.getEdad()<2) {
                System.out.println("se cobra para:"+p1.getNombre()+" un adicional");
                
                
                    
                
                }
 
            }
            
        }
        
    
    }
    
    
    public static void cargarArray(Perros[] array){
    
                 for (int i = 0; i < array.length; i++) {
           
             
             String nombre=cargaTexto("Ingrese el nombre del perro");
             int Edad= cargarNumero("ingrese la edad del perro");
             
             Perros P1=  new Perros(nombre,Edad);
             
             
             array[i]=P1;


//Perros ingesoPerro = ;
            
        }
    
    
    }

    
    
}
        
       
