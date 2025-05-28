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
public class FabricaServicios {public static InterfaceProcesos CrearEjecucionProceso(boolean auditable) {
        if (auditable) {
            return new ProxyProcesos(); // Con auditoría
        } else {
            return new ProxyAutenticacion(); // Sin auditoría
        }
    }
}
