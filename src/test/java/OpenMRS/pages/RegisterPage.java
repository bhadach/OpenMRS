package OpenMRS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "RegisterPatient")
    public WebElement registerPatientButton;

    @FindBy(css = "#next-button")
    public WebElement nextButton;

    @FindBy(name = "givenName")
    public WebElement givenName;

    @FindBy(name = "familyName")
    public WebElement familyName;

    @FindBy(id = "gender-field")
    public WebElement gender;

    @FindBy(xpath = "//input[@id='birthdateDay-field']")
    public WebElement birthDay;

    @FindBy(xpath = "//select[@id='birthdateMonth-field']")
    public WebElement birthMonth;

    @FindBy(xpath = "//input[@id='birthdateYear-field']")
    public WebElement birthYear;

    @FindBy(css = "#address1")
    public WebElement address;

    @FindBy(css = "#cityVillage")
    public WebElement city;

    @FindBy(css = "#stateProvince")
    public WebElement state;

    @FindBy(css = "#country")
    public WebElement country;

    @FindBy(css = "#postalCode")
    public WebElement postalCode;

    @FindBy(name = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(css = "#relationship_type")
    public WebElement relationShipType;

    @FindBy(xpath = "//input[@placeholder='Person Name']")
    public WebElement personName;

    @FindBy(css = "#submit")
    public WebElement confirmButton;


    public void clickRegisterPatient() {
        registerPatientButton.click();
    }

    public void patientName(String givenName, String familyName) throws InterruptedException {
        Thread.sleep(1000);
        this.givenName.sendKeys(givenName);
        this.familyName.sendKeys(familyName);
        nextButton.click();
    }

    public void selectGender(String gender) {

        this.gender.sendKeys(gender);

    }

    public void insertBirthDate(String birthDay, String birthMonth, String birthYear) {
        this.birthDay.sendKeys(birthDay);
        this.birthMonth.sendKeys(birthMonth);
        this.birthYear.sendKeys(birthYear);
    }

    public void insertPatientAddress(String address, String city, String state, String country, String postalCode) {
        this.address.sendKeys(address);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.country.sendKeys(country);
        this.postalCode.sendKeys(postalCode);

    }

    public void enterPatientPhoneNumber(String phoneNumber) {
        this.phoneNumber.sendKeys(phoneNumber);
    }

    public void selectRelationshipTypeAndName(String relationshipType, String personName) {

        this.relationShipType.sendKeys(relationshipType);
        this.personName.sendKeys(personName);
    }

    public void confirmPatientInfo() {
        confirmButton.click();
    }


}
