package org.testing.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertions.Assertt;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 extends Base
{
	@Test
	public void testcase1()
	{
		String expected_url="https://www.youtube.com";
		String expected_email="deepakdeep1992";
		Login l=new Login(driver, pr);
		l.signin(expected_email,"dfdg");
		Assert.assertTrue(Assertt.assert_1(expected_url, expected_url));
	
		WebElement button=driver.findElement(By.id(pr.getProperty("button")));
		button.click();
		WebElement b=driver.findElement(By.id(pr.getProperty("button2")));
		String actual_email=b.getText();
		Assert.assertTrue(Assertt.assert_1(expected_email, actual_email));
	}

}
