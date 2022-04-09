/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenparcial2;

/**
 *
 * @author 50662
 */
public class Moto {
   
    private Boolean año;
   

    public Moto(boolean año) {
        this.año= año;
      
    }

    public Moto() {
    }

    public Boolean getAño() {
        return año;
    }

    public void setAño(Boolean año) {
        this.año = año;
    }

  

    @Override
    public String toString() {
        return "Carro {"+"año="+año+'}';
    }
}
