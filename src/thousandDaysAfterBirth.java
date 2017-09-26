import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class thousandDaysAfterBirth {
    public static void main (String[] args) {
        Scanner console = new Scanner( System.in );
        String dateString = console.next();
        DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse( dateString, FORMATTER );
        date = date.plusDays( 999 );
        System.out.println(FORMATTER.format( date ));
    }
}
