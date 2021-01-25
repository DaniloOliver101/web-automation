package br.com.petz.steps;


import br.com.petz.apis.Api;
import br.com.petz.apis.ApiTest;
import br.com.petz.apis.Helper;
import br.com.petz.model.User;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;


public class APISteps {
    Helper helper = new Helper();
    Api api = new Api();
    ApiTest apiTest = new ApiTest();

    @Dado("o user")
    public void oUser(DataTable dt) {
        apiTest.setUserTable(dt);
        apiTest.testAddNewUser();
        apiTest.testGetUserByUserName();


    }

    @E("Com o Pet")
    public void comOPet(DataTable dt) {
        apiTest.setPetTable(dt);
        apiTest.testAddNewPet();
        apiTest.testGetNewPet();
    }

    @Entao("uma nova ordem de venda sera criada")
    public void umaNovaOrdemDeVendaSeraCriada() {
        apiTest.testAddNewOrder();
    }

    @E("o status da venda deve ser alterado para {string}")
    public void oStatusDaVendaDeveSerAlteradoPara(String status) {
        apiTest.testUpdateOrder(status);
    }

    @E("O status da order sera alterado para <{string}>")
    public void oStatusDaOrderSeraAlteradoPara(String status) {
        apiTest.testUpdateOrder(status);
    }

    @Dado("o user com os dados {int} <{string}> <{string}> <{string}> <{string}> <{string}> <{string}> {int}")
    public void oUserComOsDados(int id, String username, String firstName, String lastName, String email, String password, String phone, int status) {

        User user = new User(id,username,firstName,lastName,email,password,phone,  status);
        System.out.println(api.generateJson(user));

    }

    @Dado("o user com os dados <id> <ussername> <firstname> <lastname> <email> <{string}> <phone> {int}")
    public void oUserComOsDadosIdUssernameFirstnameLastnameEmailPhone(String arg0, int arg1) {
    }


}
