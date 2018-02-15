package pochta.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPage {

    public RegPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(id ="id9")
    private WebElement LoginBord;

    @FindBy(id ="ida")
    private WebElement RegBord;

    @FindBy(xpath = "//*[@id=\"id1d\"]/div[3]/div[2]")
    private WebElement eMail;

    public void clickLoginBord(){
        LoginBord.click();
    }

    public void clickRegBord(){
        RegBord.click();
    }

    public String getMail (){
        String mail = eMail.getText();
        return mail;
    }
}
