package org.testing.testScripts;

import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.video_play;
import org.testng.annotations.Test;

public class TC3 extends Base
{
    @Test
    public void TestCase3()
    {
    	Login l=new Login(driver, pr);
    	l.signin("dsfdgf", "dsfd");
    	video_play v=new video_play(driver, pr);
    	v.video();
    	
    	
    }
	
}
