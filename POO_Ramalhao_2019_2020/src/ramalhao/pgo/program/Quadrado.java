package ramalhao.pgo.program;

import java.awt.Polygon;

public class Quadrado {
	public Polygon getPolygon( ) {
	Polygon p= new Polygon();
	p.addPoint(400, 400);
	p.addPoint(600, 400);
	p.addPoint(600, 600);
	p.addPoint(400, 600);
	
	return p;
	}
	
	

}
