package pe.egcc.preciodeventa.model;

public class LoteModel {
  //  INPUT
    private String nombre;
    private double tamLote;
    private double preLote;
    private double porcGastosAdm; // Por ejemplo 25, que representa 25%
    private double porcGanancia; // Por ejemplo 70, que reprenta 70%
    
    // OUTPUT
    private double uniComer;
    private double cosLote;
    private double cosUnidad;
    private double preVenta;

  public LoteModel() {
  }

  public LoteModel(String nombre, double tamLote, double preLote, double porcGastosAdm, double porcGanancia) {
    this.nombre = nombre;
    this.tamLote = tamLote;
    this.preLote = preLote;
    this.porcGastosAdm = porcGastosAdm;
    this.porcGanancia = porcGanancia;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getTamLote() {
    return tamLote;
  }

  public void setTamLote(double tamLote) {
    this.tamLote = tamLote;
  }

  public double getPreLote() {
    return preLote;
  }

  public void setPreLote(double preLote) {
    this.preLote = preLote;
  }

  public double getPorcGastosAdm() {
    return porcGastosAdm;
  }

  public void setPorcGastosAdm(double porcGastosAdm) {
    this.porcGastosAdm = porcGastosAdm;
  }

  public double getPorcGanancia() {
    return porcGanancia;
  }

  public void setPorcGanancia(double porcGanancia) {
    this.porcGanancia = porcGanancia;
  }

  public double getUniComer() {
    return uniComer;
  }

  public void setUniComer(double uniComer) {
    this.uniComer = uniComer;
  }

  public double getCosLote() {
    return cosLote;
  }

  public void setCosLote(double cosLote) {
    this.cosLote = cosLote;
  }

  public double getCosUnidad() {
    return cosUnidad;
  }

  public void setCosUnidad(double cosUnidad) {
    this.cosUnidad = cosUnidad;
  }

  public double getPreVenta() {
    return preVenta;
  }

  public void setPreVenta(double preVenta) {
    this.preVenta = preVenta;
  }
    
}