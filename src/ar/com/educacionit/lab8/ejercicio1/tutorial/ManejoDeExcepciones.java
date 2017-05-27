/*
 * ManejoDeExcepciones.java
 *
 *
 */

package ar.com.educacionit.lab8.ejercicio1.tutorial;

import ar.com.educacionit.lab8.ejercicio1.administrador.AdministradorDeConexiones;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sebastián S. Sanga <SebastianSanga@gmail.com>
 */
public class ManejoDeExcepciones {
    
    /** Creates a new instance of TestJDBC */
    public ManejoDeExcepciones() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // Declara el objeto de conexion
        Connection laConexion = null;
        
        try
        {
            // Obtiene la conexion
            laConexion = AdministradorDeConexiones.getConnection();

            // Muestra los alumnos en pantalla
            mostrarAlumnos(laConexion);
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage() );
        }
        finally
        {
            // Cierra la conexion
            try
            {
                if(laConexion != null)
                    laConexion.close();
            }
            catch(Exception e){}
        }
    }
    
    public static void mostrarAlumnos(Connection conn) throws SQLException
    {
        Statement stmtAlumnos = null;
        
        // Arma la sentencia SQL en forma de text
        String consulta = "SELECT * FROM alumnos";

        // Arma la sentencia SQL y la ejecuta
        stmtAlumnos = conn.createStatement();
        ResultSet rs = stmtAlumnos.executeQuery( consulta );

        // Muestra los alumnos en pantalla
        while(rs.next())
            System.out.println( rs.getString("alu_nombre") + " -- " + rs.getString("alu_apellido") );

    }
}
