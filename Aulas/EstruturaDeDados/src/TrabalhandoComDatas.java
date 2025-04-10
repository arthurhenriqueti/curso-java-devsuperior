import java.time.*;

public class TrabalhandoComDatas {
    public static void main(String[] args) {
        Instant d01 = Instant.parse("2025-04-10T15:50:00Z");
        LocalDateTime d02 = LocalDateTime.now();
        LocalDate d03 = LocalDate.now();
        LocalDate d04 = d03.minusMonths(2);

        LocalDate r1 = LocalDate.ofInstant(d01, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d01, ZoneId.of("Portugal"));

        LocalDateTime d05 = LocalDateTime.now();
        LocalDateTime d06 = d05.minusMonths(2);

        Duration t1 = Duration.between(d05, d06);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println(d02.getDayOfMonth());
        System.out.println(d02.getMonthValue());
        System.out.println(d02.getYear());
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(Math.abs(t1.toDays()));
    }
}
