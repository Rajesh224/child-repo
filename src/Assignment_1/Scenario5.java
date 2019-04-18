package Assignment_1;

import org.openqa.selenium.WebElement;

public class Scenario5  extends Scenario4{
	Scenario4 scenario4 = null;
	Scenario3 scenario3 = null;
public Scenario5() {
	scenario4 = new Scenario4();
	scenario3 = new Scenario3();
	
}

public void methodd() {
	WebElement userNameField = driver.findElement(scenario3.oelement);
}
}
