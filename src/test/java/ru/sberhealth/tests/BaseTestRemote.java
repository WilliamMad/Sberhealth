package ru.sberhealth.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Configuration.pageLoadStrategy;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static java.lang.System.getProperty;
import static ru.sberhealth.helpers.Attachments.*;

public class BaseTestRemote {

    @BeforeAll
    static void beforeAll() {
        baseUrl = getProperty("baseUrl", "https://sberhealth.ru");
        remote = getProperty("remote", "https://user1:1234@selenoid.autotests.cloud/wd/hub");
        browser = getProperty("browser", "chrome");
        browserSize = getProperty("browserSize", "1920x1080");
        browserVersion = getProperty("version", "100");
        pageLoadStrategy = "eager";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        screenshotAs("Last screenshot");
        pageSource();
        browserConsoleLogs();
        addVideo();

        closeWebDriver();
    }
}
