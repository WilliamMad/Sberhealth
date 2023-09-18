package ru.sberhealth.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final String analysis = "¹³С-уреазный дыхательный тест (Helicobacter pylori), выдыхаемый воздух";
    SelenideElement detailCard = $("[data-testid=analysis-detail-card]");

    public void checkingAddedAnalyzes() {
        detailCard.shouldHave(text(analysis));
    }

}
