package ramalhao.pgo.quadro;
import java.awt.Polygon;
 
public class casa {
	
		public Polygon getPolygon() {
		 Polygon p= new Polygon();
		 	p.addPoint(150,150);
		 	p.addPoint(225,50);
			p.addPoint(300,150);
			p.addPoint(300,300);
			p.addPoint(150,300);
			
			return p;

}
}
