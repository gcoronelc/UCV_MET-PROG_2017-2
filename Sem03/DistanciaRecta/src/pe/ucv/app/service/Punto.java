package pe.ucv.app.service;

public class Punto {
	
	private int valorx;
	private int valory;
	
	public Punto() {
	}

	public Punto(int valorx, int valory) {
		super();
		this.valorx = valorx;
		this.valory = valory;
	}

	public int getValorx() {
		return valorx;
	}
	
	public void setValorx(int valorx) {
		this.valorx = valorx;
	}
	
	public int getValory() {
		return valory;
	}
	
	public void setValory(int valory) {
		this.valory = valory;
	}

	public String obtenerCuadrante() {
		String cua = "EJE";
		cua = (valorx == 0 && valory == 0)?"CENTRO":cua;
		cua = (valorx > 0 && valory > 0)?"I":cua;
		cua = (valorx < 0 && valory > 0)?"II":cua;
		cua = (valorx < 0 && valory < 0)?"III":cua;
		cua = (valorx > 0 && valory < 0)?"IV":cua;
		return cua;
	}
		
}
