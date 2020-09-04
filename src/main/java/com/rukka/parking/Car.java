package com.rukka.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enterTime;
    private LocalDateTime leaveTime;

    public Car(String id, LocalDateTime enterTime) {
        this.id = id;
        this.enterTime = enterTime;
    }
    public void leave () {
//        leaveTime = System.currentTimeMillis();
        leaveTime = LocalDateTime.now();
    }
    public void setLeaveTime(LocalDateTime time) {
//        if (time > enterTime) {
        if (time.isAfter(enterTime)) {
            leaveTime = time;
        }
    }
    public long getDuration() {
        Duration duration = Duration.between(enterTime, leaveTime);
        return duration.toMinutes();
    }
}
