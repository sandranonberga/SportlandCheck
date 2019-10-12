package pages;

import baseFunc.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProduktiPage {

    private BaseFunc baseFunc;

    private final By TOPMENU = By.xpath(".//ul[@id='menu-product-menu1']/li");
    private final By FUTBOLS = By.xpath(".//ul[@class='wp-megamenu-sub-menu']");

    public ProduktiPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    /*Clicks on ZĒNI tab*/
    public void clickOnZeni(String zeniName) {
        baseFunc.waitForElement(TOPMENU);
        List<WebElement> topList = baseFunc.getAllElements(TOPMENU);
        for (int i = 0; i < topList.size(); i++) {
            if (topList.get(i).getText().contains(zeniName)) {
                topList.get(i).click();
                break;
            }
        }
    }

    /*Clicks on FUTBOLS tab, under ZĒNI section*/
    public void clickOnFutbols(String futbolsTab) {
        baseFunc.waitForElement(FUTBOLS);
        List<WebElement> sectionList = baseFunc.getAllElements(FUTBOLS);
        for (int i = 0; i < sectionList.size(); i++) {
            if (sectionList.get(i).getText().contains(futbolsTab)) {
                sectionList.get(i).click();
                break;
            }
        }
    }
}
