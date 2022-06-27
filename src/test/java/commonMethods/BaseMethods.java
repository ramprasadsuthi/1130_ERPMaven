package commonMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BaseMethods {
	
	public static WebDriver driver;
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void launchERP() {
		driver.get("http://webapp.qedgetech.com/login.php");
		driver.manage().window().maximize();
	}
	
	public static void loginERP() {
		// This code belongs to login methods 
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		//String pCaption = driver.findElement(By.id("ewPageCaption")).getText();
		String pCaption1 = driver.findElement(By.linkText("Dashboard")).getText();
				
		if(pCaption1.equals("Dashboard")) {
			System.out.println("Login is success, Test Case is passed");
			} else {
			System.out.println("Unable to Login, Test Case is failed");
			}
	}
	
	public static void logoutERP() {
		//click on Logout link
		driver.findElement(By.id("mi_logout")).click();
		//validate Login button existance
				
		if(driver.findElement(By.id("btnsubmit")).isEnabled()) {
	     	System.out.println("Logout is success, and Test case is Passed");
		} else {
			System.out.println("Logout is failed, and Test case is Failed");
		}
	}

	public static void loginERP(String username, String password) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//String alertWindow = driver.getWindowHandle();	
		//driver.switchTo().window(alertWindow);
		
		String actResult = driver.findElement(By.xpath("//div[@class='alert alert-danger ewError']")).getText();
		System.out.println("Actual Result is : " + actResult);
		if(actResult.contains("Incorrect")) {
			System.out.println("Invalid login Testcase is passed");
		} else {
			System.out.println("Testcase is Failed..");
		}
	}
	
	public static void AccessToStockItemsPage() {
		//click on the stock Items menu 
		  driver.findElement(By.xpath("//li[@id='mi_a_stock_items']")).click();
		// put the validation code to check stock Items page is opened or not
		 String pcaption = driver.findElement(By.id("ewPageCaption")).getText();
		 Assert.assertTrue(pcaption.equals("Stock Items"));
	}
	
	

}
