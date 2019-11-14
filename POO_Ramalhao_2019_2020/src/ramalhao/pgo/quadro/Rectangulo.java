package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Rectangulo {
	public Polygon getPolygon() {
		Polygon r= new Polygon();
		r.addPoint(25, 25);
		r.addPoint(75, 25);
		r.addPoint(75, 50);
		r.addPoint(25, 50);
	return r;
	}
}
