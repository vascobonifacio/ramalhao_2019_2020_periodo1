package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Triangulo {
	public Polygon getPolygon() {
		Polygon p= new Polygon();
				p.addPoint (200, 100);
				p.addPoint (300, 50);
				p.addPoint (150, 300);
				
    return p;
	}
}
