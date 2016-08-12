import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class IngrijireCorpPage {

    private WebDriver webDriver;
    public IngrijireCorpPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//div[@class='filter-count']/span")
    private WebElement nrProduse;


    @FindBy(xpath = "//span[text()='Cele mai recente']")
    private WebElement recenteButton;

    @FindBy(xpath = "//div/ul/li[text()='Preț – Cel mai mare la Cel mai mic']")
    private WebElement celMaiMarePretSection;

    @FindBy(xpath = "//a[1]/div/span[@class='name']")
    private WebElement nameOfFirstValueReturned;

    @FindBy(xpath = "//a[1]/div/div/span[@class='price mainCurrency']")
    private WebElement priceOfFirstValueReturned;

    @FindBy(xpath = "//form/h1[@class='name']")
    private WebElement nameOfProduceToVerify;

    @FindBy(xpath = "//p/a/span")
    private WebElement backButtonToIngrijireCorp;

    @FindBy(xpath = "//a[@href='/bath-body/new']")
    private WebElement buttonNoutati;


    public void verifyNrProduse(){
        assertTrue(Integer.parseInt(nrProduse.getText()) > 0);
    }

    public void filterByTheHighestPrice(){
        recenteButton.click();
        celMaiMarePretSection.click();
    }

    public void nameAndPriceOfFirstProduce() {
        String nameProduce = nameOfFirstValueReturned.getText();
        System.out.println("The name of the first element: " + nameProduce);
        String price = priceOfFirstValueReturned.getText();
        System.out.println("The price of the first element: " + price);
    }

    public void clickAndVerifyFirstItem(){
        nameOfFirstValueReturned.click();
        assertEquals(nameOfProduceToVerify.getText(), "Trusă manichiură Giordani Gold");
    }

    public void clickBackButton(){
        backButtonToIngrijireCorp.click();
    }

    public NoutatiPage noutati(){
        buttonNoutati.click();
        NoutatiPage noutatiPage = PageFactory.initElements(webDriver, NoutatiPage.class);
        return noutatiPage;
    }

}
