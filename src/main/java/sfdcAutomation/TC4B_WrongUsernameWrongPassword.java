package sfdcAutomation;

import org.openqa.selenium.By;

public class TC4B_WrongUsernameWrongPassword extends common.CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GetDriver("chrome");
		GetUrl("https://login.salesforce.com/");
		Thread.sleep(5000);
		Login("lalitha@tekarch.com","Ganesha@123");
		Thread.sleep(5000);
		String expectederror = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String actualerror = driver.findElement(By.xpath("//div[@id='error']")).getText();
		//System.out.println("actualerror is "+actualerror);
		if(expectederror.equals(actualerror)) {
			System.out.println("The Testcase is passed");
		}
		else {
			System.out.println("The Testcase is failed");
		}
		
		
	}

}