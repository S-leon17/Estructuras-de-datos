/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenparcial2;

/**
 *
 * @author 50662
 */
public class Lista1 {
    
    
    Nodo1 cabeza;
    Nodo1 ultimo;

   
    
    
    public void insertar(Moto moto){
        if (cabeza== null) {
            cabeza=new Nodo1(moto) ;
            ultimo=cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            
        }
    
        else if(moto.getAño()==true){
            Nodo1 aux =new Nodo1(moto);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza=aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            
        }else if(moto.getAño()==false){
            Nodo1 aux= new Nodo1 (moto);
            aux.setBack(ultimo);
            ultimo.setNext(aux);
            ultimo=ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            
        }
            
        }

  

    @Override
    public String toString() {
        Nodo1 aux=cabeza;
        String  s= "Lista: ";
        if (aux != null) {
            s+= aux+", ";
            aux=aux.getNext();
            while(aux!= cabeza){
                s+=aux+", ";
                aux=aux.getNext();
            }
        }else{
            s+="vacia";
        }
        return s;
    }
    
    
    
    
    
    }
    
    

