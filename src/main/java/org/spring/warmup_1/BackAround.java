package org.spring.warmup_1;

public class BackAround {
    public String backAround(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(str.length() - 1)).append(str).append(str.charAt(str.length() - 1));
        return sb.toString();
    }

}
