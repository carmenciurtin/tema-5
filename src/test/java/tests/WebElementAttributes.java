package tests;

import driver.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class WebElementAttributes {
    public static void main(String[] args) throws MalformedURLException {

        testWebElementAttributes();
    }
    public static void testWebElementAttributes() throws MalformedURLException {
        RemoteWebDriver driver = WebDriverConfig.getRemoteChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");

        WebElement title = driver.findElement(By.tagName("h1"));
        System.out.println(title.getText());

        WebElement title1 = driver.findElement(By.cssSelector("h2"));
        System.out.println(title1.getText());

        WebElement text1 = driver.findElement(By.id("domattributes"));
        System.out.println(text1.getText());

        WebElement title2 = driver.findElement(By.cssSelector("h2"));
        System.out.println(title2.getText());

        WebElement text2 = driver.findElement(By.id("jsattributes"));
        System.out.println(text2.getText());

        WebElement button = driver.findElement(By.cssSelector("div.centered button"));
        button.click();


        driver.quit();
    }
}
