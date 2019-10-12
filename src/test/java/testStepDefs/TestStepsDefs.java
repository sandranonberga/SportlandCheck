package testStepDefs;

import baseFunc.BaseFunc;
import cucumber.api.java.en.Given;
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
    }

    @When("we push zeni button")
    public void get_zeni_btn(String zeni) {
        produktiPage.clickOnZeni(zeni);
//        produktiPage = new ProduktiPage(zeni);
    }

    @When("we push futbols button")
    public void get_futbols_btn(String futbols) {
        produktiPage.clickOnFutbols(futbols);
//        produktiPage = new ProduktiPage(baseFunc);
    }
}
