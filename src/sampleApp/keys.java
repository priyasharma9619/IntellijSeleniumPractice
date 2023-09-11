package sampleApp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import static sampleApp.HelloWorld.setChromeDriver;

public class keys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = setChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/flights/");
        Actions act = new Actions(driver);
        Thread.sleep(2000);
        System.out.println("1");
        act.sendKeys(Keys.CONTROL + "t");
        System.out.println("2");
//        act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
//        ac.keyDown(Keys.CONTROL).keyDown("t").build().perform();
        //mycomment added

    }
}
