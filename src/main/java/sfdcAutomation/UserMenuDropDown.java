package sfdcAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserMenuDropDown extends common.CommonMethods{
	
	@BeforeClass
	public void Login() throws IOException {
		String path = new File("test-data/Credentials.properties").getAbsolutePath();

		Properties prop = new Properties();
	    InputStream input = new FileInputStream(path);

	    // load a properties file
	    prop.load(input);
	    String username = prop.getProperty("username");
	    String password = prop.getProperty("password");
		System.out.println("Testing Testng");
		GetDriver("chrome");
		GetUrl("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Login(username,password);
	}
	
	@Test
    public void SelectMyProfile() {	 
		WebElement usermenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		Click(usermenu,"usermenu");
		WebElement myprofile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		Click(myprofile,"myprofile");
		//WebElement editprofile = driver.findElement(By.xpath("(//img[@title='Edit Profile'])[1]/.."));
		WebElement editprofile = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']"));
		//Click(editprofile,"editprofile");
		editprofile.click();
	}
	
	@Test
    public void SelectMySettings() { 
		WebElement usermenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
		Click(usermenu,"usermenu");
		WebElement mysettings = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
		Click(mysettings,"mysettings");
		WebElement personal = driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"));
		//Click(editprofile,"editprofile");
		personal.click();
		WebElement loginhistory = driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",loginhistory);
		loginhistory.click();
		WebElement downloadlh = driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
		je.executeScript("arguments[0].scrollIntoView(true);",downloadlh);
		downloadlh.click();
		WebElement dislayout = driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']"));
		dislayout.click();
		WebElement customizetab = driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
		customizetab.click();
		WebElement select_customapp = driver.findElement(By.xpath("//select[@id='p4']"));
		Select customapp_option  = new Select(select_customapp);
		customapp_option.selectByVisibleText("Salesforce Chatter");
		WebElement selecttab_option = driver.findElement(By.xpath("//select[@id='duel_select_0'])"));
		Select tabs_select  = new Select(selecttab_option);
		tabs_select.selectByValue("report");
		WebElement addtab = driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		addtab.click();
		WebElement email = driver.findElement(By.xpath("//span[@id='EmailSetup_font']"));
	    email.click();
	    WebElement emailsettings = driver.findElement(By.xpath("//span[@id='EmailSettings_font']"));
	    emailsettings.click();
	    WebElement mailnamefield = driver.findElement(By.xpath("//input[@id='sender_name']"));
	    mailnamefield.click();
	    WebElement mail_id = driver.findElement(By.xpath("//input[@id='sender_email']"));
	    mail_id.click();
	    WebElement radio_btn = driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
	    radio_btn.click();
		WebElement savebtn = driver.findElement(By.xpath("//input[@name='save']"));
		je.executeScript("arguments[0].scrollIntoView(true);",savebtn);
		savebtn.click();
	}

}