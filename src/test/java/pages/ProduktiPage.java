package pages;

import baseFunc.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProduktiPage {

    private BaseFunc baseFunc;

    private final By TOPMENU = By.xpath(".//ul[@id='menu-product-menu1']/li");


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

    /*Clicks on ZĒNI tab*/
//    public void clickOnFutbols(String zeniName, String apavi, String futbols) {
//        baseFunc.waitForElement(TOPMENU);
//        List<WebElement> topList = baseFunc.getAllElements(TOPMENU);
//        for (int i = 0; i < topList.size(); i++) {
//            if (topList.get(i).getText().equals(zeniName)) {
//                topList.get(i).click();
//                List<WebElement> allProducts = baseFunc.getAllElements(By.tagName("a"));
//                for (int j = 0; j < allProducts.size(); j++) {
//                    if(allProducts.get(j).getText().equals(apavi)) {
//                        for (int k = j + 1; k < allProducts.size(); k++) {
//                            if (allProducts.get(k).getText().equals(futbols))
//                                allProducts.get(k).click();
//                            break;
//                        }
//                    }
//                    break;
//                }
//            }
//            break;
//        }
//    }


}
