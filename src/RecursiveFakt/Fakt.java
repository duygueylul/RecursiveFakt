package RecursiveFakt;
import java.util.Scanner;

public class Fakt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int s;
		System.out.println("Bir Sayı Giriniz: ");
		s = scan.nextInt();
		int f = fakt(s);
		System.out.println(s + "!=" + f);

	}
	
	
	public static int fakt(int s) {
		if(s == 1) {
			return 1;
		}
		else {
			return s * fakt(s - 1);
		}
	}
	

}







