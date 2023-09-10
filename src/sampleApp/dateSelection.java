package sampleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class dateSelection {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = HelloWorld.setChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/holidays-india/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='departureDate']")).click();
        List<WebElement> dates  = driver.findElements(By.xpath("//div[text()='September 2023']/parent::div/following-sibling::div[2]//div[@class='DayPicker-Day']"));

        for(WebElement element : dates){
            if(element.getText().equals("16"))
            {
                System.out.println(element.getText());
                element.click();
                break;
            }
        }
        driver.quit();
    }
}
