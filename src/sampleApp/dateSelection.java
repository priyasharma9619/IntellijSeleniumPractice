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
        WebElement month1 = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div"));
        WebElement month2 = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]/div"));
        WebElement nextbutton = driver.findElement(By.xpath("//span[contains(@class,' DayPicker-NavButton--next')]"));

        while(!(month1.getText().equals("December 2023") || month2.getText().equals("December 2023"))){
            nextbutton.click();
        }
        String monthAndYear = "December 2023";
        List<WebElement> dates  = driver.findElements(By.xpath("//div[text()='"+monthAndYear+"']/parent::div/following-sibling::div[2]//div[@class='DayPicker-Day']"));

        for(WebElement element : dates){
            if(element.getText().equals("16"))
            {
                System.out.println(element.getText());
                element.click();
                break;
            }
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
