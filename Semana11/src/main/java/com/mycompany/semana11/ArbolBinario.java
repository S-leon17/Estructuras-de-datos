/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana11;

/**
 *
 * @author 50662
 */
public class ArbolBinario {
    private NodoArbol raiz;
    public void inserta(int value){
         if (raiz==null){
            raiz=new NodoArbol(value);
            
        }else{
            insertar(raiz, value);
        }
    }
    
    
    
    
    public void insertar(NodoArbol nodo, int value){
        if (value<nodo.getId()) {
            if (nodo.getHijoIzq()==null) {
                nodo.setHijoIzq(new NodoArbol(value));
            }else{
                insertar(nodo.getHijoIzq(), value);
            }
        }else{
            if (nodo.getHijoDer()==null) {
                nodo.setHijoDer(new NodoArbol(value));
            }else{
                insertar(nodo.getHijoDer(), value);
            }
        }
        
    }
    
    public void inOrden(){
        if (raiz!=null){
            inOrdenRecorrer(raiz);
            
        }else{
            System.out.println("El arbol esta vacio");
        }
    }
   public void inOrdenRecorrer(NodoArbol nodo){
       
       if (nodo!=null){
           System.out.println("mi nodo recursivo es: "+nodo.getId());
           inOrdenRecorrer(nodo.getHijoIzq());
           System.out.println(nodo.getId());
            System.out.println("aqui empieza el derecho");
           inOrdenRecorrer(nodo.getHijoDer());
       
   }
  
   }
     public void Menor(NodoArbol nodo){
       if(nodo!=null){
           if(nodo.getHijoIzq()!=null){
               Menor(nodo.getHijoIzq());
           }else{
               System.out.println(nodo.getId());
           }
       
           
    
    
    
    
    
    
    
}
     }}