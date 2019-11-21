package ramalhao.pgo.quadro.figuras;
import java.awt.Polygon;
 
public class Pentagono 
{
	private Point ponto1;
	private Point ponto2;
	private Point ponto3;
	private Point ponto4;
	private Point ponto5;
	
	public Pentagono(Point ponto1, Point ponto2, Point ponto3, 
			Point ponto4, Point ponto5) 
	{
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
		this.ponto3 = ponto3;
		this.ponto4 = ponto4;
		this.ponto5 = ponto5;
	}
	
	public Polygon getPolygon() 
	{
		Polygon p = new Polygon();
		
		p.addPoint(ponto1.getX(), ponto1.getY());
		p.addPoint(ponto2.getX(), ponto2.getY());
		p.addPoint(ponto3.getX(), ponto3.getY());
		p.addPoint(ponto4.getX(), ponto4.getY());
		p.addPoint(ponto5.getX(), ponto5.getY());
		
		return p;
	}
}
