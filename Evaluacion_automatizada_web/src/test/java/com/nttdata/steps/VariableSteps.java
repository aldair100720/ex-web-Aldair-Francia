package com.nttdata.steps;
import com.nttdata.page.Variable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class VariableSteps {
    private WebDriver driver;


    public VariableSteps(WebDriver driver){
        this.driver = driver;
    }

    public void typeUserInput1(String userInput1){
        WebElement userInputElement = driver.findElement(Variable.userInput1);
        userInputElement.sendKeys(userInput1);

    }

    public void typeUserInput2(String userInput2){
        WebElement userInputElement = driver.findElement(Variable.userInput2);
        userInputElement.sendKeys(userInput2);

    }
    public void typeUserInput3(String userInput3){
        WebElement userInputElement = driver.findElement(Variable.userInput3);
        userInputElement.sendKeys(userInput3);
    }
    public void calculate(){
        this.driver.findElement(Variable.calculateButton).click();
    }
}
