package Assignment_1;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {
	Scenario3 scenario3= null;
	WebDriver driver = null;
	public Scenario4(){
		scenario3 = new Scenario3();
		driver = new ChromeDriver();
	}

	public void sampleMethod() {

		String text;

		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		
		

		List<WebElement> list = new ArrayList<WebElement>();
		ArrayList<String> menu = new ArrayList<String>();

		// Opening application
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		// Login to the application

		WebElement userNameField = driver.findElement(scenario3.oelement);
		WebElement passWordField = driver.findElement(By.id("txtPassword"));

		userNameField.sendKeys("admin");
		passWordField.sendKeys("admin");

		driver.findElement(By.id("btnLogin")).click();

		list = driver.findElements(By.xpath("//div[@id='dashboard-quick-launch-panel-menu_holder']//tr/td/div/a/span"));

		for (WebElement obj : list) {
			text = obj.getText();
			menu.add(text);
		}

		System.out.println("List of menu items in Quick launch is: ");

		for (String s : menu) {
			System.out.println(s);
		}

		// Logout from application
		// driver.findElement(By.id("welcome")).click();
		// driver.findElement(By.xpath("//li/a[text()='Logout']")).click();

}

}