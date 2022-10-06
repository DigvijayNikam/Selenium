package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("E:\\Eclipse DJ\\Maven\\src\\test\\java\\Digvijay.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("NAME"));
		System.out.println(prop.getProperty("UserName"));
	System.out.println(prop.getProperty("Password"));
	
	prop.setProperty("City","Dhule");
	prop.setProperty("Aaba","Sheth");
		FileOutputStream fos=new FileOutputStream("E:\\Eclipse DJ\\Maven\\src\\test\\java\\Digvijay.properties");
		prop.store(fos,"data added");
	fos.close();
	}

}
