package com.sj.jdbc;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public static void main(String args[]) throws IOException {
		Properties prop=new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\Abridge Solutions\\eclipse-workspace\\Sample\\src\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("driver"));
	}
}
