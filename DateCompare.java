import java.time.*;
import java.time.format.*;
import java.util.Scanner;

class DateCompare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first date in dd-MM-yyyy format : ");
		String input1 = sc.nextLine();
		System.out.print("Enter first date in dd-MM-yyyy format : ");
		String input2 = sc.nextLine();
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date1 = LocalDate.parse(input1, formatter);
		LocalDate date2 = LocalDate.parse(input2, formatter);
		
		System.out.println("Date1 is before Date2? "+date1.isBefore(date2));
		System.out.println("Date1 is after Date2? "+date1.isAfter(date2));
		System.out.println("Date1 are same Date2? "+date1.isEqual(date2));
		
	}
}
