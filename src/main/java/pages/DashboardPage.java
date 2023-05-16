package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;

import base.PredefinedActions;
import constant.ConstantPath;
import util.PropertiesOperation;

public class DashboardPage extends PredefinedActions {
	private PropertiesOperation proOperation;
	static private DashboardPage dashboardPage;

	private DashboardPage() {
		try {
			proOperation = new PropertiesOperation(ConstantPath.DASHBOARDPAGELOCATOR_PATH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static DashboardPage getObject() {
		if (dashboardPage == null)
			dashboardPage = new DashboardPage();
		return dashboardPage;
	}

	public String getPageHeaderTile() {
		return getPageTitle();
	}

	public String getPageTitle() {
		String logoLocator = proOperation.getValue("dashboardPageTitle");
		WebElement element = getElement(logoLocator, false);
		return getElementText(element);
	}

	public int getTotalWidgets() {
		String logoLocator = proOperation.getValue("dashboardTotalWidgets");
		return getElements(logoLocator, false).size();
	}

	public List<String> getAllWidgetsText() {
		String logoLocator = proOperation.getValue("dashboardWidgetHeaders");
		return getTextOfAllElements(logoLocator, false);
	}

	public String getWidgetTextBasedOnIndex(int index) {
		List<String> widgetsList = getAllWidgetsText();
		return widgetsList.get(index);
	}
	
	public void clickOnAssignLeaveWidget() {
		WebElement element = getElement(proOperation.getValue("assignLeaveWidget"), true);
		clickOnElement(element);
		
		//clickOnElement(element);
   }
	
	public void navigateToDashboard() {
		WebElement home = getElement(proOperation.getValue("dashboard"), true);
		clickOnElement(home);
		
	}
    
	public void clickOnMyInfo() {
		WebElement myInfo = getElement(proOperation.getValue("myInfoLink"), true);
		clickOnElement(myInfo);
	}
	
	public void logOutFromApp() {
		WebElement userDropdown = getElement(proOperation.getValue("userDropdown"), true);
		clickOnElement(userDropdown);		
	}
	
	public void logOut() {
		WebElement logOutLink = getElement(proOperation.getValue("logOutLink"), true);
		clickOnElement(logOutLink);
	}
	
	public String verifyLogOut() {
		return getPageTitle();
	}
}
