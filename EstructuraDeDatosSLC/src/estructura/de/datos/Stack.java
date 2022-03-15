/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.de.datos;

/**
 *
 * @author 50662
 */
public class Stack {
    
   private node top;
    private int length;
    

    public void Stack() {
        top=null;
        length=0;
    }
//se fija si existe un top
    public boolean isEmpty() {
      if (top==null ) {
            System. out. println ("La pila se encuentra vacia") ;
            return true;
    }
    else{
        return false;
      }
   }
        
    
public int getLength(){
    return length;
}
    public  void push(int value) {
        node newNode=new node();
        newNode.setValue(value);
        
        if(isEmpty()){
            //se fija si  esta vacia
            top=newNode;
            System.out.println("la pila se encuentra vacia");
            System.out.println(top.getValue());
            
        }else{
            //se agrega el nuevo nodo y asigna nuevo valor del top
            System.out.println("se agrego el nuevo nodo");
            System.out.println(top.getValue());
            newNode.setNext(top);
            top=newNode;
            System.out.println("Se agrego nuestro nodo al top de la pila");
            System.out.println(top.getValue());
        }
        length++;
        }
       
    
    //quita elementos de la pila
    public void pop (){
if(isEmpty ()) {
System.out.println("Porque no aqregas un nuevo nodo ?") ;
 } 
else{
System.out .println ("Se guito el top de la pila en ese momento que es:") ;
System.out.println(top.getValue());
//Asigna como primer elemento, al siguiente de la pila
top=top.getNext();
System.out.println ("El nuevo top es: ") ;
System.out.println (top.getValue ()) ;
length --;
}
}
}

