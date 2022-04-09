/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenparcial2;

/**
 *
 * @author 50662
 */
public class Lista {
    public Nodo cabeza;
     public Lista() {
            cabeza=null;
             
    }
     
    public String get (int index){
int indicador=0;        
int contador=0;
int contador2=0;
Nodo temporal= cabeza;
Nodo aux=cabeza;
Nodo aux2=cabeza;
while (true==true){
   
        temporal=temporal.getNext();
        contador++;
if(0==index){
    System.out.println("El valor es: "+cabeza.getDato());
    if (cabeza.getNext().getDato()==null) {
        System.out.println("no hay siguiente");
    }else{
        System.out.println("El que sigue es: "+temporal.getDato());
        System.out.println("no existe el valor anterior");
    }
    break;
}if (contador==index) {
        System.out.println(temporal);
        if (temporal.getNext().getDato()!=null) {
        System.out.println("el que sigue"+temporal.getNext().getDato());
    }else{
            System.out.println("No existe siguiente");
        }
        
        while (true==true) {
        aux=aux2;
        aux2=aux2.getNext();
        contador2++;
        
            if (contador==index) {
                if(aux.getDato()!=null){
                    System.out.println("El anterior es:"+ aux.getDato()); indicador=1;
                break;
                
                }else{
                System.out.println("No existe anterior");
            }
               
            }
    }
       
    }

    if (indicador==1) {
        break;
    }




    }
        
       

return null;
}
     public void insertar(Persona persona){
          if (cabeza==null) {
            cabeza=new Nodo(persona);
        }else{
              Nodo aux=cabeza;
            while(aux.getNext()!=null){
                aux=aux.getNext();
            }
            Nodo temp=new Nodo(persona);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
     }
          
     }
     
     public void existe(int cedula){
         Nodo temp=cabeza;
         
         if (cabeza.getDato().getCedula()==cedula) {
              System.out.println("Existe en la lista");
         }else{
             while (true==true) {
             temp=temp.getNext();
             if (temp.getDato().getCedula()==cedula) {
                 System.out.println("Existe en la lista");
                 break;
             }else{
                 System.out.println("no existe en la lista");
                 break;
             }
         }
         }
         
     }

     
     public String toString(){
         Nodo aux=cabeza;
         String s="Lista: ";
         while(aux!=null){
             s+=aux+", ";
             aux=aux.getNext();
         }
        return s;
         
     }
     
     
}