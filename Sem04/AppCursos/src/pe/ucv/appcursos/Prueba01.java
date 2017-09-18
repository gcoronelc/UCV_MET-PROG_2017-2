package pe.ucv.appcursos;

import pe.ucv.appcursos.service.CursoService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    String curso = "Java Developer";
    int parct = 10;
    // Proceso
    double importe = CursoService.calcImporte(curso, parct);
    double dcto = CursoService.calcDcto(curso, parct);
    double total = CursoService.calcTotal(importe, dcto);
    // Reporte
    System.out.println("INPUT");
    System.out.println("Curso: " + curso);
    System.out.println("Participantes: " + parct);
    System.out.println("OUTPUT");
    System.out.println("Importe: " + importe);
    System.out.println("Descuento: " + dcto);
    System.out.println("Total: " + total);
    
    
  }
  
}
