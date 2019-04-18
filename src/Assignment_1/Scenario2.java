package Assignment_1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) {

		String text;
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		List<WebElement> list = new ArrayList<WebElement>();
		ArrayList<String> menu = new ArrayList<String>();

		// Opening application
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");

		// Login to the application

		WebElement userNameField = driver.findElement(By.id("txtUsername"));
		WebElement passWordField = driver.findElement(By.id("txtPassword"));

		userNameField.sendKeys("admin");
		passWordField.sendKeys("admin");

		driver.findElement(By.id("btnLogin")).click();

		list = driver.findElements(By.xpath("//div[@class='menu']/ul/li/a/b"));

		for (WebElement obj : list) {
			text = obj.getText();
			menu.add(text);
		}

		System.out.println("List of menu items is: ");

		for (String s : menu) {
			System.out.println(s);
		}

		// Logout from application
		// driver.findElement(By.id("welcome")).click();
		// driver.findElement(By.xpath("//li/a[text()='Logout']")).click();

	}

}
