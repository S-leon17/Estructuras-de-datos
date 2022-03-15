/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.de.datos;

/**
 *
 * @author 50662
 */
public class queue {
    
    private  node head;
    private node tail;
    
    public queue(){
        head=null;
        tail=null;
    }
    
    public void insertar(int dato){
        node newNode=new node();
        newNode.setValue(dato);
        newNode.setNext(null);
        //Es null ya que es no hay nada en la cola aun 
        if (head== null & tail ==null){
            head=newNode;
            tail=newNode;
        }
        tail.setNext(newNode);
        tail= newNode;
    }
    // se usa para extraer un elemento de la cola
    public void extraer(){
        System.out.println("El valor actual del head es:  ");
        System.out.println(head.getValue( ));
        
        head=head.getNext();
        
        System.out.println("El valor actual del head es:    ");
        System.out.println(head.getValue());
    }
    
    
    //comprueba si la cola esta vacia o no lo esta 
    public boolean isEmpty(){
        boolean cola =false;
        if (head==null & tail ==null) {
            cola=true;
            System.out.println("la cola esta vacia");
            
            
        }else{
            System.out.println("la cola no esta vacia");
            cola=false;
        }
        return cola;
    }
    
    //Contamos los elementos de la cola
    public int contar(){
        int contador=0;
        node c = this.head;
        while(c != null){
            contador++;
            c=c.getNext();
        }
        System.out.println("Numero de datos en la cola:   "+contador);
        return contador;
    }
    
    
    
    
    public int length (){
        int  resultado=0;
        node c =this.head;
        if(isEmpty()){
            return resultado;
        }while(c!=null){
            c = c.getNext();
            resultado++;
           
        }
    return resultado;
    }
  
}
