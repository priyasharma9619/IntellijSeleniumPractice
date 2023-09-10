package sampleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class uploadFile {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = HelloWorld.setChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
        Thread.sleep(3000);
        WebElement upload = driver.findElement(By.id("myFile"));
        upload.sendKeys("C:\\Users\\priya.sharma\\Desktop\\abc.html");

    }
}
