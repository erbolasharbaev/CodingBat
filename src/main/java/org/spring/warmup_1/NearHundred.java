package org.spring.warmup_1;

public class NearHundred {
    public boolean nearHundred(int n) {
        boolean result = false;
        if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10) {
            result = true;
        }
        return result;
    }
}
