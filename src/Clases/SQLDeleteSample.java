/*
 * SQLDeleteSample.java
 *
 *
 */

package Clases;

import packBrowser.AdministradorDeConexiones;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Sebastián S. Sanga <SebastianSanga@gmail.com>
 */
public class SQLDeleteSample {
    
    /** Creates a new instance of SQLDeleteSample */
    public SQLDeleteSample() {
    }
    
    public static void main(String[] args) throws Exception
    {
        // Define la conexion
        Connection laConexion = AdministradorDeConexiones.getConnection();
        
        // Arma la sentencia de eliminación y la ejecuta
        String laEliminacion = "DELETE FROM alumnos WHERE alu_id = 101";
        Statement stmtEliminacion = laConexion.createStatement();
        stmtEliminacion.execute(laEliminacion);
        
        // Cierra el Statement y la Connection
        stmtEliminacion.close();
        laConexion.close();
        
        // Informa que la eliminación ha sido realizada con éxito
        System.out.println("La eliminación ha sido realizada con éxito...");
    }
    
    
}
