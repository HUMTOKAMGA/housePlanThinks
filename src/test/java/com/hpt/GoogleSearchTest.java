package com.hpt;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void googleTest() {
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.clear();
		
		searchBox.sendKeys("Michael Jackson");
		
		searchBox.submit();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		assertEquals("Michael Jackson - Recherche Google", driver.getTitle());
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
