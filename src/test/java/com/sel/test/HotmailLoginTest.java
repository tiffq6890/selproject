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
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.devtools.v85.log.Log.clear;

/**
 *
 * @author Tiff's PC
 */
public class HotmailLoginTest {
    
    public HotmailLoginTest() {
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
    public void testLogin() throws InterruptedException{
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("http://www.hotmail.com");
    driver.findElement(By.partialLinkText("Sign in")).click();
    driver.findElement(By.id("i0116")).clear();
    driver.findElement(By.id("i0116")).sendKeys("SelSample@hotmail.com");
    driver.findElement(By.id("idSIButton9")).click();
    //driver.wait(10000);
    Thread.sleep(10000);
    //driver.findElement(By.name("passwd")).clear();
    driver.findElement(By.name("passwd")).sendKeys("Sel@123!");
    driver.findElement(By.name("passwd")).submit();
    
    }
}
