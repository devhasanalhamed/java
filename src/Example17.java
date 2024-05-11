import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example17 {
    //    Date and Time
    public static void main(String[] args) {
        final LocalDate localDate = LocalDate.now();
        final LocalTime localTime = LocalTime.now();
        final LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}
