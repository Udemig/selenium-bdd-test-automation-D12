package Pages;

import Base.BaseLib;
import Base.BaseTest;
import Base.ElementParams;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseLib {

    private static WebDriver webDriver;
    ElementParams elementParams = new ElementParams();

    public static void setDriver(WebDriver driver){
        webDriver =  driver;
    }
    @When("Username doldur: {string}")
    public HomePage userNameDoldur(String text){
        webDriver.findElement(By.name("username")).sendKeys(text);
        return this;
    }

    @When("Parola alanını doldur: {string}")
    public HomePage passwordDoldur(String pass){
        webDriver.findElement(By.name("password")).sendKeys(pass);
        return this;
    }

    @When("Login buttonuna tıklanır")
    public HomePage login(){
        webDriver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(5) > input")).click();
        return this;
    }
    @When("{string} alanına tıklanır")
    public HomePage cssSelectorClick(String fieldName){
        webDriver.findElement(By.cssSelector(elementParams.paramsRead(fieldName))).click();
        return this;
    }

    @When("{string} alanına metin girisi saglanir: {string}")
    public HomePage idFillElement(String fieldName, String text){
        webDriver.findElement(By.id(elementParams.paramsRead(fieldName))).sendKeys(text);
        return this;
    }

    @Then("Error Kontrolu: {string}")
    public HomePage errorKontrolu(String text){
        String value =  webDriver.findElement(By.cssSelector("#rightPanel > p")).getText();
        Assert.assertEquals(text, value);
        Allure.addAttachment(text + ": erorr mesajı geldiği görüntülenmiştir.","");
        attachScreenshot(webDriver);
        return this;
    }

}
