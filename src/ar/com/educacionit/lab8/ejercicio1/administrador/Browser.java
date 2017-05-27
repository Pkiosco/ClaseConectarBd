/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.lab8.ejercicio1.administrador;

import ar.com.educacionit.lab8.ejercicio1.tutorial.SQLDeleteSample;
import ar.com.educacionit.lab8.ejercicio1.tutorial.SQLInsertSample;
import ar.com.educacionit.lab8.ejercicio1.tutorial.SQLSelectSample;
import ar.com.educacionit.lab8.ejercicio1.tutorial.SQLUpdateSample;
import java.util.Scanner;

/**
 *
 * @author Casa
 */

public class Browser {

    public static void main(String[] args)  throws Exception {
        int opcionSQql;
        System.out.println("Buenas tardes ingrese la opcion deseada:\n 1-Alta\n 2-Baja \n 3-Consulta \n 4-Modificar");
        Scanner entradaOpcion = new Scanner (System.in); 
        opcionSQql = entradaOpcion.nextInt();
        
        if(opcionSQql > 4 || opcionSQql < 1){
            System.out.println("Debe ingresar una opcion entre 1 y 4");
        }else{
            System.out.flush();

            switch (opcionSQql)
            {
            case 1 :
                SQLInsertSample.main(args);
            case 2 :
                SQLDeleteSample.main(args);
            case 3 :
                SQLSelectSample.main(args);
            case 4 :
                SQLUpdateSample.main(args);
            }
    }
    
    
    }    
}
