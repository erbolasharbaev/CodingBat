package org.spring.warmup_1;

public class Or35 {
    public boolean or35(int n) {
        boolean re = false;
        if (n % 3 == 0 || n % 5 == 0) {
            re = true;
        }
        return re;
    }
}
