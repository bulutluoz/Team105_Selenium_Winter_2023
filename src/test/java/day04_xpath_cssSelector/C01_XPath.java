package day04_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XPath {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Delete butonu goruntuleme testi PASSED");
        }else {
            System.out.println("Delete butonu goruntuleme testi FAILED");
        }
        Thread.sleep(3000);
        //4- Delete tusuna basin
        deleteButonu.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemoveYaziElementi= driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("Add/remove yazi testi PASSED");
        }else {
            System.out.println("Add/remove yazi testi FAILED");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
