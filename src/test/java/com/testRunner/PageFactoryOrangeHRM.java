package com.testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryOrangeHRM {

	WebDriver driver = null;
	@FindBy(xpath = "//input[@name='username']")
	public WebElement uname;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement pwd;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement btn;

	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li[3]/a/span")
	public WebElement leave;
	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[6]/a")
	public WebElement leave_list;
	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[1]/a")
	public WebElement apply;
	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[2]/a")
	public WebElement My_leave;
	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[3]/span")
	public WebElement entitlements;
	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[4]/span")
	public WebElement report;
	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[5]/span")
	public WebElement configure;
	
	@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul/li[7]/a")
	public WebElement assign_leave;
	
	@FindBy(xpath = "//form[@class='oxd-form']/div[3]/button[1]")
	public WebElement reset;
	
	@FindBy(xpath = "//form[@class='oxd-form']/div[1]/div/div[1]/div/div[2]/div/div/input")
	public WebElement from_date;
	

	
	@FindBy(xpath = "//form[@class='oxd-form']/div[1]/div/div[2]/div/div[2]/div/div/input")
	public WebElement end_date;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[1]/div[1]")
	public WebElement check_status;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")
	public WebElement leave_type;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")
	public WebElement emp_name;
	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/div[1]")
	public WebElement sub_unit;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[3]/button[2]")
	public WebElement search;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div/div/button[1]")
	public WebElement approve;
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div/div/button[2]")
	public WebElement reject;
	
	//@FindBy(xpath="//nav[@class='oxd-topbar-body-nav']/ul/li[1]/a")
	//WebElement apply;
	
	@FindBy(xpath="//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/h6")
	public WebElement apply_nav;
	
	// My Leave
	
	@FindBy(xpath="//form[@class='oxd-form']/div[2]/button[1]")
	public WebElement my_leave_reset;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[1]/div/div[1]/div/div[2]/div/div/input")
	public WebElement start_date1;
	
	@FindBy(xpath= "//form[@class='oxd-form']/div[1]/div/div[2]/div/div[2]/div/div/input")
	public WebElement end_date1;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[1]/div[1]")
	public WebElement status;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")
	public WebElement leave1;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[2]/button[2]")
	public WebElement search1;
	
	
	//entitlements dropdown 
	
	@FindBy(xpath="//nav[@class='oxd-topbar-body-nav']/ul/li[3]/ul/li[1]/a")
	public WebElement add_ent;
	
	//add entitlements
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/input")
	public WebElement emp_name1;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[3]/div/div[1]/div/div[2]/div/div/div[1]")
	public WebElement leave_add;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[3]/div/div[2]/div/div[2]/div/div/div[1]")
	public WebElement leav_priod;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[3]/div/div[3]/div/div[2]/input")
	public WebElement ent;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[4]/button[2]")
	public WebElement serch2;
	
	
	@FindBy(xpath="//form[@class='oxd-form']/div[4]/button[1]")
	public WebElement cancel;

	
	//EMPLOYEE ENTITLEMENTS 
	
	@FindBy(xpath="//nav[@class='oxd-topbar-body-nav']/ul/li[3]/ul/li[2]/a")
	public WebElement emp_entitlements;
	
	
	@FindBy(xpath="//form[@class='oxd-form']/div[1]/div/div[1]/div/div[2]/div/div/input")
	public WebElement empName;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[1]/div/div[1]/div/div[2]/div/div/input")
	public WebElement ltype;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[1]/div/div[1]/div/div[2]/div/div/input")
	public WebElement lperiod;
	
	@FindBy(xpath="//form[@class='oxd-form']/div[1]/div/div[1]/div/div[2]/div/div/input")
	public WebElement s2;
	

	
	// ASSIGN LEAVE PAGE
	@FindBy(xpath="//nav[@class='oxd-topbar-body-nav']/ul/li[7]/a")
	public WebElement assign;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input")
	public WebElement empN;
	@FindBy(xpath="//form[@class='oxd-form']/div[2]/div/div[1]/div/div[2]/div/div/div[1]")
	public WebElement lt;
	@FindBy(xpath="//form[@class='oxd-form']/div[3]/div/div[1]/div/div[2]/div/div/input")
	public WebElement fdate;
	@FindBy(xpath="//form[@class='oxd-form']/div[3]/div/div[2]/div/div[2]/div/div/input")
	public WebElement ldate;
	@FindBy(xpath="//form[@class='oxd-form']/div[5]/button")
	public WebElement assign_button;
	
	
	
	
	
	
	public PageFactoryOrangeHRM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Login() throws InterruptedException {
		Thread.sleep(3000);

		uname.sendKeys("Admin");
		pwd.sendKeys("admin123");
		btn.click();
		Thread.sleep(2000);

	}

	public void navigating_to_Leave() throws InterruptedException {
		Thread.sleep(2000);
		leave.click();
		//leave_list.click();

	}
	public void user_on_leave_listp_page() throws InterruptedException {
		Thread.sleep(2000);
		leave_list.click();
	}
	public void user_clicks_on_different_navigation_links() throws InterruptedException {
		Thread.sleep(2000);
		apply.click();
		Thread.sleep(2000);
		My_leave.click();
		Thread.sleep(2000);
		entitlements.click();
		Thread.sleep(2000);
		report.click();
		Thread.sleep(2000);
		configure.click();
		Thread.sleep(2000);
		assign_leave.click();
		
	}
	public void user_is_in_leave_list_section() throws InterruptedException {
		Thread.sleep(3000);
		leave_list.click();
	}
	public void user_reset_the_existing() throws InterruptedException {
		Thread.sleep(3000);
		reset.click();
		
	}
	public void user_Update_the_existing_input_fields() throws InterruptedException {
		
		Thread.sleep(2000);
		from_date.click();
		Thread.sleep(2000);
		end_date.click();
	
		Thread.sleep(2000);
		check_status.click();
		Thread.sleep(2000);
		leave_type.click();
		
		
		// Click on the dropdown element to open the options
		check_status.sendKeys(Keys.ARROW_DOWN);

		// Use the Actions class to perform keyboard actions
		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.ARROW_DOWN);

		// Release the Shift key
		builder.keyUp(Keys.SHIFT);

		// Press the Enter key to confirm the selection
		builder.sendKeys(Keys.ENTER);

		// Perform the actions
		builder.perform();
		
		Thread.sleep(2000);
		
		// Click on the dropdown to open it
		leave_type.click();

		// Use Actions class to perform keyboard actions
		Actions actions = new Actions(driver);

		// Use arrow keys to navigate to desired option
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);

		// Perform the keyboard actions
		actions.build().perform();
		
		
		//EMPLOYEE NAME 
		emp_name.sendKeys("Pet");
		emp_name.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		
		//SUB UNIT
		
		// Click on the dropdown to open it
		Thread.sleep(2000);
		sub_unit.click();

		// Use Actions class to perform keyboard actions
		Actions act = new Actions(driver);

		// Use arrow keys to navigate to desired option
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);

		// Perform the keyboard actions
		act.build().perform();
		
	}
	public void user_clicks_on_the_search_button() throws InterruptedException {
			Thread.sleep(2000);
	       search.click();
	}
	

	public void user_is_Click_on_the_Apply_section() throws InterruptedException {
		Thread.sleep(2000);
		apply.click();
	}
	
	public void user_click_on_the_My_Leave_button() throws InterruptedException {
		Thread.sleep(2000);
		My_leave.click();
	}
	public void user_Reset_the_existing_input_fields() throws InterruptedException {
		Thread.sleep(2000);
		my_leave_reset.click();
	}
	public void user_enter_the_input_in_required_fileds() throws InterruptedException {
		Thread.sleep(2000);
		start_date1.click();
		Thread.sleep(2000);
		end_date1.click();
		Thread.sleep(2000);
		status.click();
		Thread.sleep(2000);
		leave1.click();
		
		// Click on the dropdown element to open the options
		status.sendKeys(Keys.ARROW_DOWN);

		// Use the Actions class to perform keyboard actions
		Actions builder = new Actions(driver);
		builder.sendKeys(Keys.ARROW_DOWN);
		//builder.sendKeys(Keys.ARROW_DOWN);
		//builder.sendKeys(Keys.ARROW_DOWN);
		// Release the Shift key
		builder.keyUp(Keys.SHIFT);

		// Press the Enter key to confirm the selection
		builder.sendKeys(Keys.ENTER);

		// Perform the actions
		builder.perform();
		
		Thread.sleep(2000);
		
		// Click on the dropdown to open it
		leave1.click();

		// Use Actions class to perform keyboard actions
		Actions actions = new Actions(driver);

		// Use arrow keys to navigate to desired option
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);

		// Perform the keyboard actions
		actions.build().perform();
		
	}
	public void user_can_click_on_the_Search_button() throws InterruptedException {
		Thread.sleep(2000);
		search1.click();
		
	}
	public void user_click_on_the_Entitlements_dropdown() throws InterruptedException {
		Thread.sleep(2000);
		entitlements.click();
	}
	public void user_click_on_the_Add_Entitlements_section() throws InterruptedException {
		
		Thread.sleep(2000);
		add_ent.click();
	}
	public void user_select_the_all_the_mandatory_fields() throws InterruptedException {
		Thread.sleep(2000);
	/*	emp_name1.click();
		Thread.sleep(2000);
		leave_add.click();
		Thread.sleep(2000);
		leav_priod.click();
		Thread.sleep(2000);
		ent.click();
		*/
	/*	
		//EMPLOYEE NAME 
		// Clear any existing value in the field
		Thread.sleep(2000);
		//emp_name.clear();

		// Enter the desired employee name
		Thread.sleep(2000);
		emp_name1.sendKeys("Malin Linea Grahn");

		// Press "Enter" to perform the search
		emp_name1.sendKeys(Keys.ENTER);
	*/
		// Find the "Employee Name" field element
		//PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
		// Find the "Employee Name" field element
		emp_name1.sendKeys("Pet");
		emp_name1.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		
		//Leave type
		// Click on the dropdown to open it
		Thread.sleep(2000);
		leave_add.click();

		// Use Actions class to perform keyboard actions
		Actions actions = new Actions(driver);

		// Use arrow keys to navigate to desired option
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);

		// Perform the keyboard actions
		actions.build().perform();
		
		 //LEAVE PERIOD
		
		leav_priod.click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
		act.build().perform();
		
		//ENTITLEMENTS
		Thread.sleep(2000);
		
		ent.sendKeys("05");
		
		
	}
	public void user_click_on_the_Save_button() throws InterruptedException {
		Thread.sleep(2000);
		serch2.click();
	}
	public void user_can_click_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(2000);
		cancel.click();
		//Thread.sleep(2000);
		//entitlements.click();
		// Navigate back to the previous page  Entitlements)
		//driver.navigate().back();
	}
	
	/*
	public void user_select_Employee_Entitlements_section() throws InterruptedException {
		Thread.sleep(2000);
		emp_entitlements.click();
	}
	
	public void user_select_The_all_the_mandatory_fields() throws InterruptedException {
	
		
				Thread.sleep(2000);
				//PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
				empName.sendKeys("Pet");
				empName.sendKeys(Keys.ENTER);
				Thread.sleep(7000);
		
		//Leave type
		// Click on the dropdown to open it
		Thread.sleep(2000);
		ltype.click();

		// Use Actions class to perform keyboard actions
		Actions actions = new Actions(driver);

		// Use arrow keys to navigate to desired option
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);

		// Perform the keyboard actions
		actions.build().perform();
		
		 //LEAVE PERIOD
		
		lperiod.click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
		act.build().perform();
	}
	
	public void user_can_click_on_the_search_button() throws InterruptedException {
		Thread.sleep(200);
		s2.click();
	}
	*/
	
	public void user_click_on_the_Assign_Leave_button() throws InterruptedException {
		Thread.sleep(2000);
		assign.click();
	}
	
	public void user_select_the_employee_name_and_leave_type() throws InterruptedException {
		
		//EMPLOYEE NAME 
		//EMPLOYEE NAME 
		
				Thread.sleep(2000);
				//PageFactoryOrangeHRM pf = new PageFactoryOrangeHRM(driver);
			empN.sendKeys("Pet");
			empN.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		
		//Leave type
		// Click on the dropdown to open it
		Thread.sleep(2000);
		lt.click();

		// Use Actions class to perform keyboard actions
		Actions actions = new Actions(driver);

		// Use arrow keys to navigate to desired option
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);

		// Perform the keyboard actions
		actions.build().perform();
		
		// enter the starting date
		
		fdate.click();
		
		// last date
		ldate.click();
	}
	public void user_click_on_the_Assign_button() throws InterruptedException {
		Thread.sleep(2000);
		assign_button.click();
	}
}
