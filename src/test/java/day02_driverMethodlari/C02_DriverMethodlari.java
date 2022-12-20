package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver= new ChromeDriver();

        // sayfayi tam ekran yapalim
        driver.manage().window().maximize();
        System.out.println("maximize window boyutlari : "+driver.manage().window().getSize());
        System.out.println("maximize window konum : "+driver.manage().window().getPosition());

        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("fullscreen window boyutlari"+driver.manage().window().getSize());
        System.out.println("fullscreen window konumu"+driver.manage().window().getPosition());

        // browser'i istedigimiz konuma ve boyuta getirelim


        Thread.sleep(3000);
        driver.close();
    }
}
