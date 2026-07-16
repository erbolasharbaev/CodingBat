package org.spring.warmup_1;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {

//        posNeg(1, -1, false) → true
//        posNeg(-1, 1, false) → true
//        posNeg(-4, -5, true) → true
        boolean result = false;
        if (!negative) {
            if (a < 0 && b > 0 || a > 0 && b < 0) {
                result = true;
            }
        } else {
            if (a < 0 && b < 0) {
                result = true;
            }
        }
        return result;
    }
}
