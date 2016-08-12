import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class NoutatiPage {

    private WebDriver webDriver;
    public NoutatiPage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//div[@class='filter-count']")
    private WebElement nrProduseNoutati;

    @FindBy(xpath = "//a[2]/div/span[3]")
    private WebElement nameOfSecundProduce;

    @FindBy(xpath = "//button[@id='addToBasketButton']")
    private WebElement buttonAdaugaInCos;

    @FindBy(xpath = "//span[@class='basket-items']")
    private WebElement verifyBasket;

    @FindBy(xpath = "//span[@title='Increase value']")
    private WebElement buttonIncreaseValue;

    @FindBy(xpath = "//a[@title='Coș cumpărărturi']")
    private WebElement iconBascket;


    public void printNumberOfProduce(){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        String[] nr = nrProduseNoutati.getText().split(" ");
        System.out.println("Number of the new products " + nr[0]);
        assertTrue(Integer.parseInt(nr[0]) > 0);
    }

    public void clickSecondProduceAndAddInBasket() {
        nameOfSecundProduce.click();
        if (buttonAdaugaInCos.isDisplayed()) {
            buttonAdaugaInCos.click();
        }
    }

    public void verifyBasket() {
                assertEquals(Integer.parseInt(verifyBasket.getText()), 1);
    }

    public void increaseValueAndAddInBasket(){
        buttonIncreaseValue.click();
        buttonAdaugaInCos.click();
    }

    public BasketPage clickIconBasket(){
        iconBascket.click();
        BasketPage basketPage = PageFactory.initElements(webDriver, BasketPage.class);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return basketPage;
    }

}
