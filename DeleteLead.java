package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
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
		driver.findElement(By.linkText("Phone")).click();
		//driver.findElement(By.xpath("//span[@id='ext-gen873']")).click();
		driver.findElement(By.name("phoneAreaCode")).sendKeys("044");
		driver.findElement(By.name("phoneNumber")).sendKeys("9840079314");
		//driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		driver.findElement(By.linkText("10827")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Name and ID")).click();
		driver.findElement(By.name("id")).sendKeys("10827");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		//String text = driver.findElement(By.id("ext-gen437")).getText();
		//String text1="No Records To Display";
		//if(text.equals(text1)) {
			System.out.println("No Records To Display");
			driver.close();
		//}
		//else {
			//System.out.println("Records To Display");
		//}
		}
}