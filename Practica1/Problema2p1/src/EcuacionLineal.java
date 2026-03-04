
public class EcuacionLineal {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	public boolean  tieneSolucion() {
		boolean ver=true;
		if(this.a*this.d==this.b*this.c) {
			ver=false;
		}
		return ver;
	}
	public double getX() {
		double x=(this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
		return x;
	}
	public double getY() {
		double y=(this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
		return y;
	}
	public void solucion() {
		if(this.tieneSolucion()) {
			double x=this.getX();
			double y=this.getY();
			System.out.println("x= "+x+" y= "+y);
		}
		else
			System.out.println("No tiene solucion");
	}
}
