/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packBrowser;

import Clases.SQLDeleteSample;
import Clases.SQLInsertSample;
import Clases.SQLSelectSample;
import Clases.SQLUpdateSample;
import java.util.Scanner;

/**
 *
 * @author Casa
 */

public class Browser {
    static String Nombre;
    static String Apellido;
    static int Id;
    public static void main(String[] args)  throws Exception {
        int opcionSQql;
        System.out.println("Buenas tardes ingrese la opcion deseada:\n 1-Alta\n 2-Baja \n 3-Consulta \n 4-Modificar");
        Scanner entradaOpcion = new Scanner (System.in); 
        opcionSQql = entradaOpcion.nextInt();
    while (opcionSQql != 0){    
        if(opcionSQql > 4 || opcionSQql < 0){
            System.out.println("Debe ingresar una opcion entre 1 y 4");
        }else{
            System.out.flush();

            
            switch (opcionSQql)
            {
            case 1 :
                //String Nombre;
                //String Apellido;                
                System.out.println("Por favor ingrese el nombre del alumno");
                Nombre = entradaOpcion.next();
                System.out.println("por favor ingrese el apellido del alumno");
                Apellido = entradaOpcion.next();

                Clases.SQLInsertSample insertando = new Clases.SQLInsertSample(Nombre,Apellido);
                insertando.Insertar();
                break;
            case 2 :
                System.out.println("Este es el listado disponible");
                Clases.SQLSelectSample consultando2 = new Clases.SQLSelectSample();
                consultando2.Select();
                
                System.out.println("Ingrese el Id que desea eliminar");
                Id = entradaOpcion.nextInt();
                Clases.SQLDeleteSample borrando = new Clases.SQLDeleteSample(Id);
                borrando.Eliminar();
                break;
            case 3 :
                Clases.SQLSelectSample consultando = new Clases.SQLSelectSample();
                consultando.Select(); 
                break;
            case 4 :
                SQLUpdateSample.main(args);
                break;
            }
            System.out.println("�Desea continuar ejecutando?\n s/n");  
            String continua;
            continua = entradaOpcion.next();
            if (continua.toUpperCase() == "N")
                opcionSQql = 0;
        } //fin while
    }
    
    
    }    
}
