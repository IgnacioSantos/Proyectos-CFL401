/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondepersonal;

import javax.swing.JOptionPane;

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

    public static void cambiarVentana(String cambiar) {
        ocultarVentanas();

        switch (cambiar) {
            case "menu":
                menuPrincipal.setVisible(true);
                //generarAreas.setVisible(true);
                break;
            case "carUsuario":
                cargaUsuarios.setVisible(true);
                break;
            case "genAreas":
                generarAreas.setVisible(true);
                break;
            default:JOptionPane.showMessageDialog(null,"No existe esa opcion");
        }

    }

    public static void ocultarVentanas() {
        menuPrincipal.setVisible(false);
        cargaUsuarios.setVisible(false);
        generarAreas.setVisible(false);
    }
    
    private static boolean primerUsuario(){
        return true;
    }
    
    private boolean corroborarYCargar(){
        return true;
    }
}
