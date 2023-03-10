package stepDefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.testRunner.PageFactoryOrangeHRM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Leave {
	WebDriver driver = null;
	
	@Given("User on the OrangeHRM login page")
	public void user_on_the_OrangeHRM_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		 System.setProperty("Webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("start-maximized");
		 driver = new ChromeDriver(options);
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(4000);
		 String title = driver.getTitle();
		 Assert.assertEquals(title, "OrangeHRM");
	}

	@When("User enter valid credentials and click Login")
	public void user_enter_valid_credentials_and_click_Login() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		 pf.uname.sendKeys("Admin");
		 pf.pwd.sendKeys("admin123");
		 pf.btn.click();
		 Thread.sleep(3000);
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see the dashboard")
	public void user_should_see_the_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		 String dashboard = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
		 Assert.assertEquals(dashboard, "Dashboard");
	}

	@When("User click on the Leave module in the left navigation menu")
	public void user_click_on_the_Leave_module_in_the_left_navigation_menu() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		String myLeave = driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[3]/a/span")).getText();
		Assert.assertEquals(myLeave, "Leave");
	}

	@Then("User should be redirected to the Leave module page")
	public void user_should_be_redirected_to_the_Leave_module_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("User clicks on different navigation links")
	 public void user_clicks_on_different_navigation_links() throws InterruptedException {
		driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li[2]/a")).click();
		Thread.sleep(2000);
	     driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li[3]/span")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li[4]/span")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li[5]/span")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li[6]/span")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li[7]/a")).click();
	 Thread.sleep(2000);
	}
	


	@Given("User is in leave list section")
	public void user_is_in_leave_list_section() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li[6]/span")).click();
		
	}

	@When("User reset the existing input fields")
	public void user_reset_the_existing_input_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//form[@class='oxd-form']/div[3]/button[1]")).clear();
	}

	@When("User Update the existing input fields")
	public void user_Update_the_existing_input_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	
		driver.findElement(By.xpath("//form[@class='oxd-form']/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2023-01-01");
		
		driver.findElement(By.xpath("//form[@class='oxd-form']/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("2023-01-05");
		
		driver.findElement(By.xpath("//div[@class='oxd-select-text--after']/i")).click();
		
		driver.findElement(By.xpath("//div[@class='oxd-multiselect-wrapper']/div[2]/span[1]")).click();
	}
	

	@When("User clicks on the search button")
	public void user_clicks_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the leave list should be submitted successfully")
	public void the_leave_list_should_be_submitted_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can click on Approve button to approve the leave")
	public void user_can_click_on_Approve_button_to_approve_the_leave() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can click on Reject button to reject the leave")
	public void user_can_click_on_Reject_button_to_reject_the_leave() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	@Given("user is in Leave Section")
	public void user_is_in_Leave_Section() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User is Click on the Apply section")
	public void user_is_Click_on_the_Apply_section() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User is successfully Redirected to Apply page")
	public void user_is_successfully_Redirected_to_Apply_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	



	@When("User click on the My Leave button")
	public void user_click_on_the_My_Leave_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Reset the existing input fields")
	public void user_Reset_the_existing_input_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enter the input in required fileds")
	public void user_enter_the_input_in_required_fileds() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User can click on the Search button")
	public void user_can_click_on_the_Search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the my leave details should be updated successfully")
	public void the_my_leave_details_should_be_updated_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}





	@When("User click on the Entitlements dropdown")
	public void user_click_on_the_Entitlements_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see Add Entitlements, Employee Entitlements, and My Entitlements")
	public void user_should_see_Add_Entitlements_Employee_Entitlements_and_My_Entitlements() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

	@When("User click on the Add Entitlements section")
	public void user_click_on_the_Add_Entitlements_section() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select the all the mandatory fields")
	public void user_select_the_all_the_mandatory_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User  click on the Save button")
	public void user_click_on_the_Save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User  can click on the cancel button")
	public void user_can_click_on_the_cancel_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the add entitlements should be added for the employee successfully")
	public void the_add_entitlements_should_be_added_for_the_employee_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}






	@When("User select Employee Entitlements section")
	public void user_select_Employee_Entitlements_section() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select The all the mandatory fields")
	public void user_select_The_all_the_mandatory_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User can click on the search button")
	public void user_can_click_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can successfully search the entitlements")
	public void user_can_successfully_search_the_entitlements() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	

	@When("User select all mandatory fields")
	public void user_select_all_mandatory_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User can click on the serch button")
	public void user_can_click_on_the_serch_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can successfully view the leave entitlements")
	public void user_can_successfully_view_the_leave_entitlements() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User can on the click Add button")
	public void user_can_on_the_click_Add_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user redirected to Add leave entitlements page")
	public void user_redirected_to_Add_leave_entitlements_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User enter the all the mandatory fields")
	public void user_enter_the_all_the_mandatory_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can click on the Save button")
	public void user_can_click_on_the_Save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can successfully search the leave entitlements")
	public void user_can_successfully_search_the_leave_entitlements() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

	

	@When("User click on Configure")
	public void user_click_on_Configure() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	@When("User click on the Configure dropdown")
	public void user_click_on_the_Configure_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select Leave Period")
	public void user_select_Leave_Period() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click on the reset button to reset the input field")
	public void user_click_on_the_reset_button_to_reset_the_input_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User set the leave period start and end dates")
	public void user_set_the_leave_period_start_and_end_dates() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click on the Save button")
	public void i_click_on_the_Save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the leave period should be updated successfully")
	public void the_leave_period_should_be_updated_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}





	@When("User select Leave Types")
	public void user_select_Leave_Types() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click on the Add")
	public void user_click_on_the_Add() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enter the all mandatory input fileds")
	public void user_enter_the_all_mandatory_input_fileds() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	@When("user click on the delete icon the to delete the record")
	public void user_click_on_the_delete_icon_the_to_delete_the_record() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user click on Yes,Delete button")
	public void user_click_on_Yes_Delete_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the record is successfully deleted")
	public void the_record_is_successfully_deleted() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user click on the edit icon")
	public void user_click_on_the_edit_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is redirected to  Add Leave types page")
	public void user_is_redirected_to_Add_Leave_types_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	@When("User select Work Weak")
	public void user_select_Work_Weak() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter the  value in all mandatory field")
	public void user_enter_the_value_in_all_mandatory_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}






	@When("User click on the Assign Leave button")
	public void user_click_on_the_Assign_Leave_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select the employee name and leave type")
	public void user_select_the_employee_name_and_leave_type() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User set the leave period and duration")
	public void user_set_the_leave_period_and_duration() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User provide a reason for the leave")
	public void user_provide_a_reason_for_the_leave() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click on the Assign button")
	public void user_click_on_the_Assign_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the leave should be assigned to the employee successfully")
	public void the_leave_should_be_assigned_to_the_employee_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the employees leave balance should be updated accordingly")
	public void the_employees_leave_balance_should_be_updated_accordingly() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
