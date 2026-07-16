package org.spring.warmup_1;

public class NotStrin {
    public String notString(String str) {
        StringBuilder sb = new StringBuilder();

        if (str.startsWith("not")) {
            sb.append(str);
        } else {
            sb.append("not ").append(str);
        }
        return sb.toString();

    }
}
