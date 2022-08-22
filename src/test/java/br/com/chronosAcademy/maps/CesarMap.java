package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CesarMap {

    @FindBy(xpath = "//a[text() = 'Aceitar Cookies']")
    public WebElement buttonAceitarCookies;
    @FindBy(xpath = "//*[@id='menu-item-15376']")
    public WebElement clickMenuSchool;
    @FindBy(xpath = "//*[@id='menu-item-15254']")
    public WebElement opcaoBlog;
    @FindBy(css = "span[href='https://www.cesar.school/blog/page/2/']")
    public WebElement acessarPagina2;
    @FindBy(css = "a[href='https://www.cesar.school/blog/page/3/']")
    public WebElement acessarPagina3;
    @FindBy(xpath = "//*[@id='post-64428']/div/div/header/h2")
    public WebElement txtTituloPagna2;
    @FindBy(xpath = " //*[@id=\"post-64428\"]/div/div/div[1]/a/div/span/time[1]")
    public WebElement dataPublicacao;

    @FindBy(xpath = "//div[@class='onde']")
    public WebElement endSchool;

    @FindBy(xpath ="//*[@id='post-64073']/div/div/header/h2/a")
    public WebElement clickTituloArtigo;

    @FindBy(xpath ="//*[@id=\"post-64073\"]/div/header/div[2]/h1")
    public WebElement txtTituloArtigo;

    @FindBy(xpath ="//*[@id='post-64073']/div/div/p[1]/strong")
    public WebElement nomeAutor;










}
