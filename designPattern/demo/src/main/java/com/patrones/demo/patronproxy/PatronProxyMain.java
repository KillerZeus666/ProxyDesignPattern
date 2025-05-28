package com.patrones.demo.patronproxy;

import com.patrones.demo.implementacion.FabricaServicios;
import com.patrones.demo.implementacion.InterfaceProcesos;

public class PatronProxyMain {
    public static void main(String[] args) {
        String usuario = "fbolano";
        String password = "pds";
        int proceso = 1;

         // false para decir que quiero sin auditoría
        boolean auditable = true;

        InterfaceProcesos procesoActivo = FabricaServicios.CrearEjecucionProceso(auditable);
        try {
            procesoActivo.EjecutarProcesos(proceso, usuario, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
