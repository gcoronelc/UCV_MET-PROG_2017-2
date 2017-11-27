package pe.egcc.censoapp.model;

public class Censo {

  private String nombre;
  private int edad;
  private String sexo;
  private String instruccion;

  public Censo() {
  }

  public Censo(String nombre, int edad, String sexo, String instruccion) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.instruccion = instruccion;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getInstruccion() {
    return instruccion;
  }

  public void setInstruccion(String instruccion) {
    this.instruccion = instruccion;
  }

}
