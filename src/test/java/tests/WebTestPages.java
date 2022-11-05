package tests;

import driver.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class WebTestPages {

    public static void main(String[] args) throws MalformedURLException {

        testWebTestPages();
    }
    public static void testWebTestPages() throws MalformedURLException {
        RemoteWebDriver driver = WebDriverConfig.getRemoteChromeDriver();
        driver.get("https://demoqa.com/elements");

        WebElement title = driver.findElement(By.cssSelector(".main-header"));
        System.out.println(title.getText());

        //WebElement text = driver.findElement(By.tagName("h2"));
        //System.out.println(text.getText());
        //text.click();

        //driver.quit();
    }
}
