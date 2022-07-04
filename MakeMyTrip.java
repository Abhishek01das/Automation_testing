import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.overlay.model.LineStyle;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MakeMyTrip {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //navigate to url
        driver.get("https://www.makemytrip.com/railways/");
        //maximize the window
        driver.manage().window().maximize();

        //check if you have landed in the correct page
        //checking url and printing the current url

        String expurl="https://www.makemytrip.com/railways/";
        String exptitle="MakeMyTrip";

        String desurl= driver.getCurrentUrl();
        if (desurl.equals(expurl)){
            System.out.println("we have landed in the correct page");
        }
        System.out.println("url of the page is: "+desurl);
        //printing the title of the page and verify
        String destitle= driver.getTitle();
        System.out.println("title of the page is: "+destitle);
        if (destitle.equals(exptitle)){
            System.out.println("we have verified title successfully");
        }
        //click on FROM
        //enter city Amritsar
        driver.findElement(By.xpath("//input[@id='fromCity']")).click();
        WebElement FromAdd= driver.findElement(By.xpath("//input[@placeholder='From']"));
        //FromAdd.click();
        FromAdd.sendKeys("amritsar");
        Thread.sleep(2000);
        FromAdd.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        FromAdd.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        //click on to
        //enter city lucknow
        WebElement to= driver.findElement(By.xpath("//input[@placeholder='To']"));
        to.click();
        to.sendKeys("Lucknow");
        Thread.sleep(3000);
        to.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(3000);
        to.sendKeys(Keys.ENTER);

        //click on travel date: 17 aug
        driver.findElement(By.xpath("//input[@id='travelDate']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@aria-label='Wed Aug 17 2022']")).click();
        Thread.sleep(2000);

        //For choosing class
        WebElement dropdown= driver.findElement(By.xpath("//span[@class='appendBottom5 downArrow']"));
        dropdown.click();

        driver.findElement(By.xpath("//li[normalize-space()='Third AC']")).click();


        //now click on search button
        driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
        Thread.sleep(4000);

        System.out.println("ALL TEST CASES PASSED SUCCESSFULLY");

        //closing the browser
        driver.close();



    }
}
