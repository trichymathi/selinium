package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithEditField {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("email")).sendKeys("mathimaran02@gmail.com");
		WebElement ele = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[2]"));
		ele.clear();
		ele.sendKeys("TAMIL",Keys.TAB);
		String attribute = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(attribute);
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	    boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
	    System.out.println(enabled);
	}

}
