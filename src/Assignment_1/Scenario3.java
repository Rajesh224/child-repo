package Assignment_1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {
	By oelement =  By.id("txtUsername");
	public void testt(String[] args) {

		String text;

		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		// Opening application
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");

		// Login to the application

		WebElement userNameField = driver.findElement(oelement);
		WebElement passWordField = driver.findElement(By.id("txtPassword"));

		userNameField.sendKeys("admin");
		passWordField.sendKeys("admin");

		driver.findElement(By.id("btnLogin")).click();
		
		//Printing selected menu

		text = driver.findElement(By.xpath("//li[@class='current']")).getText();
		
		System.out.println("By default selected menu option is: "+text);


		// Logout from application
		// driver.findElement(By.id("welcome")).click();
		// driver.findElement(By.xpath("//li/a[text()='Logout']")).click();

	
}


}
