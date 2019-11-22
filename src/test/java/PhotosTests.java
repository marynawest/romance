import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhotosTests extends BaseUI {

    @Test
    public void testPhotosPage() {
        driver.findElement(Locators.LINK_PHOTOS).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlPhotos);
    }
}