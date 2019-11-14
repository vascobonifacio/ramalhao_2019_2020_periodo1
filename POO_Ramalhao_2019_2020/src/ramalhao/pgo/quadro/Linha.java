package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Linha {
	public Polygon getPolygon() {
		Polygon l= new Polygon();
			l.addPoint(100, 200);
			l.addPoint(400, 500);
	return l;
	}
}
