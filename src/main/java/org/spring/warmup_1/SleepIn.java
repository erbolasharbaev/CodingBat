package org.spring.warmup_1;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleepMore = false;
        int age = 16;

        if (!weekday || vacation) {
            sleepMore = true;
        }
        return sleepMore;
    }

}
