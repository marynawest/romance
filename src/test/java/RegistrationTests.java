import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTests extends BaseUI {
    String expectedUrlSignIn = "https://romanceabroad.com/users/login_form";

    @Test
    public void testRegistrationPage() {
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement (Locators.TEXT_FIELD_PASSWORD)));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.TEXT_FIELD_NICKNAME).sendKeys(generateNewNumber(Data.nickname, 5));
        driver.findElement(By.cssSelector("#daySelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectDay']//a[text()='2']")).click();
        driver.findElement(By.cssSelector("#monthSelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectMonth']//a[text()='May']")).click();
        driver.findElement(By.cssSelector("#yearSelect")).click();
        driver.findElement(By.xpath("//li[@data-handler='selectYear']//a[text()='2001']")).click();
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);

    }
}
