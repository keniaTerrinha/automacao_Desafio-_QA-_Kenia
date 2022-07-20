package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {

    @FindBy(xpath = "//div[text() = 'Sign Up']")
    public static WebElement SignUpLink;
   @FindBy(xpath ="//*[@id='mui-1']")
    public static WebElement inpemail;
    @FindBy(xpath ="//*[@id='mui-2']")
    public static WebElement inpPassword;
    @FindBy(xpath = "//p[text() = 'Email is required']")
    public static WebElement InvalidEmail;
    @FindBy(xpath = "//p[text() = 'Password is required']")
    public static WebElement InvalidPassword;
    @FindBy(xpath = "//div[text()='log in']")
    public WebElement buttonLogin;




}
