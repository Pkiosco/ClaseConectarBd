/*
 * SQLSelectSample.java
 *
 * 
 */

package Clases;

import packBrowser.AdministradorDeConexiones;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.Statement;

/**
 *
 * @author Sebastián S. Sanga <SebastianSanga@gmail.com>
 */
public class SQLSelectSample {
    
    /** Creates a new instance of SQLSelectSample */
    public SQLSelectSample() {
    }
    //public void Insertar()throws Exception{
    public void Select() throws Exception    {

        // Define la conexion
        Connection laConexion = AdministradorDeConexiones.getConnection();
        
        // Arma la consulta y la ejecuta
        String laConsulta = "SELECT * FROM alumnos";
        Statement stmtConsulta = laConexion.createStatement();
        ResultSet rs = stmtConsulta.executeQuery(laConsulta);
        
        // Muestra los datos
        while( rs.next() )
            System.out.println( "ID: " + rs.getInt("alu_id") + " -- " + "Nombre: " + rs.getString("alu_nombre") + " -- " + "Apellido: " + rs.getString("alu_apellido") );
        
        // Cierra el Statement y la Connection
        stmtConsulta.close();
        laConexion.close();
        
    }
    
}
