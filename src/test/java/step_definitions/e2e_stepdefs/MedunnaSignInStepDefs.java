package step_definitions.e2e_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;


public class MedunnaSignInStepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("Go to Medunna website")
    public void goToMedunnaWebsite() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @When("Click on user dropdown button")
    public void clickOnUserDropdownButton() { homePage.userIcon.click();
    }

    @And("Click on sign in button")
    public void clickOnSignInButton() { homePage.signInOption.click();
    }
    @And("Enter username")
    public void enterUsername() {loginPage.usernameInput.sendKeys(ConfigReader.getProperty("medunna_username"));

    }

    @And("Enter password")
    public void enterPassword() { loginPage.passwordInput.sendKeys(ConfigReader.getProperty("medunna_password"));
    }

    @And("Click on sign in button again")
    public void clickOnSignInButtonAgain() { loginPage.signInSubmitButton.click();
    }


}
