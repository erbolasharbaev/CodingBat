package org.spring.warmup_1;

public class StartHi {
    public boolean startHi(String str) {
        int sum = 0;
        boolean re = false;
        if (str.startsWith("hi")) {
            re = true;
        }
        return re;

    }
}
