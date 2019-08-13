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
        super (nombre,patas,100);
        this.cantPelos = cantPelos;
        
        /*this.nombre = nombre;
        this.patas = patas;
        this.cantPelos = cantPelos;
        energia = 100;*/
    }
    
    public int getCantPelos() {
        return cantPelos;
    }

    public void setCantPelos(int cantPelos) {
        this.cantPelos = cantPelos;
    }
    
    public void correr(){
        energia = energia-10;
    }
    
    public void jugar(){
        energia = energia-15;
    }
    
    @Override
    public void comer(String nomComida){
        if(nomComida.equals("Raza")){
            energia = energia+15;
    }
    }
}




