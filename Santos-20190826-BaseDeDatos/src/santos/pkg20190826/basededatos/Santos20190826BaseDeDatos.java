/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santos.pkg20190826.basededatos;

import java.sql.*;

/**
 *
 * @author Programación
 */
public class Santos20190826BaseDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        ResultSet resultado;//creamos una variable con un tipo de dato resultset 
        Connection conexion;
        conexion = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/cfl401?user=programador&password=cfl401");//sirve para conectarse a la ruta donde se aloja la base de datos con su respectiva direcion y puerto con la tabla y usando ? es como espacio y se agrega el usuario y la contraseña.
        Statement consultor = conexion.createStatement();
        resultado = consultor.executeQuery("SELECT * FROM accesos");//usando el execute.query() consultamos en formato string igual los comandos introducidos en el mariadb.
        while (resultado.next()) {
            System.out.println(resultado.getInt("id"));
            System.out.println(resultado.getString("usuario"));
        }
        resultado = consultor.executeQuery("SELECT * FROM datospersonales");
        while (resultado.next()) {
            System.out.println(resultado.getString("apellido"));
            System.out.println(resultado.getString("nombre"));
            System.out.println(resultado.getInt("edad"));
        }
        conexion.close();
    }
    
}
