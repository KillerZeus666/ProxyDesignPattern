package com.patrones.demo.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.patrones.demo.db.ConexionDB;

public class ProxyAutenticacion implements InterfaceProcesos {

    @Override
    public void EjecutarProcesos(int IdProceso, String Usuario, String Password) throws Exception {
        if (!autenticar(Usuario, Password)) {
            throw new Exception("Usuario no autorizado.");
        }

        ProcesoDefecto ejecutor = new ProcesoDefecto();
        ejecutor.EjecutarProcesos(IdProceso, Usuario, Password);
    }

    private boolean autenticar(String usuario, String password) {
        String sql = "SELECT COUNT(*) FROM usuarios WHERE usuario = ? AND password = ?";

        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            rs.next();

            return rs.getInt(1) > 0;

        } catch (Exception e) {
            System.out.println("Error al autenticar: " + e.getMessage());
            return false;
        }
    }
}
