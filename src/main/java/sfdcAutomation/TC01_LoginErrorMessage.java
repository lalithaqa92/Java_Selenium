package sfdcAutomation;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.PropertiesFileUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_LoginErrorMessage extends PropertiesFileUtils{

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("enter username");
		String path = new File("test-data/Credentials.properties").getAbsolutePath();
	    System.out.println(path);	    
		String username = readPropertiesFile(path,"username");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		System.out.println("enter blank password");
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(3000);
		String expectederror = "Please enter your password.";
		String actualerror = driver.findElement(By.xpath("//div[@id='error']")).getText();
		if(expectederror.equals(actualerror)) {
			System.out.println("The Testcase is passed");
		}
		else {
			System.out.println("The Testcase is failed");
		}
	}

}