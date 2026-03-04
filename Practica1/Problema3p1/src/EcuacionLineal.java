
public class EcuacionLineal {
	private double a;
	private double b;
	private double c;
	public EcuacionLineal(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getDiscriminante() {
		return (this.b*this.b-(4*this.a*this.c));
	}
	public double getRaiz1() {
		return ((-this.b+Math.sqrt(this.getDiscriminante()))/(2*this.a));
	}
	public double getRaiz2() {
		return ((-this.b-Math.sqrt(this.getDiscriminante()))/(2*this.a));
	}
	public void raizes() {
		double disc = this.getDiscriminante();
        if (disc > 0) {
            System.out.println("La ecuación tiene dos raíces " + this.getRaiz1() + " y " + this.getRaiz2());
        } else if (disc == 0) {
            System.out.println("La ecuación tiene una raíz " +this.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
	}
}
