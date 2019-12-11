package com.kimi.boot.util;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Enc{
	
	public static void main(String[] args) {
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("kimi");
		String username = encryptor.encrypt("PCtracking");
		String password = encryptor.encrypt("kimids1@");
		
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		
		System.out.println("username(dec) : " + encryptor.decrypt(username));
		System.out.println("password(dec) : " + encryptor.decrypt(password));
	}
}