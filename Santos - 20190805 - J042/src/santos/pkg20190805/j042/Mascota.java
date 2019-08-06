/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.pkg20190805.j042;

/**
 *
 * @author Programación
 */
public class Mascota {
    private String nombre;
    private int edad;
    private int patas;
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPatas() {
        return patas;
    }

    public String getTipo() {
        return tipo;
    }

    public Mascota(String nombre, int edad, int patas, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.patas = patas;
        this.tipo = tipo;
    }
    
    public boolean sosMayorA(int edad){
        return this.edad<edad;
    }
}
