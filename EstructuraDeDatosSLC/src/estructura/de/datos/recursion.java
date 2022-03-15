/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.de.datos;


public class recursion {
    
    static int arr[ ]={12,34,64,2,3};
    
    /*El metodo recursivo debe tener una condicion base que nos permita devolver un valor y una llamada a si misma*/
    public static int factorial (int  n){
        if(n==0){
            return 1;
            
        }else{
            return (n*factorial(n-1)); 
        
    }
        
}
    /*un metodo que logra buscar un valor x en un array
*/    
  public static int buscarElemento(int  arr[ ],int i, int n, int f){
      
      if (f<1){
          return -1;
      }
      if(arr[i]==n){
          return n;
      }
      if(arr[f]==n){
          return n;
      }
      else{
        return buscarElemento(arr, 1+i,n,f-1);
      }
  }

}