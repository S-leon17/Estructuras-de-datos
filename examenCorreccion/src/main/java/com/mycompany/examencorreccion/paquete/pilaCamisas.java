/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examencorreccion.paquete;

import javax.swing.JOptionPane;



/**
 *
 * @author 50662
 */
public class pilaCamisas {
    
    public int tallaS=0, tallaM=0, tallaL=0, tallaXL=0, indica=0;
    public String colorAnte;
    private nodePila top;
    public int length; 
    public pilaCamisas(){
        
    }
    
    public void pilaCamisas(){
        length=0;
    }
    
     public boolean isEmpty() {
      if (top==null ) {
            System. out. println ("La pila se encuentra vacia") ;
            return true;
    }
    else{
        return false;
      }
   }
     
public void Repeticion(){
    System.out.println("la cantidad de tallas S es: "+ tallaS);
    System.out.println("la cantidad de tallas M es: "+ tallaM);
    System.out.println("la cantidad de tallas L es: "+ tallaL);
    System.out.println("la cantidad de tallas XL es: "+ tallaXL);
}
     
 public int getLength(){
     System.out.println(length);
     return length;
}
 public void verificaColor(){
      if (colorAnte==top.next.camisa.color) {
                System.out.println("se repite");
            }   
 }
  public  void push(camisa c) {
        nodePila aux=new nodePila(c);
        aux.setCamisa(c);
        
            if (top!=null && indica==0) {
           //se agrega el nuevo nodo y asigna nuevo valor del top
            System.out.println("se agrego el nuevo nodo: "+top.getCamisa());
            aux.setNext(top);
            top=aux;
      }
            if(top==null){
            //se fija si  esta vacia
            top=aux;
            System.out.println(top.getCamisa());
             indica=1;
        }
            
           
            
        
        
        if (c.talla=="s" || c.talla=="S" || c.talla=="small" || c.talla=="Small") {
          tallaS=tallaS+1;
      }if (c.talla=="m" || c.talla=="M" || c.talla=="Mediana" || c.talla=="mediana"||c.talla=="Medium") {
          tallaM=tallaM+1;
      }if (c.talla=="l" || c.talla=="L" || c.talla=="Large" || c.talla=="large"||c.talla=="Large") {
          tallaL=tallaL+1;
      }if (c.talla=="XL" || c.talla=="xl" || c.talla=="ExtraLarge" || c.talla=="ExtraLargo") {
          tallaXL=tallaXL+1;
      }
        length++;
        }
       
  public void pop (){
if(isEmpty ()) {
System.out.println("Porque no aqregas un nuevo nodo ?") ;
 } 
else{
System.out .println ("Se quito el top de la pila en ese momento que es:") ;
System.out.println(top.getCamisa());
//Asigna como primer elemento, al siguiente de la pila
top=top.getNext();

length --;
}
}
 
 
    
}
