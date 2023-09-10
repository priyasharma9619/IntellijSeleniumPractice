package sampleApp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static sampleApp.HelloWorld.setChromeDriver;

public class alertss {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = setChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        //Driver.get commands are perfect for a website that loads slowly,
        // as it waits for the page to get loaded fully and then proceeds to the next steps
        driver.manage().window().maximize();
//        int width = 600;
//        int height = 400;
//        Dimension dimension = new Dimension(width, height);
//        driver.manage().window().setSize(dimension);
//        -------------------------------------------------------
//        upload a file using Selenium WebDriver
//        ----------------------------------------------------------------

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("promptBox")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.sendKeys("hello");
        alert.accept();
        System.out.println(driver.findElement(By.id("output")).getText());
        driver.quit();
    }
}
