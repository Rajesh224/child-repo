package Assignment_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Scenario1 {

	public static void main(String[] args) {
		int numOfRows = 1;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); 
		for (int i = 0; i < 366; i++) {
			c.add(Calendar.DATE, 150); 
			String sNextYear =  sdf.format(c.get(Calendar.YEAR)) + 1;
			if (sdf.format(c.getTime()).equals("2020"))
				break;
			numOfRows = numOfRows + 1;
		}
if(true && true) {
	
}
		String output = sdf.format(c.getTime());
		System.out.println(output);
		System.out.println("ROWS"+numOfRows);
//
//		String pageTitle;
//		System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//
//		// Opening application
//		driver.manage().window().maximize();
//		driver.get("http://opensource.demo.orangehrmlive.com/");
//		// Login to the application
//
//		WebElement userNameField = driver.findElement(By.id("txtUsername"));
//		WebElement passWordField = driver.findElement(By.id("txtPassword"));
//
//		userNameField.sendKeys("admin");
//		passWordField.sendKeys("admin");
//
//		driver.findElement(By.id("btnLogin")).click();
//
//		pageTitle = driver.getTitle();
//		System.out.println("Title of the page" + pageTitle);

	}

}
