package tests;

import base.BaseTest;
import constants.ConfigConstants;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CreateMonsterPage;
import utils.BrowserUtils;
import utils.ExcelUtils;
import utils.Log;

public class DemoTest  extends BaseTest {

    private static final Log log = new Log();
    private static final String FILE_PATH = "src/main/resources/TestData.xlsx";
    private static ExcelUtils excelUtils;

    @BeforeClass
    public void setupExcel() {
        excelUtils = new ExcelUtils(FILE_PATH);
    }

    @Test
    public void monsterCreation() throws InterruptedException {
        log.info("Starting monster creation test");
        CreateMonsterPage createMonsterPage = new CreateMonsterPage(driver);
        Assert.assertEquals(driver.getTitle(), ConfigConstants.TITLE);
        String randomNameFromSheet = excelUtils.getRandomName("Sheet1", 0);
        createMonsterPage.enterMonsterName(randomNameFromSheet);
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.firstMonsterIcon);
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage), 1);
        log.info("Monster with the name "+randomNameFromSheet+" was successfully created");
        BrowserUtils.captureScreenshot(driver);

    }

    @Test
    public void monsterDelete(){
        log.info("Starting monster delete test");
        CreateMonsterPage createMonsterPage = new CreateMonsterPage(driver);
        Assert.assertEquals(driver.getTitle(), ConfigConstants.TITLE);
        String randomNameFromSheet = excelUtils.getRandomName("Sheet1", 0);
        createMonsterPage.enterMonsterName(randomNameFromSheet);
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.secondMonsterIcon);
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage), 1);
        log.info("Monster with the name "+randomNameFromSheet+" was successfully created");
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
        String randomNameFromSheet1 = excelUtils.getRandomName("Sheet1", 0);
        createMonsterPage.enterMonsterName(randomNameFromSheet1);
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.firstMonsterIcon);
        log.info("First monster with the name "+randomNameFromSheet1+" was successfully created");
        String randomNameFromSheet2 = excelUtils.getRandomName("Sheet1", 0);
        createMonsterPage.enterMonsterName(randomNameFromSheet2);
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.secondMonsterIcon);
        log.info("Second monster with the name "+randomNameFromSheet2+" was successfully created");
        String randomNameFromSheet3 = excelUtils.getRandomName("Sheet1", 0);
        createMonsterPage.enterMonsterName(randomNameFromSheet3);
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.thirdMonsterIcon);
        log.info("Third monster with the name "+randomNameFromSheet3+" was successfully created");
        String randomNameFromSheet4 = excelUtils.getRandomName("Sheet1", 0);
        createMonsterPage.enterMonsterName(randomNameFromSheet4);
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.fourthMonsterIcon);
        log.info("Fourth monster with the name "+randomNameFromSheet4+" was successfully created");
        String randomNameFromSheet5 = excelUtils.getRandomName("Sheet1", 0);
        createMonsterPage.enterMonsterName(randomNameFromSheet5);
        createMonsterPage.enterMonsterHP(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesAttack(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesDefence(BrowserUtils.generateRandomNumber());
        createMonsterPage.enterMonstesSpeed(BrowserUtils.generateRandomNumber());
        createMonsterPage.createMonster(createMonsterPage.fifthMonsterIcon);
        log.info("Fifth monster with the name "+randomNameFromSheet5+" was successfully created");
        Assert.assertEquals(BrowserUtils.getElementCount(driver, createMonsterPage.monsterOnPage),5);
        log.info("All monsters are present on the page");
        BrowserUtils.captureScreenshot(driver);

    }


}
