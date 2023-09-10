package sampleApp;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class HelloWorld {

    public static WebDriver setChromeDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\priya.sharma\\Downloads\\chromedriver.exe");
        return new ChromeDriver();
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = setChromeDriver();
        driver.get("https://htmlcolorcodes.com/");
        driver.manage().window().maximize();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,new File("D:\\test.png"));
        driver.switchTo().newWindow(WindowType.TAB); //open a new tab
//        driver.switchTo().newWindow(WindowType.WINDOW); //open new window
//        ((JavascriptExecutor) driver).executeScript("window.open()");
        Thread.sleep(5000);
        driver.quit();

    }
}
