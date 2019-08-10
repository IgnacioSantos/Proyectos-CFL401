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
public class Perros extends Animales{
    private int cantPelos;

    
    public Perros(String nombre,int patas,int cantPelos){
        this.nombre = nombre;
        this.patas = patas;
        this.cantPelos = cantPelos;
        energia = 100;
    }
    
    public int getCantPelos() {
        return cantPelos;
    }

    public void setCantPelos(int cantPelos) {
        this.cantPelos = cantPelos;
    }
    
    public void correr(){
        
    }
    
    public void jugar(){
        
    }
}




