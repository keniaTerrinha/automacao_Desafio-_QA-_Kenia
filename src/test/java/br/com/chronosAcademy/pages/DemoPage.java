package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.maps.DemoMap;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DemoPage {
    private static WebElement SignUpLink;
    private static br.com.chronosAcademy.maps.DemoMap DemoMap;
    private static WebDriver driver;



    public DemoPage(){
        DemoMap = new DemoMap();
        PageFactory.initElements(Driver.getDriver(), DemoMap);
    }


    public void clickMenuDemo() {
        Driver.visibilityOf(DemoMap.menuDemo);

        DemoMap.menuDemo.click();


    }


    public boolean  identificaCadeadoEImprimeTitulo() throws Exception {


            String TextoTopico1="";
            String TextoTopico2="";

        //Se cadeado existe
        Thread.sleep(20);
        Driver.visibilityOf(DemoMap.cadeadoTopico);
        Driver.visibilityOf(DemoMap.TextoCadeadoTopico1);
        TextoTopico1 = DemoMap.TextoCadeadoTopico1.getText();
        TextoTopico2 = DemoMap.TextoCadeadoTopico2.getText();


        //imprime Texto topico
                System.out.println("------------------------------------------------------------------");
                System.out.println(" >> Foram identificados 2 cadeados. E o texto dos seus tópicos são: ");
                System.out.println("------------------------------------------------------------------");
                System.out.println(TextoTopico1);
                System.out.println(TextoTopico2 );

                return true;
    }


//    public void ScrollDown() throws Exception {
//
//
//        WebElement el = driver.findElement(By.id("ember146"));
//        executarJS("window.scrollBy(0, arguments[0])", el.getLocation().y);
//
//
//    }





    public void ScrollDown() throws Exception {
       WebElement el = driver.findElement(By.id("ember148"));

        executarJS("window.scrollBy(0, arguments[0])", el.getLocation().y);


    }



        public Object executarJS(String cmd, Object... param) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            return js.executeScript(cmd, param);
        }


    public void clickViews() throws InterruptedException {
        Thread.sleep(2000);
        Driver.invisibilityOf(DemoMap.clickViews);
        DemoMap.clickViews.click();


    }

    public String getTituloTopicoMaiorQuantViews() {
        String TxtTituloMaiorQuantViews="";
        Driver.visibilityOf(DemoMap.tituloTopicoMaiorQuantViews);
        TxtTituloMaiorQuantViews=DemoMap.tituloTopicoMaiorQuantViews.getText();
        System.out.println(TxtTituloMaiorQuantViews);

        return TxtTituloMaiorQuantViews;



    }








 
    }
