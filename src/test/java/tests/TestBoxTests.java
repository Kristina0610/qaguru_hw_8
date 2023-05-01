package tests;

import org.junit.jupiter.api.Test;
import pages.BoxPage;
import utils.RandomUtils;


public class TestBoxTests extends TestBase {
  BoxPage boxPage = new BoxPage();
  RandomUtils randomUtils = new RandomUtils();

  String userName = randomUtils.getRandomFirstName(),
          userEmail = randomUtils.getRandomEmail(),
          currentAddress = randomUtils.getRandomAddress(),
          permanentAddress = randomUtils.getRandomAddress();

  @Test
  void successfulFillFormTest() {

    boxPage
            .openPage()
            .setUserName(userName)
            .setUserEmail(userEmail)
            .setCurrentAddress(currentAddress)
            .setPermanentAddress(permanentAddress)
            .clickSubmit();

    boxPage
            .verifyResult("name", userName)
            .verifyResult("email", userEmail)
            .verifyResult("currentAddress", currentAddress)
            .verifyResult("permanentAddress", permanentAddress);
  }
}