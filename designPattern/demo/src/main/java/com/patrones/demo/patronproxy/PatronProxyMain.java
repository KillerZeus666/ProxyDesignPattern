package com.patrones.demo.patronproxy;

import com.patrones.demo.implementacion.FabricaServicios;
import com.patrones.demo.implementacion.InterfaceProcesos;

public class PatronProxyMain {
    public static void main(String[] args) {
        String usuario = "admin";
        String password = "adminpass";
        int proceso = 1;

        // true para decir que quieres un proxy auditable
        boolean auditable = true;

        // Llamada corregida al factory con el parámetro 'auditable'
        InterfaceProcesos procesoActivo = FabricaServicios.CrearEjecucionProceso(auditable);

        try {
            procesoActivo.EjecutarProcesos(proceso, usuario, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
