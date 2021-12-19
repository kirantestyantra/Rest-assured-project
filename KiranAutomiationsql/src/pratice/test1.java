package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/software/chrome.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("www.ebay.com");
        
  

        
        
       /* WebElement listbox = driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));
		  
		  Select s = new Select(listbox);
		  s.selectByVisibleText("Books");
		  
		  WebElement selected = s.getFirstSelectedOption();
		  System.out.println(selected.getText());
		  
		  driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
		  driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("The Monk who sell his ferrari");
		  driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
		  Thread.sleep(3000);
		  driver.close();*/
	  }
	}

}
