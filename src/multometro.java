import java.util.Scanner;

public class multometro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int repeticiones = 1;

		 final int NUM_PERSONAS = 5;
		
		while (repeticiones <= NUM_PERSONAS) {
			System.out.println("Ingrese su nombre ");
			String nombre = input.nextLine();
			System.out.println("Ingrese la velocidad");
			int velocidad = input.nextInt();

			input.nextLine();

			if (velocidad >= 60) {
				int multa = (int) (velocidad * 2.5);
				System.out.println("excedio el limite de velocidad que la mminima era de 59kmh usted ser multado señor "
						+ nombre + " su velocidad fue de " + velocidad + " el valor de su multa sera de  " + multa);
			}

		}

		repeticiones = repeticiones + 1;
	}
}
