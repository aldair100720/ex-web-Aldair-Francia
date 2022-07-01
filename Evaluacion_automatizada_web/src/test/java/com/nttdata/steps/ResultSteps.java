package com.nttdata.steps;

import com.nttdata.page.Result;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
public class ResultSteps {

    private WebDriver driver;

    //contrsuctor
    public ResultSteps(WebDriver driver){
        this.driver = driver;
    }

    public int getItemSize(){
        List<WebElement> items = this.driver.findElements(Result.resultado);
        return items.size();
    }

}
