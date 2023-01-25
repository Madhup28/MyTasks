package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6Tasks {

	public static void main(String[] args) {
		try
		{

		// CHROME
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manoj\\eclipse-workspace\\Day2Task\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a = new Actions(driver);
		Robot r = new Robot();
		
		// QUESTION 1
		
		driver.get("https://www.facebook.com/");

		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_SHIFT);

		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);

		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);

		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);

		r.keyPress(KeyEvent.VK_U);
		r.keyRelease(KeyEvent.VK_U);

        // Ctrl + A - Select All
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
        
        // Ctrl + X - Cut
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

        // Ctrl + V - Paste
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		// QUESTION 2

		driver.get("https://www.google.co.in/webhp");
 
		// Enter Text
		WebElement txtSearch = driver.findElement(By.name("q"));
		txtSearch.sendKeys("VelMurugan");

		// Perform Double Click
		for (int i = 0; i < 4; i++) {
			a.doubleClick(txtSearch).perform();
		}
		a.moveToElement(txtSearch).perform();
        // Cut
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		// QUESTION 3

		driver.get("https://greenstech.in/selenium-course-content.html");

		// Click Interview Questions
		WebElement txtInterview = driver.findElement(By.xpath("//div[@id = 'heading20']"));
		txtInterview.click();
		Thread.sleep(1000);
		
		// Right Click CTS Interviuew Questions
		WebElement txtCts = driver.findElement(By.xpath("//a[contains(text(),'CTS Interview Question ')]"));
		a.contextClick(txtCts).perform();

		// New Window
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		
		
		// QUESTION 4
		
		driver.get("https://greenstech.in/selenium-course-content.html");

		// Right Click Framework Test Papers
		WebElement txtInterviewGreens = driver.findElement(By.xpath("//div[@id = 'heading304']"));
		a.contextClick(txtInterviewGreens).perform();

		// Select Inspect
		for (int i = 0; i < 10; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		// QUESTION 5
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		// Click Model Resumes
		WebElement lblmdl = driver.findElement(By.xpath("//div[@id='heading201']"));
		lblmdl.click();
		
		// Scroll to Resume Model 4 
		WebElement lnkresume = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", lnkresume);	
		Thread.sleep(1000);
		
		// Right Click Resume Model 4
		a.contextClick(lnkresume).perform();
		
		// Select Save As
		for (int i = 0; i < 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			}
	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		// QUESTION 6
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		// Right Click 
		WebElement lnkrpa = driver.findElement(By.xpath("//a[text()='RPA']"));
		a.contextClick(lnkrpa).perform();
		
		// Select Inspect 
		for (int i = 0; i < 6; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		// QUESTION 7
		driver.get("http://greenstech.in/selenium-course-content.html");
		// Click Selenium Test Papers
		WebElement lblsel = driver.findElement(By.xpath("//div[@id='heading303']"));
		lblsel.click();
		
		//  Right Click on Day 6 Tasks
		WebElement lnkday = driver.findElement(By.xpath("//a[text()=' DAY 6 TASK']"));
		a.contextClick(lnkday).perform();
		
		// Select Inspect
        for (int i = 0; i < 6; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		// QUESTION 8
		driver.get("https://www.flipkart.com/");
		
		// No need to click login , it opens by default
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_SHIFT);

		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);

		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);

		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);

		r.keyPress(KeyEvent.VK_U);
		r.keyRelease(KeyEvent.VK_U);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		// QUESTION 9
		
		driver.get("https://www.amazon.in");
		
		// Click Sign In
		WebElement btnLogin = driver.findElement(By.xpath("//span[text() ='Hello, sign in']"));
		btnLogin.click();
		
		// Enter mail id
		WebElement txtmnail = driver.findElement(By.id("ap_email"));
		txtmnail.sendKeys("abc@gmail.com");

		// Select All
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
			
		// Right Click mail
		a.contextClick(txtmnail).perform();
		
		// Cut
		for(int i =0;i<2;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		// QU0ESTION 10
		
		driver.get("https://www.snapdeal.com/");
					
		// Mouse over Product
		WebElement movertoy = driver.findElement(By.linkText("Toys, Kids' Fashion & more"));
		a.moveToElement(movertoy).perform();
		
		// Right Click Toys
		WebElement lnktoy = driver.findElement(By.xpath("//span[text()= 'Toy Cars']"));
		a.contextClick(lnktoy).perform();
		
		// Open in New Window
		for(int i =0;i<2;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		
		
		
		// QUESTION 11
		
		driver.get("https://www.flipkart.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Check Login is displayed
		if(driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']")).click();
		}
		
		// First Mouseover 
		WebElement lnkPdt = driver.findElement(By.xpath("//div[text() = 'Electronics']"));
		a.moveToElement(lnkPdt).perform();
		
		// Seconnd MouseOver
		WebElement lnkPdt1 = driver.findElement(By.xpath("//a[text() = 'Gaming']"));
		a.moveToElement(lnkPdt1).perform();
		Thread.sleep(2000);
		
		// Right Click Product
		WebElement lnkPdt2 = driver.findElement(By.xpath("//a[text() = 'Games']"));
		a.contextClick(lnkPdt2).perform();
		Thread.sleep(1000);
		
		// Click on Save As
		for(int i =0;i<4;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.quit();
		
	}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}

	}

}
