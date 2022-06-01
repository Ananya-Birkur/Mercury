package com.mercury.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadData {

	public static String getData(String filename, String key) throws Exception
	{
		//String filepath="E:\\eclipseworkspace\\MavenMercuryProject\\src\\test\\resources\\LoginData.properties";
		 
		FileInputStream instream=new FileInputStream("E:\\eclipseworkspace\\MavenMercuryProject\\src\\test\\resources\\LoginData.properties");
		Properties pro=new Properties();
		pro.load(instream);
		String value=pro.getProperty(key);
		return value;
	}
}
