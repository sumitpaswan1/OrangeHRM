package com.testRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FactoryHRM {
	WebDriver driver;
	PageFactoryOrangeHRM pgm;
    @Test
	public void logintestO() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		PageFactoryOrangeHRM pgm = new PageFactoryOrangeHRM(driver);
		pgm.Login();
		pgm.navigating_to_Leave();
		pgm.user_on_leave_listp_page();
		pgm.user_clicks_on_different_navigation_links();
		pgm.user_is_in_leave_list_section();
		pgm.user_reset_the_existing();
		
		pgm.user_Update_the_existing_input_fields();
		pgm.user_clicks_on_the_search_button();
		pgm.user_is_Click_on_the_Apply_section();
		pgm.user_click_on_the_My_Leave_button();
		pgm.user_Reset_the_existing_input_fields();
		pgm.user_enter_the_input_in_required_fileds();
		pgm.user_can_click_on_the_Search_button();
		
		pgm.user_click_on_the_Entitlements_dropdown() ;
		pgm.user_click_on_the_Add_Entitlements_section();
		pgm.user_select_the_all_the_mandatory_fields() ;
		pgm.user_click_on_the_Save_button();
		pgm.user_can_click_on_the_cancel_button();
		
	
	
		
		pgm.user_click_on_the_Assign_Leave_button();
		pgm.user_select_the_employee_name_and_leave_type();
		pgm.user_click_on_the_Assign_button();
		
		
		
	
	}

}
