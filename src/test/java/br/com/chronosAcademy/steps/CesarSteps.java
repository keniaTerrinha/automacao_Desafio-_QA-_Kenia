package br.com.chronosAcademy.steps;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.maps.CesarMap;
import br.com.chronosAcademy.pages.CesarPage;
import br.com.chronosAcademy.pages.DemoPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CesarSteps {

    String username;
    CesarPage cesarPage;




    @Dado("que acesso o site Cesar")
    public void que_acesso_o_site_Cesar() {
        Driver.getDriver().get("https://www.cesar.school/");
        cesarPage = new CesarPage();
        cesarPage.ClickButtonAceitarCookies();


    }

    @Dado("clico na opção “School” disponível no menu principal")
    public void clico_na_opção_school_disponível_no_menu_principal() throws InterruptedException {
        cesarPage.ClickMenuSchool();
    }
    @Dado("clico na opção “Blog”")
    public void clico_na_opção_blog() throws InterruptedException {
       cesarPage.ClickOpcaoBlog();

  }
    @Quando("acesso a segunda página da lista de posts")
    public void acesso_a_segunda_página_da_lista_de_posts() throws Exception {
     //cesarPage.ScrollDown();
        cesarPage.AcessarPagina2();
    }
    @Entao("imprimo informações do segundo post da página")
    public void imprimo_as_seguintes_informações_do_segundo_post_da_página() {
        cesarPage.getTituloPagna2();
        cesarPage.getDataPublicacaoPagna2();

    }

    @Entao("acesso o terceiro post da página")
    public void acesso_o_terceiro_post_da_página() throws Exception {

       cesarPage.ClickTerceiroPost();
    }
    @Entao("imprimo informações do terceiro post da página")
    public void imprimo_as_seguintes_informações_do_terceiro_post_da_página() throws Exception {
        cesarPage.getTituloArtigo();
        cesarPage.getNomeAutor();
    }

    @Entao("Imprimo endereço do cesar school")
    public void imprimo_endereço_do_cesar_school() {
        cesarPage.getEndSchool();
    }










}
