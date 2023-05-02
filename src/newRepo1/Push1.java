package newRepo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Push1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		int rv = driver.manage().window().getPosition().getX();
		System.out.println(rv);

		int rv1 = driver.manage().window().getPosition().getY();
		System.out.println(rv1);
		
		org.openqa.selenium.Point p=new org.openqa.selenium.Point(rv1*2,rv*2);
		driver.manage().window().setPosition(p);
		System.out.println(p);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
	}

}
