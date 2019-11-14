package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Triangulo{
	public Polygon getPolygon() {
	 Polygon p= new Polygon();
		p.addPoint(300,300);
		p.addPoint(600,300);
		p.addPoint(450,500);
		
		return p;
	}
	
	
}