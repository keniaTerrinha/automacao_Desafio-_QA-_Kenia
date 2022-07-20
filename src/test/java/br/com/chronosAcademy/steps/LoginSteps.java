package br.com.chronosAcademy.steps;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.enums.Browser;
import br.com.chronosAcademy.pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.io.IOException;
import java.util.Map;

public class LoginSteps {
    LoginPage loginPage;
    String username;

/*
    @Before
    public void iniciaNavegador(Scenario cenario){
       new Driver(Browser.CHROME);
       Driver.setNomeCenario(cenario.getName());
       Driver.criaDiretorio();
    }
*/

   /* @After
    public void fechaNavegador(Scenario cenario) throws IOException {
        if(cenario.isFailed()){
            Driver.printScreen("erro no cenario");
        }
        Driver.getDriver().quit();
    }*/

    @Dado("que estou na tela de Login")
    public void que_estou_na_tela_de_Login() {
        Driver.getDriver().get("https://app.deel.com");
        loginPage = new LoginPage();

    }



    @Quando("for realizado um clique em Sign Up")
            public void for_realizado_um_clique_em_Sign_Up() throws Exception {
            LoginPage.clickLinkSignUp();
            }

    @Entao("A tela de Login sera redirecionada para tela Sign Up")
    public void a_tela_de_Login_sera_redirecionada_para_tela_Sign_up() throws Exception {

        Assert.assertTrue(loginPage.PegarUrlAtual());

    }

    @Quando("os campos de login forem preenchidos da seguinte forma")
    public void osCamposDeLoginForemPreenchidosDaSeguinteForma(Map<String, String> map) throws IOException {
        String email = map.get("email");
        String password = map.get("password");

        if(email != null){
            loginPage.setInpEmail(email);
        }

        if (password != null){
            loginPage.setInpPassword(password);
        }

    }

    @Quando("for realizado um clique no botao sign in")
    public void for_realizado_um_clique_no_botao_sign_in() throws Exception {

      loginPage.clickButtonLogin();

    }

    @Entao("deve ser possivel logar no sistema")
    public void deve_ser_possivel_logar_no_sistema() throws Exception {



    }

    @Entao("o sistema deve exibir uma mensagem de erro campos obrigatorios vazios")
    public void o_sistema_deve_exibir_uma_mensagem_de_erro_campos_obrigatorios_vazios() throws Exception {

        Assert.assertEquals("Email is required", loginPage.ValidaMsgInvalidEmail());

        Assert.assertEquals("Password is required",loginPage.ValidaMsgInvalidPassword());

    }

    @Entao("o sistema deve exibir uma mensagem de erro campo email")
    public void o_sistema_deve_exibir_uma_mensagem_de_erro_campo_email() throws Exception {

        Assert.assertEquals("Email is required", loginPage.ValidaMsgInvalidEmail());



    }

    @Entao("o sistema deve exibir uma mensagem de erro para campo password")
    public void o_sistema_deve_exibir_uma_mensagem_de_erro_para_campo_password() throws Exception {


        Assert.assertEquals("Password is required",loginPage.ValidaMsgInvalidPassword());

    }



}
