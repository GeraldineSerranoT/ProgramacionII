import java.util.Random;
import java.util.Scanner;
public class Modular {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese la cantidad de datos:");
		Scanner lee = new Scanner(System.in);
		double d[]=new double[100];
		int n;
		double m,sm,de;
		n=lee.nextInt();
		Random r = new Random();
		for(int k=0;k<n;k++) {
			d[k]=r.nextDouble();
		}
		double s=0;
		for(int k=0;k<n;k++) {
			s=s+d[k];
		}
		m=s/n;
		sm=0;
		for(int k=0;k<n;k++) {
			sm=sm+(d[k]-m)*(d[k]-m);
		}
		de=Math.sqrt(sm/(n-1));
		for(int k=0;k<n;k++) {
			System.out.print(d[k]+",");
		}
		System.out.println("\nLa media es: "+m);
		System.out.println("La desviacion estandar es: "+de);
	}
	/*
	 * Ventajas de usar poo
	 * la ventaja de tener un programa mas ordenado y simplificado
	 * la ventaja de usar los metodo las veces que queramos o que sean necesarias sin necesidad de copiar el codigo
	 * la ventaja de tener menos lineas de codigo
	*/
}
