package org.spring.warmup_1;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleepMore = false;

        if (!weekday || vacation) {
            sleepMore = true;
        }
        return sleepMore;
    }

}
