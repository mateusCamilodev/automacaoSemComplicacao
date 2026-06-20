package br.com.chronosacademy.AutomacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void incializaTeste() {
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");


        String xPathTitulo = "//div[2]/h2";
        WebElement xPathTxt = driver.findElement(By.xpath(xPathTitulo));
        String titulo = xPathTxt.getText();
        assertEquals("Que tal uma pesquisa para começar?", titulo);
    }

    @After
    public void tearDown() {
    driver.quit();
    driver.quit();
    }
}