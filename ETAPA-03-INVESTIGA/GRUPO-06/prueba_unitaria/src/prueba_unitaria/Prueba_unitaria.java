
package prueba_unitaria;


public class Prueba_unitaria {

 
  public static void main(String[] args) {
    double operacion =0.0;
    operacion=division(8.0,4.0);
    System.out.println("La operacion dio como resultado:"+operacion);
  }
    public static double division(double a, double b){
      try{
        return a/b;
      }catch(Exception e){
        System.out.println("Error"+e.getMessage());
      }
      return 0.0;
    }
    
    
    
    
  
  
}
