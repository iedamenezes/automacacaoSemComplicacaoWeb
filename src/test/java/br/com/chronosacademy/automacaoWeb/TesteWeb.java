package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;

import static org.junit.Assert.assertEquals;

public class TesteWeb {

    WebDriver driver;

    @Before
    public void InicializaTeste() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br/");
    }

    @Test
    public void primeiroTeste() {

        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        WebElement txttitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txttitulo.getText();
        assertEquals("Porque Tempo É Conhecimento", titulo);



    }
    @Test
    public void segundoTeste() {

        String xpathBotao = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[2]/div/div/a";
        WebElement btntitulo = driver.findElement(By.xpath(xpathBotao));

        btntitulo.click();


    }

  @After
    public void finalizarTeste() {
        driver.quit();
}
}
