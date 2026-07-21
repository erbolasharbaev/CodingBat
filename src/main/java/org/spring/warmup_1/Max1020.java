package org.spring.warmup_1;

public class Max1020 {
    public int max1020(int a, int b) {
        int re = 0;
        if (a < b) {
            if (b >= 10 && b <= 20) {
                return re = b;
            } else if (a >= 10 && a <= 20) {
                return re = a;
            }
            return re;
        } else if (a > b){
            if (a >= 10 && a <= 20) {
                return re = a;
            }else if (b >= 10 && b <= 20){
                return re = b;
            }
        }
        return re;
    }
}
