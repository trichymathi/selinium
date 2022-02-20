package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.findElement(By.name("UserFirstName")).sendKeys("MATHI");
		driver.findElement(By.name("UserLastName")).sendKeys("MARAN");
		driver.findElement(By.name("UserEmail")).sendKeys("mathimaran002@gmail.com");
		WebElement titledrop = driver.findElement(By.name("UserTitle"));
		Select drop1 = new Select(titledrop);
		drop1.selectByVisibleText("Sales Manager");
		driver.findElement(By.name("CompanyName")).sendKeys("HARI AMBILI");
		driver.findElement(By.xpath("(//div[@class='companyEmployees selectFieldInput section']//select/option)[3]")).click();
		//WebElement employeedrop = driver.findElement(By.xpath("//div[@class='companyEmployees selectFieldInput section']//select"));
		//Select drop2 = new Select(employeedrop);
		//drop1.selectByValue("75");   //("101 - 500 employees");
		driver.findElement(By.name("UserPhone")).sendKeys("6383585161");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
