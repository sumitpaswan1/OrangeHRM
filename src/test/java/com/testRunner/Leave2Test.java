package com.testRunner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Leave2Test {

	WebDriver driver = null;
  @Test
  public void i_click_on_the_Save_buttonTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void the_leave_list_should_be_submitted_successfullyTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void the_leave_period_should_be_updated_successfullyTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void the_record_is_successfully_deletedTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_Reset_the_existing_input_fieldsTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_Update_the_existing_input_fieldsTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_can_click_on_Approve_button_to_approve_the_leaveTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_can_click_on_Reject_button_to_reject_the_leaveTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_can_click_on_the_Save_buttonTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_can_click_on_the_Search_buttonTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_can_click_on_the_cancel_buttonTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_can_click_on_the_search_buttonTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_can_click_on_the_serch_buttonTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_can_on_the_click_Add_buttonTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_can_successfully_search_the_entitlementsTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_can_successfully_search_the_leave_entitlementsTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_can_successfully_view_the_leave_entitlementsTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_click_on_ConfigureTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_click_on_Yes_Delete_buttonTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_click_on_the_AddTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_click_on_the_Add_Entitlements_sectionTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_click_on_the_Assign_Leave_buttonTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_click_on_the_Assign_buttonTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_click_on_the_Configure_dropdownTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_click_on_the_Entitlements_dropdownTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_click_on_the_Leave_module_in_the_left_navigation_menuTest() {   //3
    throw new RuntimeException("Test not implemented");
    
	String myLeave = driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[3]/a/span")).getText();
	Assert.assertEquals(myLeave, "Leave");
  }

  @Test
  public void user_click_on_the_My_Leave_buttonTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_click_on_the_Save_buttonTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_click_on_the_delete_icon_the_to_delete_the_recordTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_click_on_the_edit_iconTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_click_on_the_reset_button_to_reset_the_input_fieldTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_clicks_on_different_navigation_linksTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_clicks_on_the_search_buttonTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_enter_the_all_mandatory_input_filedsTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_enter_the_all_the_mandatory_fieldsTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_enter_the_input_in_required_filedsTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_enter_the_value_in_all_mandatory_fieldTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_enter_valid_credentials_and_click_LoginTest() {     // 2nd
    throw new RuntimeException("Test not implemented");
    
	 PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
	 pf.uname.sendKeys("Admin");
	 pf.pwd.sendKeys("admin123");
	 pf.btn.click();
	 Thread.sleep(3000);
  }

  @Test
  public void user_is_Click_on_the_Apply_sectionTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_is_in_Leave_SectionTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_is_in_leave_list_sectionTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_is_redirected_to_Add_Leave_types_pageTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_is_successfully_Redirected_to_Apply_pageTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_on_the_OrangeHRM_login_pageTest() throws InterruptedException {    //1
    //throw new RuntimeException("Test not implemented");
	  
		 System.setProperty("Webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("start-maximized");
		 driver = new ChromeDriver(options);
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(4000);
		 String title = driver.getTitle();
		 Assert.assertEquals(title, "OrangeHRM");
  }

  @Test
  public void user_redirected_to_Add_leave_entitlements_pageTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_reset_the_existing_input_fieldsTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_select_Employee_Entitlements_sectionTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_select_Leave_PeriodTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_select_Leave_TypesTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_select_The_all_the_mandatory_fieldsTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_select_Work_WeakTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_select_all_mandatory_fieldsTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_select_the_all_the_mandatory_fieldsTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_select_the_employee_name_and_leave_typeTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_set_the_leave_period_start_and_end_datesTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_should_be_logged_in_successfullyTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void user_should_be_redirected_to_the_Leave_module_pageTest() {           //4
    //throw new RuntimeException("Test not implemented");
    
	String myLeave = driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li[6]/a")).getText();
	Assert.assertEquals(myLeave, "Leave");
  }

  @Test
  public void user_should_see_the_dashboardTest() {                     // 3
    //throw new RuntimeException("Test not implemented");
    
    
	 String dashboard = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
	 Assert.assertEquals(dashboard, "Dashboard");
  }
}
