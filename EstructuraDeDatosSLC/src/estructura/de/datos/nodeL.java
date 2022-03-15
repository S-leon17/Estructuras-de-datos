/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.de.datos;

/**
 *
 * @author 50662
 */
public class nodeL {
    
    persona persona;
    nodeL next;

    public nodeL(persona persona) {
        this.persona = persona;
        
    }
    
    
    

    public persona getPersona() {
        return persona;
    }

    public void setPersona(persona persona) {
        this.persona = persona;
    }

    public nodeL getNext() {
        return next;
    }

    public void setNext(nodeL next) {
        this.next = next;
    }
    
    
}
