import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by mapostol on 8/10/2016.
 */
public class PentruElPage {
    private WebDriver webDriver;
    public PentruElPage (WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//div/ul[2]/li[5]/a")
    private WebElement accesoriiButton;

    @FindBy(xpath = "//li[5]/ul/li[3]/a[@href='/men/accessories/watches']")
    private WebElement ceasuriButtorn;

    @FindBy(xpath = "//span[3]")
    private List<WebElement> lastItem;

    @FindBy(xpath = "//span[@class='stars']")
    private List<WebElement> stars;


}
