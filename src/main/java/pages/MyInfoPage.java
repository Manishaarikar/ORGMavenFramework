package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import base.PredefinedActions;
import constant.ConstantPath;
import util.PropertiesOperation;

public class MyInfoPage extends PredefinedActions {

	private PropertiesOperation proOperation;
	static private MyInfoPage myInfoPage;

	private MyInfoPage() {
		try {
			proOperation = new PropertiesOperation(ConstantPath.MYINFOPAGELOCATOR_PATH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static MyInfoPage getObject() {
		if (myInfoPage == null)
			myInfoPage = new MyInfoPage();
		return myInfoPage;
	}
	
	public void clickOnMyInfoLink() {
		WebElement element = getElement(proOperation.getValue("myInfoLink"), true);
		clickOnElement(element);	
	}
	
	public String verifyTitle() {
		return getPageTitle();
	}
	
	public boolean isProfileDisplayed() {
		String profilePicLocator = proOperation.getValue("profilePic"); // [XPATH]:-//img
		WebElement element = getElement(profilePicLocator, true);
		return isElementDisplayed(element);
    }
	
	public String verifyEmployee() {
		
		WebElement element = getElement(proOperation.getValue("employeeName"), true);
		return getElementText(element);
	}
	
	public String verifyJobTitle() {
		WebElement element = getElement(proOperation.getValue("jobTitle"), true);
		return getElementText(element);
		
	}
	
	public String viewJobDetails() throws InterruptedException {
		Thread.sleep(5000);
		WebElement element = getElement(proOperation.getValue("jobInfo"), true);
		clickOnElement(element);
		return getPageTitle();
	}
}