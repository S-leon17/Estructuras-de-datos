/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sebastainleon_examen_iii;

/**
 *
 * @author 50662
 */
public class ArboBinario {
     
     private Nodo root;

    public ArboBinario() {
        this.root=new Nodo(55);
    }


    public void inserta(int value){
         if (root==null){
            root=new Nodo(value);
            
        }else{
            insertarNodo(root, value);
        }
    }
    
    
    
    
    public void insertarNodo(Nodo nodo, int value){
      
        if (value<nodo.getId()) {
            
            if (nodo.getHijoIzq()==null) {
                nodo.setHijoIzq(new Nodo(value));
            }else{
                insertarNodo(nodo.getHijoIzq(), value);
            }
        }else{
           
            if (nodo.getHijoDer()==null) {
                nodo.setHijoDer(new Nodo(value));
            }else{
                insertarNodo(nodo.getHijoDer(), value);
            }
        }
        
    }
    
    
     public void inOrden(){
        if (root!=null){
            inOrdenRecorrer(root);
            
        }else{
           
        }
    }
   public void inOrdenRecorrer(Nodo nodo){
       
       if (nodo!=null){
           
           inOrdenRecorrer(nodo.getHijoIzq());
           System.out.println(nodo.getId());
           
           inOrdenRecorrer(nodo.getHijoDer());
       
   }
  
   }
    
    
    
}
