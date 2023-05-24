import com.codeborne.selenide.Condition;
import com.codeborne.selenide.*;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static com.codeborne.selenide.Selenide.*;

public class Test {

    @org.junit.Test
    public void logoTest() {
        open("https://pethouse.ua/ua/shop/koshkam/suhoi-korm/");
        $("#tpl-logo").click();
        assert WebDriverRunner.url().equals("https://pethouse.ua/ua/");
        screenshot("logo is working");


    }

    @org.junit.Test
    public void searchIsWorking() {
        open("https://pethouse.ua/ua/");
        $("#search").click();
        $("#search").setValue("їжа для собак").pressEnter();
        $("h1").shouldHave(Condition.text("Результати пошуку"));
        $("h1").shouldBe(Condition.visible);
    }

    @org.junit.Test
    public void languageSwitcherRu() {
        open("https://pethouse.ua/ua/");
        $(new By.ByXPath("//a[@href='https://pethouse.ua/ru/']")).click();
        $("li").shouldHave(Condition.text("Профиль"));
    }

    @org.junit.Test
    public void emptyBasket() {
        open("https://pethouse.ua/ua/");
        $(".icon-cart").click();
        $(new By.ByXPath("//img[@src='/assets/templates/zoog2/images/cat-basket.png']")).shouldBe(Condition.visible);
    }


    @org.junit.Test
    public void profileAuthorizationPopUpWindow() {
        open("https://pethouse.ua/ua/");
        $(new By.ByXPath("//li[@class='header-profile']")).click();
        $("#auth-new-block").shouldBe(Condition.visible);
    }

    @org.junit.Test
    public void contactsPopUpWindow() {
        open("https://pethouse.ua/ua/");
        $(new By.ByXPath("//li[@class='header-contacts']")).click();
        $(".vex-content").shouldBe(Condition.visible);
    }

    @org.junit.Test
    public void checkPaymentandDevilery() {
        open("https://pethouse.ua/ua/");
        $(".ph-header-phone").click();
        $("h1").shouldHave(Condition.text("Оплата та доставка"));
        $("h1").shouldBe(Condition.visible);
    }

    @org.junit.Test
    public void checkDiscountProgram() {
        open("https://pethouse.ua/ua/");
        $(new By.ByXPath("//a[contains(@href, 'club/')]")).click();
        $("h1").shouldHave(Condition.text("Клуб Постійних Покупців"));
        $("h1").shouldBe(Condition.visible);
    }

    @org.junit.Test
    public void allOffersOnSale() {
        open("https://pethouse.ua/ua/");
        $(".main-header-link").click();
        assert WebDriverRunner.url().equals("https://pethouse.ua/ua/superoffers/");

    }

    @org.junit.Test
    public void novelty() {
        open("https://pethouse.ua/ua/");
        $(new By.ByXPath("//a[@href='novetly/']")).click();
        assert WebDriverRunner.url().equals("https://pethouse.ua/ua/novetly/");
    }

    @org.junit.Test
    public void testimonials() {
        open("https://pethouse.ua/ua/");
        $(new By.ByXPath("//a[@href='testimonials/']")).click();
        assert WebDriverRunner.url().equals("https://pethouse.ua/ua/testimonials/");
    }

    @org.junit.Test
    public void video() {
        open("https://pethouse.ua/ua/");
        $(new By.ByXPath("//a[@href='video/']")).click();
        assert WebDriverRunner.url().equals("https://pethouse.ua/ua/video/");
    }

    @org.junit.Test
    public void brand() {
        open("https://pethouse.ua/ua/");
        $(new By.ByXPath("//a[@href='brand/']")).click();
        assert WebDriverRunner.url().equals("https://pethouse.ua/ua/brand/");
    }

    @org.junit.Test
    public void playMarketUserReview() {
        open("https://pethouse.ua/ua/");
        $("#gcr-logo").click();
        assert WebDriverRunner.url().equals("https://customerreviews.google.com/v/merchant?q=pethouse.ua&c=UA&v=19&hl=uk");
    }

    @org.junit.Test
    public void footerFacebookLink() {
        open("https://pethouse.ua/ua/");
        $(new By.ByXPath("//img[@alt='facebook']")).click();
        assert WebDriverRunner.url().contains("pethouse");
    }

    @org.junit.Test
    public void footerYoutubeLink() {
        open("https://pethouse.ua/ua/");
        $(new By.ByXPath("//img[@alt='youtube']")).click();
        assert WebDriverRunner.url().contains("pethouse");
    }

    @org.junit.Test
    public void footerInstaLink() {
        open("https://pethouse.ua/ua/");
        $(new By.ByXPath("//img[@alt='instagram']")).click();
        assert WebDriverRunner.url().contains("pethouse");
    }

}