package scripts;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.BusinessFunctions;

public class Tc02 extends StartBrowser{
  @Test
  public void testLogin_Logout() throws Exception {
	  BusinessFunctions bfunctions=new BusinessFunctions();
	  bfunctions.login();
	  bfunctions.logout();

  }
}
