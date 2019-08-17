/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.pkg20190816.cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Programación
 */
public class Client extends Conexiones {

    public Client() throws IOException {
        super("cliente");
    }

    public void prepararIO() throws IOException {
        entrada = new DataInputStream(clienteSocket.getInputStream());
        salida = new DataOutputStream(clienteSocket.getOutputStream());
    }

    public void cerrar() throws IOException {
        clienteSocket.close();
    }

    public void Comunicarme() throws IOException {
        Scanner teclado = new Scanner(System.in);
        String texto;
        String respuesta;
        prepararIO();
        texto = entrada.readUTF();
        System.out.println(texto);
        texto = entrada.readUTF();
        System.out.println(texto);
        salida.writeUTF(respuesta = teclado.nextLine());
        texto = entrada.readUTF();
        System.out.println(texto);
        texto = entrada.readUTF();
        System.out.println(texto);
        salida.writeUTF(respuesta = teclado.nextLine());
        texto = entrada.readUTF();
        System.out.println(texto);
        texto = entrada.readUTF();
        System.out.println(texto);
        cerrar();
    }
}
