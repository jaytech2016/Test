package Class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagefactoring {
@FindBy(xpath = "//*[@name = 'email_address']")
private WebElement email;

@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
private WebElement account;

@FindBy(xpath = "//*[@id=\"ap_email\"]")
private WebElement username;





















}
