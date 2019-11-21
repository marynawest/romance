import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrlSearch;
    String expectedUrl = "https://romanceabroad.com/users/search";
    String expectedUrlSweets = "https://romanceabroad.com/store/category-sweets";
    String expectedUrlHowWeWork = "https://romanceabroad.com/content/view/how-it-works";
    String expectedUrlPhotos = "https://romanceabroad.com/media/index";
    String expectedUrlTOUR = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";
    String expectedUrlSignIn = "https://romanceabroad.com/users/login_form";
    String expectedUrlBookNow = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";

    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_GIFTS_SWEETS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    By LINK_HOW_WE_WORK = By.cssSelector("a[href='https://romanceabroad.com/content/view/how-it-works']");
    By LINK_PHOTOS = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    By LINK_TOUR = By.cssSelector("a[class='nav-link '][href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    By LINK_SIGN_IN = By.xpath("//li/a[@href='https://romanceabroad.com/users/login_form']");
    By LINK_BOOK_NOW = By.xpath("//div/a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    By GIFT_SEARCH_FIELD = By.cssSelector("input[id='search_product']");
    By GIFT_SEARCH_BUTTON = By.cssSelector("button#search_friend");
    By BOOK_NOW_CATEGORIES = By.cssSelector("i[class='fa fa-bars']");
    By BOOK_NOW_CATEGORIES_EMAIL = By.cssSelector("input[id='email']");
    By BOOK_NOW_CATEGORIES_PASSWORD = By.cssSelector("input[id='password']");
    By BOOK_NOW_CATEGORIES_SIGNIN_BUTTON = By.cssSelector("button[name='logbtn']");




    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

   @Test
   public void testMainPageSearch(){
   driver.findElement (LINK_SEARCH).click();
   currentUrlSearch = driver.getCurrentUrl();
       System.out.println(currentUrlSearch);
       Assert.assertEquals(currentUrlSearch, expectedUrl);
    }

   @Test
   public void testGiftPage(){
   driver.findElement (LINK_GIFTS_SWEETS).click();
   currentUrlSearch = driver.getCurrentUrl();
       System.out.println(currentUrlSearch);
       Assert.assertEquals(currentUrlSearch, expectedUrlSweets);
    }

    @Test
   public void testGiftPageSearchField(){
   driver.findElement (LINK_GIFTS_SWEETS).click();
   currentUrlSearch = driver.getCurrentUrl();
        driver.findElement (GIFT_SEARCH_FIELD).sendKeys("spa");
        driver.findElement(GIFT_SEARCH_BUTTON).click();
    }

    @Test
   public void testHowWeWorkPage(){
   driver.findElement (LINK_HOW_WE_WORK).click();
   currentUrlSearch = driver.getCurrentUrl();
       System.out.println(currentUrlSearch);
       Assert.assertEquals(currentUrlSearch, expectedUrlHowWeWork);
    }

    @Test
   public void testPhotosPage(){
   driver.findElement (LINK_PHOTOS).click();
   currentUrlSearch = driver.getCurrentUrl();
       System.out.println(currentUrlSearch);
       Assert.assertEquals(currentUrlSearch, expectedUrlPhotos);
    }

    @Test
   public void testTourToUkrainePage(){
   driver.findElement (LINK_TOUR).click();
   currentUrlSearch = driver.getCurrentUrl();
       System.out.println(currentUrlSearch);
       Assert.assertEquals(currentUrlSearch, expectedUrlTOUR);
    }

    @Test
   public void testBlogPage(){
   driver.findElement (LINK_BLOG).click();
   currentUrlSearch = driver.getCurrentUrl();
       System.out.println(currentUrlSearch);
       Assert.assertEquals(currentUrlSearch, expectedUrlBlog);
    }

    @Test
   public void testSignInPage(){
   driver.findElement (LINK_SIGN_IN).click();
   currentUrlSearch = driver.getCurrentUrl();
       System.out.println(currentUrlSearch);
       Assert.assertEquals(currentUrlSearch, expectedUrlSignIn);
    }

    @Test
   public void testBookNow(){
   driver.findElement (LINK_BOOK_NOW).click();
   currentUrlSearch = driver.getCurrentUrl();
       System.out.println(currentUrlSearch);
       Assert.assertEquals(currentUrlSearch, expectedUrlBookNow);
    }

    @Test
   public void testBookNowCategoriesSignIn(){
   driver.findElement (LINK_BOOK_NOW).click();
   currentUrlSearch = driver.getCurrentUrl();
   driver.findElement(BOOK_NOW_CATEGORIES).click();
        //driver.findElement(BOOK_NOW_CATEGORIES_EMAIL).sendKeys("888@gmail.com");
        //driver.findElement(BOOK_NOW_CATEGORIES_PASSWORD).sendKeys("888@gmail.com");
        //driver.findElement(BOOK_NOW_CATEGORIES_SIGNIN_BUTTON).click();
    }

    @AfterMethod
    public void afterActions(){
        //driver.quit();
    }
}
