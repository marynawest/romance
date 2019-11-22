import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowWeWorkTests extends BaseUI {

    String expectedUrlHowWeWork = "https://romanceabroad.com/content/view/how-it-works";
    By LINK_HOW_WE_WORK = By.cssSelector("a[href='https://romanceabroad.com/content/view/how-it-works']");

    @Test
    public void testHowWeWorkPage() {
        driver.findElement(LINK_HOW_WE_WORK).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlHowWeWork);
    }
}
