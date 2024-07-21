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

public class HomePage {
	
	
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
    public void ScrollTest() throws InterruptedException 
	{
			
        // ScrollDown 
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	
        // Define the scroll step and the delay
        int scrollStep = 20;
        int delay = 50; // milliseconds

        // Scroll down in small steps
        for (int i = 0; i < 5000; i += scrollStep) {
        js.executeScript("window.scrollBy(0, " + scrollStep + ");");
        Thread.sleep(delay);  
        
        }
    
        Thread.sleep(3000);
    
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(delay);
     
	}
	
	@Test(priority  = 3)
    public void NavBarTest() throws InterruptedException 
	{
		
		//NavBar click
		driver.findElement(By.id("nav-hamburger-menu")).click();
		Thread.sleep(2000);
		
		//Scroll Down and Up in list
		WebElement targetElement = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[25]/a"));
		
		Actions actions = new Actions(driver);
		
		actions.scrollToElement(targetElement).perform();
		Thread.sleep(2000);
		 
		WebElement targetElement2 = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a"));
			
		Actions actions1 = new Actions(driver);
			
		actions1.scrollToElement(targetElement2).perform();
		Thread.sleep(2000);
			 
		//Closing nav option
	    driver.findElement(By.xpath("//*[@id=\"hmenu-canvas-background\"]/div")).click();
	    Thread.sleep(2000);
	    
	    
	    
	    //Select Amazon miniTV tab
	    
	    driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"appContainer\"]/nav/div[2]/a[2]")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"appContainer\"]/nav/div[2]/a[3]/span")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id=\"appContainer\"]/nav/div[2]/a[4]/span")).click();
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"appContainer\"]/nav/div[2]/a[5]/span")).click();
	    Thread.sleep(2000);
	    

	    driver.findElement(By.xpath("//*[@id=\"appContainer\"]/nav/div[2]/a[6]")).click();
	    Thread.sleep(2000);
	    

	    driver.findElement(By.xpath("//*[@id=\"appContainer\"]/nav/div[2]/a[7]/span")).click();
	    Thread.sleep(2000);
	    
	    

	    driver.findElement(By.xpath("//*[@id=\"appContainer\"]/nav/div[3]/div[1]/a/div/div[1]/img")).click();
	    Thread.sleep(2000);
	    
	    //Select Gift Card Tab
	    
	    driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
	    Thread.sleep(2000);
	    
	    
	    //Scroll Down and Up
	    
	    // ScrollDown 
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	
        // Define the scroll step and the delay
        int scrollStep = 20;
        int delay = 50; // milliseconds

        // Scroll down in small steps
        for (int i = 0; i < 5000; i += scrollStep) {
        js.executeScript("window.scrollBy(0, " + scrollStep + ");");
        Thread.sleep(delay);  
        
   }
    
        Thread.sleep(3000);
    
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(delay);
        
        driver.navigate().back();
        
        
        //Language Selection
        
        //Action class to move to element
        
        //Hindi Language
    	Actions action = new Actions(driver);
    		
        
        WebElement element3= driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]"));
	    
        action.moveToElement(element3).perform();
	    Thread.sleep(3000); // add pause
		
		
        
	    Actions action1 = new Actions(driver);
		 
	    WebElement element4 = driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[2]/span/i"));
		action1.moveToElement(element4).perform();
		Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[2]/span/span[1]")).click();
		Thread.sleep(3000); // add pause
		 
		 
		 //kannad Language
		 
		Actions action2 = new Actions(driver);
			
		WebElement element5= driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]"));
		    
	    action2.moveToElement(element5).perform();
	    Thread.sleep(3000); // add pause
			
			
	    WebElement element6 = driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[3]/span/span[1]"));
	    action2.moveToElement(element6).perform();
		Thread.sleep(3000);
			 
	    driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[3]/span/span[1]")).click();
		Thread.sleep(3000); // add pause
			 
			 
	    //tamil Language
			 
		Actions action3 = new Actions(driver);
				
		WebElement element7= driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]"));
			    
		action3.moveToElement(element7).perform();
		Thread.sleep(3000); // add pause
				
				
	    WebElement element8 = driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[4]/span/span[1]"));
		action3.moveToElement(element8).perform();
		Thread.sleep(3000);
				 
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[4]/span/span[1]")).click();
		Thread.sleep(3000); // add pause
				 
			 
		//kannada2 Language
				 
		Actions action4 = new Actions(driver);
					
		WebElement element9= driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]"));
				    
	    action4.moveToElement(element9).perform();
		Thread.sleep(3000); // add pause
					
					
		WebElement element10 = driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[5]/span/span[1]"));
		action4.moveToElement(element10).perform();
		Thread.sleep(3000);
					 
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[5]/span/span[1]")).click();
		Thread.sleep(3000); // add pause
					 
				 
		//Malyalam Language
					 
		Actions action5 = new Actions(driver);
						
		WebElement element11= driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]"));
					    
        action5.moveToElement(element11).perform();
	    Thread.sleep(3000); // add pause
						
						
	    WebElement element12 = driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[6]/span/span[1]"));
		action5.moveToElement(element12).perform();
		Thread.sleep(3000);
						 
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[6]/span/span[1]")).click();
		Thread.sleep(3000); // add pause
						 
		//Bangladeshi Language
						 
		Actions action6 = new Actions(driver);
							
		WebElement element13= driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]"));
						    
		action6.moveToElement(element13).perform();
		Thread.sleep(3000); // add pause
							
							
		WebElement element14 = driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[7]/span/span[1]"));
		action6.moveToElement(element14).perform();
		Thread.sleep(3000);
							 
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[7]/span/span[1]")).click();
		Thread.sleep(3000); // add pause
							 
		
	                
	    //Marathi  Language
						 
		Actions action7 = new Actions(driver);
							
		WebElement element15= driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]"));
						    
		action7.moveToElement(element15).perform();
		Thread.sleep(3000); // add pause
							
							
		WebElement element16 = driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[8]/span/span[1]"));
		action7.moveToElement(element16).perform();
		Thread.sleep(3000);
							 
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[8]/span/span[1]")).click();
		Thread.sleep(3000); // add pause
					
				
        //English  Language
						 
						 
		Actions action8 = new Actions(driver);
							
		WebElement element17= driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]"));
						    
		action8.moveToElement(element17).perform();
		Thread.sleep(3000); // add pause
							
							
		WebElement element18 = driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[1]/span/span[1]"));
		action8.moveToElement(element18).perform();
		Thread.sleep(3000);
							 
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/a[1]/span/span[1]")).click();
		Thread.sleep(3000); // add pause
					
						 
	    //Check cart 
						 
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
		Thread.sleep(3000);
						 
						 
						// ScrollDown 
						    JavascriptExecutor js1 = (JavascriptExecutor) driver;
						
					        // Define the scroll step and the delay
					        int scrollStep1 = 20;
					        int delay1 = 50; // milliseconds

					        // Scroll down in small steps
					        for (int i = 0; i < 5000; i += scrollStep1) {
					        js.executeScript("window.scrollBy(0, " + scrollStep1 + ");");
					        Thread.sleep(delay1);  
					        
					        }
					    
					        Thread.sleep(3000);
					    
					        js.executeScript("window.scrollTo(0, 0);");
					        Thread.sleep(delay1);
					        
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
