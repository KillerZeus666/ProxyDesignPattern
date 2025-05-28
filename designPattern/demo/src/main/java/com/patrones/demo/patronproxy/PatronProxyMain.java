/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Proxy
 * Tipo de Clase: Main()
 */

package com.patrones.demo.patronproxy;

import com.patrones.demo.implementacion.FabricaServicios;
import com.patrones.demo.implementacion.InterfaceProcesos;

/**
 *
 * @author Fabrizio Bolaño
 */
public class PatronProxyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String usuario = "fbolano";
        String password = "8877";
        int proceso = 1;
        InterfaceProcesos ProcesoActivo = FabricaServicios.CrearEjecucionProceso(); 
        try {
            ProcesoActivo.EjecutarProcesos(proceso, usuario, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
