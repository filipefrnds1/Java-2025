import java.util.Locale;
import java.util.Scanner;

public class ParseInt {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		int num = Integer.parseInt(monthAndYear.substring(3,5));
		
		System.out.println(month);
		System.out.println(year);
		System.out.println(num);
		sc.close();

	}

}
