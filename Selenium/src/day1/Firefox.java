package day1;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.gecko.driver","E:\\Eclipse DJ\\Selenium\\executables\\geckodriver.exe");
		WebDriver fdriver=new FirefoxDriver();
		
		//fdriver.close();

	}

}
