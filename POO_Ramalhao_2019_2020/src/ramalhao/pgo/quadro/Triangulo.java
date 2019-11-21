package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Triangulo {
	public Polygon getPolygon() {
		Polygon p = new Polygon();
		p.addPoint(25, 75);
		p.addPoint(75, 25);
		p.addPoint(125, 75);
		return p;
	}
	
}