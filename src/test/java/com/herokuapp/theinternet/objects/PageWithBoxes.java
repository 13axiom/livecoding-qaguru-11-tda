package com.herokuapp.theinternet.objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PageWithBoxes {
    //locators
    SelenideElement boxA = $("#column-a"),
            boxB = $("#column-b");

    //actions

    public PageWithBoxes checkThatElementIsFirstOnPage (String element){
        $$(".column").first().$("header").shouldHave(text(element));
        return this;
    }

    public PageWithBoxes swapBoxes() {
        boxA.dragAndDropTo(boxB);
        return this;
    }
}
