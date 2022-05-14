
package org.proydesa.clases;

public class Perros {
    
    
    public String nombre;
    public int Edad;

    public Perros(String nombre, int Edad) {
        this.nombre = nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", Edad=" + Edad ;
    }

   
    
}