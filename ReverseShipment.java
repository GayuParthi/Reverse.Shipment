package eShipslogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReverseShipment {
	@Test
	public void createShipmentReverse() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://qa-eshipz.herokuapp.com/");
		driver.findElement(By.id("email")).sendKeys("automation@eshipz.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("login-submit")).click();
		if(driver.getTitle().contains("eShipz")) {
			System.out.println("My HomePage is displayed..");
		}else {
			System.out.println("HomePage is not displayed..");	
		}

		WebElement createShipment = driver.findElement(By.xpath("(//a[contains(text(),'Create Shipment')])"));
		Actions builder = new Actions(driver);
		builder.moveToElement(createShipment).perform();
		driver.findElement(By.xpath("//a[@title='Quick Shipment Creation - Reverse']")).click();
		WebElement shipperAddress = driver.findElement(By.xpath("//select[@ng-init='defaultWarehouse']"));
		Select obj = new Select(shipperAddress);
		obj.selectByIndex(0);
		WebElement receiverAddress = driver.findElement(By.xpath("//select[@ng-model='order.shipment.reciever_address_id']"));
		Select obj1 = new Select(receiverAddress);
		obj1.selectByIndex(1);
		driver.findElement(By.xpath("//label[@for='rto-address-0']")).click();
		WebElement RTOaddress = driver.findElement(By.xpath("//select[@ng-init='defaultRto']"));
		Select obj2 = new Select(RTOaddress);
		obj2.selectByIndex(1);
		WebElement senderName = driver.findElement(By.id("sender_name"));
		senderName.clear();
		senderName.sendKeys("Abinaya");
		WebElement cmpName = driver.findElement(By.xpath("//input[@id='company_name']"));
		cmpName.clear();
		cmpName.sendKeys("e-Ships");
		WebElement address1 = driver.findElement(By.id("sender_street1"));
		address1.clear();
		address1.sendKeys("Address Line 1");
		WebElement address2 = driver.findElement(By.id("sender_street2"));
		address2.clear();
		address2.sendKeys("Address Line 2");
		WebElement address3 = driver.findElement(By.id("sender_street3"));
		address3.clear();
		address3.sendKeys("Address Line 3");
		WebElement senderCity = driver.findElement(By.id("sender_city"));
		senderCity.clear();
		senderCity.sendKeys("Chennai");
		WebElement country = driver.findElement(By.xpath("//select[@ng-change='sendercountrySelect(order.shipment.sender_country,order)']"));
		Select obj3 = new Select(country);
		obj3.selectByVisibleText("India");
		WebElement state = driver.findElement(By.xpath("//input[contains(@class,'form-control ng-pristine')]"));
		state.clear();
		state.sendKeys("Tamil Nadu");
		WebElement pinCode = driver.findElement(By.id("sender_pincode"));
		pinCode.clear();
		pinCode.sendKeys("560001");
		WebElement phnNumber = driver.findElement(By.id("sender_phone"));
		phnNumber.clear();
		phnNumber.sendKeys("8888888888");
		WebElement senderEmail = driver.findElement(By.id("sender_email"));
		senderEmail.clear();
		senderEmail.sendKeys("gayu@gmail.com");
		WebElement addressType = driver.findElement(By.xpath("//select[@ng-change='CompanyReq(order.shipment.sender_type, false)']"));
		Select obj4 = new Select(addressType);
		obj4.selectByIndex(0);
		WebElement receiverName = driver.findElement(By.id("receiver_name"));
		receiverName.clear();
		receiverName.sendKeys("Ravi");
		WebElement receivercmpName = driver.findElement(By.xpath("(//input[@id='company_name'])[2]"));
		receivercmpName.clear();
		receivercmpName.sendKeys("E-Couriers");
		WebElement receiverStreet = driver.findElement(By.id("receiver_street1"));
		receiverStreet.clear();
		receiverStreet.sendKeys("address line 123");
		WebElement receiverCity = driver.findElement(By.id("receiver_city"));
		receiverCity.clear();
		receiverCity.sendKeys("Bangalore");
		WebElement receiverCountry = driver.findElement(By.xpath("//select[@ng-change='countrySelect(order.shipment.country,order)']"));
		Select obj5 = new Select(receiverCountry);
		obj5.selectByVisibleText("India");
		driver.findElement(By.xpath("(//input[@placeholder='Enter State name'])[2]")).sendKeys("KA");
		WebElement receiverPincode = driver.findElement(By.id("receiver_pincode"));
		receiverPincode.clear();
		receiverPincode.sendKeys("400001");
		WebElement receiverPhnNumb = driver.findElement(By.id("receiver_phone"));
		receiverPhnNumb.clear();
		receiverPhnNumb.sendKeys("4444444444");
		driver.findElement(By.xpath("(//input[@id='sender_name'])[2]")).sendKeys("Sudheera");
		driver.findElement(By.xpath("(//input[@id='sender_street1'])[2]")).sendKeys("Address Line 3");
		driver.findElement(By.xpath("(//input[@id='sender_city'])[2]")).sendKeys("Bombay");
		WebElement RTOCountryCode = driver.findElement(By.xpath("//select[@ng-change='RtocountrySelect(order.shipment.return_to_country,order)']"));
		Select obj6 = new Select(RTOCountryCode);
		obj6.selectByVisibleText("India");
		driver.findElement(By.xpath("(//label[text()='Country'])[3]/following::input")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("(//input[@id='sender_pincode'])[2]")).sendKeys("411044");
		WebElement senderPhnnumber = driver.findElement(By.xpath("(//input[@id='sender_phone'])[2]"));
		senderPhnnumber.clear();
		senderPhnnumber.sendKeys("2222222222");
		driver.findElement(By.xpath("(//input[@id='sender_email'])[2]")).sendKeys("abcd@gmail.com");
		WebElement RTOAddressType = driver.findElement(By.xpath("//select[@ng-model='order.shipment.return_to.type']"));
		Select obj7 = new Select(RTOAddressType);
		obj7.selectByIndex(1);	
		driver.findElement(By.id("customer_ref")).sendKeys("2457548");
		WebElement shipmentType = driver.findElement(By.xpath("//select[@ng-change='updateShipmentType(order)']"));
		Select obj8 = new Select(shipmentType);
		obj8.selectByIndex(1);
		WebElement courierPurpose = driver.findElement(By.xpath("//select[@data-ng-options='x for x in courier_purpose']"));
		Select obj9 = new Select(courierPurpose);
		obj9.selectByIndex(1);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement courierService = driver.findElement(By.xpath("//select[@ng-model='selectedService']"));
		courierService.click();
		Select obj10 = new Select(courierService);
		obj10.selectByIndex(1);
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		//driver.findElement(By.xpath("//i[text()='exit_to_app']")).click();
	}

}
