/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondepersonal;

/**
 *
 * @author Programación
 */
public class GestionDePersonal {

    /**
     * @param args the command line arguments
     */
    
    private static MenuPrincipal menuPrincipal;
    private static CargaUsuarios cargaUsuarios;
    private static GenerarAreas generarAreas;
    public static void main(String[] args) {
        menuPrincipal = new MenuPrincipal();
        cargaUsuarios = new CargaUsuarios();
        generarAreas = new GenerarAreas();
        
        
        menuPrincipal.setVisible(true);
        
    }
     public static void cambiarVentana(){
         menuPrincipal.setVisible(false);
         generarAreas.setVisible(true);
     }
}
