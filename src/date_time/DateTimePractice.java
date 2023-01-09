package date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimePractice {

    public static void main(String[] args) {

        /*
         1. Создать объект LocalDateTime, представляющий собой
         дату 25.06.2020 19:47. Используя этот объект, создать другой объект LocalDateTime,
         представляющий собой дату через 3 месяца после сегодняшней.
         Вывести на консоль содержащиеся в нем объеты LocalDate and LocalTime.
         */
        System.out.println("Task #1");
        LocalDateTime localDateTime = LocalDateTime.of(2020, 6, 25, 19, 47);
        LocalDateTime newLocalDateTime = localDateTime.plusMonths(3L);

        System.out.println(newLocalDateTime.toLocalDate());
        System.out.println(newLocalDateTime.toLocalTime());


        /*
         2. Создать объект LocalDate, представляющий собой сегодняшнюю
         дату. Преобразовать дату в строку вида "05.05.2017". Вывести эту строку на
         консоль.
         */
        System.out.println("Task #2");
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String format = now.format(formatter);
        System.out.println(format);


        /*
         3. Дана строка вида "26-03-1968T09:24". Получить объект LocalDateTime, представляющий
         собой дату, полученную из этой строки.
         */
        System.out.println("Task #3");
        String formattedDate3 = "26-03-1968T09:24";
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime localDateTime3 = LocalDateTime.parse(formattedDate3, formatter3);
        System.out.println(localDateTime3);


        /*
         4. Использовать LocalDateTime из предыдущего задания, преобразовать его
         в объект типа Instant, указав тайм зону "America/Chicago". Вывести количество
         прошедших миллисекунд.
         */
        System.out.println("Task #4");
        String formattedDate4 = "26-03-1968T09:24";
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime localDateTime4 = LocalDateTime.parse(formattedDate4, formatter4);
        System.out.println(localDateTime4);

        Instant instant = localDateTime.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(localDateTime));
        System.out.println(instant);
        System.out.println(instant.toEpochMilli());

        /*
         5. Создать объект LocalDate, представляющий собой сегодняшнюю
         дату. Создать объект LocalDate, представляющий собой дату
         07.07.2018. Используя созданные объекты, найти количество дней между
         этими двумя датами.
         */
        System.out.println("Task #5");
        LocalDate now5 = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);

        Period period = Period.between(prevDate, now5);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        long days = ChronoUnit.DAYS.between(prevDate, now5);
        System.out.println(days);

        /*
         6. Даны два объекта LocalDate из предыдущего задания. Подсчитать количество
         секунд между полуночью первой даты и полуночью второй даты.
         */
        System.out.println("Task #6");
        LocalDate now6 = LocalDate.now();
        LocalDate prevDate6 = LocalDate.of(2018, 7, 7);

//        LocalDateTime.of(now, LocalTime.MIDNIGHT);
        LocalDateTime localDateTimeNow = now6.atStartOfDay();
        LocalDateTime localDateTimePrev = prevDate6.atStartOfDay();

        Duration duration = Duration.between(localDateTimePrev, localDateTimeNow);
        System.out.println(duration.getSeconds());

        /*
         7. Создать объект Instant. Вывести его на консоль. Затем создать
         объект ZonedDateTime на основании предыдущего объекта с тайм зоной "Africa/Cairo".
         */
        System.out.println("Task #7");
        Instant instant7 = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime = instant7.atZone(ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime);

        /*
         8. Написать свою реализацию интерфейса TemporalAdjuster, которая бы
         прибавляла к дате 42 дня
         */
        System.out.println("Task #8");
        LocalDateTime now8 = LocalDateTime.now();

        LocalDateTime localDateTime8 = now8.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));
        System.out.println(localDateTime8);
    }
}

