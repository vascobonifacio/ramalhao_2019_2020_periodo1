package ramalhao.pgo.program;

import java.awt.Polygon;

public class Retangulo {
	public Polygon getPolygon( ) {
	Polygon p= new Polygon();
	p.addPoint(400, 200);
	p.addPoint(400, 500);
	p.addPoint(200, 500);
	p.addPoint(200, 200);
	return p;
	}
	

}

