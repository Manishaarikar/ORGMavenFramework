package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PredefinedActions;
import constant.ConstantPath;
import util.PropertiesOperation;

public class MenuPage extends PredefinedActions {
	private PropertiesOperation proOperation;
	static private MenuPage menuPage;

	private MenuPage() {
		try {
			proOperation = new PropertiesOperation(ConstantPath.MENUPAGELOCATOR_PATH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static MenuPage getObject() {
		if (menuPage == null)
			menuPage = new MenuPage();
		return menuPage;
	}

	public void navigateTo(String menu) {
		String[] arr = menu.split("->");
		navigateToMenu(arr, proOperation.getValue("menuItem"));
	}
}
