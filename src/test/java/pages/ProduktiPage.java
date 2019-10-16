package pages;

import baseFunc.BaseFunc;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProduktiPage {

    private BaseFunc baseFunc;

    private final By TOPMENU = By.xpath(".//ul[@id='menu-product-menu1']/li");
    private final By SELECTOR = By.xpath(".//div[@class='spodb-filter__select']/select/option");
    private final By ALLITEMS = By.xpath(".//p[@class='spodb-product-card__title']");
    private final By SALEITEMS = By.xpath(".//p[@class='spodb-product-card__percentage']");
    private final By NIKE = By.xpath(".//input[@id='85']");

    public ProduktiPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void clickOnFutbols(String category, String subCategory, String product) {
        List<WebElement> categoryList = baseFunc.getAllElements( TOPMENU );
        for (int i = 0; i < categoryList.size(); i++) {
            if (categoryList.get( i ).getText().contains( category )) {
                categoryList.get( i ).click();
                List<WebElement> subCategoryList = categoryList.get( i ).findElements( By.tagName( "a" ) );
                for (int j = 0; j < subCategoryList.size(); j++) {
                    if (subCategoryList.get( j ).getText().equals( subCategory )) {
                        for (int k = j + 1; k < subCategoryList.size(); k++) {
                            if (subCategoryList.get( k ).getText().equals( product )) {
                                subCategoryList.get( k ).click();
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
    }

    public void selectIzpardosana (String izpardosana) {
        baseFunc.waitForElement(SELECTOR);
        List<WebElement> izpardosanaSelect = baseFunc.getAllElements(SELECTOR);
        for (int i = 0; i < izpardosanaSelect.size(); i++) {
            if(izpardosanaSelect.get(i).getText().contains(izpardosana)) {
                izpardosanaSelect.get(i).click();
                break;
            }
        }
    }

    public void checkSale () {
        List<WebElement> visiProdukti = baseFunc.getAllElements(ALLITEMS);
        List<WebElement> izpardosanasProd = baseFunc.getAllElements(SALEITEMS);
        Assertions.assertTrue(visiProdukti.size() == izpardosanasProd.size(), "Not all products are on sale");
    }

    public void clickBrand() {
        baseFunc.getElement(NIKE).click();
    }

    public void checkBrand() {

    }

}
