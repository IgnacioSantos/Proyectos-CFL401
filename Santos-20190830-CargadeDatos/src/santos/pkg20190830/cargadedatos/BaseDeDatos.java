/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.pkg20190830.cargadedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Programación
 */
public class BaseDeDatos {

    private Connection conexion;
    private String ip;
    private String puerto;
    private String usuario;
    private String contrasenia;
    private String nombreDeBd;
    private Statement consultor;

    public BaseDeDatos(String ip, String puerto, String usuario, String contrasenia, String nombreDeBd) throws SQLException {
        this.ip = ip;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombreDeBd = nombreDeBd;
        conexion = DriverManager.getConnection("jdbc:mariadb://" + ip + ":" + puerto + "/" + nombreDeBd + "?user=" + usuario + "&password=" + contrasenia);
        consultor = conexion.createStatement();
    }

    public ResultSet Consulta(String dato) throws SQLException {

        return consultor.executeQuery(dato);
    }

    public void Editar(String accion) {

    }

    public void Cerrar() throws SQLException {
        consultor.close();
        conexion.close();
    }
}
