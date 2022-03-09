/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sel.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Tiff's PC
 */
public class SampleTest {
    
    public SampleTest() {
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
    public void testSample(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //Navigate to ibm.com
        driver.get("http://www.ibm.com");
        driver.get("https://www.google.com/");
        //driver.findElement(By.name("q")).click();
        //driver.findElement(By.name("q")).clear();
        //driver.findElement(By.name("q")).sendKeys("selenium jobs");
        //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("About")) .click();
    }
}  

 