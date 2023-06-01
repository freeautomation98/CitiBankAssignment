package com.CITI.orangeHRM.stepDefinition;

import java.util.List;
import java.util.Map;

import com.CITI.orangeHRM.pageLayer.PIMPage;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageStepDef {
	
	private static PIMPage pimPage;
	@Given("user click on menu button and user is on PIMPage")
	public void user_click_on_menu_button_and_user_is_on_pim_page() throws InterruptedException {
	    pimPage=new PIMPage();
	    pimPage.clickOnPimLink();
	}

	@Then("click on add employee and first name,last name and click on save button")
	public void click_on_add_employee_and_first_name_last_name_and_click_on_save_button(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> ls = dataTable.asMaps();
		int a = ls.size();
		
		for(int i=0;i<a;i++)
		{
				String fname = ls.get(i).get("FirstName");
				String lname = ls.get(i).get("LastName");
				pimPage.addEmployee(fname, lname);
		}

	}
	@When("user enter employee name as {string} and click on search and delete button")
	public void user_enter_employee_name_as_and_click_on_search_and_delete_button(String extUserName) throws InterruptedException {
		pimPage.searchEmployee(extUserName);
	}
}
