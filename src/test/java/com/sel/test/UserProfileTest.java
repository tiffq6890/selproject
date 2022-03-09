/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sel.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Tiff's PC
 */
public class UserProfileTest {
    
    public UserProfileTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testProfile(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("http://nlilaramani.github.io");
    driver.findElement(By.partialLinkText("User Registration")).click();
    driver.findElement(By.id("fname")).clear();
    driver.findElement(By.id("fname")).sendKeys("Robert");
    driver.findElement(By.name("lname")).sendKeys("Daley");
    driver.findElement(By.id("username")).sendKeys("Rob");
    driver.findElement(By.className("pwd")).sendKeys("testpwd");
    driver.findElements(By.name("g")).get(0).click();
    driver.findElement(By.tagName("select")).sendKeys("Bachelors");
    WebElement e=driver.findElement(By.tagName("select"));
    Select s=new Select(e);
    s.selectByIndex(1);
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    driver.findElement(By.xpath("//input[1]")).sendKeys("Name with xpath");
    
    }
   
    @Test
    public void testAlert() throws InterruptedException{
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://nlilaramani.github.io/frame.html");
    driver.findElement(By.tagName("button")).click();
    Thread.sleep(5000);
    driver.switchTo().alert().dismiss();
    
    }
    
    @Test 
    public void testTabs(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   
    String h1=driver.getWindowHandle();
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("http://www.google.com");
    String h2=driver.getWindowHandle();
    driver.switchTo().newWindow(WindowType.WINDOW);
    driver.get("http://www.ibm.com");
    String h3=driver.getWindowHandle();
    driver.switchTo().window(h1);
    driver.get("http://www.microsoft.com");
    driver.switchTo().window(h2);
    driver.findElement(By.name("q")).sendKeys("Selenium jobs");
    driver.close();
    driver.quit();
    
    }
}
