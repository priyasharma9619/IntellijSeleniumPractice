package sampleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class uploadFile {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = HelloWorld.setChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");

//        Explicit wait
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

//       Fluent wait
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("Not found the element")
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myFiles")));

        WebElement upload = driver.findElement(By.id("myFile"));
        upload.sendKeys("C:\\Users\\priya.sharma\\Desktop\\abc.html");



    }
}
