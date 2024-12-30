package browser;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
 public static void main(String[] args) throws InterruptedException {
  //System.setProperty("webdriver.chrome.driver", "chromedriver-win64/.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.makemytrip.com/");
  Thread.sleep(4000);
  driver.manage().window().maximize();
  Thread.sleep(3000);
  driver.get("https://www.facebook.com/");
  //.sendKeys - is to input the text in "username/password fields"
  driver.findElement(By.id("email")).sendKeys("surya86@gmail.com");
  Thread.sleep(6000);
  driver.findElement(By.name("pass")).sendKeys("nit@369");
  Thread.sleep(8000);
  //.Click - is to perform action on "BUTTONS"
  /*driver.findElement(By.name("login")).click();
     Thread.sleep(10000);*/
     driver.get("https://www.amazon.in/");
     Thread.sleep(20000);
     driver.findElement(By.id("createAccountSubmit")).click();
     Thread.sleep(6000);
      driver.findElement(By.xpath(" WebElement YourName = driver.findElement(null)")).sendKeys("suryareddy");
     //Thread.sleep(7000);
     //fn.sendKeys("siva");
    // Thread.sleep(8000);
     
     //fn.clear();
     //Thread.sleep(9000);
     //fn.sendKeys("nit");
     //Thread.sleep(10000);
     driver.findElement(By.id("ap_phone_number")).sendKeys("9866536428");
     Thread.sleep(110000);
     driver.findElement(By.name("password")).sendKeys("siva@369");
     Thread.sleep(80000);
     driver.findElement(By.className("a-button-input")).click();
  //driver.manage().window().minimize();
  Thread.sleep(6000);
  driver.close();
  driver.getCurrentUrl();
	
  
 }

}
