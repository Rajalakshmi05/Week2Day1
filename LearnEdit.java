package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  driver.manage().window().maximize();
		  WebElement eleUserName=driver.findElement(By.id("Username"));
		  eleUserName.sendKeys("DemoSalesManager");
		  driver.findElement(By.id("Password")).sendKeys("crmsfa");
		  driver.findElement(By.className("decarative Submit")).click();
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajalakshmi");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mahalingam");
		   WebElement el= driver.findElement(By.id("createLoadForm_dataSourcerId"));
		  Select d1= new Select(el);
		  d1.selectByVisibleText("Conference");
		  driver.findElement(By.id("createLeadForm_firseNameLocal")).sendKeys("Raji");
		  driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Maha");
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("Top Selenium Leading Center");
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("raji5.maha@gmail.com");
		  WebElement e2= driver.findElement(By.id("createLoadForm_generalStateProvienceGioId"));
		  Select d2= new Select(e2);
		  d2.selectByVisibleText("New York");
		  driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Best Education Organization");
		  driver.findElement(By.name("Submit Button")).click();
		  driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateLeadForm_description")).clear();
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Selenium Webdriver is Amazing");
			driver.findElement(By.className("smallSubmit")).click();
			String title=driver.getTitle();
			System.out.println("Title of Web Page is :"+title);
			//System.out.println("Title of Web Page is :"+driver.getTitle());
		 driver.close();
		
	}

}
