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
 * @author Sebasti�n S. Sanga <SebastianSanga@gmail.com>
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
        
        // Arma la sentencia de eliminaci�n y la ejecuta
        Statement stmtEliminacion = laConexion.createStatement();
        stmtEliminacion.execute(delete);
        
        // Cierra el Statement y la Connection
        stmtEliminacion.close();
        laConexion.close();
        
        // Informa que la eliminaci�n ha sido realizada con �xito
        System.out.println("La eliminaci�n ha sido realizada con �xito...");
    }
    
    
}
