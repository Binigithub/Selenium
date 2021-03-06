import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/binni/Desktop/Selenium/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.manage().window().maximize();
		
		List<WebElement> names = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));

		System.out.println(names.size());

		List<WebElement> price = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[4]"));

		System.out.println(price.size());

		String companyName = "Jyoti";
		
		for(int i=0;i<names.size();i++) {
			if(names.get(i).getText().equals(companyName)) {
				System.out.println(price.get(i).getText()); 
				break;
				
			}
			
		}
		//how many column 
		int column = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[1]/td")).size();
		System.out.println(column);
		driver.quit();

	}

}
