import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {
    String expectedUrlSignIn = "https://romanceabroad.com/users/login_form";

    @Test
    public void testRegistrationPage() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(Data.nickname);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);

    }
}
