package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //it waits 20 sec for every find element 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//driver.findElement(By.linkText("Phone")).click();
		//driver.findElement(By.xpath("//span[@id='ext-gen873']")).click();
		//driver.findElement(By.name("phoneAreaCode")).sendKeys("044");
		//driver.findElement(By.name("phoneNumber")).sendKeys("9840079314");
		//driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Divya");
		WebElement firstlead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));//parent call
		String text = firstlead.getText();
		System.out.println(text);
		firstlead.click();
		//driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		//driver.findElement().click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//driver.findElement(By.linkText("Name and ID")).click();
		driver.findElement(By.name("id")).sendKeys(text);
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
	    String text2 = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		//System.out.println(text2);
		if(text.equals(text2)) {
			System.out.println(text);
		}else {
			System.out.println(text2);
			}
		}
		}