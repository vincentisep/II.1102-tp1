import java.util.Scanner;

public class Pave {
	
	public static void main(String [] args) {
		System.out.println("Bonjour Vincent !");
		System.out.print("\nPourriez-vous me dire la longueur, la largeur et la hanteur de votre cube?");
		Scanner scan = new Scanner(System.in);
		long longueurlu = scan.nextLong();
		System.out.println("\nla longueur est : " + longueurlu + "cm");
		long largeurlu = scan.nextLong();
		System.out.println("\nla largeur est : " + largeurlu + "cm");
		long hauteurlu = scan.nextLong();
		System.out.println("\nla hauteur est : " + hauteurlu + "cm");
		long resultat = longueurlu * largeurlu * hauteurlu ;
		System.out.println("\nVotre cube a donc un volume de : " + resultat + "cm3");
		}
}