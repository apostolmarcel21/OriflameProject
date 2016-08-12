import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {

    public static WebDriver webDriver;
    protected HomePage homePage;
    protected IngrijireCorpPage ingrijireCorpPage;
    protected NoutatiPage noutatiPage;
    protected BasketPage basketPage;
    protected PentruElPage pentruElPage;

    @BeforeClass
    public static void setUp() {
        webDriver = new FirefoxDriver();
        webDriver.get("http://ro.oriflame.com/");
        webDriver.manage().window().maximize();
    }

    @Before
    public void initPageObject(){
        homePage =  PageFactory.initElements(webDriver, HomePage.class);
    }

    @AfterClass
    public static void tearDown() {
        webDriver.close();
    }

}
