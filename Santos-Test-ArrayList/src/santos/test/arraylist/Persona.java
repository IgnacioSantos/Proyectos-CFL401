/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.test.arraylist;

import java.util.ArrayList;

/**
 *
 * @author Programación
 */
public class Persona {
    private String nombre;
    private int edad;
    private ArrayList <Mascotas> mascotas;//al declarar la variable se utiliza dentro de la clase propia

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        mascotas = new ArrayList();
    }
    
    public int agregarMascota(Mascotas mascota){//se crea una nueva funcion dentro de otra clase para asignarle una mascota a una persona
        mascotas.add(mascota);//se agrega una mascota a la ArrayList de mascota
        return mascotas.size();//el size te da la cantidad de elementos del tipo mascotas
    }
    
    public int cuantasMascotasTenes(){
     return mascotas.size();
    }
}
