/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Anuncio;
import Models.ControlReportes;
import Models.Cuenta;
import Models.RegistroPropiedad;
import Models.Usuario;
import Models.ControlReportes;
import Models.Propiedad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CompuFire
 */
public class ConsultasAdmin {

    ConexionDAO con = new ConexionDAO();

    public List<Anuncio> consultarAnuncios() throws Exception {
        List<Anuncio> anuncios = new ArrayList<Anuncio>();
        String query = "SELECT id_anuncio, usuario_id, descripcion, fecha_publicacion, fecha_vencimiento FROM anuncio";
        try {

            Statement s = con.conexionMysql().createStatement();
            ResultSet r = s.executeQuery(query);

            while (r.next()) {
                Anuncio datos = new Anuncio();

                datos.setId_anuncio(r.getLong("id_anuncio"));
                datos.setUsuario_id(r.getLong("usuario_id"));
                datos.setDescripcion(r.getString("descripcion"));
                datos.setFecha_publicacion(r.getString("fecha_publicacion"));
                datos.setFecha_vencimiento(r.getString("fecha_vencimiento"));
                anuncios.add(datos);
            }
        } catch (Exception e) {

            System.out.println("Error al consultar anuncios" + query);

            System.out.println("Error al consultar anuncios");

        } finally {
            if (con != null) {
                try {
                    con.conexionMysql().close();
                    System.out.println("Cierre de conexion exitosa");
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar conexion");
                }
            }
        }
        return anuncios;
    }

    public List<Cuenta> consultarCuentas() throws Exception {
        List<Cuenta> cuentas = new ArrayList<Cuenta>();
        String query = "SELECT id_cuenta, usuario_id, estado, saldo_pagar, saldo_deudor FROM cuenta";
        try {

            Statement s = con.conexionMysql().createStatement();
            ResultSet r = s.executeQuery(query);

            while (r.next()) {
                Cuenta datos = new Cuenta();

                datos.setId_cuenta(r.getLong("id_cuenta"));
                datos.setUsuario_id(r.getLong("usuario_id"));
                datos.setEstados(r.getString("estado"));
//              datos.setImagen(r.getBlob("imagen"));
                datos.setSaldo_pagar(r.getString("saldo_pagar"));
                datos.setSaldo_deudor(r.getString("saldo_deudor"));
                cuentas.add(datos);

                System.out.println("query: " + query);
            }
        } catch (Exception e) {

            System.out.println("Error al consultar cuentas" + query);

            System.out.println("Error al consultar cuentas");

        } finally {
            if (con != null) {
                try {
                    con.conexionMysql().close();
                    System.out.println("Cierre de conexion exitosa");
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar conexion");
                }
            }
        }
        return cuentas;
    }

    public List<ControlReportes> consultarReporte() throws Exception {
        List<ControlReportes> Reporte = new ArrayList<ControlReportes>();

        try {
            String query = "SELECT id_reporte, autor_id, usuario_asignado_id, descripcion, fecha_creacion, fecha_cierre, estado FROM reporte";
            Statement s = con.conexionMysql().createStatement();
            ResultSet r = s.executeQuery(query);

            while (r.next()) {
                ControlReportes reporte = new ControlReportes();

                reporte.setId_reporte(r.getLong("id_reporte"));
                reporte.setAutor_id(r.getLong("autor_id"));
                reporte.setUsuario_asignado_id(r.getLong("usuario_asignado_id"));
                reporte.setDescripcion(r.getString("descripcion"));
                reporte.setFecha_creacion(r.getString("fecha_creacion"));
                reporte.setFecha_cierre(r.getString("fecha_cierre"));
                reporte.setEstado(r.getString("estado"));
                Reporte.add(reporte);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar usuarios");
        } finally {
            if (con != null) {
                try {
                    con.conexionMysql().close();
                    System.out.println("Cierre de conexion exitosa");
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar conexion");
                }
            }
        }

        return Reporte;
    }

    public List<RegistroPropiedad> consultarRegistros() throws Exception {
        List<RegistroPropiedad> registros = new ArrayList<RegistroPropiedad>();
        String query = "SELECT id_registro, persona_id, propiedad_id FROM registro_propiedad";

        try {

            Statement s = con.conexionMysql().createStatement();
            ResultSet r = s.executeQuery(query);

            while (r.next()) {
                RegistroPropiedad datos = new RegistroPropiedad();

                datos.setId_registro(r.getLong("id_registro"));
                datos.setPersona_id(r.getLong("persona_id"));
                datos.setPropiedad_id(r.getLong("propiedad_id"));
                registros.add(datos);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar registros");
        } finally {
            if (con != null) {
                try {
                    con.conexionMysql().close();
                    System.out.println("Cierre de conexion exitosa");
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar conexion");
                }
            }
        }

        return registros;
    }

    public List<Propiedad> consultarPropiedades() throws Exception {
        List<Propiedad> propiedades = new ArrayList<Propiedad>();
        String query = "SELECT id_propiedad, direccion, tipo_propiedad, precio, area, descripcion, habitacion, baños FROM propiedad";

        try {

            Statement s = con.conexionMysql().createStatement();
            ResultSet r = s.executeQuery(query);

            while (r.next()) {
                Propiedad datos = new Propiedad();

                datos.setId_propiedad(r.getLong("id_propiedad"));
                datos.setDireccion(r.getString("direccion"));
                datos.setTipo_propiedad(r.getString("tipo_propiedad"));
                datos.setPrecio(r.getFloat("precio"));
                datos.setArea(r.getString("area"));
                datos.setDescripcion("descripcion");
                datos.setHabitaciones(r.getInt("habitacion"));
                datos.setBaños(r.getInt("baños"));
                
                propiedades.add(datos);

            }
            System.out.println("PROPIEADES: " + query);
            System.out.println("EXITO");
        } catch (Exception e) {
            System.out.println("Error al consultar propiedades: " + query);
        } finally {
            if (con != null) {
                try {
                    con.conexionMysql().close();
                    System.out.println("Cierre de conexion exitosa");
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar conexion");
                }
            }
        }
        System.out.println("PROPIEADES: " + query);
        return propiedades;
    }

}
