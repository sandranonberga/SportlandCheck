package pages;

import baseFunc.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    private BaseFunc baseFunc;

    private final By MENU = By.xpath("(.//button[@class='menu-trigger js-toggle-menu'])");
//    private final By PRODUKTI = By.xpath(".//a[@href='https://sportland.lv/produkti/']");
    private final By HEADER = By.xpath(".//ul[@id='menu-primary-menu']/li");

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void clickOnMenu(){
        baseFunc.getElement(MENU).click();
    }

    public void clickOnProdukti(String productName){
        baseFunc.waitForElement(HEADER);
        List<WebElement> headerList = baseFunc.getAllElements(HEADER);
        for (int i = 0; i < headerList.size(); i++) {
            if (headerList.get(i).getText().contains(productName)) {
                headerList.get(i).click();
                break;
            }
        }
    }
}
