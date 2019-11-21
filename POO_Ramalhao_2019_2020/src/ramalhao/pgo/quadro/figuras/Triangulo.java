package ramalhao.pgo.quadro.figuras;

import java.awt.Polygon;

public class Triangulo {	 

	private Point ponto1;
	private Point ponto2;
	private Point ponto3;

	public Triangulo (Point ponto1, Point ponto2, Point ponto3 )
	{

		super();
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
		this.ponto3 = ponto3; 
	}

	public Point getPonto1() {
		return ponto1;
	}

	public void setPonto1(Point ponto1) {
		this.ponto1 = ponto1;
	}

	public Point getPonto2() {
		return ponto2;
	}

	public void setPonto2(Point ponto2) {
		this.ponto2 = ponto2;
	}

	public Point getPonto3() {
		return ponto3;
	}

	public void setPonto3(Point ponto3) {
		this.ponto3 = ponto3;
	}



	public Polygon getPolygon() {
		
		Polygon polygon = new Polygon();
		
		polygon.addPoint(ponto1.getX(), ponto1.getY());
		polygon.addPoint(ponto2.getX(), ponto2.getY());
		polygon.addPoint(ponto3.getX(), ponto3.getY());
		
		return polygon;
		
	}

}

