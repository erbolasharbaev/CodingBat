package org.spring.warmup_1;

public class EndUp {
    public String endUp(String str) {
        StringBuilder sb = new StringBuilder();
        if(str.length() >= 3){
            sb.append(str.substring(0,str.length() - 3)).
                    append(str.substring(str.length() - 3).toUpperCase());
        }else {
            sb.append(str.toUpperCase());
        }
        return sb.toString();
    }
}
