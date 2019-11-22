import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftTests extends BaseUI {
    String expectedUrlSweets = "https://romanceabroad.com/store/category-sweets";
    By LINK_GIFTS_SWEETS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    By GIFT_SEARCH_FIELD = By.cssSelector("input[id='search_product']");
    By GIFT_SEARCH_BUTTON = By.cssSelector("button#search_friend");

    @Test
    public void testGiftPage() {
        driver.findElement(LINK_GIFTS_SWEETS).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSweets);
    }

    @Test
    public void testGiftPageSearchField() {
        driver.findElement(LINK_GIFTS_SWEETS).click();
        currentUrlSearch = driver.getCurrentUrl();
        driver.findElement(GIFT_SEARCH_FIELD).sendKeys("spa");
        driver.findElement(GIFT_SEARCH_BUTTON).click();
    }
}
