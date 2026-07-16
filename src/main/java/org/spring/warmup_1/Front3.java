package org.spring.warmup_1;

public class Front3 {
    public String front3(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            if (str.length() > 3) {
                sb.append(str.substring(0, 3));
            } else {
                sb.append(str);
            }
        }
        return sb.toString();

    }
}
