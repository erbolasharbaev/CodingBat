package org.spring.warmup_1;

public class StartOz {
    public String startOz(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.startsWith("oz")) {
            sb.append(str.substring(0, 2));
        } else if (str.startsWith("o")) {
            sb.append(str.charAt(0));
        } else if (str.startsWith("z", 1)) {
            sb.append(str.charAt(1));
        }
        return sb.toString();
    }
}
