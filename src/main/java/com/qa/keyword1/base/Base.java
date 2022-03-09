package com.qa.keyword1.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(String browserName) {
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			if(prop.getProperty("headless").equals("yes")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver();
			}
			else {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
		}
		return driver;
	}
	public Properties init_properties() {
		prop = new Properties();
		try {
			FileInputStream fio = new FileInputStream("C:\\Users\\bhpanchal\\OneDrive - MMI HOLDINGS LTD\\"
					+ "Documents\\Workspace\\KeywordDriverOpen\\src\\main\\java\\com\\qa\\keyword1\\config\\config.properties");
			prop.load(fio);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
	
	
}
