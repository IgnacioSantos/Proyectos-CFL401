/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.pkg20190816.servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author Programación
 */
public class Server extends Conexiones {

    public Server() throws IOException {
        super("servidor");
    }

    public void procesar() throws IOException {
        String texto;
        String elec;
        clienteSocket = serverSocket.accept();
        prepararIO();
        salida.writeUTF("Bienvenido.");//mandamos mensaje
        salida.writeUTF("Decime tu nombre:");
        texto = entrada.readUTF();//recibimos una respuesta
        while (true) {
            salida.writeUTF("¿Como estas " + texto + "?");

            salida.writeUTF("¿Que quieres tomar:?\n"
                    + "1-Cafe\n"
                    + "2-Cappuccino\n"
                    + "3-Lagrima.");
            elec = entrada.readUTF();

            switch (elec) {
                case "1":
                    salida.writeUTF("Ya esta preparado tu Cafe.");
                    break;
                case "2":
                    salida.writeUTF("Ya esta preparado tu Cappuccino.");
                    break;

                default:
                    salida.writeUTF("Ya esta preparado tu Lagrima.");
            }

            salida.writeUTF("chau y gracias.");
            cerrar();

            //System.out.println(texto);
        }
    }

    public void prepararIO() throws IOException {
        entrada = new DataInputStream(clienteSocket.getInputStream());
        salida = new DataOutputStream(clienteSocket.getOutputStream());
    }

    public void cerrar() throws IOException {
        serverSocket.close();
        clienteSocket.close();
    }
}
