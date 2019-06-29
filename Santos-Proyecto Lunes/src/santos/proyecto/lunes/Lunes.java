/*
4 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.proyecto.lunes;

/**
 *
 * @author Programación
 */
public class Lunes {
public static VentanaLogin ventanaLogin = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ventanaLogin = new VentanaLogin();
        iniciar();
        
        
        
        
        //System.out.println("Hola mundo");
        
        //System.out.println("Adios");
        
        
        
        
    }
    
    public static void iniciar(){
        ventanaLogin.setVisible(true);
    }
    
    public static void mostrar(){
        PersonaCorta per1 = new PersonaCorta("Juan","Perez",28);
        PersonaCorta per2 = new PersonaCorta("Marta","Lopez",38);
        PersonaCorta per3 = new PersonaCorta("Pepe","Argento",59);
        
        System.out.println(per1.getNombre());
        System.out.println(per2.getNombre());
        per3.setNombre("Xuxa");
        System.out.println(per1.getNombre());
    }
}
