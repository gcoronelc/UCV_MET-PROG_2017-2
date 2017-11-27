package pe.egcc.app.prueba;

public class Prueba01 {

  public static void main(String[] args) {
    
    try {
      
      // Datos
      int n1 = 20;
      int n2 = 2;

      // Proceso
      int cociente = n1 / n2;

      // Reporte
      System.out.println("n1: " + n1);
      System.out.println("n2: " + n2);
      System.out.println("cociente: " + cociente);
      
    } catch (ArithmeticException e) {
      
      System.err.println("ERROR, no se puede dividir por cero.");
      
    } finally {
      
      System.out.println("Chau a todos.");
      
    }
    
    
  }
    
}
