package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("MATHI");
		driver.findElement(By.id("lastNameField")).sendKeys("MARAN");
		driver.findElement(By.name("departmentName")).sendKeys("BUISSNESS");
		driver.findElement(By.name("description")).sendKeys("This Is Good Time");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mathimaran02@gmail.com");
		WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select text = new Select(State);
		text.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("DO THE WORK PROPERLY");
		//driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		//driver.quit();

	}

}
