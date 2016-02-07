import java.util.Scanner;

public class Equations {

	public static void main(String[] args) {
		System.out.println("Veuillez choisir les coefficients de l''équation du second degré: ax² + bx + c = 0");
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		System.out.println("on résout :   " + a + "x² + " + b + "x +" + c + " = 0" );
		double delta = b * b - 4 * a * c;
		System.out.print(delta);
		if (delta > 0) {
			double x1 = (- b - Math.sqrt(delta))/ (2 * a);
			double x2 = (- b + Math.sqrt(delta))/ (2 * a);
			System.out.print("\nles solutions sont :  x1 = " + x1 + " et x2 = " + x2);
		}
		else if (delta == 0) {
			double x3 = - b / (2 * a);
			System.out.print("\nL'unique solution est x = " + x3);
		}
		else if(delta < 0) {
			System.out.print("\nIl n'y a pas de solution.");
		}
	}

}
