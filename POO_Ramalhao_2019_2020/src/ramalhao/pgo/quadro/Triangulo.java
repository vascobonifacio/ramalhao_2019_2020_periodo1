package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Triangulo {
	public Polygon getPolygon() {
		Polygon p= new Polygon();
		p.addPoint(200, 150);
		p.addPoint(201, 150);
		p.addPoint(400, 500);
		p.addPoint(40, 500);
	return p;
	 
	}
}
