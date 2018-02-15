package pochta.tests;

import framework.WorkFromWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pochta.pages.LoginPage1;
import pochta.pages.RegPage;


public  class LoginTest extends WorkFromWebDriver {
    public static LoginPage1 loginPage;
    public static RegPage regPage;

    @Test(testName = "ошибка 1")
    public void LoginTest1() {
        loginPage = new LoginPage1(driver);
        loginPage.inputLogin("9994644047");
        loginPage.inputPassword("qwer1234");
        loginPage.clickLoginButton();
        String error = loginPage.getRegError();
        Assert.assertEquals("Неверно указан логин/пароль пользователя.", error);
    }

    @Test
    public void RegTest(){
        regPage = new RegPage(driver);
        loginPage.clickRegBord();
        String mail = regPage.getMail();
        Assert.assertEquals("Укажите свой E-mail", mail);
    }

}
