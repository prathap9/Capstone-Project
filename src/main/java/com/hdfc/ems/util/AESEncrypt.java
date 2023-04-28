package com.hdfc.ems.util;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESEncrypt {

	private static final String ALGORITHM = "AES";
    private static final String KEY = "mysecretkey12345";

    public static byte[] encrypt(LocalDate date) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        return cipher.doFinal(date.toString().getBytes(StandardCharsets.UTF_8));
    }

	
}
