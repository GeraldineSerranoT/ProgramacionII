import java.util.Random;
public class Estadistica {
	private double dato[]=new double[50];
	public int cntDatos;
	public Estadistica(int n) {
		this.cntDatos = n;
		Random r = new Random();
		for(int k=0;k<this.cntDatos;k++) {
			this.dato[k]=r.nextDouble();
		}
	}
	public String toString() {
		String c="";
		for(int k=0;k<this.cntDatos;k++) {
			c=c+this.dato[k]+",";
		}
		c=c+"\n La media es: "+this.media()+"\n La desviacion estandar es: "+this.desviacionEstandar();
		return c;
	}
	public double media() {
		double s=0;
		for(int k=0;k<this.cntDatos;k++) {
			s=s+this.dato[k];
		}
		return s/this.cntDatos;
	}
	public double desviacionEstandar() {
		double s=0;
		for(int k=0;k<this.cntDatos;k++) {
			s=s+(this.dato[k]-this.media())*(this.dato[k]-this.media());
		}
		return Math.sqrt(s/(this.cntDatos-1));
	}
}
