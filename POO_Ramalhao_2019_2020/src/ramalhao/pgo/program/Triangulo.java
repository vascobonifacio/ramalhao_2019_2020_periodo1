package ramalhao.pgo.program;

import java.awt.Polygon;

public class Triangulo 
{
	
	public Polygon getPolygon() {
		
	
		Polygon p = new Polygon(); 
		 p.addPoint(100,100);
		 p.addPoint(100,300);
		 p.addPoint(100,200);
		 return p;
	 
	}

}
 
