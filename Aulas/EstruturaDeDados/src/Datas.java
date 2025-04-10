import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now(); // LocalDate d01 = new LocalDate() -> d01.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-04-10");
        LocalDateTime d05 = LocalDateTime.parse("2025-04-10T15:25:00");

        Instant d06 = Instant.parse("2025-04-10T15:25:00Z");
        Instant d07 = Instant.parse("2025-04-10T15:25:00-03:00");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d08 = LocalDateTime.parse("10/04/2025 15:35", fmt2);

        LocalDate d09 = LocalDate.of(2025, 04, 10);
        LocalDateTime d10 = LocalDateTime.of(2025, 04, 10, 15, 35);

        System.out.println(d01);
        System.out.println(d02.format(fmt1));
        System.out.println(fmt2.format(d02));
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
    }
}
