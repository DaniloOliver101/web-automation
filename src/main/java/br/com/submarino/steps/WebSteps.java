package br.com.submarino.steps;

import br.com.submarino.driver.Driver;
import br.com.submarino.pages.CommonPage;
import br.com.submarino.pages.SubmarinoPage;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;


public class WebSteps {
    static Driver driver;
    static CommonPage commonPage;
    static SubmarinoPage submarinoPage;

    @Before
    public void setUp(){
        driver = new Driver();
        commonPage = new CommonPage(driver);
        submarinoPage = new SubmarinoPage(driver);
    }
    @Dado("que realizo uma pesquisa por {string}")
    public void queRealizoUmaPesquisaPor(String searchText) {
        submarinoPage.getSearchBar().sendKeys(searchText);
        submarinoPage.getSearchBar().click();

    }

    @E("na lista eu procuro pelo {string}")
    public void naListaEuProcuroPelo(String arg0) {
    }

    @Quando("selecionar e validar")
    public void selecionarEValidar() {
    }

    @E("ao incluir o item no carrinho")
    public void aoIncluirOItemNoCarrinho() {
    }

    @Entao("devo poder validar os dados do produto")
    public void devoPoderValidarOsDadosDoProduto() {
    }

    @Dado("que eu acesso a pagina {string}")
    public void queEuAcessoAPagina(String url) {
        driver.get(url);

    }
}
