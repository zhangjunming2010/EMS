package com.tinymore.test.utils;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig;

public class Testspy {
	
	public static void main(String[] args){
        //加密工具
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        //加密配置
        EnvironmentStringPBEConfig config = new EnvironmentStringPBEConfig();
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setPassword("tinymore");
        //应用配置
        encryptor.setConfig(config);
//        String plaintext="jdbc:mysql://localhost:3306/ems?characterEncoding=UTF-8&serverTimezone=GMT";//需要加密的原文
        String plaintext="x5";//需要加密的原文
        //加密
        String ciphertext=encryptor.encrypt(plaintext);
        System.out.println(ciphertext);
    }
}