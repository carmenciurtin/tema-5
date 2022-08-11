package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTestPages {

    public static void main(String[] args){
        testWebTestPages();
    }
    public static void testWebTestPages(){
        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement title = driver.findElement(By.tagName("h1"));
        System.out.println(title.getText());

        WebElement text = driver.findElement(By.tagName("h2"));
        System.out.println(text.getText());

        WebElement text1 = driver.findElement(By.cssSelector("p.inline-explanation"));
        System.out.println(text1.getText());

        WebElement text2 = driver.findElement(By.cssSelector("a#basicpagetest"));
        System.out.println(text2.getText());
        text2.click();

        WebElement text3 = driver.findElement(By.cssSelector("a#elementattributestest"));
        System.out.println(text3.getText());
        text3.click();

        WebElement text4 = driver.findElement(By.cssSelector("a#findbytest"));
        System.out.println(text4.getText());
        text4.click();

        //WebElement text5 = driver.findElement(By.cssSelector("#HTML Tag Examples"));
        //System.out.println(text5.getText());

        WebElement text6 = driver.findElement(By.cssSelector("a#tablestest"));
        System.out.println(text6.getText());
        text6.click();

        //driver.quit();
    }
}
