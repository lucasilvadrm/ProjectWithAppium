package org.mobile.bdd.steps;

import appium.connect.App;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
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

    @Quando("eu pesquisar pelo termo {string}")
    public void eu_pesquisar_pelo_termo(String string) {
        App.logger().info("Executando o passo: eu pesquisar pelo termo " + string);
        HomeActions.fillSearchField(string);
        HomeActions.validateResultAfterSearch();
    }

    @Entao("devo visualizar o resultado da pesquisa")
    public void devo_visualizar_o_resultado_da_pesquisa() {
        App.logger().info("Executando o passo: devo visualizar o resultado da pesquisa");
    }

    @Quando("eu clicar no botão de seleção de endereço")
    public void eu_clicar_no_botao_de_selecao_de_endereco() {
        App.logger().info("Executando o passo: eu clicar no botão de seleção de endereço");
        HomeActions.clickOnSelectAddress();
    }

    @Entao("devo visualizar um modal solicitando minha permissão para acessar a localização")
    public void devo_visualizar_um_modal_solicitando_minha_permissao_para_acessar_a_localizacao() {
        App.logger().info("Executando o passo: devo visualizar um modal solicitando minha permissão para acessar a localização");
        HomeActions.validateLocationModalMessage();
    }

    @E("devo visualizar a mensagem {string}")
    public void devo_visualizar_a_mensagem(String string) {
        App.logger().info("Executando o passo: devo visualizar a mensagem \"" + string + "\"");
        HomeActions.validateMessage(string);
    }

    @Quando("eu permitir o acesso a localização")
    public void eu_permitir_o_acesso_a_localizacao() {
        App.logger().info("Executando o passo: eu permitir o acesso a localização");
        HomeActions.clickOnSelectAddress();
        HomeActions.clickOnLocationModalAllowButton();
    }

    @Entao("devo visualizar o endereço atual na tela")
    public void devo_visualizar_o_endereco_atual_na_tela() {
        App.logger().info("Executando o passo: devo visualizar o endereço atual na tela");
        HomeActions.validateAddressAdded();
    }
}
