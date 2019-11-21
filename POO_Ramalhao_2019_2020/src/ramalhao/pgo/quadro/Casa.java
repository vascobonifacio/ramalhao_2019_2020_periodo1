package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Casa {
	public Polygon getPolygon() {
		Polygon p = new Polygon();
		p.addPoint(25, 150);
		p.addPoint(25, 75);
		p.addPoint(75, 25);
		p.addPoint(125, 75);
		p.addPoint(125, 150);
		return p;
	}
	
}