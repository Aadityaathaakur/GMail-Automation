package GmailAutomaTion;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class GmailTestClass {
 
	public   WebDriver driver=GmailTest.driver;
	@BeforeClass
	public void launchBrowser() throws FileNotFoundException, IOException 
	{
		GmailTest.launch();
	 
	}
	/*@Test
	  public void test001_For_InCorrect_Uname()  {
			String eMsz= GmailTest.testForIncorrectUserName();
			System.out.println("error msz is"+eMsz);
			//Assert.assertEquals(eMsz,"Couldn't find your Google Account");
		}*/
	@Test
  public void test004_For_Correct_Credentials()  {
		String title=GmailTest.testForCorrectCredentials();
		Assert.assertEquals(title,"Gmail");
	}
	
	/*@Test
	  public void test005_For_Compose()  {
			String msz= GmailTest.composeMail();
			Assert.assertEquals(msz,"Message sent.");
		}*/
	@Test
	  public void test007_For_deleteMail() throws InterruptedException  {
			 GmailTest.deleteMail();
			//Assert.assertEquals(msz,"Message sent.");
		}
	@Test
	  public void test006_OpenMail() throws InterruptedException
	  {
		GmailTest.OpenMail();
	  }
	//
}
