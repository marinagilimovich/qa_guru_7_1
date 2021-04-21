package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckSomething {

    @Test
    void checkSomething() {
        open("https://www.google.com/");
        $("[name='q']").setValue("Krakow").pressEnter();
        $("#rso").shouldHave(text("Wikipedia"));
    }
}
