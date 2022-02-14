package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    LoginPage loginPage = new LoginPage();
  //  @Given("the user is on the login page")
   // public void the_user_is_on_the_login_page() {
     //   System.out.println("I open browser and navigate to vytrack login page");
  //  }
  //  @When("the user enters the sales manager information")
  //  public void the_user_enters_the_sales_manager_information() {
   //     System.out.println("I enter sales manager username and password");
   // }

    @When("the user navigates Fleet and Vehicles")
    public void the_user_navigates_Fleet_and_Vehicles() {
        System.out.println("Fleet-->Vehicles");
    }

    @Then("the title should be Vehicles")
    public void the_user_should_be_able_to_see_Vehicles() {
        System.out.println("User has access to Vehicles");
    }

    @When("the user navigates to Marketing and Campaigns")
    public void the_user_navigates_to_Marketing_and_Campaigns() {
        System.out.println("Marketing-->Campaigns");
    }

    @Then("the title should be  Campaigns")
    public void the_user_should_be_able_to_see_Campaigns() {
        System.out.println("User can see Campaigns");
    }

    @When("the user navigates to Activities and Calendar Pages")
    public void the_user_navigates_to_Activities_and_Calendar_Pages() {
        System.out.println("Activities-->Calendar");
    }

    @Then("the title should be  Calendar")
    public void the_user_should_be_able_to_see_Calendar() {
        System.out.println("User can see Calendar");
    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);
    }


    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNum) {
        BrowserUtils.waitFor(5);
        ContactsPage contactsPage = new ContactsPage();
        Integer actualNumber =Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNum,actualNumber);
    }



}

