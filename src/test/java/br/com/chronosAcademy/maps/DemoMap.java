package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoMap {



    @FindBy(xpath = "//a[text() = 'Demo']")
    public static WebElement menuDemo;

//    @FindBy(xpath= "//*[@id='main']//ul/li[4]/a")
//    public static WebElement menuDemo;

    @FindBy(xpath = "//div[@class= 'topic-statuses']")
    public WebElement cadeadoTopico;

    @FindBy(xpath = "//*[@id='ember496']/td[1]/span/div/span/svg']")
    public WebElement TextoCadeadoTopico1;
    @FindBy(xpath = "//*[@id='ember494']/td[1]/span/div/span/svg']")
    public WebElement TextoCadeadoTopico2;

    @FindBy(xpath = "//*[@id='ember152']/h3")
    public WebElement scrollClickFinalPg;

    @FindBy(xpath = "//*[@id='ember47']/thead/tr/th[4]")
    public WebElement clickViews;

    @FindBy(xpath ="//*[@id='ember175']")
    public WebElement tituloTopicoMaiorQuantViews;









}
