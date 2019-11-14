package ramalhao.pgo.program;

import java.awt.Polygon;

public class Triangulo {
	public Polygon getPolygon( ) {
	Polygon p= new Polygon();
	p.addPoint(400, 200);
	p.addPoint(200, 400);
	p.addPoint(600, 200);
	
	return p;
	}
	

}
