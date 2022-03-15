/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.de.datos;

/**
 *
 * @author 50662
 */
public class list {
    
    private nodeL cabeza;
    
    public list(){
        
    }
    
    public void insertar(persona p){
        if (cabeza==null){
            nodeL nuevoNodo=new nodeL(p);
            
        }
        
        else if(p.getId()<cabeza.getPersona().getId()){
            nodeL aux =new nodeL(p);
            aux.setNext(cabeza);
            cabeza=aux;
        }
       else if (p.getId()>cabeza.getPersona().getId()&&cabeza.getNext()==null) {
            nodeL aux=new nodeL(p);
            
            cabeza.setNext(aux);
        }
        else{
            nodeL aux=cabeza;
            while (aux.getNext()!=null && aux.getNext().getPersona().getId()>p.getId() ) {                
                aux=aux.getNext();
            }
            
            nodeL Temp =new nodeL(p);
            Temp.setNext(aux.getNext());
            aux.setNext(Temp);
            
            
        }
    }
    
    public void imprimirLista(){
        nodeL aux=cabeza;
        
        while (aux!=null) {
           
            System.out.println(aux.getPersona().toString());
            aux=aux.getNext();
            
        }
    }

    public nodeL getCabeza() {
        return cabeza;
    }

    public void setCabeza(nodeL cabeza) {
        this.cabeza = cabeza;
    }
    
    
    
    
    
    
}
