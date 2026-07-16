package org.spring.warmup_1;

public class SumDouble {
    public int sumDouble(int a, int b) {

        int sum = 0;
        if (a == b) {
            sum = (a + b) * 2;
        } else {
            sum = a + b;
        }
        return sum;
    }
}
