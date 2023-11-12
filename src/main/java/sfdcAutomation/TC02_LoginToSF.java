package sfdcAutomation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.PropertiesFileUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02_LoginToSF extends PropertiesFileUtils{

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String path = new File("test-data/Credentials.properties").getAbsolutePath();
	    System.out.println(path);	    
		String username = readPropertiesFile(path,"username");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		String pwd = readPropertiesFile(path,"password");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(6000);
		WebElement home = driver.findElement(By.xpath("//a[@title='Home Tab']"));
		if(home.isDisplayed()) {
			System.out.println("The Testcase is passed");
		}
		else {
			System.out.println("The Testcase is failed");
		}
		
	}

}