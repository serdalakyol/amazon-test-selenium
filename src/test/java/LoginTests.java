import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTests {

        WebDriver driver;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


       @Test
        void AmazonLoginTests(){

           driver.get("https://www.amazon.com.tr/");
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15l));

            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".hm-icon-label")));
           driver.findElement(By.cssSelector(".hm-icon-label")).click();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//b[.='Merhaba, Giriş yapın']")));
           driver.findElement(By.xpath("//b[.='Merhaba, Giriş yapın']")).click();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ap_email")));
           driver.findElement(By.id("ap_email")).click();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ap_email")));
           driver.findElement(By.id("ap_email")).sendKeys("seleniumotomasyon@gmail.com");
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("continue")));
           driver.findElement(By.id("continue")).click();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ap_password")));
           driver.findElement(By.id("ap_password")).sendKeys("otomasyon-123");
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("signInSubmit")));
           driver.findElement(By.id("signInSubmit")).click();

           driver.findElement(By.id("twotabsearchtextbox")).click();

           driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple Watch 7");
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-search-submit-button")));
           driver.findElement(By.id("nav-search-submit-button")).click();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[alt='Sponsorlu Reklam - Apple Watch Series 7 [GPS + Cellular 45 mm] Akıllı Saat, Grafit Paslanmaz Çelik Kasa ve Gece Yarısı Spo...']")));
           driver.findElement(By.cssSelector("[alt='Sponsorlu Reklam - Apple Watch Series 7 [GPS + Cellular 45 mm] Akıllı Saat, Grafit Paslanmaz Çelik Kasa ve Gece Yarısı Spo...']")).click();
           wait.until(ExpectedConditions.presenceOfElementLocated(By.id("add-to-cart-button")));
           driver.findElement(By.id("add-to-cart-button")).click();
           driver.findElement(By.xpath("//span[@id='sw-gtc']//a[contains(.,'Sepete Git')]")).click();















        }
    @AfterEach
        void thearDown(){
        driver.close();
    }
}
