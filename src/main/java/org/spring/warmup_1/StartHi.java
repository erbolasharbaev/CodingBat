package org.spring.warmup_1;

public class StartHi {
    public boolean startHi(String str) {
        boolean re = false;
        if (str.startsWith("hi")) {
            re = true;
        }
        return re;

    }
}
