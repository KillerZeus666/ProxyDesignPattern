
package com.patrones.demo.implementacion;

/**
 *
 * @author Fabrizio Bolaño
 */
public class ProcesoDefecto implements InterfaceProcesos {

    @Override
    public void EjecutarProcesos(int IdProceso, String Usuario, String Password) throws Exception {
        System.out.println("proceso " + IdProceso + " en acciòn");
        System.out.println("proceso " + IdProceso + " finalizado");
    }
    
}
