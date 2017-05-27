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
    private int IdBorrar;
    private String delete;
    public SQLDeleteSample(int IdBorrar) {
        this.IdBorrar = IdBorrar;
        this.delete = "DELETE FROM alumnos WHERE alu_id = "+ this.IdBorrar;
    }
    
    /** Creates a new instance of SQLDeleteSample */
    public SQLDeleteSample() {
    }
    public void Eliminar()throws Exception{
        // Define la conexion
        Connection laConexion = AdministradorDeConexiones.getConnection();
        
        // Arma la sentencia de eliminación y la ejecuta
        Statement stmtEliminacion = laConexion.createStatement();
        stmtEliminacion.execute(delete);
        
        // Cierra el Statement y la Connection
        stmtEliminacion.close();
        laConexion.close();
        
        // Informa que la eliminación ha sido realizada con éxito
        System.out.println("La eliminación ha sido realizada con éxito...");
    }
    
    
}
