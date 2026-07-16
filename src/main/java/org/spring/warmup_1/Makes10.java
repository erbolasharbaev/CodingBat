package org.spring.warmup_1;

public class Makes10 {
    public boolean makes10(int a, int b) {
        boolean result = false;
        if (a == 10 || b == 10 || a + b == 10) {
            result = true;
        }
        return result;
    }
}
