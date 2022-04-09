/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examencorreccion.paquete;



/**
 *
 * @author 50662
 */
public class nodePila {
    
    camisa camisa;
    nodePila next;
  
public nodePila(camisa camisa){
    this.camisa=camisa;
}

    public camisa getCamisa() {
        return camisa;
    }

    public void setCamisa(camisa camisa) {
        this.camisa = camisa;
    }

    public nodePila getNext() {
        return next;
    }

    public void setNext(nodePila next) {
        this.next = next;
    }
   






}
