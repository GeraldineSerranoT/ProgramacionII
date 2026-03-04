
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EcuacionLineal el1=new EcuacionLineal(1,2,3,4,5,6);
		EcuacionLineal el2=new EcuacionLineal(-1,2,1,-2,5,6);
		//System.out.println(el1.tieneSolucion()+" "+el2.tieneSolucion());
		el1.solucion();
		el2.solucion();
	}
}
