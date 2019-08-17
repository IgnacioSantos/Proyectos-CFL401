/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.pkg20190816.cliente;

import java.io.IOException;

/**
 *
 * @author Programación
 */
public class Santos20190816Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Client cliente = new Client();
        
        cliente.Comunicarme();
        cliente.cerrar();
    }
    
}
