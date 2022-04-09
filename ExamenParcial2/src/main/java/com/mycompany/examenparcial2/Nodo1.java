/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenparcial2;

/**
 *
 * @author 50662
 */
public class Nodo1 {
    
    private Moto moto;
    private Nodo1 next;
    private Nodo1 back;
    
    public Nodo1 getBack(){
        return  back;
    }
    
    public  void setBack(Nodo1 back){
        this.back=back;
    }

    @Override
    public String toString() {
        return "Carro {"+"año="+moto+'}';
    }
    
    public Nodo1 (Moto carro){
        this.moto=moto;
    }
    
    public Moto getCarro(){
        
        return moto;
    }
    
    public void setCarro(Moto carro){
        this.moto=moto;
    }
    public Nodo1 getNext(){
        return next;
    }
    public void setNext(Nodo1 next){
        this.next=next;
    }
    
    
}
