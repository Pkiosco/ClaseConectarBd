/*
 * CommitRollback.java
 *
 *
 */

package Clases;

import packBrowser.AdministradorDeConexiones;
import java.sql.Connection;

/**
 *
 * @author Sebastián S. Sanga <SebastianSanga@gmail.com>
 */
public class CommitRollback {
    
    /** Creates a new instance of CommitRollback */
    public CommitRollback() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Declara la conexion
        Connection conn = null;
        
        try
        {
            // Define la conexion
            conn = AdministradorDeConexiones.getConnection();
            
            // Setea el auto-commit en falso
            conn.setAutoCommit(false);
            
            // Acá comienza la transacción
            // alumno1.insertar();
            // alumno2.insertar();
            // alumno3.insertar();
            
            // Confirma los cambios
            conn.commit();
        }
        catch(Exception e)
        {
            try
            {
                // Vuelve atras los cambios
                conn.rollback();
            }
            catch(Exception ee){}
        }
        finally
        {
            try
            {
                // Cierra la conexion
                if( conn != null )
                    conn.close();
            }
            catch(Exception e){}
        }
    }
    
}
