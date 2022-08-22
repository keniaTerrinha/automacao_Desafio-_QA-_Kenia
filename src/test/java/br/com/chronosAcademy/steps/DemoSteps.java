package br.com.chronosAcademy.steps;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.pages.DemoPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class DemoSteps {

    String username;
   DemoPage demoPage;



    @Dado("que acesso o site Demo")
    public void que_acesso_o_site_Demo() {
        Driver.getDriver().get("https://www.discourse.org/");
        demoPage = new DemoPage();

    }

    @Dado("clico na opção Demo disponível no menu principal")
    public void clico_na_opção_demo_disponível_no_menu_principal() throws Exception {

        demoPage.clickMenuDemo();
    }

    @Quando("faco o scroll até o final da página")
    public void faco_o_scroll_até_o_final_da_página() throws Exception {


        demoPage.ScrollDown() ;
    }
    @Entao("imprimo o título de todos os tópicos fechados")
    public void imprimo_o_título_de_todos_os_tópicos_fechados() throws Exception {
       //demoPage.identificaCadeadoEImprimeTitulo();
    }
    @Entao("imprimo a Quantidade de itens de cada categoria e dos que não possui categoria")
    public void imprimo_a_quantidade_de_itens_de_cada_categoria_e_dos_que_não_possui_categoria() {

    }
    @Entao("imprimo o título do tópico que contém o maior número de views")
    public void imprimo_o_título_do_tópico_que_contém_o_maior_número_de_views() throws InterruptedException {
//        demoPage.clickViews();
//        demoPage.getTituloTopicoMaiorQuantViews();

    }



}
