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
        createMonsterPage.enterMonsterName("Vasya");
        createMonsterPage.enterMonsterHP("12");
        createMonsterPage.enterMonstesAttack("78");
        createMonsterPage.enterMonstesDefence("1");
        createMonsterPage.enterMonstesSpeed("100");
        createMonsterPage.createMonster();
        Assert.assertTrue(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage)>0);
        Thread.sleep(4000);

    }

    @Test
    public void monsterDelete(){
        CreateMonsterPage createMonsterPage = new CreateMonsterPage(driver);
        Assert.assertEquals(driver.getTitle(), ConfigConstants.TITLE);
        createMonsterPage.enterMonsterName("Vasya");
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster();
        Assert.assertTrue(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage)>0);
        createMonsterPage.deleteMonster();
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage),0);

    }


}
