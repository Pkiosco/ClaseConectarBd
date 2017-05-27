/*
 * SQLUpdateSample.java
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
public class SQLUpdateSample {
    
    /** Creates a new instance of SQLUpdateSample */
    public SQLUpdateSample() {
    }
    
    public void upDate()throws Exception{
    {
        // Define la conexion
        Connection laConexion = AdministradorDeConexiones.getConnection();
        
        // Arma la sentencia de actualización y la ejecuta
        String laActualizacion = "UPDATE alumnos SET alu_apellido = 'Trobbiani' WHERE alu_id = 101";
        Statement stmtActualizacion = laConexion.createStatement();
        stmtActualizacion.execute(laActualizacion);
        
        // Cierra el Statement y la Connection
        stmtActualizacion.close();
        laConexion.close();
        
        // Informa que la actualización ha sido realizada con éxito
        System.out.println("La actualización ha sido realizada con éxito...");
    }
    
}
