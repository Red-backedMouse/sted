package com.taotas.selenideintro;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class GoogleTest {
@Test
    void shouldSearch(){
    open("https://google.com/ncr");
    element(byName("q")).setValue("selenide").pressEnter();
    elements("#search .g").shouldHave(sizeGreaterThanOrEqual(6))
            .first().shouldHave(text("Selenide: concise UI tests in Java"))
            .find(".LC20lb").click();
    Wait().until(titleIs("Selenide: concise UI tests in Java"));
}
}

