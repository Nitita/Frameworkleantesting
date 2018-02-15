package pochta.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

    private static String url = "https://online.pochtabank.ru/app/";

    public LoginPage1(WebDriver driver) {
        /* проверить, что вы находитесь на верной странице
        if (!driver.getUrlcontains().contains(url)) {
            throw new IllegalStateException(
                    "This is not the page you are expected"
            );
        }*/
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(id ="id9")
    private WebElement LoginBord;

    @FindBy(id ="ida")
    private WebElement RegBord;

    @FindBy(id="id3")
    private WebElement loginClient;

    @FindBy(id="id4")
    private WebElement passwordClient;

    @FindBy(id="id6")
    private WebElement SubmitR;

    @FindBy(xpath = "//*[@id=\"id14\"]/div/span[2]")
    private WebElement RegError;

    public void clickLoginBord(){
        LoginBord.click();
    }

    public void clickRegBord(){
        RegBord.click();
    }

    public void inputLogin(String login){
        loginClient.clear();
        loginClient.sendKeys(login);
    }

    public void inputPassword(String pass){
        passwordClient.clear();
        passwordClient.sendKeys(pass);
    }

    public void clickLoginButton(){
        SubmitR.click();
    }

    public String getRegError(){
        String RError = RegError.getText();
        return RError;
    }
}
