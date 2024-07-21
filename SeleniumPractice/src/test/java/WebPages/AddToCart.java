package WebPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddToCart {
	
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
		
		WebElement element =  driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));		
		action.moveToElement(element).perform();
		Thread.sleep(2000); // add pause
 		 
        //Click on sign in
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		Thread.sleep(4000);
		
		
        //Enter valid Username
		driver.findElement(By.id("ap_email_login")).click();
		driver.findElement(By.id("ap_email_login")).clear();
		Thread.sleep(3000);
		 
		driver.findElement(By.id("ap_email_login")).sendKeys("somkar413@gmail.com");
		
        //Click on contineu
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
	public void SearchProductTest() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
		Thread.sleep(2000);
		
		
        //Enter product name
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("one plus");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(4000);

	  
	     //Locate the target element
	     WebElement targetElement =   driver.findElement(By.xpath("//*[@id=\"a-autoid-3-announce\"]"));

	     //Scroll to the target element using JavaScript
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("arguments[0].scrollIntoView(true);",targetElement);  
	     Thread.sleep(3000);
	    
	      
	     driver.findElement(By.xpath("//*[@id=\"a-autoid-4-announce\"]")).click();
	     Thread.sleep(5000);

	     driver.navigate().back();
	     Thread.sleep(3000);
	      
	     //Click on cart 
	 	 driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
		 Thread.sleep(5000);
		 
		 driver.navigate().back();
		 
		 
	      
	    	
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
