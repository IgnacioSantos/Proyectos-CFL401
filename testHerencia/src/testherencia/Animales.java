/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia;

/**
 *
 * @author Programación
 */
public class Animales {
    protected String nombre;
    protected int patas;
    protected int energia;

    Animales(String nombre, int patas, int energia) {
        this.nombre = nombre;
        this.patas = patas;
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    public void comer(String nomComida){
        if(energia<30){
            energia = energia+15;
        }
    }
    
    
    }

