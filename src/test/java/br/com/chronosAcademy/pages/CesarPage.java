package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.maps.CesarMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CesarPage {

    private static br.com.chronosAcademy.maps.CesarMap CesarMap;
    private static WebDriver driver;


    public CesarPage() {
        CesarMap = new CesarMap();
        PageFactory.initElements(Driver.getDriver(), CesarMap);
    }


    public void ClickButtonAceitarCookies() {
        Driver.visibilityOf(CesarMap.buttonAceitarCookies);
        CesarMap.buttonAceitarCookies.click();
    }


    public void ClickMenuSchool() throws InterruptedException {
        Thread.sleep(3000);
        Driver.visibilityOf(CesarMap.clickMenuSchool);
        CesarMap.clickMenuSchool.click();

    }

    public void ClickOpcaoBlog() throws InterruptedException {
//        Driver.visibilityOf(CesarMap.opcaoBlog);
//        CesarMap.opcaoBlog.click();
        Driver.getDriver().get("https://www.cesar.school/blog/");

    }

    public void ScrollDown() throws Exception {
        WebElement el = driver.findElement(By.id("primary"));

        executarJS("window.scrollBy(0, arguments[0])", el.getLocation().y);


    }



    public Object executarJS(String cmd, Object... param) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript(cmd, param);
    }


    public void AcessarPagina2() throws InterruptedException {
        Thread.sleep(3000);
//        Driver.visibilityOf(CesarMap.acessarPagina3);
//        CesarMap.acessarPagina3.click();
        Driver.getDriver().get("https://www.cesar.school/blog/page/2/");

    }
    public String getTituloPagna2() {
        String TxtTitulo="";
        Driver.visibilityOf(CesarMap.txtTituloPagna2);
        TxtTitulo =CesarMap.txtTituloPagna2.getText();
        System.out.println(TxtTitulo);

        return TxtTitulo;

    }

    public String getDataPublicacaoPagna2() {
        String TxtDataPubl="";
        Driver.visibilityOf(CesarMap.dataPublicacao);
        TxtDataPubl=CesarMap.dataPublicacao.getText();
        System.out.println(TxtDataPubl);

        return TxtDataPubl;

    }

    public String getEndSchool() {
        String TxtendSchool="";
        Driver.visibilityOf(CesarMap.endSchool);
        TxtendSchool=CesarMap.endSchool.getText();
        System.out.println(TxtendSchool);

        return TxtendSchool;

    }

    public String getTituloArtigo() {
        String TxtTituloArtigo="";
        Driver.visibilityOf(CesarMap.txtTituloArtigo);
        TxtTituloArtigo=CesarMap.txtTituloArtigo.getText();
        System.out.println(TxtTituloArtigo);

        return TxtTituloArtigo;



    }

    public String getNomeAutor(){
        String TxtNomeAutor="";
        Driver.visibilityOf(CesarMap.nomeAutor);
        TxtNomeAutor=CesarMap.nomeAutor.getText();
        System.out.println(TxtNomeAutor);

        return TxtNomeAutor;

    }

    public void ClickTerceiroPost() throws InterruptedException {
        Thread.sleep(3000);
        Driver.visibilityOf(CesarMap.clickTituloArtigo);
        CesarMap.clickTituloArtigo.click();

    }




}

