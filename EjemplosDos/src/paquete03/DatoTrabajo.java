/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {
    public static String obtenerNombreEmpresa(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre de la empresa");
        String empresa = entrada.nextLine();
        
        return empresa;
    }
    public static String obtenerDireccionEmpresa(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese direccion de la empresa");
        String direccion = entrada.nextLine();
        
        return direccion;
    }
}
