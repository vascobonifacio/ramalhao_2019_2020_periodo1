package ramalhao.pgo.quadro.figuras;

import java.awt.Polygon;

public class Pentagono {
	public Point ponto1;
	public Point ponto2;
	public Point ponto3;
	public Point ponto4;
	public Point ponto5;
	
	public Pentagono(Point ponto1, Point ponto2, Point ponto3, Point ponto4, Point ponto5) {
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
		this.ponto3 = ponto3;
		this.ponto4 = ponto4;
		this.ponto5 = ponto5;
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
	
	public Point getPonto5() {
		return ponto5;
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
	
	public Point setPonto5() {
		return ponto5;
	}
	
	public Polygon getPolygon() {
		Polygon p = new Polygon();
		p.addPoint(ponto1.getX(), ponto1.getY());
		p.addPoint(ponto2.getX(), ponto2.getY());
		p.addPoint(ponto3.getX(), ponto3.getY());
		p.addPoint(ponto4.getX(), ponto4.getY());
		p.addPoint(ponto5.getX(), ponto5.getY());
		return p;
	}
}
