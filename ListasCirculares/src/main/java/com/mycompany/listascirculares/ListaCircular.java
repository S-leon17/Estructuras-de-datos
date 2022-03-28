/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listascirculares;

/**
 *
 * @author 50662
 */
public class ListaCircular {
    
public Nodo cabeza=null;
public Nodo ultimo;
    

public void Insertrar(Persona p){
    if (cabeza==null) {
        cabeza=new Nodo (p);
        ultimo=cabeza;
        ultimo.setNext(cabeza);
    }else{
        ultimo.setNext(new Nodo(p));
        ultimo=ultimo.getNext();
        ultimo.setNext(cabeza);
    }
        
    
    
    
}

    @Override
    public String toString() {
       Nodo aux=cabeza;
       String s= "Lista: ";
        if ( aux !=null) {
            s+=aux+", ";
            aux= aux.getNext();
            while(aux !=cabeza){
                s+=aux+", ";
            aux= aux.getNext();
            }
        } else{
                    s+="vacia";
                    }
            
    return s;
    }
    
    
    public void Eliminar(){
       
       Nodo temporal= cabeza; 
       Nodo aux=null;
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
    
}
