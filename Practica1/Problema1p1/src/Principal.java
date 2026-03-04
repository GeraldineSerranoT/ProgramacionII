import java.util.Random;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cronometro cr=new Cronometro();
		int[] n = new int[100000];
        Random r = new Random();
        for (int k = 0; k < n.length; k++) {
            n[k] = r.nextInt();
         //   System.out.print(n[k]+",");
        }
        cr.inicia();
        for (int k = 0; k < n.length - 1; k++) {
            int minIndex = k;
            for (int j = k + 1; j < n.length; j++) {
                if (n[j] < n[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = n[k];
            n[k] = n[minIndex];
            n[minIndex] = temp;
        }
        cr.detener();
        System.out.println("Tiempo: "+cr.lapsoDeTiempo()+" milisegundos");
	}

}
