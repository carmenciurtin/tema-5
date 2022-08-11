package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableTag {
    public static void main(String[] args){

        testWebTableTag();
    }
    public static void testWebTableTag(){
        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/tag/table.html");

        WebElement title = driver.findElement(By.tagName("h1"));
        System.out.println(title.getText());

        WebElement text1 = driver.findElement(By.cssSelector("table#mytable caption"));
        System.out.println(text1.getText());
        System.out.println("");

        List<WebElement> tabelRows =  driver.findElements(By.cssSelector("table#mytable tr"));
        WebElement row1 = tabelRows.get(0);
        List<WebElement> row1colums = row1.findElements(By.cssSelector("th"));
        System.out.println(row1colums.get(0).getText());
        System.out.println(row1colums.get(1).getText());
        System.out.println("");

        WebElement row2 = tabelRows.get(1);
        List<WebElement> row2colums = row2.findElements(By.cssSelector("td"));
        System.out.println(row2colums.get(0).getText());
        System.out.println(row2colums.get(1).getText());
        System.out.println("");

        WebElement row3 = tabelRows.get(2);
        List<WebElement> row3colums = row3.findElements(By.cssSelector("td"));
        System.out.println(row3colums.get(0).getText());
        System.out.println(row3colums.get(1).getText());
        System.out.println("");

        WebElement row4 = tabelRows.get(3);
        List<WebElement> row4colums = row4.findElements(By.cssSelector("td"));
        System.out.println(row4colums.get(0).getText());
        System.out.println(row4colums.get(1).getText());
        System.out.println("");

        WebElement row5 = tabelRows.get(4);
        List<WebElement> row5colums = row5.findElements(By.cssSelector("td"));
        System.out.println(row5colums.get(0).getText());
        System.out.println(row5colums.get(1).getText());
        System.out.println("");

        driver.quit();
    }
}

