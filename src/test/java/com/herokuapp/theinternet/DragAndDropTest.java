package com.herokuapp.theinternet;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropTest {
    SelenideElement boxA = $("#column-a"),
            boxB = $("#column-b");

    @BeforeAll
    static void beforeAll() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

    }

    @Test
    void dragAndDropWithoutActions() {
        $$(".column").first().$("header").shouldHave(text("A"));
        boxA.dragAndDropTo(boxB);
        $$(".column").first().$("header").shouldHave(text("B"));
    }
}
