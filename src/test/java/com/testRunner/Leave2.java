package com.testRunner;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Leave2 {
	
	WebDriver driver = null;
	//PageFactoryOrangeHRM pgm = new PageFactoryOrangeHRM(driver);
	
	@Given("User on the OrangeHRM login page")
	public void user_on_the_OrangeHRM_login_page() throws InterruptedException {
	    
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
	  
	}

	@Then("User should see the dashboard")
	public void user_should_see_the_dashboard() {
	    
		 String dashboard = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6")).getText();
		 Assert.assertEquals(dashboard, "Dashboard");
	}

	@When("User click on the Leave module in the left navigation menu")
	public void user_click_on_the_Leave_module_in_the_left_navigation_menu() {
	   
		WebElement myLeave = driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[3]/a/span"));
		myLeave.click();
	}

	@Then("User should be redirected to the Leave module page")
	public void user_should_be_redirected_to_the_Leave_module_page() throws InterruptedException {
	    Thread.sleep(3000);
		String myLeave = driver.findElement(By.xpath("//h6[text()='Leave']")).getText();
		Assert.assertEquals(myLeave, "Leave");
	}
	
	@Then("User clicks on different navigation links")
	 public void user_clicks_on_different_navigation_links() throws InterruptedException {
		Thread.sleep(2000);
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
	public void user_is_in_leave_list_section() throws InterruptedException {
			Thread.sleep(2000);
			WebElement leave_list = driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li[6]/a"));
			//Assert.assertEquals(leave_list, "Leave List");
			leave_list.click();
		
	}

	@When("User reset the existing input fields")
	public void user_reset_the_existing_input_fields() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Reset ']")).click();
	}

	@When("User Update the existing input fields")
	public void user_Update_the_existing_input_fields() throws InterruptedException {
	   
		
			// user enter the starting date
			Thread.sleep(2000);
			PageFactoryOrangeHRM pf3 = new PageFactoryOrangeHRM(driver);
			WebElement from = driver.findElement(By.xpath("//form[@class='oxd-form']/div[1]/div/div[1]/div/div[2]/div/div/input"));
			pf3.clearField(from);
			from.sendKeys("2023-01-01");
		
		// enter the ending date
		
		 //
			WebElement end= driver.findElement(By.xpath("//form[@class='oxd-form']/div[1]/div/div[2]/div/div[2]/div/div/input"));
			pf3.clearField(end);
			end.sendKeys("2023-01-01");
		
		// Locate the dropdown element
			Thread.sleep(2000);
		
			WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[1]/div[1]"));
			dropdown.sendKeys(Keys.DOWN);
			dropdown.sendKeys(Keys.DOWN);
			dropdown.sendKeys(Keys.DOWN);
			dropdown.sendKeys(Keys.ENTER);

		// Click on the dropdown element to open the option
		// LEAVE TYPE dropdown 
		
		// Find the "Leave Type" dropdown element
		Thread.sleep(2000);
		WebElement leaveTypeDropdown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"));

		// Click on the dropdown to open it
		leaveTypeDropdown.click();

		// Use Actions class to perform keyboard actions
		Actions actions = new Actions(driver);

		// Use arrow keys to navigate to desired option
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		// Find the "Employee Name" field element
		
		//
		Thread.sleep(2000);
		PageFactoryOrangeHRM pf2 = new PageFactoryOrangeHRM(driver);
		pf2.emp_name.sendKeys(Keys.DELETE+"p");
		Thread.sleep(7000);
		
		// Find the "SUB UNIT" dropdown element
		
		Thread.sleep(2000);
		WebElement subunit = driver.findElement(By.xpath("//form/div[2]/div/div[2]/div/div[2]/div/div/div[1]"));

		// Click on the dropdown to open it
		subunit.click();

		// Use Actions class to perform keyboard actions
		Actions act = new Actions(driver);

		// Use arrow keys to navigate to desired option
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);

		// Perform the keyboard actions
		act.build().perform();
		
		
	}
	

	@When("User clicks on the search button")
	public void user_clicks_on_the_search_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
		   WebElement searchButton = driver.findElement(By.xpath("//button[text()=' Search ']"));
	       searchButton.click();
	}

	@Then("the leave list should be submitted successfully")
	public void the_leave_list_should_be_submitted_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can click on Approve button to approve the leave")
	public void user_can_click_on_Approve_button_to_approve_the_leave() throws InterruptedException {
		
		Thread.sleep(2000);
	  
		PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		pf.approve.click();
	   Thread.sleep(2000);
	}

	@Then("User can click on Reject button to reject the leave")
	public void user_can_click_on_Reject_button_to_reject_the_leave() throws InterruptedException {
	    
		PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
//		WebElement reject = driver.findElement(By.id("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div/div/button[2]"));
	    pf.reject.click();
	    Thread.sleep(2000);
	}


	@Given("user is in Leave Section")
	public void user_is_in_Leave_Section() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//String myLeave = driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']/ul/li[6]/a")).getText();
		//Assert.assertEquals(myLeave, "Leave");
		//Thread.sleep(2000);
		//PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		//pf.leave.click();
	}

	@When("User is Click on the Apply section")
	public void user_is_Click_on_the_Apply_section() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//Thread.sleep(2000);
		//WebElement app = driver.findElement(By.id("//nav[@class='oxd-topbar-body-nav']/ul/li[1]/a"));
	    //app.click();

		Thread.sleep(2000);
		PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		pf.apply.click();
		
		
	}

	@Then("User is successfully Redirected to Apply page")
	public void user_is_successfully_Redirected_to_Apply_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		Thread.sleep(2000);
		String apply = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/h6")).getText();
		Assert.assertEquals(apply, "Apply Leave");
	}

	@When("User click on the My Leave button")
	public void user_click_on_the_My_Leave_button() throws InterruptedException {
	
	    
		Thread.sleep(2000);
		PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		pf.My_leave.click();
		
	}

	@When("User Reset the existing input fields")
	public void user_Reset_the_existing_input_fields() throws InterruptedException {
	  
		Thread.sleep(2000);
		WebElement my_leave = driver.findElement(By.xpath("//form[@class='oxd-form']/div[2]/button[1]"));
	    my_leave.click();
	}


	@When("User enter the input in required fileds")
	public void user_enter_the_input_in_required_fileds() throws InterruptedException {
	   
		// user enter the starting date
		Thread.sleep(2000);
		PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		WebElement from = driver.findElement(By.xpath("//form[@class='oxd-form']/div[1]/div/div[1]/div/div[2]/div/div/input"));
		pf.clearField(from);
		from.sendKeys("2023-01-01");
		// user eneter the ending date
		Thread.sleep(2000);
		
		WebElement to = driver.findElement(By.xpath("//form[@class='oxd-form']/div[1]/div/div[2]/div/div[2]/div/div/input"));
		pf.clearField(to);
		to.sendKeys("2023-01-05");
		
		//select the dropdown  on the Show Leave with Status
		
		WebElement dropdown = driver.findElement(By.xpath("//div[text()='Select']"));
		dropdown.click();
		// Click on the dropdown element to open the options
		dropdown.sendKeys(Keys.DOWN);
		dropdown.sendKeys(Keys.DOWN);
		dropdown.sendKeys(Keys.DOWN);
		dropdown.sendKeys(Keys.ENTER);
		// select the Leave Type
		
		// Find the "Leave Type" dropdown element
		Thread.sleep(2000);
		WebElement leaveTypeDropdown = driver.findElement(By.xpath("//form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"));

		// Click on the dropdown to open it
		leaveTypeDropdown.click();

		// Use Actions class to perform keyboard actions
		Actions actions = new Actions(driver);

		// Use arrow keys to navigate to desired option
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			
	}

	@When("User can click on the Search button")
	public void user_can_click_on_the_Search_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		WebElement my_leave = driver.findElement(By.id("//form[@class='oxd-form']/div[2]/button[2]"));
	    my_leave.click();
	    	
	}

	@Then("the my leave details should be updated successfully")
	public void the_my_leave_details_should_be_updated_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}


	@When("User click on the Entitlements dropdown")
	public void user_click_on_the_Entitlements_dropdown() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(2000);
		PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		pf.entitlements.click();
	}


	@When("User click on the Add Entitlements section")
	public void user_click_on_the_Add_Entitlements_section() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
		Thread.sleep(2000);
		PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		pf.add_ent.click();
	}

	@When("User select the all the mandatory fields")
	public void user_select_the_all_the_mandatory_fields() throws InterruptedException {
		// Find the "Employee Name" field element
		Thread.sleep(3000);
		PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		// Find the "Employee Name" field element
		pf.emp_name1.sendKeys(Keys.DELETE+"P");
		Thread.sleep(7000);
		
		
		// LEvE TYPE
		
		WebElement leaveTypeDropdown = driver.findElement(By.xpath("//form[@class='oxd-form']/div[3]/div/div[1]/div/div[2]/div/div/div[1]"));

		// Click on the dropdown to open it
		leaveTypeDropdown.click();

		// Use Actions class to perform keyboard actions
		Actions actions = new Actions(driver);

		// Use arrow keys to navigate to desired option
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		

		// LEAVE PERIOD
		
		WebElement leavePeriodDropdown = driver.findElement(By.xpath("//form[@class='oxd-form']/div[3]/div/div[2]/div/div[2]/div/div/div[1]"));

		// Click on the dropdown to open it
		leavePeriodDropdown.click();

		// Use Actions class to perform keyboard actions
		Actions act = new Actions(driver);

		// Use arrow keys to navigate to desired option
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		// ENTITLEMENTS
		driver.findElement(By.xpath("//form[@class='oxd-form']/div[3]/div/div[3]/div/div[2]/input")).sendKeys("05");
	
		
	}

	@When("User  click on the Save button")
	public void user_click_on_the_Save_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		Thread.sleep(2000);
		PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		pf.serch2.click();
		
	}
	
	@Then("User should see Apply, My Leave, Entitlements, Reports, configure, Leave List and Assign Leave")
	public void user_should_see_apply_my_leave_entitlements_reports_configure_leave_list_and_assign_leave() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		String apply = driver.findElement(By.xpath("//a[text()='Apply']")).getText();
		Assert.assertEquals(apply, "Apply");
	    
	    
	}

	@Then("the add entitlements should be added for the employee successfully")
	public void the_add_entitlements_should_be_added_for_the_employee_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


	@When("User select Employee Entitlements section")
	public void user_select_Employee_Entitlements_section() throws InterruptedException {
		Thread.sleep(2000);
		PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		pf.emp_entitlements.click();
		
	}

	@When("User select The all the mandatory fields")
	public void user_select_The_all_the_mandatory_fields() throws InterruptedException {
		//EMPLOYEE NAME 
		
		// Find the "Employee Name" field element
		Thread.sleep(3000);
		// Find the "Employee Name" field element
		
		//
		PageFactoryOrangeHRM pf1 = new PageFactoryOrangeHRM(driver);
		pf1.empName.sendKeys(Keys.DELETE+"p");
		Thread.sleep(7000);
		
		// LEvE TYPE
		
		WebElement leaveTypeDropdown = driver.findElement(By.xpath("//form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));

		// Click on the dropdown to open it
		leaveTypeDropdown.click();

		// Use Actions class to perform keyboard actions
		Actions actions = new Actions(driver);

		// Use arrow keys to navigate to desired option
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		

		// LEAVE PERIOD
		
		WebElement leavePeriodDropdown = driver.findElement(By.xpath("//form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));

		// Click on the dropdown to open it
		leavePeriodDropdown.click();

		// Use Actions class to perform keyboard actions
		Actions act = new Actions(driver);

		// Use arrow keys to navigate to desired option
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		
	}

	@When("User can click on the search button")
	public void user_can_click_on_the_search_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
		PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		pf.s2.click();
		
	}


	@When("User click on the Assign Leave button")
	public void user_click_on_the_Assign_Leave_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(2000);
		PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		pf.assign.click();
		
	}

	@When("User select the employee name and leave type")
	public void user_select_the_employee_name_and_leave_type() throws InterruptedException {
	
		//EMPLOYEE NAME 
		
				Thread.sleep(2000);
				PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
				pf.empN.sendKeys(Keys.DELETE+"p");
				Thread.sleep(7000);
		
		// LEvE TYPE
		
		WebElement leaveTypeDropdown = driver.findElement(By.xpath("//form[@class='oxd-form']/div[2]/div/div[1]/div/div[2]/div/div/div[1]"));

		// Click on the dropdown to open it
		leaveTypeDropdown.click();

		// Use Actions class to perform keyboard actions
		Actions actions = new Actions(driver);

		// Use arrow keys to navigate to desired option
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		
	
		// user enter the starting date
		Thread.sleep(2000);
		PageFactoryOrangeHRM pf4 = new PageFactoryOrangeHRM(driver);
		WebElement from = driver.findElement(By.xpath("//form[@class='oxd-form']/div[3]/div/div[1]/div/div[2]/div/div/input"));
		pf4.clearField(from);
		from.sendKeys("2023-01-01");
		// user eneter the ending date
		Thread.sleep(2000);
		
		WebElement to = driver.findElement(By.xpath("//form[@class='oxd-form']/div[3]/div/div[2]/div/div[2]/div/div/input"));
		pf4.clearField(to);
		to.sendKeys("2023-01-05");
	}

	@Then("User click on the Assign button")
	public void user_click_on_the_Assign_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		Thread.sleep(4000);
		PageFactoryOrangeHRM pf6 = new PageFactoryOrangeHRM(driver);
		pf6.assign_button.click();
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}

}
