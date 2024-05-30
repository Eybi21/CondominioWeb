/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;


@ManagedBean(name = "bkn_direccion")
public class Direccionamiento implements Serializable {
        
        private String puerto = "8080";

         public void inicioLogin() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/inicio/Login.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         
    public void inicioAdmin() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/admin/bienvenidaAdmin.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void inicioManto() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/manto/bienvenidaManto.xhtml");
            System.out.println("direccionando a pasarela pagos");
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inicioCliente() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {


            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/cliente/bienvenidaCliente.xhtml"); // Reemplaza esta URL con la que desees abrir.

        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pasarelaPagos() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/cliente/pasarelapagos.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cuentacliente() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/cliente/estadocuenta.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void reportesclientes() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/cliente/reportes.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void controlReportes() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/admin/ControlReportes.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void controlPropiedades() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/admin/ControlPropiedades.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void estadoCuenta() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/admin/ControlPropiedades.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void controlPagos() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/admin/ControlDePagos.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void propiedades() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/admin/Propiedades.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void controlUsuarios() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/admin/Usuario.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void reportesManto() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/manto/ReportesManto.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void registroPropiedad() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/admin/RegistroPropiedad.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void reporteResuelto() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/manto/ReportesResueltos.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void reportePendiente() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/manto/ReportesPendientes.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //agregado manual
     public void inicioManto2() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/manto/bienvenidaManto2.xhtml");
            System.out.println("direccionando a usuario Mantenimiento 2");
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
      public void ReporteMantoRuben() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/manto/ReportesManto.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
       public void ReporteMantoAngel() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/manto/ReportesManto2.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
        public void Anuncios() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/manto/Anuncios.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        public void Anuncios2() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        try {
            externalContext.redirect("http://localhost:"+puerto+"/CondominioGT/pages/manto/Anuncios2.xhtml"); // Reemplaza esta URL con la que desees abrir.
        } catch (IOException ex) {
            Logger.getLogger(Direccionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
      

}
