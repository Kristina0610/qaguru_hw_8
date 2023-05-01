package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.ResultOutput;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BoxPage {
  // SelenideElements / locator / etc

  ResultOutput resultOutput = new ResultOutput();

  SelenideElement
          userName = $("#userName"),
          userEmail = $("#userEmail"),
          currentAddress = $("#currentAddress"),
          permanentAddress = $("#permanentAddress"),
          button = $("#submit");

  // Actions

  public BoxPage openPage() {
    open("/text-box");

    return this;
  }

  public BoxPage setUserName(String value) {
    userName.setValue(value);

    return this;
  }

  public BoxPage setUserEmail(String value) {
    userEmail.setValue(value);

    return this;
  }

  public BoxPage setCurrentAddress(String value) {
    currentAddress.setValue(value);

    return this;
  }

  public BoxPage setPermanentAddress(String value) {
    permanentAddress.setValue(value);

    return this;
  }

  public BoxPage clickSubmit() {
    button.click();

    return this;
  }

  public BoxPage verifyResult(String id, String value) {
    resultOutput.verifyResult(id, value);

    return this;
  }

}
