/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.de.datos;

import java.awt.image.PixelGrabber;


public class main {
 
    static int arr[ ]={12,24,5,7,9};
    
    public static void  main (String[] args){  
        
//---------------------------------------Recursividad---------------------------//
//        System.out.println(recursion.factorial(3));
//        System.out.println(recursion.buscarElemento(arr, 0, 5, arr.length-1));
    
    //-------------------------------------Pilas------------------------------------------//
//    Stack Pila=new Stack();
//  System.out.println(Pila.getLength());
//    Pila.push(1);
//    System.out.println(Pila.getLength());
//    Pila.push(2);
//    Pila.push(909090);
//    System.out.println(Pila.getLength());    
//    Pila.pop();
//    System.out.println(Pila.getLength());

/*******************************************cola*********************************/
//queue cola1=new queue();
//cola1.insertar(46);
//cola1.insertar(12);
//cola1.insertar(87);
//cola1.insertar(125);
//cola1.insertar(30);
//cola1.extraer();
//cola1.isEmpty();
//cola1.contar();
/*****************************************Lista*****************************/

list miLista= new list();
miLista.insertar(new persona(5,"Juan"));
miLista.insertar(new persona(10,"Jscfan"));
miLista.insertar(new persona(3,"Juasfsfn"));
miLista.insertar(new persona(2,"Juancs"));
miLista.imprimirLista();
}
}
