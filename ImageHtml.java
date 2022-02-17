package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageHtml {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img")).click();
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight']/img)[4]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/img)[2]")).click();
		String title = driver.getTitle();
		String title2 = "TestLeaf - Interact with Images";
		if(title.equals(title2)) {
			System.out.println("broken image");
		}else {
			System.out.println("not a broken");
		}
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/img)[3]")).click();
		Thread.sleep(2500);
		driver.close();
	}
}
