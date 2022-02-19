package com.herokuapp.theinternet;

import com.codeborne.selenide.SelenideElement;
import com.herokuapp.theinternet.objects.PageWithBoxes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropTest {
    PageWithBoxes pageWithBoxes = new PageWithBoxes();
    String element1 = "A",
            elemetn2 = "B";

    @BeforeAll
    static void beforeAll() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
    }

    @Test
    void dragAndDropWithoutActions() {
        pageWithBoxes.checkThatElementIsFirstOnPage(element1) //проверяем что первый элемент - Box A
                .swapBoxes() //меняем ящики местами
                .checkThatElementIsFirstOnPage(elemetn2); //проверяем что первый элемент - Box B
    }
}
