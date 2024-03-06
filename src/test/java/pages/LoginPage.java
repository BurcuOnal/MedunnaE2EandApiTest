package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public  LoginPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(id = "username")
        public WebElement userNameInput;
        @FindBy(id = "password")
        public WebElement passwordInput;
        @FindBy(id = "rememberMe")
        public WebElement rememberMeCheckBox; // optional to use
        @FindBy(xpath = " //button[@type='submit']")
        public WebElement signInSubmitButton;




    }

