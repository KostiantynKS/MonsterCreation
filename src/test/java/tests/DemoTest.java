package tests;

import base.BaseTest;
import constants.ConfigConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateMonsterPage;
import utils.BrowserUtils;
import utils.Log;

public class DemoTest  extends BaseTest {

    private static final Log log = new Log();

    @Test
    public void monsterCreation() throws InterruptedException {
        log.info("Starting monster creation test");
        CreateMonsterPage createMonsterPage = new CreateMonsterPage(driver);
        Assert.assertEquals(driver.getTitle(), ConfigConstants.TITLE);
        createMonsterPage.enterMonsterName("Jon");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.firstMonsterIcon);
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage), 1);
        log.info("Monster was successfully created");
        BrowserUtils.captureScreenshot(driver);

    }

    @Test
    public void monsterDelete(){
        log.info("Starting monster delete test");
        CreateMonsterPage createMonsterPage = new CreateMonsterPage(driver);
        Assert.assertEquals(driver.getTitle(), ConfigConstants.TITLE);
        createMonsterPage.enterMonsterName("Jon");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.secondMonsterIcon);
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage), 1);
        log.info("Monster was successfully created");
        createMonsterPage.deleteMonster();
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage),0);
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.noMonstersMessage), 1);
        log.info("Monster was successfully deleted");
        BrowserUtils.captureScreenshot(driver);

    }

    @Test
    public void addAllMonsters() {
        log.info("Starting add all monster monster test");
        CreateMonsterPage createMonsterPage = new CreateMonsterPage(driver);
        Assert.assertEquals(driver.getTitle(), ConfigConstants.TITLE);
        createMonsterPage.enterMonsterName("Monster1");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.firstMonsterIcon);
        log.info("Monster1 was successfully created");
        createMonsterPage.enterMonsterName("Monster2");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.secondMonsterIcon);
        log.info("Monster2 was successfully created");
        createMonsterPage.enterMonsterName("Monster3");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.thirdMonsterIcon);
        log.info("Monster3 was successfully created");
        createMonsterPage.enterMonsterName("Monster4");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.fourthMonsterIcon);
        log.info("Monster4 was successfully created");
        createMonsterPage.enterMonsterName("Monster5");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.fifthMonsterIcon);
        log.info("Monster5 was successfully created");
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage),5);
        log.info("All monsters are present on the page");
        BrowserUtils.captureScreenshot(driver);

    }


}
