package org.spring.warmup_1;

public class Diff21 {
    public int diff21(int n) {
        int deference = 0;

        if (n <= 21) {
            deference = 21 - n;
        } else {
            deference = 2 * (n - 21);
        }
        return deference;
    }
}
