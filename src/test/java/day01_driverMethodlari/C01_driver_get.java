package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        // windows olanlar sonunda .exe yazmali, mac'de buna gerek yok

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(5000);

        driver.close();

        /*
            1- Selenium jar dosyalarini ve chromedriver driver'ini manuel olarak sisteme
            tanitmis olduk.

            Eger firefox veya safari ile calismamiz gerekse,
            bu defa da onlarin driver'larini indirip, manuel olarak
            10.satirda o driver'lari tanimlamaliyiz

            2- 13.satirda ChromeDriver() constructor'ini kullanarak bir obje olusturduk
            bu objeyi kullanmasak bile
            bu satirdan dolayi bos bir browser acilir

            3- driver.get(url) driver'i yazdigimiz url'e goturur
            url yazarken www yazmasak calisir
            ancak https:// yazmazsak method calismaz


         */



    }
}
