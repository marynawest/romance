import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TourToUkraineTests extends BaseUI {
    String expectedUrlTOUR = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    By LINK_TOUR = By.cssSelector("a[class='nav-link '][href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");

    @Test
    public void testTourToUkrainePage() {
        driver.findElement(LINK_TOUR).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlTOUR);
    }
}
