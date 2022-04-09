/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examencorreccion.paquete;

/**
 *
 * @author 50662
 */
public class camisa {
   public String talla;
   public String color;
   public String marca;
    public String lugarDeConfeccion;
    public String tipoDeCamisa;
    
    public camisa(String talla, String color, String marca, String lugarDeConfeccion, String tipoDeCamisa){
        this.talla=talla;
        this.color=color;
        this.marca=marca;
        this.tipoDeCamisa=tipoDeCamisa;
        this.lugarDeConfeccion=lugarDeConfeccion;
    }
    public camisa(){
        this.talla=talla;
        this.color=color;
        this.marca=marca;
        this.tipoDeCamisa=tipoDeCamisa;
        this.lugarDeConfeccion=lugarDeConfeccion;
        
    }
    
    @Override
 public String toString(){
    
       return "Camisa{"+ " talla: "+ talla+ " color: "+color+" marca: "+marca+" tipo de camisa: "+tipoDeCamisa+" lugar de confeccion: "+lugarDeConfeccion+ "}";
    
 }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLugarDeConfeccion() {
        return lugarDeConfeccion;
    }

    public void setLugarDeConfeccion(String lugarDeConfeccion) {
        this.lugarDeConfeccion = lugarDeConfeccion;
    }

    public String getTipoDeCamisa() {
        return tipoDeCamisa;
    }

    public void setTipoDeCamisa(String tipoDeCamisa) {
        this.tipoDeCamisa = tipoDeCamisa;
    }
    
 
    
    
}
