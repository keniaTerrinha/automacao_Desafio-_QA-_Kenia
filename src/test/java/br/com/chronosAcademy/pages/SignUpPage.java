package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.maps.SignUpMap;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
    SignUpMap SignUpMap;
    private String SelectHowDidYouHearAboutDell;

    public SignUpPage(){
        SignUpMap = new SignUpMap();
        PageFactory.initElements(Driver.getDriver(), SignUpMap);
    }


    public void clickButtonBusiness() {
        Driver.visibilityOf(SignUpMap.buttonBusiness);
        SignUpMap.buttonBusiness.click();
    }

    public void clickButtonContractor() {
        Driver.visibilityOf(SignUpMap.buttonContractor);
        SignUpMap.buttonContractor.click();
    }

    public void clickButtonNext() {
        Driver.visibilityOf(SignUpMap.buttonNext);
        SignUpMap.buttonNext.click();
    }

    public void InsertFirstName(String firstname) {
        Driver.visibilityOf(SignUpMap.InsertFirstName);
        SignUpMap.InsertFirstName.click();
        SignUpMap.InsertFirstName.sendKeys(firstname);
    }

    public void InsertLastName(String lastname) {

        Driver.visibilityOf(SignUpMap.InsertLastName);
        SignUpMap.InsertLastName.click();
        SignUpMap.InsertLastName.sendKeys(lastname);
    }

    public void InsertEmailAddress(String email) {
        Driver.visibilityOf(SignUpMap.InsertEmailAddress);
        SignUpMap.InsertEmailAddress.click();
        SignUpMap.InsertEmailAddress.sendKeys(email);
    }

    public void InsertPassword(String password) {
        Driver.visibilityOf(SignUpMap.InsertPassword);
        SignUpMap.InsertPassword.click();
        SignUpMap.InsertPassword.sendKeys(password);
    }



/*    public void SelectHowDidYouHearAboutDell() {


        Select select = new Select(SignUpMap.campoSelectHowDidYouHearAboutDell);
        Driver.aguardaOptions(select);
        //select.selectByVisibleText(opcao);


    }*/



    public void SelectHowDidYouHearAboutDell(String opcao) {
        Driver.visibilityOf(SignUpMap.campoSelectHowDidYouHearAboutDell);
        SignUpMap.campoSelectHowDidYouHearAboutDell .click();
        WebElement categoria = Driver.getDriver().findElement(By.xpath(String.valueOf(SignUpMap.opcaoGoogle2)));
        Select categoriaComBobox = new Select(categoria);
        categoriaComBobox.selectByVisibleText(opcao);

    }

    public void clickSelectOpcao() {
        Driver.visibilityOf(SignUpMap.opcaoGoogle2);
        SignUpMap.opcaoGoogle2 .click();



    }



    public void buttonCreateYourDeelAccount() {
        Driver.visibilityOf(SignUpMap.buttonCreateYourDeelAccount);
        SignUpMap.buttonCreateYourDeelAccount.click();
    }



    }

