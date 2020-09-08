package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPromise {
	public static WebDriver driver ;
	 @BeforeTest
	  public void setup() throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver","E://Softies/Chromedriver/85/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		 
			driver.get("http://182.74.238.221/clarion_promise_qa/home.php");
		
			 driver.manage().window().maximize(); 
			 
			 
			 /*try{
				 driver.findElement(By.xpath("//*[@name='submit1']")).submit();
			}catch (Exception e) {
				 System.out.println("Please Enter Username and Password");
				 throw(e);
			}*/
	 }
			 
			 @Test
			  public void loginusr() throws InterruptedException{
			 driver.findElement(By.name("txtUsername")).sendKeys("sanjeetk@clariontechnologies.co.in");
			 Thread.sleep(2000);
			 driver.findElement(By.name("txtPassword")).sendKeys("clarion");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@name='submit1']")).submit();

	 }
	 
	 public void addpromise()
	 {
		
		 driver.findElement(By.linkText("Log Promise")).click();
		 Select pfrom = new Select(driver.findElement(By.name("cboEmp")));
		 pfrom.selectByVisibleText("Sonali test");
		 driver.findElement(By.id("txtPromise")).sendKeys("Promise-abcde");
		 driver.findElement(By.id("btnSubmit")).click();
		 
		 Select promiser = new Select(driver.findElement(By.name("cboEmp")));
		 promiser.selectByVisibleText("Sonali test");
		 
		 
		 driver.findElement(By.xpath("//input[@name='txtStartDate']")).sendKeys("08-09-2020");
		 driver.findElement(By.name("btnSearch")).click();
		
		  
	 }                                
	
}

