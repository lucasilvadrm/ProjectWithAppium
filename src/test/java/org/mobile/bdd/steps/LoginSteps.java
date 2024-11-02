package org.mobile.bdd.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import lombok.extern.slf4j.Slf4j;
import org.mobile.bdd.actions.HomeActions;
import org.mobile.bdd.actions.LoginActions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class LoginSteps {
    private static final Logger log = LoggerFactory.getLogger(LoginSteps.class);

    @Dado("que estou na tela de login")
    public void que_estou_na_tela_de_login() {
        log.info("Executando o passo: que estou na tela de login");
        LoginActions.validatePage();
    }

    @Quando("eu preencher o campo email com {string} e a senha com {string}")
    public void eu_preencher_o_campo_email_com_e_a_senha_com(String usuario, String senha) {
        log.info("Executando o passo: eu preencher o campo email com {} e a senha com {}", usuario, senha);
        LoginActions.fillPage(usuario, senha);
    }

    @E("clicar no botão de login")
    public void clicar_no_botão_de_login() {
        log.info("Executando o passo: clicar no botão de login");
        LoginActions.submit();
    }

    @Então("devo ser direcionado para a tela inicial")
    public void devo_ser_direcionado_para_a_tela_inicial() {
        log.info("Executando o passo: devo ser direcionado para a tela inicial");
        HomeActions.validatePage();
    }
}
