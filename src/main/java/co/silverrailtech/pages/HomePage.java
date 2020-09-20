package co.silverrailtech.pages;

import co.silverrailtech.Utilty.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//li[@id='menu-item-5275']//a[@class='menu-item-link js-smooth-scroll'][contains(text(),'Contact Us')]")
    WebElement _contactUs;

    @FindBy(xpath = "//h2[@id='fancy-title-71']//span[contains(text(),'OUR OFFICES')]")
    WebElement _ourOffice;

    @FindBy(xpath = "")
    WebElement _UkOffice;


    public void clickOnContactUs() {
        waitUntilElementToBeClickable(_contactUs,10);
        Reporter.addStepLog("Clicking on contact us tab : " + _contactUs.toString() + "<br>");
        clickOnElement(_contactUs);
        log.info("Clicking on contact us tab : " + _contactUs.toString());
    }

    public void clickOnOurOffice() {
        Reporter.addStepLog("Clicking on our office tab : " + _ourOffice.toString() + "<br>");
        clickOnElement(_contactUs);
        log.info("Clicking on our office tab : " + _contactUs.toString());
    }


    public void verifyUnitedKingdomDisplayed(String unitedKingdam) {
        Reporter.addStepLog("verify text : " + unitedKingdam + "is displayed" + _UkOffice.toString() + "<br>");
        waitUntilPresenceOfElementLocated(By.xpath("//p[contains(text(),'United Kingdom')]"),30);
        verifyTextAssertMethod(_UkOffice, unitedKingdam);
        log.info("verify text : " + unitedKingdam + "is displayed" + _UkOffice.toString() + "<br>");
    }


}
