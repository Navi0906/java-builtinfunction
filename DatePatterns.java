import java.time.*;
import java.time.format.*;

class DatePatterns{
	public static void main(String[] args){
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Date in dd/mm/yyyy : "+date.format(formatter1));
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("Date in yyyy-MM-dd : "+date.format(formatter2));
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		System.out.println("Date in EEE, MMM dd, yyyy : "+date.format(formatter3));


	}
}