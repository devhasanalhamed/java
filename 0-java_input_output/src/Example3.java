import java.util.Date;

public class Example3 {

    public static void main(String[] args){
//        Date and time formatting
//        t: is the conversion character to deal with time and dates
//        and there are suffix to specify other needs
//        Time:
//        T for extracting time from a date
//        H, M, and S for extracting the hour, minutes, and seconds
//        L, N for the time in milliseconds, nanoseconds
//        p adds a.m/p.m
//        z time-zone offset
//
//        Date:
//        A prints full day of the week
//        d formats a two-digit day of the month
//        B prints full month
//        m formats a two-digit month
//        Y outputs a year in four digits
//        y outputs the last two digits of the year


        Date date = new Date();
        System.out.println("default date: " + date);
        // using printf
        System.out.printf("time: %tTp%n", date);
        // another way to print time
        System.out.printf("time: %tH:%tM:%tSp%n", date,date,date);
        // to get rid od multiple date arguments we can add %[1$] to determine first argument
        System.out.printf("time: %1$tH:%1$tM:%1$tSp%n", date);

        System.out.printf("day name: %tA%n", date);
        System.out.printf("day number: %td%n", date);
        System.out.printf("month name: %tB%n", date);
        System.out.printf("month number: %tm%n", date);
        System.out.printf("full year: %tY%n", date);
        System.out.printf("last two digits of the year: %ty%n", date);
    }
}
