package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open Chrome browser
		WebDriver driver = new ChromeDriver();

		//Maximizing the window 
		driver.manage().window().maximize();
		
		//Navigating the URL
		driver.get("https://jqueryui.com/datepicker/");

		//Using ImplicitlyWait for page to wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Using switchTo frame to locate the element
		driver.switchTo().frame(0);
		
		//For clicking the next
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.xpath("//a[@title='Next']")).click();

		//Picking the date 22
		driver.findElement(By.xpath("((//table)[1]//tr//a[text()='22'])")).click();
		
		//Getting the date using getAttribute
		WebElement datePick = driver.findElement(By.id("datepicker"));
		String date = datePick.getAttribute("value");
		
		//Printing the date
		System.out.println("\n\nNext Month Date -> " + date);

		//Quiting the driver
		//driver.quit();
		
}

		

	}


