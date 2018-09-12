import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeMeuk {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalTime time1 = LocalTime.now();
        LocalDateTime datetime1 = LocalDateTime.now();
        LocalDateTime datetime2 = LocalDateTime.of(2018,9,12,15,47,23,5_670_000_00);
        LocalDateTime datetime3 = LocalDateTime.of(date1,time1);

        System.out.println("date1: "+date1);
        System.out.println("time1: "+time1);
        System.out.println("datetime1: "+datetime1);
        System.out.println("datetime1: "+datetime2);
        System.out.println("datetime1: "+datetime3);

        date1=date1.plusDays(2);
        System.out.println("date1 + 2 dagen: "+date1);
        date1=date1.minusWeeks(2);
        System.out.println("date1 - 2 weken: "+date1);
        date1=date1.plusMonths(2);
        System.out.println("date1 + 2 maanden: "+date1);

        for (int i=0;i<2;) {
            System.out.println("voor "+i);
            i += 1;
            System.out.println("achter "+i);
        }
    }
    public LocalDate addDays(LocalDate date2) { //snap niet hoe aan te spreken?
        date2.now().plusDays(5);
        System.out.println("date2 :" + date2);
        return date2;
    }
}
