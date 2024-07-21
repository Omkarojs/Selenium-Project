package WebPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	

	public String baseUrl = "https://www.amazon.in/";
	
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Before Test executed");
		// TODO Auto-generated method stub
		driver=new ChromeDriver();

		//maximise windows
		driver.manage().window().maximize();

		//open url
		driver.get(baseUrl);

		//timer i kept as 60 you can keep 40
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); //60 seconds
	}
	
	
 	@Test(priority  = 1)
	public void LoginTest() throws InterruptedException 
	{
		
        
        //Action class to move to element
		Actions action = new Actions(driver);
		
		//Move to sign in option
		WebElement element =  driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));		
		action.moveToElement(element).perform();
		Thread.sleep(2000); // add pause
 		 
        //Click on sign in button
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		Thread.sleep(4000);
		
		
        //Enter valid Username, Email
		driver.findElement(By.id("ap_email_login")).click();
		driver.findElement(By.id("ap_email_login")).clear();
		Thread.sleep(3000);
		
		//Enter Email
		driver.findElement(By.id("ap_email_login")).sendKeys("somkar413@gmail.com");
		
        //Click on continue
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	    Thread.sleep(5000);
		 
        //Enter Password 
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Vijay@0192");
		
		//lick on submit
		driver.findElement(By.xpath("//*[@id=\"auth-signin-button\"]")).click();
		
		Thread.sleep(5000);
		
	    WebElement text = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
	
	    System.out.println("Login Successful : " + text.getText());
	
	}
		
		

	
	

	
		
	@Test(priority  = 2)
    public void AccountCheckTest() throws InterruptedException 
	{
	
        
        // Account check
        
		Actions action2 = new Actions(driver);
		
		WebElement element2 =  driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		action2.moveToElement(element2).perform();
		
		Thread.sleep(5000); // add pause
		 
		driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span")).click();
		
		Thread.sleep(5000);
		 
	    driver.navigate().back();
		   
	    Thread.sleep(3000);
		   
		   
		// Check your order details
		   
	    Actions action3 = new Actions(driver);
		  
		WebElement element3 =  driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		action3.moveToElement(element3).perform();
			
	    Thread.sleep(5000); // add pause
			 
		driver.findElement(By.xpath(" //*[@id=\"nav_prefetch_yourorders\"]/span")).click();
			
		Thread.sleep(5000);
			 
	    driver.navigate().back();
			   
	    Thread.sleep(3000);
		     
	   // Sign out
		   
	    Actions action4 = new Actions(driver);
			   
		WebElement element4 =  driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			
		action4.moveToElement(element4).perform();
			
		Thread.sleep(5000); // add pause
			 
		driver.findElement(By.xpath(" //*[@id=\"nav-item-signout\"]/span")).click();
		 
		    
	}

   
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		//	logOut();

		Thread.sleep(8000);//wait for 8 secs before quit
		driver.close();
		driver.quit();

	}
}


