package org.call;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\DropDown2\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement data = driver.findElement(By.id("selenium_commands"));
		Select s = new Select(data);
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()='accept']")).click();
		s.selectByVisibleText("Browser Commands");
		s.selectByIndex(1);
}}