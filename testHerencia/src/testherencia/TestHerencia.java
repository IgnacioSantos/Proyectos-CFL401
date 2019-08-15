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
public class TestHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perros perro = new Perros("Boby",4,7000);
        Gatos gato = new Gatos("Mish",4,5000);
        Aves ave = new Aves("Julio",2,2,60);
        Gatos gato2 = new Gatos("Salem",4,5000);
        
        System.out.println(gato.getEnergia());
        
        gato.correr();
        gato.correr();
        gato.correr();
        gato.jugar();
        gato.jugar();
        
        System.out.println(gato.getEnergia());
        
        gato.comer("Raza");
        
        System.out.println(gato.getEnergia());
        
        System.out.println(perro.getEnergia());
        
        perro.correr();
        perro.jugar();
        
        System.out.println(perro.getEnergia());
        
        perro.comer("Raza");
        
        System.out.println(perro.getEnergia());
        
        perro.comer("Raza");
        
        perro.comer("Raza");
        
        System.out.println(perro.getEnergia());
        
        perro.comer("Raza");
        
        System.out.println(perro.getEnergia());
        
        System.out.println(gato2.getEnergia());
        
        System.out.println(gato.getEnergia());
        
        gato2.jugarCon(gato);
        
        System.out.println(gato2.getEnergia());
        
        gato2.jugarCon(gato);
        gato2.jugarCon(gato);
        gato2.jugarCon(gato);
        
        System.out.println(gato2.getEnergia());
        System.out.println(gato.getEnergia());
        
        
        gato.jugarCon(ave);
        
        System.out.println(ave.getEnergia());
        
        ave.aveFenix(ave);
        
        System.out.println(ave.getEnergia());
        
        System.out.println(gato.getEnergia());
        
        gato.dormir(127);
        
        System.out.println(gato.getEnergia());
        
        System.out.println(gato.getVidas());
        
        gato.jugarConPerros();
        
        System.out.println(gato.getVidas());
        
    }
    
}
