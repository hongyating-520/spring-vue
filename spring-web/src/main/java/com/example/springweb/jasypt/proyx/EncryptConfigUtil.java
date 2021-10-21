package com.example.springweb.jasypt.proyx;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;

/*
 * @author ZZQ
 * @Date 2021/7/26 4:08 下午
 */
public class EncryptConfigUtil {
    public static String encyptPwd(String password,String value){
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        encryptor.setConfig(cryptor(password));
        String result = encryptor.encrypt(value);
        return result;
    }

    /**
     * 解密
     * @param password 配置文件中设定的加密盐值
     * @param value 解密密文
     * @return
     */
    public static String decyptPwd(String password,String value){
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        encryptor.setConfig(cryptor(password));
        String result = encryptor.decrypt(value);
        return result;
    }

    public static SimpleStringPBEConfig cryptor(String password){
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(password);
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        return config;
    }


    public static void main(String[] args) {
        // 加密
        String encPwd = encyptPwd("123456", "123456");
        // 解密
        String decPwd = decyptPwd("123456", "n3hP0NkiK/dBPQYmd3OzZA==");
        System.out.println(encPwd);
        System.out.println(decPwd);
    }
}
