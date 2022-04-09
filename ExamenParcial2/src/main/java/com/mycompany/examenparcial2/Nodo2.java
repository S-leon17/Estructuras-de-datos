/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenparcial2;

/**
 *
 * @author 50662
 */
public class Nodo2 {
    private Persona2 dato;
    private Nodo2 next;

    Nodo2(Persona2 p) {
       
    }

    public Nodo2(Persona2 dato, Nodo2 next) {
        this.dato = dato;
        this.next = next;
    }

    

  

    public Persona2 getDato() {
        return dato;
    }

    public void setDato(Persona2 dato) {
        this.dato = dato;
    }

    public Nodo2 getNext() {
        return next;
    }

    public void setNext(Nodo2 next) {
        this.next = next;
    }
    
    
    
    
}
