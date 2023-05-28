package s;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	

	public static WebDriver driver;
	public  static String projectpath=System.getProperty("user.dir");
	public static Properties p;
	
	public static void lauch(String browser)
	{
		//if(browser.equals("chrome"))
		if(p.getProperty(browser).equals("chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver",projectpath +"//driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		}
	} 
	
	public static void url(String url)
	{
		//driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		//driver.get(url);
		
	}
	
	
	public static void init() throws Exception
	{
		
		FileInputStream fis = new FileInputStream(projectpath+"//data.properties");
		//Properties p=new Properties();--inside this method only
		p=new Properties();
		p.load(fis);
	}
	
	

}
