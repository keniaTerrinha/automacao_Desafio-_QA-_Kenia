package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpMap {

    @FindBy(xpath = "//button[text() = 'I’m A Contractor']")
    public WebElement buttonContractor;
    @FindBy(xpath = "//button[text() = 'I’m A Business']")
    public WebElement buttonBusiness;
    @FindBy(xpath = "//button[text() = 'Next']")
    public WebElement buttonNext;
    @FindBy(xpath= "//*[@id='mui-1']")
    public WebElement InsertFirstName;
    @FindBy(xpath= "//*[@id='mui-2']")
    public WebElement InsertLastName;
    @FindBy(xpath = "//*[@id='mui-3']")
    public WebElement InsertEmailAddress;
    @FindBy(xpath= "//*[@id='mui-4']")
    public WebElement InsertPassword;
    @FindBy(xpath = "//*[@id='mui-component-select-source']")
    public WebElement campoSelectHowDidYouHearAboutDell;
    @FindBy(xpath = "//i[@tabindex='0']")
    public WebElement SelectIndexOpcao;

    @FindBy(xpath = "//i[@class='deel-ui__icon deel-ui__icon__orientation-up deel-ui__icon_clickable']")
    public WebElement SelectHowDidYouHearAboutDell;
    @FindBy(xpath = "//button[text() = 'Create Your Deel Account']")
    public WebElement buttonCreateYourDeelAccount;
    @FindBy(xpath = "//*[@id='menu-source']/div[3]/ul/li[5]")
    public WebElement opcaoGoogle;
    @FindBy(xpath = "//li[@data-value= 'google']")
    public WebElement opcaoGoogle2;

    @FindBy(xpath = "//p[text() = 'Back']")
    public WebElement LinkBack;













}
