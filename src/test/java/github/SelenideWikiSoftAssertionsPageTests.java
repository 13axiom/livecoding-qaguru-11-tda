package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class SelenideWikiSoftAssertionsPageTests {
    @Test
    void pageHaveExampleForJUnit5() {
        //открыть страницу репы selenide
        open("https://github.com/selenide/selenide");

        //перейти в раздел Wiki
        $(".UnderlineNav-body").$(byText("Wiki")).parent().click();

        //найти раздел SoftAssertions
        $(".f6.Link--muted.js-wiki-more-pages-link.btn-link.mx-auto").click();
        $(".Layout-sidebar").shouldHave(text("SoftAssertions"));

        // перейти в раздел SoftAssertions
        $(".Layout-sidebar").$(byText("SoftAssertions")).click();

        //check: внутри есть пример кода для JUnit5
        $(".Layout-main").$$("h3").get(1).shouldHave(text("Example"));
        $(".Layout-main").$(withText("Using JUnit5 extend test class:")).shouldBe(visible);
        $(".Layout-main").$(withText("Using JUnit5 extend test class:")).closest("ol")
                .sibling(0).shouldHave(text("@ExtendWith"));
    }
}
