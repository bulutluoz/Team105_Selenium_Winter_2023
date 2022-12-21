package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) throws InterruptedException {
        // amazon anasayfaya gidin
        // Gift Cards linkini tiklayin
        // Gift Cards sayfasina gittigini test edin

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        // WebElement giftCardLinki= driver.findElement(By.linkText("Gift Cards"));

        Thread.sleep(4000);
        WebElement giftCardLinki=driver.findElement(By.partialLinkText("Gift"));
        giftCardLinki.click();

        // istenen sayfaya gittigini test etmek icin
        // titkle'in Gift Card icerdigini test edebiliriz

        String expectedKelime="Gift Cards";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedKelime)){
            System.out.println("Gift Cards testi PASSED");
        }else {
            System.out.println("Gift Card testi FAILED");
        }

        driver.close();

    }
}
