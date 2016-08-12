import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

/**
 * Created by mapostol on 8/10/2016.
 */
public class BasketPage {

    private WebDriver webDriver;
    public BasketPage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//span[@class='price']/span[@class='value']")
    private WebElement getTotalPrice;

    @FindBy(xpath = "//span[@class='total-bp']")
    private WebElement getEarnedPoints;

    @FindBy(xpath = "//a[@data-category='men']")
    private WebElement pentruElButton;

    public void veryPriceAndPoints(){
        String[] price = getTotalPrice.getText().split(" ");
        assertEquals(price[0], "38,97");
        System.out.println(getEarnedPoints.getText());
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public PentruElPage clickPentruEl(){
        pentruElButton.click();
        PentruElPage pentruElPage = PageFactory.initElements(webDriver, PentruElPage.class);
        return pentruElPage;
    }

}
