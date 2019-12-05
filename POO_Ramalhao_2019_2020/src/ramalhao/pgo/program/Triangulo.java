package ramalhao.pgo.program;

import java.awt.Polygon;

public class Triangulo {
	private Point ponto1;
	private Point ponto2;
	private Point ponto3;
	

public Triangulo(Point ponto1 , Point ponto2 , Point ponto3 ) {
	this.ponto1= ponto1;
	this.ponto2= ponto2;
	this.ponto3= ponto3;
}

	public Polygon getPolygon() {
		Polygon p = new Polygon();
		p.addPoint(ponto1.getX(),ponto1.getY());
		p.addPoint(ponto2.getX(),ponto2.getY());
		p.addPoint(ponto3.getX(),ponto3.getY());
		return p;
	}

}

