import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookNowTests extends BaseUI {
    By LINK_BOOK_NOW = By.xpath("//div/a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    String expectedUrlBookNow = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";

    @Test
    public void testBookNow() {
        driver.findElement(LINK_BOOK_NOW).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlBookNow);
    }
}
