/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Proxy
 * Tipo de Clase: Java
 */
package com.patrones.demo.implementacion;

/**
 *
 * @author Fabrizio Bolaño
 */
public class FabricaServicios {
     public static InterfaceProcesos CrearEjecucionProceso(){
        return new ProxyProcesos();
    }
}
