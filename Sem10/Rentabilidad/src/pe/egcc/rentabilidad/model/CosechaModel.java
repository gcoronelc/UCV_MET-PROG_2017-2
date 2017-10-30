package pe.egcc.rentabilidad.model;

public class CosechaModel {

  // INPUT
  private int hectareas;
  private double preBolsaSemilla;
  private double preBolsaAbono;
  private double preHoraHombre;
  private double preRiegoHectarea;
  private double toneladasHectarea;
  private double precVentaTonelada;

  // OUTPUT
  private double gastoSemilla;
  private double gastoAbono;
  private double gastoHoraHombre;
  private double gastoRiego;
  private double ingresoVenta;
  private double utilidad;

  public CosechaModel() {
  }

  public CosechaModel(int hectareas, double preBolsaSemilla, double preBolsaAbono, double preHoraHombre, double preRiegoHectarea, double toneladasHectarea, double precVentaTonelada) {
    this.hectareas = hectareas;
    this.preBolsaSemilla = preBolsaSemilla;
    this.preBolsaAbono = preBolsaAbono;
    this.preHoraHombre = preHoraHombre;
    this.preRiegoHectarea = preRiegoHectarea;
    this.toneladasHectarea = toneladasHectarea;
    this.precVentaTonelada = precVentaTonelada;
  }

  public int getHectareas() {
    return hectareas;
  }

  public void setHectareas(int hectareas) {
    this.hectareas = hectareas;
  }

  public double getPreBolsaSemilla() {
    return preBolsaSemilla;
  }

  public void setPreBolsaSemilla(double preBolsaSemilla) {
    this.preBolsaSemilla = preBolsaSemilla;
  }

  public double getPreBolsaAbono() {
    return preBolsaAbono;
  }

  public void setPreBolsaAbono(double preBolsaAbono) {
    this.preBolsaAbono = preBolsaAbono;
  }

  public double getPreHoraHombre() {
    return preHoraHombre;
  }

  public void setPreHoraHombre(double preHoraHombre) {
    this.preHoraHombre = preHoraHombre;
  }

  public double getPreRiegoHectarea() {
    return preRiegoHectarea;
  }

  public void setPreRiegoHectarea(double preRiegoHectarea) {
    this.preRiegoHectarea = preRiegoHectarea;
  }

  public double getToneladasHectarea() {
    return toneladasHectarea;
  }

  public void setToneladasHectarea(double toneladasHectarea) {
    this.toneladasHectarea = toneladasHectarea;
  }

  public double getPrecVentaTonelada() {
    return precVentaTonelada;
  }

  public void setPrecVentaTonelada(double precVentaTonelada) {
    this.precVentaTonelada = precVentaTonelada;
  }

  public double getGastoSemilla() {
    return gastoSemilla;
  }

  public void setGastoSemilla(double gastoSemilla) {
    this.gastoSemilla = gastoSemilla;
  }

  public double getGastoAbono() {
    return gastoAbono;
  }

  public void setGastoAbono(double gastoAbono) {
    this.gastoAbono = gastoAbono;
  }

  public double getGastoHoraHombre() {
    return gastoHoraHombre;
  }

  public void setGastoHoraHombre(double gastoHoraHombre) {
    this.gastoHoraHombre = gastoHoraHombre;
  }

  public double getGastoRiego() {
    return gastoRiego;
  }

  public void setGastoRiego(double gastoRiego) {
    this.gastoRiego = gastoRiego;
  }

  public double getIngresoVenta() {
    return ingresoVenta;
  }

  public void setIngresoVenta(double ingresoVenta) {
    this.ingresoVenta = ingresoVenta;
  }

  public double getUtilidad() {
    return utilidad;
  }

  public void setUtilidad(double utilidad) {
    this.utilidad = utilidad;
  }

  
}
