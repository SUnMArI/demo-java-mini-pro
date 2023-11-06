package DataDemo;

import java.time.LocalDate;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
//        LocalDate now = LocalDate.now();
//        System.out.println(now.format());
        String name ="Sopheak";
        String encrypt = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println(encrypt);

        String encode ="U29waGVhaw==";
        String Decode = Base64.getDecoder().decode(encode).toString();
        System.out.println(Decode);

    }
}
