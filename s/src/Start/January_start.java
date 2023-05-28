package Start;

import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class January_start extends baseclass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.chrome.driver","H:\\JAVA TUTORIAL\\JAVA\\chromedriver\\chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
						
	//	ChromeDriver driver=new ChromeDriver();
	//	driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	//	driver.manage().window().maximize();
		init();
		lauch("chromebrowser");
		
	}

}
