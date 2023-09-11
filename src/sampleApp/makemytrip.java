package sampleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class makemytrip {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = HelloWorld.setChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/flights/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Login or Create Account']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("priya@gmail.com");
        driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-Bz112c']")).click();
        Thread.sleep(2000);
        String phandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for(String h: handles){
            if(!h.equals(phandle)) {
                driver.switchTo().window(h);
                driver.findElement(By.xpath("//input[@type='email']")).sendKeys("swasti9619@gmail.com");
            }
            driver.close();
            }


        driver.findElement(By.xpath("//div[text()='Confirm']")).click();

    }
}
