package pe.ucv.appcursos.service;

public class CursoService {

  public static final String CURSO1 = "Java Developer";
  public static final String CURSO2 = "Oracle Database";
  public static final String CURSO3 = "PHP Developer";
  public static final String CURSO4 = ".NET Developer";

  private static final double PRECIO1 = 1850.0;
  private static final double PRECIO2 = 1400.0;
  private static final double PRECIO3 = 850.0;
  private static final double PRECIO4 = 1300.0;

  public static String[] obtenerCursos1(){
    String[] cursos = {CURSO1, CURSO2, CURSO3, CURSO4};
    return cursos;
  }
  
  public static double calcImporte(String curso, int part) {
    double importe;
    // Proceso
    double precio = obtenerPrecio(curso);
    importe = precio * part;
    // Proceso
    return importe;
  }
  
  public static double calcDcto(String curso, int part){
    double dcto;
    // Proceso
    int n = part / 5;
    dcto = n * obtenerPrecio(curso);
    // Proceso
    return dcto;
  }
  
  public static double calcTotal( double importe, double dcto){
    double total;
    // Proceso
    total = importe - dcto;
    // Proceso
    return total;
  }

  private static double obtenerPrecio(String curso) {
    double precio;
    // Proceso
    switch (curso) {
      case CURSO1:
        precio = PRECIO1;
        break;
      case CURSO2:
        precio = PRECIO2;
        break;
      case CURSO3:
        precio = PRECIO3;
        break;
      case CURSO4:
        precio = PRECIO4;
        break;
      default:
        precio = 0.0;
    }
    // Proceso
    return precio;
  }

}
