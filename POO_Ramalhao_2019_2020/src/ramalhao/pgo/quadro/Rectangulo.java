package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Rectangulo {
	public Polygon getPolygon() {
		Polygon p = new Polygon();
		p.addPoint(25, 25);
		p.addPoint(125, 25);
		p.addPoint(125, 75);
		p.addPoint(25, 75);
		return p;
	}
	
}