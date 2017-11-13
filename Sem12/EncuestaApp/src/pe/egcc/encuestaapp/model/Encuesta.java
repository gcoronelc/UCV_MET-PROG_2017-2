package pe.egcc.encuestaapp.model;


public class Encuesta {

  private String curso;
  private String turno;

  public Encuesta() {
  }

  public Encuesta(String curso, String turno) {
    this.curso = curso;
    this.turno = turno;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getTurno() {
    return turno;
  }

  public void setTurno(String turno) {
    this.turno = turno;
  }

}
