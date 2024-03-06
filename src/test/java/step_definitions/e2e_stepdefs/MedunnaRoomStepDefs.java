package step_definitions.e2e_stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.RoomPage;
import utilities.Driver;
import utilities.Methods;


public class MedunnaRoomStepDefs {

    HomePage homePage = new HomePage();
    RoomPage roomPage = new RoomPage();
    public static int roomNumber;
    public static String roomId;


    @When("Click on Items&Titles option")
    public void clickOnItemsTitlesOption() { homePage.itemsdAndTitles.click();
    }

    @And("Click on Room option")
    public void clickOnRoomOption() { homePage.roomOption.click();
    }

    @And("Click on Create a New Room button")
    public void clickOnCreateANewRoomButton() { roomPage.createANewRoomButton.click();
    }

    @And("Enter a oda_no into room number box")
    public void enterAOda_noIntoRoomNumberBox() { roomNumber = Faker.instance().number().numberBetween(100000, 1000000);
        roomPage.roomNumberInput.sendKeys(roomNumber+ "");
    }

    @And("Chose room type as SUITE")
    public void choseRoomTypeAsSUITE() {
        new Select(roomPage.roomTypeDropDown).selectByIndex(3);
    }

    @And("Click on status control")
    public void clickOnStatusControl() { roomPage.statusCheckbox.click();
    }

    @And("Enter {string} into price box")
    public void enterIntoPriceBox(String price) {
        Methods.sendKeysJS(roomPage.priceInput,price);
      //  roomPage.priceInput.sendKeys(price);
    }

    @And("Enter {string} into description box")
    public void enterIntoDescriptionBox(String description) {roomPage.descriptionInput.sendKeys(description);
    }

    @And("Click on save button")
    public void clickOnSaveButton() {
        Methods.click(roomPage.saveSubmitButton);
        Methods.visibleWait(roomPage.alert,5);
        roomId = roomPage.alert.getText().replaceAll("[^0-9]","");

    }

    @Then("Close the site")
    public void closeTheSite() {
        Driver.closeDriver();
    }
}
