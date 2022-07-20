package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.maps.LoginMap;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class LoginPage {
    private static WebElement SignUpLink;
    LoginMap loginMap;

    public LoginPage(){
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }


    public static void clickLinkSignUp() {
        Driver.visibilityOf(LoginMap.SignUpLink);
        LoginMap.SignUpLink.click();
    }


    public static boolean PegarUrlAtual(){
        String urlAtual= "";
        urlAtual = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://app.deel.com/signup", urlAtual);
        return true;
    }

    public void setInpEmail(String email){
        Driver.visibilityOf(loginMap.inpemail);
        loginMap.inpemail.sendKeys(email);
    }

    public void setInpPassword(String password){
        Driver.visibilityOf(loginMap.inpPassword);
        loginMap.inpPassword.sendKeys(password);
    }

    public String ValidaMsgInvalidEmail() {
        Driver.visibilityOf(loginMap.InvalidEmail);
        return loginMap.InvalidEmail.getText();
    }


    public String ValidaMsgInvalidPassword(){
        Driver.visibilityOf(loginMap.InvalidPassword);
        return loginMap.InvalidPassword.getText();
    }

    public void  clickButtonLogin() {
        Driver.visibilityOf(loginMap.buttonLogin);
        loginMap.buttonLogin.click();
        loginMap.buttonLogin.click();
    }

 
    }
