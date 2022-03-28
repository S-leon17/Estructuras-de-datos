/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.listascirculares;

/**
 *
 * @author 50662
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular lalista= new ListaCircular();
        lalista.Insertrar(new Persona("Juanes"));
        lalista.Insertrar(new Persona("pedro"));
        lalista.Insertrar(new Persona( "andres"));

        lalista.Eliminar();
    
        System.out.println(lalista);
    }
    
}
