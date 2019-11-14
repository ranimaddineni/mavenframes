package reuse;

import org.openqa.selenium.WebDriver;

import comands.ActionDriver;
import config.StartBrowser;
import or.CustomersPage;
import or.HomePage;
import or.Login;

public class BusinessFunctions {
	WebDriver driver;
	ActionDriver adriver;
	public BusinessFunctions()
	{
		driver=StartBrowser.driver;
		adriver=new ActionDriver();
	
	}
	public void login() throws Exception
	{
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Login to Application");
adriver.navigateToApplication("http://www.gcrit.com/build3/admin/login.php/");
adriver.type(Login.txtUserName,"admin","UserName");
adriver.type(Login.txtPassword,"admin@123","Password");
adriver.click(Login.clickLogin, "Login button");
}
	public void logout() throws Exception
	{
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Logout to Application");

adriver.click(HomePage.linkLogout, "Logoff button");
}
	public void updateComments() throws Exception
	{
		StartBrowser.childTest=StartBrowser.parentTest.createNode("update comments");
adriver.click(CustomersPage.lnkCustomer,"Customer link");
adriver.click(CustomersPage.lnkOrders,"Orders link");
adriver.click(CustomersPage.btnEdit,"Edit btn");
adriver.type(CustomersPage.txtComments,"My edit","comments");
adriver.click(CustomersPage.btnUpdate,"Update button");

}
	
		
	}
