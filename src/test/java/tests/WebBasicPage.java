package tests;

import driver.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;


public class WebBasicPage {

    public static void main(String[] args) throws MalformedURLException {

        testWebBasicPage();
    }
    public static void testWebBasicPage() throws MalformedURLException {
        RemoteWebDriver driver = WebDriverConfig.getRemoteChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");

        WebElement title = driver.findElement(By.tagName("h1"));
        System.out.println(title.getText());

        WebElement text1 = driver.findElement(By.cssSelector("#para1"));
        System.out.println(text1.getText());

        WebElement text2 = driver.findElement(By.cssSelector("#para2"));
        System.out.println(text2.getText());

        driver.quit();
    }
}

