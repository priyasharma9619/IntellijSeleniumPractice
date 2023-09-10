package sampleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static sampleApp.HelloWorld.*;

public class windowHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = setChromeDriver();

// ---------------------getcssvalue,getattribute,selenium color class[string to hexadecimal conversion]--------------------------------
// ----------------------------------------------------------------------------------------------------------------------------------------------
//        driver.get("https://htmlcolorcodes.com/");
//        WebElement colorcode = driver.findElement(By.xpath("(//table[@class=\"color-table\"])[1]//tr[1]//td[contains(@class,\"cell--hex\")]"));
//        String actualcolor = colorcode.getText().toLowerCase();
//        WebElement colorcode1 = driver.findElement(By.xpath("(//table[@class=\"color-table\"])[1]//tr[1]//div[contains(@class,\"js-color\")]"));
//        String expectedColor = colorcode1.getCssValue("background-color");
//        String hexacolor = Color.fromString(expectedColor).asHex().toLowerCase();
//        System.out.println("actual: "+actualcolor+" expected: "+hexacolor);
//        Assert.assertEquals(actualcolor,hexacolor,"not matched");
//----------------------------------------------------------------------------------------

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("newTabBtn")).click();
        String handle = driver.getWindowHandle();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Set<String> handles =  driver.getWindowHandles();
        for(String windowHandle : handles ){
            if(!windowHandle.equals(handle)){
                driver.switchTo().window(windowHandle);
                System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());
                driver.close();
                Thread.sleep(2000);
            }
        }
        driver.switchTo().window(handle);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("helloworld");
        driver.quit();

    }
}
