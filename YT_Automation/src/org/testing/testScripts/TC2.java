package org.testing.testScripts;

import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testng.annotations.Test;

public class TC2 extends Base
{
	@Test
	public void testcase2()
	{
		Login l=new Login(driver, pr);
		l.signin("Deepak","dfdg");
	}

}
