package org.mobile.bdd.steps;

import appium.connect.App;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import lombok.extern.slf4j.Slf4j;
import org.mobile.bdd.actions.HomeActions;
import org.mobile.bdd.actions.LoginActions;

@Slf4j
public class HomeSteps {
    @Dado("que estou logado no app")
    public void que_estou_logado_no_app() {
        App.logger().info("Executando o passo: que estou logado no app");
        LoginActions.performLogin("teste@teste.com", "123456");
    }

    @Entao("devo visualizar o texto {string}")
    public void devo_visualizar_o_texto_Lojas(String texto) {
        App.logger().info("Executando o passo: devo visualizar o texto " + texto);
        HomeActions.validatePage();
    }
}
