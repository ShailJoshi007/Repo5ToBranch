package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFile {

	//pull back
	WebDriver driver=null;
	
	@Test
	public void m1()
	{
		System.out.println("Hello to test Branching of Git");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//String BROWSER = System.getProperty("browser");
	
	}


}
