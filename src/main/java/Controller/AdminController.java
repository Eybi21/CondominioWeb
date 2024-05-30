/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ConsultasAdmin;
import DAO.ConsultasManto;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

import Models.Anuncio;
import Models.ControlReportes;
import Models.Cuenta;
import Models.Propiedad;
import Models.RegistroPropiedad;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 *
 * @author CompuFire
 */
@ManagedBean(name = "bkn_Admin")
public class AdminController implements Serializable {

    //Anuncios
    private List<Anuncio> listaAnuncios;
    //Cuentas
    private List<Cuenta> listaCuentas;
    //Reportes
    private List<ControlReportes> listaReportes;
    //Control Propiedades
    private List<RegistroPropiedad> listaRegistro;
    //Propiedades
    private List<Propiedad> listaPropiedades;

    @PostConstruct
    public void init() {

        listarAnuncios();
        listarCuentas();
        listarReportes();
        listarRegistros();
        listarPropiedades();

    }

    public void listarAnuncios() {

        ConsultasAdmin consulta = new ConsultasAdmin();

        try {
            setListaAnuncios(consulta.consultarAnuncios());
        } catch (Exception e) {
            System.out.println("Error al listar anuncios");
        }

    }

    public void listarCuentas() {

        ConsultasAdmin consulta = new ConsultasAdmin();

        try {
            setListaCuentas(consulta.consultarCuentas());
        } catch (Exception e) {
            System.out.println("Error al listar cuentas");
        }

    }

    public void listarReportes() {

        ConsultasAdmin consulta = new ConsultasAdmin();

        try {
            setListaReportes(consulta.consultarReporte());
        } catch (Exception e) {
            System.out.println("Error al listar reportes");
        }

    }

    public void listarRegistros() {

        ConsultasAdmin consulta = new ConsultasAdmin();

        try {
            setListaRegistro(consulta.consultarRegistros());
        } catch (Exception e) {
            System.out.println("Error al listar registros");
        }

    }

    public void listarPropiedades() {
        ConsultasAdmin consulta = new ConsultasAdmin();

        try {
            setListaPropiedades(consulta.consultarPropiedades());
            System.out.println("LISTA PROPIEDADES: "+listaPropiedades.size());
        } catch (Exception e) {
            System.out.println("Error al listar propiedades");
        }
    }
    
    public void buscar(){
        
    }

    /**
     * @return the listaPropiedades
     */
    public List<Propiedad> getListaPropiedades() {
        return listaPropiedades;
    }

    /**
     * @param listaPropiedades the listaPropiedades to set
     */
    public void setListaPropiedades(List<Propiedad> listaPropiedades) {
        this.listaPropiedades = listaPropiedades;
    }

    /**
     * @return the listaRegistro
     */
    public List<RegistroPropiedad> getListaRegistro() {
        return listaRegistro;
    }

    /**
     * @param listaRegistro the listaRegistro to set
     */
    public void setListaRegistro(List<RegistroPropiedad> listaRegistro) {
        this.listaRegistro = listaRegistro;
    }

    /**
     * @return the listaReportes
     */
    public List<ControlReportes> getListaReportes() {
        return listaReportes;
    }

    /**
     * @param listaReportes the listaReportes to set
     */
    public void setListaReportes(List<ControlReportes> listaReportes) {
        this.listaReportes = listaReportes;
    }

    public List<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public List<Anuncio> getListaAnuncios() {
        return listaAnuncios;
    }

    public void setListaAnuncios(List<Anuncio> listaAnuncios) {
        this.listaAnuncios = listaAnuncios;
    }

}
