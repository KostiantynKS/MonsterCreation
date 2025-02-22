package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateMonsterPage {

    private WebDriver driver;

    public CreateMonsterPage(WebDriver driver){
        this.driver = driver;
    }

    public By monsterName = By.xpath("//input[@name='name']");
    public By monsterHP = By.xpath("//input[@name='hp']");
    public By monsterDefence = By.xpath("//input[@name='defense']");
    public By monsterAttack = By.xpath("//input[@name='attack']");
    public By monsterSpeed = By.xpath("//input[@name='speed']");
    public By firstMonsterIcon = By.xpath("//div[@data-testid='monster-1']");
    public By createMonsterButton = By.xpath("//button[contains(text(), 'Create Monster')]");
    public By monsterOnPage = By.xpath("//div[@data-testid='monster-card']");
    public By deleteMonster = By.xpath("//button[contains(text(), 'Delete')]");

    public void enterMonsterName(String name){
        driver.findElement(monsterName).sendKeys(name);
    }
    public void enterMonsterHP(String hp){
        driver.findElement(monsterHP).sendKeys(hp);
    }
    public void enterMonstesDefence(String defence){
        driver.findElement(monsterDefence).sendKeys(defence);
    }
    public void enterMonstesAttack(String attack){
        driver.findElement(monsterAttack).sendKeys(attack);
    }
    public void enterMonstesSpeed(String speed){
        driver.findElement(monsterSpeed).sendKeys(speed);
    }
    public void createMonster(){
        driver.findElement(firstMonsterIcon).click();
        driver.findElement(createMonsterButton).click();
    }
    public void deleteMonster(){
        driver.findElement(deleteMonster).click();
    }



}
