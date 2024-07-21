package WebPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductSearch {
	
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
	public void ProductPurchaseTest() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
		Thread.sleep(2000);
		
		
		//Enter product name
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("one plus 10 r");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]")).click();
		Thread.sleep(4000);
		
		
		WebElement w = driver.findElement(By.xpath("//*[@id=\"s-result-sort-select\"]"));
		
		Select dropdown = new Select(w);
		dropdown.selectByIndex(1);
		Thread.sleep(3000);
		
		
		  // ScrollDown 
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	
        // Define the scroll step and the delay
        int scrollStep = 20;
        int delay = 25; // milliseconds

        // Scroll down in small steps
        for (int i = 0; i < 110; i += scrollStep) {
        js.executeScript("window.scrollBy(0, " + scrollStep + ");");
        Thread.sleep(delay);  
        
        }
    
        Thread.sleep(3000);
    
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(delay);
        
    
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_3\"] ")).click();
           
        Thread.sleep(3000);
        
        // ScrollDown 
	 

        // Scroll down in small steps
        for (int i = 0; i < 150; i += scrollStep) {
        js.executeScript("window.scrollBy(0, " + scrollStep + ");");
        Thread.sleep(delay);  
        
        }
    
        Thread.sleep(3000);
    
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(delay);
        
        
      //*[@id="s-result-sort-select_2"]
        
        driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_4\"] ")).click();
        
        
          Thread.sleep(3000);
        // ScrollDown 
	 

        // Scroll down in small steps
        for (int i = 0; i < 110; i += scrollStep) {
        js.executeScript("window.scrollBy(0, " + scrollStep + ");");
        Thread.sleep(delay);  
        
        }
    
        Thread.sleep(3000);
    
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(delay);
        
        
        
        // Go to Home Tab
        driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
        
        //Click on Category DropDwon
        
        driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
        
    	Thread.sleep(3000);
        
    	//Click on Fashion option 
        driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[4]")).click();
      

		Thread.sleep(3000);
		
		
		//Click on Sobmit button
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		
		
		 // ScrollDown 
		
		 // Define the scroll step and the delay
        int scrollStep1 = 20;
        int delay1 = 50; // millisecond
		 

        // Scroll down in small steps
        for (int i = 0; i < 5000; i += scrollStep1) {
        js.executeScript("window.scrollBy(0, " + scrollStep1 + ");");
        Thread.sleep(delay1);  
        
        }
    
        Thread.sleep(3000);
    
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(delay);
        
        
 //Click on Category DropDwon
        
        driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
        
    	Thread.sleep(3000);
        
    	//Click on Fashion option 
        driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[4]")).click();
      

		Thread.sleep(3000);
		
		//*[@id="twotabsearchtextbox"]
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("t shirt");
		
		//Click on Sobmit button
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		
		
		 // ScrollDown 
		
		 // Define the scroll step and the delay
        int scrollStep2 = 20;
        int delay2 = 50; // millisecond
		 

        // Scroll down in small steps
        for (int i = 0; i < 5000; i += scrollStep2) {
        js.executeScript("window.scrollBy(0, " + scrollStep2 + ");");
        Thread.sleep(delay1);  
        
        }
    
        Thread.sleep(3000);
    
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(delay);
        
        Thread.sleep(3000);
		
        
    	Actions action = new Actions(driver);
		
		WebElement element= driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[2]/span[1]"));
						    
		action.moveToElement(element).perform();
		Thread.sleep(3000); // add pause
							
		
		
       Actions action1 = new Actions(driver);
		
	   WebElement element1= driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[3]/span[1]"));
						    
	   action1.moveToElement(element1).perform();
	   Thread.sleep(3000); // add pause
							
		
		
	   Actions action2 = new Actions(driver);
			
	   WebElement element2= driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[4]/span[1]"));
							    
	   action2.moveToElement(element2).perform();
	   Thread.sleep(3000); // add pause
								
	   
	   Actions action3 = new Actions(driver);
		
	   WebElement element3= driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[5]/span[1]"));
							    
	   action3.moveToElement(element3).perform();
	   Thread.sleep(3000); // add pause
								
	   
	   Actions action4 = new Actions(driver);
		
	   WebElement element4= driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[6]/span[1]"));
							    
	   action4.moveToElement(element4).perform();
	   Thread.sleep(3000); // add pause
								
	   
	   Actions action5 = new Actions(driver);
		
	   WebElement element5= driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[7]/span[1]"));
							    
	   action5.moveToElement(element5).perform();
	   Thread.sleep(3000); // add pause
								
       
      
	   // Go to Home Tab
       driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
       
       
            
        
	 
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
