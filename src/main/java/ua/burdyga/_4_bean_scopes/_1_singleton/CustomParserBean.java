package ua.burdyga._4_bean_scopes._1_singleton;

import java.util.concurrent.TimeUnit;

public class CustomParserBean {
    private long timeStart = System.currentTimeMillis();
    private String message;

    public void parsingFile() {
        String time = String.format("%d min, %d sec",
                TimeUnit.MILLISECONDS.toMinutes(timeStart),
                TimeUnit.MILLISECONDS.toSeconds(timeStart) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(timeStart)));
        System.out.println("StartTime is: " + time + ", message: " + getMessage());
    }

    public long getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(long timeStart) {
        this.timeStart = timeStart;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
