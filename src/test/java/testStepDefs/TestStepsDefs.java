package testStepDefs;

import baseFunc.BaseFunc;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import pages.FutbolsPage;
import pages.HomePage;
import pages.ProduktiPage;

public class TestStepsDefs {

    private BaseFunc baseFunc = new BaseFunc();
    private HomePage homePage;
    private ProduktiPage produktiPage;
    private FutbolsPage futbolsPage;


    @Given("open {string} home page")
    public void get_home_page(String url) {
        baseFunc.openPage(url);
        homePage = new HomePage(baseFunc);
    }

    @When("we push menu button")
    public void get_menu_btn() {
        homePage.clickOnMenu();
        homePage = new HomePage(baseFunc);
    }

    @When("we push {string} button")
    public void get_produkti_btn(String products) {
        homePage.clickOnProdukti(products);
//        homePage = new HomePage(baseFunc);
        produktiPage = new ProduktiPage(baseFunc);
    }

    @When("we push {string} category, {string} subcategory for {string} product")
    public void get_futbols_subcategory(String zeni, String apavi, String futbols) {
        produktiPage.clickOnFutbols(zeni, apavi, futbols);
//        produktiPage = new ProduktiPage(baseFunc);
    }

    @When("sort by {string}")
    public void select_izpardosana(String izpardosana) {
        produktiPage.selectIzpardosana(izpardosana);
    }

    @Then("check that all items are on sale")
    public void check_sale() {
        produktiPage.checkSale();
    }

    @When("select brand")
    public void select_nike() {
        produktiPage.clickBrand();
    }

    @Then("check that all items has correct brand")
    public void check_brand() {
        produktiPage.checkBrand();
    }
}
