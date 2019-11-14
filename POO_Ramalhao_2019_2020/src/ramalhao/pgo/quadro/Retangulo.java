package ramalhao.pgo.quadro;

import java.awt.Polygon;

public class Retangulo {
	
		public Polygon getPolygon() {
		 Polygon p= new Polygon();
			p.addPoint(150,150);
			p.addPoint(300,150);
			p.addPoint(300,500);
			p.addPoint(150,500);
			
			return p;
}
}
