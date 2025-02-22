package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Elements;

public class NaukriPage {
	public NaukriPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	protected WebDriver driver;

	private static By naukriLoginBtn = By.id("login_Layer");
	private static By userNameFld = By.xpath("//input[@placeholder='Enter your active Email ID / Username']");
	private static By passwordFld = By.xpath("//input[@placeholder='Enter your password']");
	private static By loginText = By.xpath("//div[text()='Login']");
	private static By signWithGoogle = By.xpath("//span[text()='Sign in with Google']");
	private static By loginBtn = By.xpath("//button[text()='Login']");
	private static By completProfileBtn = By.xpath("//a[text()='Complete']");
	private static By headLineBtn = By.xpath("(//span[text()='editOneTheme'])[1]");
	private static By resumeHeadLineFld = By.id("resumeHeadlineTxt");
	private static By saveBtn = By.xpath("//button[text()='Save']");

	public String headLine = "Senior Automation Test Engineer | 7+ Yrs Exp | Selenium WebDriver | Java | Cucumber BDD | API & UI Testing | Agile | GitHub Actions";
	public String dummyText = "Selenium Automation Engineer Selenium Automation Engineer";

	public void loginToNaukri(String userName, String password) {
		Elements.doClick(driver, naukriLoginBtn);
		Elements.doClick(driver, userNameFld);
		Elements.doSendKeys(driver, userNameFld, userName);
		Elements.doSendKeys(driver, passwordFld, password);
		Elements.doClick(driver, loginBtn);
	}

	public void updateNaukriProfile(String dummytext,String resumeHeadLine) throws InterruptedException {
		Elements.doClick(driver, completProfileBtn);
		Elements.doClick(driver, headLineBtn);
		driver.findElement(resumeHeadLineFld).clear();
		Elements.doClick(driver, resumeHeadLineFld);
		Elements.doSendKeys(driver, resumeHeadLineFld, dummytext);
		Elements.doClick(driver, saveBtn);
		Thread.sleep(2000);
		Elements.doClick(driver, headLineBtn);
		driver.findElement(resumeHeadLineFld).clear();
		//Elements.doClick(driver, resumeHeadLineFld);
		Elements.doSendKeys(driver, resumeHeadLineFld, resumeHeadLine);
		Elements.doClick(driver, saveBtn);
		
		
	}

}
