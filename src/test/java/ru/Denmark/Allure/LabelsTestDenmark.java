package ru.Denmark.Allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTestDenmark {

    @Test
    public void lambdaLabelsTestDenmark() {
        Allure.label("owner", "Adiyakova");
        Allure.feature("Issues");
        Allure.story("Создание Issue для авторизованного пользователя");
        Allure.label("severity", SeverityLevel.BLOCKER.value());
        Allure.link("GitHub", "https://github.com");
    }

    @Test
    @Owner("Adiyakova")
    @Feature("Issues")
    @Stories({
            @Story("Создание Issue для авторизованного пользователя"),
            @Story("Создание Issue со страницы репозитория")
    })
    @DisplayName("Создание Issue для авторизованного пользователя")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "GitHub", url = "https://github.com")
    public void annotatedLabelsTest() {
    }
}
