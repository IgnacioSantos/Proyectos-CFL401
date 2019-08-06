/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.pkg20190805.j042;

import java.util.ArrayList;

/**
 *
 * @author Programación
 */
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private ArrayList <Mascota> mascotas;

    public Mascota[] getMascota() {
        return mascotas;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMascota(Mascota[] mascota) {
        this.mascotas = mascota;
    }

    public Persona(int id, String nombre, String apellido, int edad, int dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        mascotas = new ArrayList();
    }
    
    public boolean estaLaMascota(String nombre){
        return  
    }
    
    public int cuantasMascotasTenes(){
        return mascotas.length;
                
    }
    
    public boolean sosMayorA(int edad){
        return this.edad<edad;
    }

    
}


