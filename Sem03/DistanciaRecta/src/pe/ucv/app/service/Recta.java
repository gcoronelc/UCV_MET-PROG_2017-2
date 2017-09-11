package pe.ucv.app.service;

public class Recta {
	
	private Punto p1;
	private Punto p2;
	
	public Recta() {
	}

	public Recta(Punto p1, Punto p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	public double getDistancia() {
		
		int dx = p2.getValorx() - p1.getValorx();
		int dy = p2.getValory() - p1.getValory();
		
		double d = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		
		return d;
	}
	

	
}
