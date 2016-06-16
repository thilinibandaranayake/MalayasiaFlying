package plainbooking;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class plainbooking {

	WebDriver driver = new FirefoxDriver();
	
	 @BeforeClass
		public void beforeTest() throws Exception {
		driver.get("http://www.malaysiaairlines.com/my/en.html");
		Thread.sleep(5000);
		WebElement close = driver.findElement(By.xpath(".//*[@id='cookie_policy_modal']/div/p[4]/button"));
		close.click();
	 }
	
	  @Test	  
	  public void booktab() throws InterruptedException{
		  
		  Thread.sleep(5000);
		  
		  WebElement book = driver.findElement(By.xpath(".//*[@id='page_container']/div[1]/div/div[1]/ul/li[1]/a"));
		  book.click();
		  
		  WebElement from = driver.findElement(By.xpath(".//*[@id='miniibe_form_container']/form/div[1]/div[1]/div[1]/div[1]"));
		  from.click();
		  WebElement frmcmbbox = driver.findElement(By.xpath(".//*[@id='miniibe_form_container']/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/div[3]"));
		  frmcmbbox.click();
		  frmcmbbox.sendKeys("Darwin(DRW)");
		  
		  Thread.sleep(6000);
		  
		  WebElement To = driver.findElement(By.xpath(".//*[@id='miniibe_form_container']/form/div[1]/div[2]/div[1]/div[1]"));
		  To.click();
		  WebElement tocmbbox = driver.findElement(By.xpath(".//*[@id='miniibe_form_container']/form/div[1]/div[2]/div[1]/div[2]/div/div[1]/div[5]"));
		  tocmbbox.click();
		  tocmbbox.sendKeys("Perth(PER)");
		  
		  Thread.sleep(7000);
		 
	     WebElement departedate = driver.findElement(By.id("dateDeparture"));
	     departedate.click();
		 WebElement departureedate = driver.findElement(By.xpath("html/body/div[8]/div[7]/div/div/div/div/table[1]/tbody/tr[4]/td[6]/div"));
		 departureedate.click();
		 departureedate.sendKeys("24");
		 
		 WebElement returndate = driver.findElement(By.id("dateReturn"));
		 returndate.click();
		 WebElement retdate = driver.findElement(By.xpath("html/body/div[8]/div[7]/div/div/div/div/table[2]/tbody/tr[4]/td[4]/div"));
		 retdate.click();
		 retdate.sendKeys("20");
		 
		 WebElement clearbtn = driver.findElement(By.xpath("html/body/div[8]/div[7]/div/div/div/div/div[2]/button[2]"));
		 clearbtn.click();
		 
		 WebElement Rtnradiobtn = driver.findElement(By.id("inlineRadioReturn"));
		 Rtnradiobtn.click();
		 
		 WebElement adult = driver.findElement(By.xpath(".//*[@id='miniibe_form_container']/form/div[2]/div[1]/div[1]/div/div[1]"));
		 adult.click();
		 WebElement adultdrpdwn = driver.findElement(By.xpath(".//*[@id='miniibe_form_container']/form/div[2]/div[1]/div[1]/div/div[2]/div/div[4]"));
		 adultdrpdwn.click();
		 adultdrpdwn.sendKeys("4");
		  
		  WebElement childern = driver.findElement(By.xpath(".//*[@id='miniibe_form_container']/form/div[2]/div[1]/div[2]/div/div[1]"));
		  childern.click();
		  WebElement childerndrpdwn = driver.findElement(By.xpath(".//*[@id='miniibe_form_container']/form/div[2]/div[1]/div[2]/div/div[2]/div/div[5]"));
		  childerndrpdwn.click();
		  childerndrpdwn.sendKeys("4");
		 
		  WebElement flyingpattern = driver.findElement(By.xpath(".//*[@id='miniibe_form_container']/form/div[2]/div[2]/div/div[1]"));
		  flyingpattern.click();
		  WebElement flyingpatterndrpdwn = driver.findElement(By.xpath(".//*[@id='miniibe_form_container']/form/div[2]/div[2]/div/div[2]/div/div[1]"));
		  flyingpatterndrpdwn.click();
		  
		  WebElement searchbtn = driver.findElement(By.xpath(".//*[@id='miniibe_form_container']/form/div[2]/div[6]/a"));
		  searchbtn.click();
		  
		driver.close();
		  
		  
		  
		 }
	  }

	 
	
	
	
	

