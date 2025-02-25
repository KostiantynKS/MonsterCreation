package tests;

import base.BaseTest;
import constants.ConfigConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateMonsterPage;
import utils.BrowserUtils;

public class DemoTest  extends BaseTest {

    @Test
    public void monsterCreation() throws InterruptedException {
        CreateMonsterPage createMonsterPage = new CreateMonsterPage(driver);
        Assert.assertEquals(driver.getTitle(), ConfigConstants.TITLE);
        createMonsterPage.enterMonsterName("Jon");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.firstMonsterIcon);
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage), 1);
        BrowserUtils.captureScreenshot(driver);

    }

    @Test
    public void monsterDelete(){
        CreateMonsterPage createMonsterPage = new CreateMonsterPage(driver);
        Assert.assertEquals(driver.getTitle(), ConfigConstants.TITLE);
        createMonsterPage.enterMonsterName("Jon");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.secondMonsterIcon);
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage), 1);
        createMonsterPage.deleteMonster();
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage),0);
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.noMonstersMessage), 1);
        BrowserUtils.captureScreenshot(driver);

    }

    @Test
    public void addAllMonsters() {
        CreateMonsterPage createMonsterPage = new CreateMonsterPage(driver);
        Assert.assertEquals(driver.getTitle(), ConfigConstants.TITLE);
        createMonsterPage.enterMonsterName("Monster1");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.firstMonsterIcon);
        createMonsterPage.enterMonsterName("Monster2");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.secondMonsterIcon);
        createMonsterPage.enterMonsterName("Monster3");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.thirdMonsterIcon);
        createMonsterPage.enterMonsterName("Monster4");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.fourthMonsterIcon);
        createMonsterPage.enterMonsterName("Monster5");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.fifthMonsterIcon);
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage),5);
        BrowserUtils.captureScreenshot(driver);

    }


}
