/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.de.datos;


public class node {
    
    private node next;
    private int value;
    

    public void node() {
        this.value=0;
        this.next=null;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
   
}
public class Pilas{
    
    private node start;
    private int length;
    
    public void Pilas(){
        start=null;
        length=0;
    }
    
    public boolean isEmpty(){
        return start==null;
    }
    public int getLength(){
        return  length;
    }
}