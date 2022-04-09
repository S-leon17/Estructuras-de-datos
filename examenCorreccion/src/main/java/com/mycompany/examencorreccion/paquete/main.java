/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examencorreccion.paquete;

/**
 *
 * @author 50662
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
  pilaCamisas Pila=new pilaCamisas();
  
  //EJEMPLO  Pila.push(new camisa("TALLA (S-M-L-XL)","COLOR (verde-rojo-amarillo...etc)","MARCA (Lo que sea y Bunny)","LUGAR DE CONFECCION (Lo que sea)","Tipo de camisa(Lo que sea)"));
  Pila.push(new camisa("S","verde","d","fg","fv"));
  Pila.push(new camisa("S","verde","d","fg","fv"));
  Pila.pop();
  Pila.push(new camisa("M","hg","d","fg","fv"));
  Pila.push(new camisa("M","S","d","fg","fv"));
   Pila.push(new camisa("XL","M","d","fg","fv"));
  Pila.Repeticion();
    }
    
}
