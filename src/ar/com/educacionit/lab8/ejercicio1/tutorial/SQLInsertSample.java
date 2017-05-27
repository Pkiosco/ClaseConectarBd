/*
 * SQLInsertSample.java
 *
 *
 */

package ar.com.educacionit.lab8.ejercicio1.tutorial;

import ar.com.educacionit.lab8.ejercicio1.administrador.AdministradorDeConexiones;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Sebastián S. Sanga <SebastianSanga@gmail.com>
 */
public class SQLInsertSample {
    
    /** Creates a new instance of SQLInsertSample */
    public SQLInsertSample() {
    }

    public static void main(String[] args) throws Exception
    {
        // Define la conexion
        Connection laConexion = AdministradorDeConexiones.getConnection();
    
        // Arma la sentencia de inserción y la ejecuta
        String laInsercion = "INSERT INTO alumnos ( alu_nombre, alu_apellido) VALUES ( 'Manuel', 'Santos')";
        Statement stmtInsercion = laConexion.createStatement();
        stmtInsercion.execute(laInsercion);
        
        // Cierra el Statement y la Connection
        stmtInsercion.close();
        laConexion.close();
        
        // Informa que la inserción ha sido realizada con éxito
        System.out.println("La inserción ha sido realizada con éxito...");
        
    }
    
}
