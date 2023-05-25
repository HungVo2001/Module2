import TingNgayTiepTheo.NextDayCalculator;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {
    NextDayCalculator nextDayCalnculator = new NextDayCalculator();
    @Test
    void find03031999() {
        LocalDate date = LocalDate.of(1999,3,4);
        LocalDate nextDay = nextDayCalnculator.findNextDay(date);
        LocalDate expected = LocalDate.of(1999,3,5);
        assertEquals(expected,nextDay);
        System.out.println(date);
        System.out.println(nextDay);
        System.out.println(expected);
    }

    @Test
     void findTodayAndTomorrow() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Vui lòng nhập ngày theo định dạng dd/MM/yyyy");
        String todayS = "28/02/2023";
//        String tomorrowsS = "23/02/2023";
//        String todayS = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate today = LocalDate.parse(todayS,formatter);
//        LocalDate tomorrow =LocalDate.parse(tomorrowsS,formatter);
        LocalDate tomorrow = today.plusDays(1);


        LocalDate expected = nextDayCalnculator.findNextDay(today);

        assertEquals(expected,tomorrow);
        System.out.println(expected.format(formatter));
        System.out.println(tomorrow);
    }


}
