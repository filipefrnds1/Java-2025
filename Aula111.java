import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Aula111 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/text/SimpleDateFormat.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
				
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); // data hora GMT Z
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		LocalDateTime d10 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d11 = LocalDate.of(2022, 7, 20);
		LocalDateTime d12 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		
			System.out.println("d01 = " + d01.toString()); // chama o toString de forma explícita
			System.out.println("d02 = " + d02.toString());
			System.out.println("d03 = " + d03);
			System.out.println("d04 = " + d04);
			System.out.println("d05 = " + d05);
			System.out.println("d06 = " + d06);
			System.out.println("d07 = " + d07);
			System.out.println("d08 = " + d08);
			System.out.println("d09 = " + d09);
			System.out.println("d10 = " + d10);
			System.out.println("d11 = " + d11);
			System.out.println("d12 = " + d12);
		
		sc.close();
	}

}
