package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Rectangulo {
	public Polygon getPolygon() {
		Polygon p = new Polygon();
		p.addPoint(25, 25);
		p.addPoint(75, 25);
		p.addPoint(75, 50);
		p.addPoint(25, 50);
		return p;
	}
	
}