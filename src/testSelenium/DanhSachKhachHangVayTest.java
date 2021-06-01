package testSelenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Model.Customer_Loan;

public class DanhSachKhachHangVayTest {

WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/dong99/Downloads/chromedriver");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/SQA_QLNH/listKHV");
		
	}
	@After
	public void tearDown() {
		driver.close();
	}
	
	@Test 
	public void TestSearchChuanSoHopDong() {
		WebElement txtSearchTen= driver.findElement(By.id("searchinput"));
		txtSearchTen.sendKeys("NHD123");
		driver.findElement(By.id("searchbutton")).click();
		String expected_url="http://localhost:8080/SQA_QLNH/searchKHV?key=NHD123";
		String result_url=driver.getCurrentUrl();
		assertEquals(expected_url, result_url);
	}
	
	@Test 
	public void TestSearchSaiSoHopDong() {
		WebElement txtSearchTen= driver.findElement(By.id("searchinput"));
		txtSearchTen.sendKeys("NHD234");
		driver.findElement(By.id("searchbutton")).click();
		String expected_url="http://localhost:8080/SQA_QLNH/searchKHV?key=NHD234";
		String result_url=driver.getCurrentUrl();
		assertEquals(expected_url, result_url);
	}
	
	@Test 
	public void TestSearchGanDungSoHopDong() {
		WebElement txtSearchTen= driver.findElement(By.id("searchinput"));
		txtSearchTen.sendKeys("NHD12");
		driver.findElement(By.id("searchbutton")).click();
		String expected_url="http://localhost:8080/SQA_QLNH/searchKHV?key=NHD123";
		String result_url=driver.getCurrentUrl();
		assertEquals(expected_url, result_url);
	}
	
	@Test 
	public void TestDetailChuan() {
		Customer_Loan customer_Loan = new Customer_Loan();
		driver.findElement(By.id("detailKHV")).click();
		String expected_url="http://localhost:8080/SQA_QLNH/chitietKHV?id=1";
		String result_url=driver.getCurrentUrl();
		assertEquals(expected_url, result_url);
	}

}
