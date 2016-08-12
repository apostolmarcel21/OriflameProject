import org.junit.Test;


public class OriflameTest extends  TestBase{

    @Test
    public void testOriflame() {

        IngrijireCorpPage ingrijireCorpPage = homePage.ingrijireCorp();
        ingrijireCorpPage.verifyNrProduse();
        ingrijireCorpPage.filterByTheHighestPrice();
        ingrijireCorpPage.nameAndPriceOfFirstProduce();
        ingrijireCorpPage.clickAndVerifyFirstItem();
        ingrijireCorpPage.clickBackButton();
        NoutatiPage noutatiPage = ingrijireCorpPage.noutati();
        noutatiPage.printNumberOfProduce();
        noutatiPage.clickSecondProduceAndAddInBasket();
        noutatiPage.verifyBasket();
        noutatiPage.increaseValueAndAddInBasket();
        BasketPage basketPage = noutatiPage.clickIconBasket();
        basketPage.veryPriceAndPoints();
        PentruElPage pentruElPage = basketPage.clickPentruEl();
    }

}
