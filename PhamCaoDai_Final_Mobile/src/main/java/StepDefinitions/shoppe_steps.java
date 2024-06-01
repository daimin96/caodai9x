package StepDefinitions;

import Core.AppiumBase;
import Functions.shoppe_function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.net.MalformedURLException;

public class shoppe_steps extends AppiumBase {
    shoppe_function shoppeFunction = new shoppe_function();

    @Given("open shoppe app")
    public void open_shoppe_app() throws MalformedURLException {
        setup();
    }
    @Given("Click to Bat dau trai nghiem")
    public void click_to_bat_dau_trai_nghiem() throws InterruptedException {
        shoppeFunction.clickToBatDau();
    }
    @When("I click to Deny")
    public void i_click_to_deny() {
        shoppeFunction.clickToDeny();
    }
    @Then("The Home screen should displayed")
    public void the_home_screen_should_displayed() {
        shoppeFunction.verifyHomeScreen();
    }
    @Then("The menu footer should displayed")
    public void the_menu_footer_should_displayed() {
        shoppeFunction.verifyMenu();
    }
    @Given("I am in Home Screen")
    public void i_am_in_home_screen() throws InterruptedException {
        shoppeFunction.clickToBatDau();
        shoppeFunction.clickToDeny();
    }
    @When("I click to Thuong Hieu")
    public void i_click_to_thuong_hieu() {
        shoppeFunction.clickToThuongHieu();
    }
    @Then("The screen should be displayed {int} branch name")
    public void the_screen_should_be_displayed_branch_name(Integer int1) {
        shoppeFunction.verify4BranchName();
    }


    @When("I click to Uu Dai")
    public void i_click_to_uu_dai() {
        shoppeFunction.clickToUuDai();
    }

    @When("Click to the first item")
    public void click_to_the_first_item() {
        shoppeFunction.clickFirstItem();
    }

    @Then("The screen should be displayed with some item")
    public void the_screen_should_be_displayed_with_some_item() {
        shoppeFunction.verifySomeItem();
    }


    @When("I click to Voucher")
    public void i_click_to_voucher() {
        shoppeFunction.clickToVoucher();
    }

    @When("Swipe and click to the last Voucher")
    public void swipe_and_click_to_the_last_voucher() throws IOException {
        shoppeFunction.SwipeAndClickToTheLastVoucher();
    }

    @Then("The screen should be displayed with some {int} item")
    public void the_screen_should_be_displayed_with_some_item(Integer int1) {
        shoppeFunction.verifySome4Item();
    }

    @When("I click to Ca nhan")
    public void i_click_to_ca_nhan() {
        shoppeFunction.clickToCaNhan();
    }

    @Then("The screen should be displayed with {int} tab")
    public void the_screen_should_be_displayed_with_tab(Integer int1) {
        shoppeFunction.verify4tab();
    }

    @And("Click to Mua sam Online")
    public void clickToMuaSamOnline() {
        shoppeFunction.clickToMuaSamOl();

    }

}
