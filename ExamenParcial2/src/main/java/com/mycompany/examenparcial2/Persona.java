/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenparcial2;

/**
 *
 * @author 50662
 */
public class Persona {
    private int cedula;
    private String nombre;
    private String nacionalidad;

    public Persona(int cedula, String nombre, String nacionalidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    
    

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona{"+"cedula= "+cedula+",  Nombre= "+ nombre+", Nacionalidad= "+nacionalidad+'}';
    }
    
    
}
