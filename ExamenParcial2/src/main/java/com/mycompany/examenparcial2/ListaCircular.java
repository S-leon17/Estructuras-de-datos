/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenparcial2;

public class ListaCircular {
    
public Nodo2 cabeza;
public Nodo2 ultimo;
    

public void Insertrar(Persona2 p){
    if (cabeza==null) {
        cabeza=new Nodo2 (p);
        ultimo=cabeza;
        ultimo.setNext(cabeza);
    }else{
        ultimo.setNext(new Nodo2(p));
        ultimo=ultimo.getNext();
        ultimo.setNext(cabeza);
    }
        
    
    
    
}



    
    
    
    public void Eliminar(){
       
       Nodo2 temporal= cabeza; 
       Nodo2 aux=null;
       while(true==true){
           temporal=temporal.getNext();
           
               
               if (temporal.getNext()==ultimo) {
                   aux=temporal;
                   ultimo=aux;
                   ultimo.setNext(cabeza);
                     break;
               }
              
               
             
          
       }
       
    }
    public void mostrar(){
        System.out.println(cabeza.getDato());
    }

    @Override
    public String toString() {
        Nodo2 aux=cabeza;
        String s ="Lista: ";
        if (aux!=null) {
            s+=aux+", ";
            aux=aux.getNext();
            
        }else{
            s+="vacia";
        }
        return s;
    }
    
    
    
}
