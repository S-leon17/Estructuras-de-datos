/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.listascircularesdobles;

/**
 *
 * @author 50662
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista miLista=new Lista();
        miLista.insertar(new Persona (12,"juan"));
         miLista.insertar(new Persona (11,"juan"));
          miLista.insertar(new Persona (14,"juan"));
          miLista.Existe(12);
        System.out.println(miLista);
    }
    
}
