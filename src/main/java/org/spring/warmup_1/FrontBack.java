package org.spring.warmup_1;

public class FrontBack {
    public String frontBack(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                sb.append(str.charAt(str.length() - 1));

            } else if (i == str.length() - 1) {
                sb.append(str.charAt(0));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
