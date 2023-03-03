package com.demo1.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_PF {
	
    private WebDriver driver;

    // Constructor
    public OrangeHRM_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators using @FindBy annotation
    @FindBy(id = "//nav[@class='oxd-navbar-nav']/div[2]/ul/li[4]/a")
    private WebElement timeMenu;

    @FindBy(id = "//nav[@class='oxd-topbar-body-nav']/ul/li[1]/span")
    private WebElement timesheetsDropdown;

    @FindBy(id = "menu_time_viewEmployeeTimesheet")
    private WebElement timesheetsMenu;

    // Methods for accessing the elements
    public void clickTimeMenu() {
        timeMenu.click();
    }

    public void clickTimesheetsDropdown() {
        timesheetsDropdown.click();
    }

    public boolean isTimesheetsMenuVisible() {
        return timesheetsMenu.isDisplayed();
    }
	
	
	
	
	
	
	
}
	
	
	   public static void main(String[] args) {
	        // Set the system property for the ChromeDriver
		   System.setProperty("Webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

	        // Initialize a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the OrangeHRM login page
	        driver.get("https://opensource-demo.orangehrmlive.com/");

	        driver.manage().window().maximize();
	        
	       

	   }
	

