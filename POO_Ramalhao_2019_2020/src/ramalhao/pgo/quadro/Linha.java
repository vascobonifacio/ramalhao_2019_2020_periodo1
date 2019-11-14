package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Linha {
	public Polygon getPolygon() {
		Polygon l= new Polygon();
			l.addPoint(200, 150);
			l.addPoint(201, 150);
			l.addPoint(400, 500);
			l.addPoint(401, 500);
	return l;
	}
}
