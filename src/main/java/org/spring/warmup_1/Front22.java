package org.spring.warmup_1;

public class Front22 {
    public String front22(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.length() >= 2) {
            sb.append(str.substring(0, 2)).append(str).append(str.substring(0, 2));
        } else {
            sb.append(str).append(str).append(str);
        }
        return sb.toString();
    }
}
