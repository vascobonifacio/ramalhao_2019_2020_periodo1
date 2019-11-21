package ramalhao.pgo.quadro.figuras;

import java.awt.Polygon;

public class Triangulo {
	public Point ponto1;
	public Point ponto2;
	public Point ponto3;

	public Triangulo(Point ponto1, Point ponto2, Point ponto3) {
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
		this.ponto3 = ponto3;
	}
	
	public Point getPonto1() {
		return ponto1;
	}
	
	public Point getPonto2() {
		return ponto2;
	}
	
	public Point getPonto3() {
		return ponto3;
	}
	
	public Point setPonto1() {
		return ponto1;
	}
	
	public Point setPonto2() {
		return ponto2;
	}
	
	public Point setPonto3() {
		return ponto3;
	}
	
	public Polygon getPolygon() {
		Polygon t = new Polygon();
		t.addPoint(ponto1.getX(), ponto1.getY());
		t.addPoint(ponto2.getX(), ponto2.getY());
		t.addPoint(ponto3.getX(), ponto3.getY());		
		return t;
	}
}
