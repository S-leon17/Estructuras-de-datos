/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listascirculares;

/**
 *
 * @author 50662
 */
public class Persona {
    
    private String nombre;

    public Persona(String nombre) {
     
        this.nombre = nombre;
    }
    
    
    public Persona(){}

   

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    


    @Override
    public String toString() {
        return "Persona{ "+"nombre="+nombre+'}';
    }
       
    
}
