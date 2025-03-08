import java.time.*;
import java.time.format.*;
import java.util.Scanner;

class DateArithmetic{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		System.out.print("Enter the date in dd-mm-yyyy format: ");
		String input = sc.nextLine();
		
		LocalDate date = LocalDate.parse(input, formatter);
		
		LocalDate modified = date.plusDays(7).plusMonths(1).plusYears(2);
		LocalDate result = modified.minusWeeks(3);
		
		System.out.println("Date is "+result.format(formatter));
		
	}
}
