package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Step:1 
		FileInputStream fis=new FileInputStream("src/main/resources/Config_en.properties");
		
		//Step:2  -->Instantiate the Properties class
		Properties prop=new Properties();
		
		//Step:3 -->connect the prop with fis
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		
		
		
		
	}

}
