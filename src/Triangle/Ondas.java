package Triangle;

import java.util.ArrayList;
import java.util.Scanner;

public class Ondas {

	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);
		int numIteraciones = lectura.nextInt();
		ArrayList<Integer> resultados = new ArrayList<Integer>();
		
		for (int j = 1; j <= numIteraciones; j++) {
			int amplitud = lectura.nextInt();
			int frecuencia = lectura.nextInt();

			for (int y = 1; y <= frecuencia; y++) {

				switch (amplitud) {
				case 2: {
					resultados.add(1);
					resultados.add(22);
					resultados.add(1);
					resultados.add(null);
					break;
				}
				case 3: {
					resultados.add(1);
					resultados.add(22);
					resultados.add(333);
					resultados.add(22);
					resultados.add(1);
					resultados.add(null);
					break;
				}
				case 4: {
					resultados.add(1);
					resultados.add(22);
					resultados.add(333);
					resultados.add(4444);
					resultados.add(333);
					resultados.add(22);
					resultados.add(1);
					resultados.add(null);
					break;
				}
				case 5: {
					resultados.add(1);
					resultados.add(22);
					resultados.add(333);
					resultados.add(4444);
					resultados.add(55555);
					resultados.add(4444);
					resultados.add(333);
					resultados.add(22);
					resultados.add(1);
					resultados.add(null);
					break;
				}
				case 6: {

					resultados.add(1);
					resultados.add(22);
					resultados.add(333);
					resultados.add(4444);
					resultados.add(55555);
					resultados.add(666666);
					resultados.add(55555);
					resultados.add(4444);
					resultados.add(333);
					resultados.add(22);
					resultados.add(1);
					resultados.add(null);
					break;
				}
				case 7: {
					resultados.add(1);
					resultados.add(22);
					resultados.add(333);
					resultados.add(4444);
					resultados.add(55555);
					resultados.add(666666);
					resultados.add(7777777);
					resultados.add(666666);
					resultados.add(55555);
					resultados.add(4444);
					resultados.add(333);
					resultados.add(22);
					resultados.add(1);
					resultados.add(null);
					break;
				}
				case 8: {
					resultados.add(1);
					resultados.add(22);
					resultados.add(333);
					resultados.add(4444);
					resultados.add(55555);
					resultados.add(666666);
					resultados.add(7777777);
					resultados.add(88888888);
					resultados.add(7777777);
					resultados.add(666666);
					resultados.add(55555);
					resultados.add(4444);
					resultados.add(333);
					resultados.add(22);
					resultados.add(1);
					resultados.add(null);
					break;
				}
				case 9: {
					resultados.add(1);
					resultados.add(22);
					resultados.add(333);
					resultados.add(4444);
					resultados.add(55555);
					resultados.add(666666);
					resultados.add(7777777);
					resultados.add(88888888);
					resultados.add(999999999);
					resultados.add(88888888);
					resultados.add(7777777);
					resultados.add(666666);
					resultados.add(55555);
					resultados.add(4444);
					resultados.add(333);
					resultados.add(22);
					resultados.add(1);
					resultados.add(null);
					break;
				}

				default:
					;
				}

			}
		}
		for (int a = 0; a < resultados.size(); a += 1) {
			Integer dato = resultados.get(a);
			if(dato==null) {
				System.out.println("");
			}else {
				System.out.println(dato);
			}
			
		}
	}

}
