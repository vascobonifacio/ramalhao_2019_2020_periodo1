package ramalhao.pgo.quadro.figuras;

import java.awt.Polygon;

import ramalhao.pgo.quadro.Quadro;

public class Quadrilatero {
	public Point ponto1;
	public Point ponto2;
	public Point ponto3;
	public Point ponto4;
	
	public Quadrilatero(Point ponto1, Point ponto2, Point ponto3, Point ponto4) {
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
		this.ponto3 = ponto3;
		this.ponto4 = ponto4;
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
	
	public Point getPonto4() {
		return ponto4;
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
	
	public Point setPonto4() {
		return ponto4;
	}
	
	public Polygon getPolygon1() {
		Polygon q = new Polygon();
		q.addPoint(ponto1.getX(), ponto1.getY());
		q.addPoint(ponto2.getX(), ponto2.getY());
		q.addPoint(ponto3.getX(), ponto3.getY());
		q.addPoint(ponto4.getX(), ponto4.getY());			
		return q;
	}
	
	public Polygon getPolygon2() {
		Polygon r = new Polygon();
		r.addPoint(ponto1.getX(), ponto1.getY());
		r.addPoint(ponto2.getX(), ponto2.getY());
		r.addPoint(ponto3.getX(), ponto3.getY());
		r.addPoint(ponto4.getX(), ponto4.getY());			
		return r;
	}
}
