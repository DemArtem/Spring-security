package org.itstep;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Main {
    public static void main(String[] args) {
        //алгоритм шифрования "шипастая рыба"
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encoded = encoder.encode("root");
        System.out.println(encoded);

        boolean matches = encoder.matches("root",encoded);
        System.out.println(matches);
    }

}
