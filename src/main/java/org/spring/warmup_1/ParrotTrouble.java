package org.spring.warmup_1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {

        boolean trouble = false;
        if ((talking && hour < 7) || (talking && hour > 20)) {
            trouble = true;
        }
        return trouble;
    }
}
