package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@SuppressWarnings("SynchronizationOnLocalVariableOrMethodParameter")
public class Main {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","D://Selenium//drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.out.println("Padidino langą.");
            driver.get("https://ibpsapptest.vrm.lt/it-app/loginDev/IT_ISTAIGOS_VADOVAS/IT_PROKURORAS/IT_TEISEJAS/IT_KONTROLE/IBPS_ADMINISTRAVIMAS/IBPS_ATASKAITOS/ISTAIGU_TVARKYMAS/TESTINIS_FUNKCIONALUMAS/EPP_FUNKCIJOS/P0009945");
            System.out.println("Atidarė IBPS.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_1907\"]")))).click();
            System.out.println("Paspaudė [Registruoti] mygtuką.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_249-real\"]")))).sendKeys("Tarnybinis pranešimas");
            System.out.println("Pagrindo paieškos lauke įrašė Tarnybinis pranešimas.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_606\"]")))).click();
            System.out.println("Paspaudė ant Tarnybinis pranešimas.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_878\"]")))).click();
            System.out.println("Paspaudė [Pasirašyti] mygtuką.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_1497\"]")))).click();
            System.out.println("Patvirtino pasirašymą.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_3004\"]")))).click();
            System.out.println("Paspaudė [Grįžti] mygtuką.");
            synchronized (driver){driver.wait(2000);}
            System.out.println("2 s. palaukimas.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_427\"]")))).sendKeys("Selenium AutoTest");
            System.out.println("Įrašė veiklos aprašymą.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_441-real\"]")))).sendKeys("2022-02-07");
            System.out.println("Įrašė datą nuo.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_510-cnt\"]")))).click();
            System.out.println("Atidarė BK pasirinmimo langą.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_10425-real\"]")))).click();
            System.out.println("Pasirinko 99 str.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_818\"]")))).click();
            System.out.println("Paspaudė [Pasirinkti] mygtuką.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_416\"]")))).click();
            System.out.println("Paspaudė [Kurti PRĮR įvykį] mygtuką.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_281-chdex\"]")))).click();
            System.out.println("Paspaudė [Išsaugoti] mygtuką.");
            synchronized (driver){driver.wait(2000);}
            System.out.println("2 s. palaukimas.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_215\"]")))).click();
            System.out.println("Paspaudė [Sprendimas dėl IT] mygtuką.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_423-real\"]")))).sendKeys("IT");
            System.out.println("Veiksmo paieškoje įrašė IT.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_1537\"]")))).click();
            System.out.println("Paspaudė ant IT pradėjimas.");
            new WebDriverWait(driver, Duration.ofSeconds(10)).until((ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"zk_comp_500\"]")))).click();
            System.out.println("Paspaudė [Patvirtinti] mygtuką.");
            System.out.println("Pradėjo IT.");

    }
}
