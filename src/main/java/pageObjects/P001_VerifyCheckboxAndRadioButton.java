package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P001_VerifyCheckboxAndRadioButton {

	WebDriver driver=null;
	public P001_VerifyCheckboxAndRadioButton(WebDriver driver) {
		this.driver=driver;
	} 
	
	By radio = By.xpath("//body[1]/div[1]/fieldset[1]/label[3]/span[1]");
	By checkbox= By.xpath("//body[1]/div[1]/fieldset[2]/label[4]/span[1]");
	By checkbox2= By.xpath("//body[1]/div[1]/fieldset[2]/label[1]/span[1]");
	
	public void clickRadioButton() {
		driver.findElement(radio).click();
	}
	
	public void clickCheckBox() {
		driver.findElement(checkbox).click();
	}
	
	public void clickCheckBox2() {
		driver.findElement(checkbox2).click();
	}
	
}
