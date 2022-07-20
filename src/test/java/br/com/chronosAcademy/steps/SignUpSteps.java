package br.com.chronosAcademy.steps;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.enums.Browser;
import br.com.chronosAcademy.pages.LoginPage;
import br.com.chronosAcademy.pages.SignUpPage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.io.IOException;
import java.util.Map;

public class SignUpSteps {
    SignUpPage SignUpPage;
    String username;

//    @Before
//    public void iniciaNavegador(Scenario cenario){
//       new Driver(Browser.CHROME);
//       Driver.setNomeCenario(cenario.getName());
//       Driver.criaDiretorio();
//    }

/*
    @After
    public void fechaNavegador(Scenario cenario) throws IOException {
        if(cenario.isFailed()){
            Driver.printScreen("erro no cenario");
        }
        Driver.getDriver().quit();
    }
*/



    @Dado("que estou na tela de Sing Up")
    public void que_estou_na_tela_Sign_Up() {
        Driver.getDriver().get("https://app.deel.com/signup");
        SignUpPage = new SignUpPage();

    }



    @Quando("clico em {string}")
    public void clico_em(String string) throws Exception {
        SignUpPage.clickButtonBusiness();
    }

    @Quando("clico na opcao {string}")
    public void clico_na_opcao(String string) throws Exception {

        SignUpPage.clickButtonContractor();

    }

    @Entao("clico no botao {string}")
    public void clico_no_botao(String string) throws Exception {

        SignUpPage.clickButtonNext();

    }

    @Entao("Insert First Name {string}")
    public void Insert_First_Name(String string) throws Exception {

        SignUpPage.InsertFirstName(string);

    }

    @Entao("Insert Last Name {string}")
    public void Insert_Last_Name(String string) throws Exception {

        SignUpPage.InsertLastName(string);

    }

    @Entao("Insert email address {string}")
    public void Insert_email_address(String string) throws Exception {

        SignUpPage.InsertEmailAddress(string);

    }


    @Entao("Insert Password {string}")
    public void Insert_Password(String string) throws Exception {

        SignUpPage.InsertPassword(string);

    }


    @Entao("select opcao How Did You Hear AboutDell {string}")
    public void select_opcao_How_Did_You_Hear_AboutDell (String string) throws Exception {

        SignUpPage.SelectHowDidYouHearAboutDell(string);


    }

    @Entao("Click button Create Your Deel Account")
    public void Click_button_Create_Your_Deel_Account () throws Exception {
        SignUpPage.clickSelectOpcao();

        SignUpPage.buttonCreateYourDeelAccount();

    }




}
