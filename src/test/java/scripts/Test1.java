package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	@Test
	public void tc1() {
		
		Reporter.log("selenium",true);
	}

}
