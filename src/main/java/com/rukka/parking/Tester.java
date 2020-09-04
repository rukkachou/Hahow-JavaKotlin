package com.rukka.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enterTime =
                LocalDateTime.of(2020, 12, 25,
                        8, 0);
        LocalDateTime leaveTime =
                LocalDateTime.of(2020, 12, 25,
                        10, 8);
        /*Car car = new Car("AA-0001", enterTime.atZone(ZoneId.systemDefault()).toEpochSecond());
        car.setLeaveTime(System.currentTimeMillis() + 1000*60*60*2);*/
        Car car = new Car("AA-0001", enterTime);
        car.setLeaveTime(leaveTime);
        System.out.println(car.getDuration());
//        long hours = car.getDuration()/60 + ((car.getDuration()%60 != 0)? 1: 0);
        long hours = (long)Math.ceil(car.getDuration()/60.0);
        System.out.println(hours);
        System.out.println(30*hours);
//        java8();
//        java();
    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);
        // local
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(localDateTime));
        System.out.println(localDateTime.plus(Duration.ofHours(3)));
        LocalDateTime other =
                LocalDateTime.of(2018, 11, 23, 8, 0);
        System.out.println(other);
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s = "2020/08/31 08:00:00";
        Date anotherDate = null;
        try {
            anotherDate = sdf.parse(s);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(anotherDate);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 9);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println(calendar.getTime());
    }
}
