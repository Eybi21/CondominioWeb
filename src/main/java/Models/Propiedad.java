/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author CompuFire
 */
public class Propiedad implements Serializable {

    private Long id_propiedad;
    private String direccion;
    private String tipo_propiedad;
    private float precio;
    private String area;
    private String descripcion;
    private int habitaciones;
    private int baños;

    public Propiedad(Long id_propiedad, String direccion, String tipo_propiedad, float precio, String area, String descripcion, int habitaciones, int baños) {
        this.id_propiedad = id_propiedad;
        this.direccion = direccion;
        this.tipo_propiedad = tipo_propiedad;
        this.precio = precio;
        this.area = area;
        this.descripcion = descripcion;
        this.habitaciones = habitaciones;
        this.baños = baños;
    }

    public Propiedad() {
    }

    
    /**
     * @return the id_propiedad
     */
    public Long getId_propiedad() {
        return id_propiedad;
    }

    /**
     * @param id_propiedad the id_propiedad to set
     */
    public void setId_propiedad(Long id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the tipo_propiedad
     */
    public String getTipo_propiedad() {
        return tipo_propiedad;
    }

    /**
     * @param tipo_propiedad the tipo_propiedad to set
     */
    public void setTipo_propiedad(String tipo_propiedad) {
        this.tipo_propiedad = tipo_propiedad;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the habitaciones
     */
    public int getHabitaciones() {
        return habitaciones;
    }

    /**
     * @param habitaciones the habitaciones to set
     */
    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    /**
     * @return the baños
     */
    public int getBaños() {
        return baños;
    }

    /**
     * @param baños the baños to set
     */
    public void setBaños(int baños) {
        this.baños = baños;
    }

}
