package ramalhao.pgo.program;

import java.awt.Polygon;

public class Linha {
	public Polygon getPolygon( ) {
	Polygon p= new Polygon();
	p.addPoint(150, 150);
	p.addPoint(150, 500);
	p.addPoint(151, 150);
	p.addPoint(151, 500 );
	return p;
	}
	

}

