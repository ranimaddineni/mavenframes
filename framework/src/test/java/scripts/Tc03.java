package scripts;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.BusinessFunctions;

public class Tc03 extends StartBrowser {
  @Test
  public void testupdateComments() throws Exception {
	  BusinessFunctions bfunctions=new BusinessFunctions();
	  bfunctions.login();
	  bfunctions.updateComments();
	  bfunctions.logout();

	  
  }
}
