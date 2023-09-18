package ru.sberhealth.tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.sberhealth.pages.*;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@DisplayName("Смоук тесты")
public class SmokeTestsRemote extends BaseTestRemote {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    OnlineConsultationPage onlineConsultationPage = new OnlineConsultationPage();
    AnalysisPage analysisPage = new AnalysisPage();
    CartPage cartPage = new CartPage();
    String doctorSpec = "Гастроэнтеролог";


    @Test
    @Tag("remote")
    @DisplayName("Открытие формы логина")
    void loginFormOpenCheck() {

        step ("Открываем главную страницу и переходим в ЛК", () -> {
            mainPage.openMainPage().clickLoginButton();
        });
        step ("Проверяем результаты", () -> {
            loginPage.registrationForm("Войдите, чтобы продолжить");
        });
    }

    @Test
    @Tag("remote")
    @DisplayName("Переход по ссылке 'Онлайн консультация' + проверка фильтра врачей по заданной специализации")
    void onlineConsultationOpenFormCheck() {
        step ("Открываем главную страницу и переходим по ссылке 'Онлайн консультации'", () -> {
            mainPage.openMainPage()
                    .onlineConsultationsForm();
        });
        step ("Вводим специализацию врача в окно 'Специализация' и нажимаем Enter", () -> {
            switchTo().window(1);
            onlineConsultationPage.scrollTo();
            onlineConsultationPage.doctorSpecializationChoice(doctorSpec);
        });
        step ("Проверяем, что поиск выдает корректный результат в соотв. с заданной специализацией врача", () -> {
            onlineConsultationPage.checkingResults(doctorSpec);
        });
    }

    @Test
    @Tag("remote")
    @DisplayName("Переходим по ссылке 'Выбрать анализы' и добавляем товар в корзину")
    void buyingAnalysis() {
        step ("Открываем главную страницу и переходим по ссылке 'Выбрать анализы'", () -> {
            mainPage.openMainPage()
                    .clickAnalysis();
        });
        step ("Меняем город на требуемый", () -> {
            analysisPage.changeCity();
        });
        step ("Добавляем товар в корзину", () -> {
            analysisPage.searchResult();
            analysisPage.addToCart();
        });
        step ("Переходим в корзину и проверяем, что товар был добавлен", () -> {
            analysisPage.goToCart();
            cartPage.checkingAddedAnalyzes();
        });
    }
}

