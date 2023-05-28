package s;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tt extends base {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","H:\\JAVA TUTORIAL\\JAVA\\chromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
		
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		init();
		//lauch("chrome");
		lauch("chromebrowser");
		//url("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("narasimha");
		WebElement lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys("sista");
		//driver.findElement(By.id("sex-0")).click();
		//driver.findElement(By.id("exp-2")).click();
		//driver.findElement(By.id("datepicker")).sendKeys("01/01/2023");
		driver.findElement(By.id("profession-0")).click();
		
		driver.findElement(By.id("tool-0")).click();
		
		List<WebElement> boxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
				System.out.println(boxes.size());
				
				Select drpCountry = new Select(driver.findElement(By.name("continents")));
				drpCountry.selectByVisibleText("Australia");
				
				Select se = new Select(driver.findElement(By.id("continents")));
				List<WebElement> l = se.getOptions();
				System.out.println(l.size());
				
				//Object dropdown = Select(driver.find_element(By.XPATH,"//*[@id='continents']"))
					//System.out.println("Items are: " )
						//for i in ((Select) dropdown).getOptions():
						  // print(i.get_attribute('innerHTML'))
						    
						    
						    Select dropDown = new Select(driver.findElement(By.id("continents")));
		        List <WebElement> elementCount = dropDown.getOptions();
		        int itemSize = elementCount.size();
		        for(int i = 0; i < itemSize ; i++){
		            String optionsValue = elementCount.get(i).getText();
		            System.out.println(optionsValue);
		        }
		
	}

	private static char[] len(List<WebElement> boxes) {
		// TODO Auto-generated method stub
		return null;
	}

}
