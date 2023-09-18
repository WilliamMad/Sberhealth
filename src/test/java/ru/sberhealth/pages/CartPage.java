package ru.sberhealth.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    SelenideElement detailCard = $("[data-testid=analysis-detail-card]");

    public void checkingAddedAnalyzes(String text) {
        detailCard.shouldHave(text(text));
    }

}
