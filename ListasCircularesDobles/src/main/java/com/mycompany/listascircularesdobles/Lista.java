/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listascircularesdobles;

/**
 *
 * @author 50662
 */
public class Lista {
    
    
    Nodo cabeza;
    Nodo ultimo;

   
    
    
    public void insertar(Persona persona){
        if (cabeza== null) {
            cabeza=new Nodo (persona);
            ultimo=cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            
        }
        else if(persona.getId()<cabeza.getPersona().getId()){
            Nodo aux =new Nodo(persona);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza=aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            
        }else if(persona.getId()>=cabeza.getPersona().getId()){
            Nodo aux= new Nodo (persona);
            aux.setBack(ultimo);
            ultimo.setNext(aux);
            ultimo=ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            
        }
            else{
            Nodo aux=cabeza;
            while(aux.getNext().getPersona().getId()<persona.getId()){
                aux=aux.getNext();
            }
            Nodo temporal= new Nodo (persona);
            temporal.setNext(aux.getNext());
            temporal.setBack(aux);
            temporal.getNext().setBack(temporal);
            aux.setNext(temporal);
            }
        }
    public  boolean Existe(int id){
        boolean esta=false;
        if (id==cabeza.getPersona().getId()) {
            System.out.println("El id se encontro");
        }
        else if(id==ultimo.getPersona().getId()){
            System.out.println("El id se encontro");
        }
        else{
            Nodo temporal=cabeza;
            while(true==true){
                temporal=temporal.getNext();
                if (temporal.getPersona().getId()==id) {
                    System.out.println("Se encontro en el medio");
                    break;
                }
            }
        }
        
        
        
        return false ;
        
    }
    
  

    @Override
    public String toString() {
        Nodo aux=cabeza;
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
    
    

