package ru.sberhealth.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    SelenideElement loginButton = $("[class*='the-button--type-grey']");
    SelenideElement onlineConsultations = $("[class*='online med-service__block-inner']");
    SelenideElement analysis = $("[class*='fluid analyzes']");


    public MainPage openMainPage() {
        open("/");
        return this;
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void onlineConsultationsForm() {
        onlineConsultations.click();
    }

    public void clickAnalysis() {
        analysis.click();
    }
}
