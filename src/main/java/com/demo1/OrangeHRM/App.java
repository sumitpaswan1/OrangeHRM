import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class App {
 WebDriver driver = null;
@FindBy(xpath="//input[@name='username']")
WebElement uname;

 @FindBy(xpath="//input[@type='password']")
 WebElement pwd;
 
@FindBy(xpath="//button[@type='submit']")
WebElement btn;

public void PageFactoryOrangeHRM(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
}


public void login() throws IOException, InterruptedException {
File src = new File("C:\\Users\\SSING446\\eclipse-workspace\\OrangeHRM\\src\\test\\java\\Property\\User.properties");
FileInputStream fis = new FileInputStream(src);
 Properties pro = new Properties();
 pro.load(fis);
 System.setProperty("Webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.get(pro.getProperty("orangeHRM.login.URL"));
 driver.manage().window().maximize();
 Thread.sleep(3000);
 WebElement usrnme = driver.findElement(By.xpath(pro.getProperty("orangeHRM.login.username.xpath")));
 usrnme.sendKeys("Admin");
 WebElement pwd = driver.findElement(By.xpath(pro.getProperty("orangeHRM.login.password.xpath")));
 pwd.sendKeys("admin123");
 driver.findElement(By.xpath(pro.getProperty("orangeHRM.login.button.xpath"))).click();
 }
}