package p1.p11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelUtility;

public class bookticket {
	private WebDriver driver;
	
	
	@Test(priority = 1,DataProvider="logindata" "userName" "password")
	public void f() {
		poo123.uname.sendKeys("ABC");
		poo123.password.sendKeys("ABC");
		poo123.Login_button.click();
		  /*driver.findElement(By.name("userName")).sendKeys("abc");
		  driver.findElement(By.name("password")).sendKeys("abc");
		  driver.findElement(By.name("login")).click();*/
		 
	  }
	
		@DataProvider(name = "logindata")
		public String[][] login_data()throws Exception{
			ExcelUtility.setExcelPath("sheet1", "C:\\Users\\A06438_P5.Training\\Documents\\p1.xlsx");
			String username = ExcelUtility.getCellData(1, 1);
			String password = ExcelUtility.getCellData(1, 2);
			
			return new String[][] {
				new String[] {username,password},
				
			};
		}
		
		
		
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers1\\chromedriver_win32(1)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://newtours.demoaut.com/");
	  PageFactory.initElements(driver,poo123.class);
	  }

	  @AfterTest
	  public void afterTest() {
	  }

}
