import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mapostol on 8/7/2016.
 */
public class HomePage {

    private WebDriver webDriver;
    public HomePage (WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//div[@id='primary-navigation']/ul/li/a[text()='Îngrijire Corp']")
    private WebElement ingrijireCoprSection;



    public IngrijireCorpPage ingrijireCorp () {

        ingrijireCoprSection.click();
        IngrijireCorpPage ingrijireCorpPage = PageFactory.initElements(webDriver, IngrijireCorpPage.class);
        return ingrijireCorpPage;
    }

}
