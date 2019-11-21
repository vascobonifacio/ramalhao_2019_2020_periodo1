package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Linha {
	
	public Polygon getPolygon() {
		Polygon p= new Polygon();
				p.addPoint (100, 100);
				p.addPoint (100, 125);
				p.addPoint (600, 125);
				p.addPoint (600, 100);
				return p;
}}
