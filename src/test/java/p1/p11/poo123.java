package p1.p11;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class poo123 {

	
	@FindBy(how=How.NAME,using="userName")
	public static WebElement uname;
	
	@FindBy(how=How.NAME,using="password")
	public static WebElement password;
	
	@FindBy(how=How.NAME,using="login")
	public static WebElement Login_button;
	
}
