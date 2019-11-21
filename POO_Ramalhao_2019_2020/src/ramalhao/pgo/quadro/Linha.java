package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Linha {
	public Polygon getPolygon() {
		Polygon p = new Polygon();
		p.addPoint(25, 25);
		p.addPoint(125, 25);
		p.addPoint(125, 35);
		p.addPoint(25, 35);
		return p;
	}
	
}