package com.br.Findby.Utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Utils {
    public static PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
