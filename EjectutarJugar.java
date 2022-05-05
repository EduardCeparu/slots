package slots;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjectutarJugar {

	public static final int NUMERO_CASILLAS = 4;
	static Random rm = new Random();
	

	public static int[] jugar(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int aleatorio = 0;
			do {
				aleatorio = rm.nextInt(8) + 1;
			} while (array == null);
			array[i] = aleatorio;
		}
		return array;
	}

	// Funcion que da la bienvenida y preguntar si quiere jugar
	public static void accion() {
		// mensaje de bienvenida
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al salón de juego");
		System.out.println("¿Cuantas tiradas desea realiazar?");
		
		int tiradas = sc.nextInt();
		int saldo = 3000;
		
			while (saldo >0 && tiradas > 0) {
				//se crea la linea de premios
				int[] lineaPremio = new int[NUMERO_CASILLAS];
				int[] lineaGenerada = jugar(lineaPremio);
				System.out.println(Arrays.toString(lineaGenerada));
//			
				// condiciones de victoria
				if ((lineaGenerada[0] == lineaGenerada[1]) && (lineaGenerada[0] == lineaGenerada[2])
						&& (lineaGenerada[0] == lineaGenerada[3])) {
					System.out.println("ganas con 4 figuras");
					saldo+=50;
				} else if (lineaGenerada[0] == lineaGenerada[2] && lineaGenerada[0] == lineaGenerada[3]) {
					System.out.println("ganas con 3 figurascaso");
					saldo+=20;
				} else if (lineaGenerada[1] == lineaGenerada[2] && lineaGenerada[1] == lineaGenerada[3]) {
					System.out.println("ganas con 3 figuras caso 2");
					saldo+=20;
				} else if (lineaGenerada[0] == lineaGenerada[1] && lineaGenerada[0] == lineaGenerada[2]) {
					System.out.println("ganas con 3 figuras caso 3");
					saldo+=20;
				} else if (lineaGenerada[0] == lineaGenerada[1] && lineaGenerada[0] == lineaGenerada[3]) {
					System.out.println("ganas con 3 figuras caso 4");
					saldo+=20;
				} else {
					System.out.println("pierdes");
					saldo-=10;
				}
				WaitTime.esperar(1);
				tiradas--;
				
				System.out.println("saldo: " + saldo);
			}

		sc.close();
	}
}
