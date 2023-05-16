	package pages;

	import java.io.IOException;
	import java.util.List;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import base.PredefinedActions;
	import constant.ConstantPath;
	import util.PropertiesOperation;

	public class AssignLeavePage extends PredefinedActions {

		private PropertiesOperation proOperation;
		static private AssignLeavePage assignleavePage;

		private AssignLeavePage() {
			try {
				proOperation = new PropertiesOperation(ConstantPath.ASSIGNLEAVEPAGELOCATOR_PATH);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static AssignLeavePage getObject() {
			if (assignleavePage == null)
				assignleavePage = new AssignLeavePage();
			return assignleavePage;	
		}
		public String verifyTitle() {
			return getPageTitle();
		}
		public void enterEmployee(String employee) throws InterruptedException {
			WebElement element = getElement(proOperation.getValue("employeeValue"), true);
			enterText(element, employee);
			//WebElement employee=getElement(proOperation.getValue("enterEmployee"),true);
			//clickOnElement(employee);
			Thread.sleep(4000);
		}
		
		public  void clickOnLeaveType() throws InterruptedException {
			WebElement element = getElement(proOperation.getValue("leaveTypeSelect"), true);
			clickOnElement(element);
		
			WebElement leave = getElement(proOperation.getValue("selectLeave"), true);
			clickOnElement(leave);
	   }
		
		public void selectDate() {
			WebElement element = getElement(proOperation.getValue("fromDate"), true);
			clickByActions(element);
			WebElement element1 = getElement(proOperation.getValue("todayStartButton"), true);
			clickByActions(element1);
			
			WebElement toDate = getElement(proOperation.getValue("toDate"), true);
			clickByActions(toDate);
			WebElement todayToDate = getElement(proOperation.getValue("todayToButton"), true);
			clickByActions(todayToDate);
		}
		
		public void writeComment(String comment) {
			WebElement element = getElement(proOperation.getValue("comment"), true);	
			enterText(element, comment);
		}
		
		public void clickOnAssign() {
			WebElement element = getElement(proOperation.getValue("assignButton"), false);
			clickOnElement(element);
			WebElement close=getElement(proOperation.getValue("closeLeave"), true);
			clickOnElement(close);		
	   }	
		
		public void checkSickLeaveBalance() {
			WebElement sickLeaveBalance = getElement(proOperation.getValue("checkBalanceLink"), true);
			clickOnElement(sickLeaveBalance);	
		}
		
		public void validateLeaves() {
			//WebElement leave= getElement(proOperation.getValue("leaveCount"), true);
			//getElementText(leave);
			WebElement close=getElement(proOperation.getValue("closeLeave"), true);
			clickOnElement(close);	
		}
	}
