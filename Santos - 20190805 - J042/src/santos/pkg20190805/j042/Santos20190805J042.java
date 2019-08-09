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
public class Santos20190805J042 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota perro = new Mascota("Firu",1,4,"Perro");
        Mascota gato = new Mascota("Gea",5,4,"Gato");
        Mascota loro = new Mascota("Franco",3,2,"Loro");
        
        Persona per1 = new Persona(001,"Roberto","Fuentes",52,10235689);
        Persona per2 = new Persona(002,"Maria","Leamount",24,35222645);
        
        per1.setMascota(perro);
        per1.setMascota(gato);
        per2.setMascota(loro);
        
        
    }
    
}
