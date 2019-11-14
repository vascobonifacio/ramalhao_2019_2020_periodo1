package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Rectangulo {
	public Polygon getPolygon() {
		Polygon p = new Polygon();
		p.addPoint(25, 25);
		p.addPoint(75, 25);
		p.addPoint(50, 25);
		p.addPoint(50, 75);
		return p;
	}
	
}