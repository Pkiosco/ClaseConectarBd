/*
 * AdministradorDeConexiones.java
 *
 *
 */

package ar.com.educacionit.lab8.ejercicio1.administrador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sebastián S. Sanga <SebastianSanga@gmail.com>
 */
public abstract class AdministradorDeConexiones {
    
    /**
     * Creates a new instance of AdministradorDeConexiones
     */
    public AdministradorDeConexiones() {
    }

    public static Connection getConnection() throws Exception
    {

        // Establece el nombre del driver a utilizar
       // String dbDriver = "com.mysql.jdbc.Driver";
        
        // Establece la conexion a utilizar contra la base de datos
        String dbConnString = "jdbc:mysql://localhost/j2se"; //3306 puesto default 
        // Tipo de Bda Conectar - Puerto del puerto - Nombre BD
        
        // Establece el usuario de la base de datos
        String dbUser = "Kiosco";
        
        // Establece la contraseña de la base de datos
        String dbPassword = "146921";
        
        // Establece el driver de conexion
        //Class.forName(dbDriver).newInstance();
        
        // Retorna la conexion
        return DriverManager.getConnection(dbConnString, dbUser, dbPassword);
    }    
    
    public static void main (String [] args) throws Exception {
    
        System.out.println(getConnection().getMetaData().getDatabaseProductName());
    }
 
}
