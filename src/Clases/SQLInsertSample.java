/*
 * SQLInsertSample.java
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
public class SQLInsertSample {
    private String alu_nombreIn;
    private String alu_apellidoIn;
    private Connection laConexion;
    private String Insert;
public SQLInsertSample() throws Exception {
        this.laConexion = packBrowser.AdministradorDeConexiones.getConnection();
    }
    public SQLInsertSample(String alu_nombreIn, String alu_apellidoIn) throws Exception {
        this.alu_nombreIn = alu_nombreIn;
        this.alu_apellidoIn = alu_apellidoIn;
        this.Insert = "INSERT INTO alumnos ( alu_nombre, alu_apellido)  VALUES  ( '" + this.alu_nombreIn + "'  , '" +this.alu_apellidoIn +"')";
    }
            // Arma la sentencia de inserción y la ejecuta
        Statement stmtInsercion = laConexion.createStatement();
        
        public void Insertar()throws Exception{
        stmtInsercion.execute(Insert);
        
        // Cierra el Statement y la Connection
        stmtInsercion.close();
        laConexion.close();
        
        // Informa que la inserción ha sido realizada con éxito
        System.out.println("La inserción ha sido realizada con éxito...");
        }
    
    
}
