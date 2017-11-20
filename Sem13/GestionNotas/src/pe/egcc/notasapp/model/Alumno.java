package pe.egcc.notasapp.model;

public class Alumno {

  // INPUT
  private String nombre;
  private Integer nota1;
  private Integer nota2;
  private Integer nota3;
  private Integer nota4;
  private Integer exapar;
  private Integer exafin;

  // OUTPUT
  private Double pronota;
  private Double profinal;
  private String situacion;

  public Alumno() {
  }

  public Alumno(String nombre, Integer nota1, Integer nota2, Integer nota3, Integer nota4, Integer exapar, Integer exafin) {
    this.nombre = nombre;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
    this.nota4 = nota4;
    this.exapar = exapar;
    this.exafin = exafin;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getNota1() {
    return nota1;
  }

  public void setNota1(Integer nota1) {
    this.nota1 = nota1;
  }

  public Integer getNota2() {
    return nota2;
  }

  public void setNota2(Integer nota2) {
    this.nota2 = nota2;
  }

  public Integer getNota3() {
    return nota3;
  }

  public void setNota3(Integer nota3) {
    this.nota3 = nota3;
  }

  public Integer getNota4() {
    return nota4;
  }

  public void setNota4(Integer nota4) {
    this.nota4 = nota4;
  }

  public Integer getExapar() {
    return exapar;
  }

  public void setExapar(Integer exapar) {
    this.exapar = exapar;
  }

  public Integer getExafin() {
    return exafin;
  }

  public void setExafin(Integer exafin) {
    this.exafin = exafin;
  }

  public Double getPronota() {
    return pronota;
  }

  public void setPronota(Double pronota) {
    this.pronota = pronota;
  }

  public Double getProfinal() {
    return profinal;
  }

  public void setProfinal(Double profinal) {
    this.profinal = profinal;
  }

  public String getSituacion() {
    return situacion;
  }

  public void setSituacion(String situacion) {
    this.situacion = situacion;
  }

  public Object[] toRowData() {
    Object[] rowData = {
      nombre, nota1, nota2, nota3, nota4, exapar, exafin,
      pronota, profinal, situacion
    };
    return rowData;
  }

}
