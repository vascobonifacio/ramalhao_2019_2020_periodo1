package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Retangulo {
	public Polygon getPolygon() {
		Polygon p= new Polygon();
				p.addPoint (000, 100);
				p.addPoint (100, 100);
				p.addPoint (000, 000);
				p.addPoint (100, 000);
				
				return p;
	}}
