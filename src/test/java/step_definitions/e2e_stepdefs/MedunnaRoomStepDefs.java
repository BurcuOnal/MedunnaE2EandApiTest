package step_definitions.e2e_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RoomPage;


public class MedunnaRoomStepDefs {

    HomePage homePage = new HomePage();
    RoomPage roomPage = new RoomPage();
    public static int roomNumber;
    public static String roomId;


    @When("Click on Items&Titles option")
    public void clickOnItemsTitlesOption() {
    }

    @And("Click on Room option")
    public void clickOnRoomOption() {
    }

    @And("Click on Create a New Room button")
    public void clickOnCreateANewRoomButton() {
    }

    @And("Enter a oda_no into room number box")
    public void enterAOda_noIntoRoomNumberBox() {
    }

    @And("Chose room type as SUITE")
    public void choseRoomTypeAsSUITE() {
    }

    @And("Click on status control")
    public void clickOnStatusControl() {
    }

    @And("Enter {string} into price box")
    public void enterIntoPriceBox(String arg0) {
    }

    @And("Enter {string} into description box")
    public void enterIntoDescriptionBox(String arg0) {
    }

    @And("Click on save button")
    public void clickOnSaveButton() {
    }

    @Then("Close the site")
    public void closeTheSite() {
    }
}
