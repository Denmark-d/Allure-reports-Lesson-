package ru.Denmark.Allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {
    @Test
    public void testIssueSearch() {

        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.");

        $(".header-search-input").click();
        $(".header-search-input").sendKeys("eroshenkoam/allure-example");
        $(".header-search-input").submit();

        $(linkText("eroshenkoam/allure-example")).click();
        $(partialLinkText("Issues")).click();
        $(withText("#68")).should(Condition.visible);

    }

    @Test
    public void testIssueSearchDenmark() {

        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com");

        $(".header-search-input").click();
        $(".header-search-input").sendKeys("denmark-d/allure");
        $(".header-search-input").submit();

        $(linkText("Denmark-d/Allure-reports-Lesson-")).click();
        $(partialLinkText("Issues")).click();
        $(withText("#1")).should(Condition.visible);

    }
}