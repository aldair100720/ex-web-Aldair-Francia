package com.nttdata.stepsdefinitions;
import com.nttdata.steps.ResultSteps;
import com.nttdata.steps.VariableSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OperationStepsDefs {

    private WebDriver driver;
    private Scenario scenario;
    private ResultSteps inventorySteps(WebDriver driver){
        return new ResultSteps(driver);
    }
    @Before(order = 0)
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\usuario\\Downloads\\Evaluacion_automatizada_web\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }
    @Dado("que me encuentro en la página de la calculadora")
    public void que_me_encuentro_en_la_página_de_la_calculadora() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        screenShot();
    }
    @Cuando("Ingreso los datos primero: {string} y segundo: {string} para sumar con la opción {string}")
    public void Ingreso_los_datos_para_sumar(String primero, String segundo, String resultado) {
        VariableSteps loginSteps = new VariableSteps(driver);
        loginSteps.typeUserInput1(primero);
        loginSteps.typeUserInput2(segundo);
        loginSteps.typeUserInput3(resultado);
        loginSteps.calculate();
        screenShot();
    }

    @Entonces("valido que deberia aparecerme la suma")
    public void valido_que_deberia_aparecerme_la_suma() {
        int itemsListSize = inventorySteps(driver).getItemSize();
        screenShot();
        Assertions.assertTrue(itemsListSize > 0, "El resultado es: " + itemsListSize);
    }


    @Cuando("Ingreso los datos primero: {string} y segundo: {string} para restar con la opción {string}")
    public void Ingreso_los_datos_para_restar(String primero, String segundo, String resultado) {
        VariableSteps loginSteps = new VariableSteps(driver);
        loginSteps.typeUserInput1(primero);
        loginSteps.typeUserInput2(segundo);
        loginSteps.typeUserInput3(resultado);
        loginSteps.calculate();
        screenShot();
    }

    @Entonces("valido que deberia aparecerme la resta")
    public void valido_que_deberia_aparecerme_la_resta() {
        int itemsListSize = inventorySteps(driver).getItemSize();
        screenShot();
        Assertions.assertTrue(itemsListSize > 0, "El resultado es: " + itemsListSize);
    }

    @Cuando("Ingreso los datos primero: {string} y segundo: {string} para multiplicar con la opción {string}")
    public void Ingreso_los_datos_para_multiplicar(String primero, String segundo, String resultado) {
        VariableSteps loginSteps = new VariableSteps(driver);
        loginSteps.typeUserInput1(primero);
        loginSteps.typeUserInput2(segundo);
        loginSteps.typeUserInput3(resultado);
        loginSteps.calculate();
        screenShot();
    }

    @Entonces("valido que deberia aparecerme la multiplicación")
    public void valido_que_deberia_aparecerme_la_multiplicar() {
        int itemsListSize = inventorySteps(driver).getItemSize();
        screenShot();
        Assertions.assertTrue(itemsListSize > 0, "El resultado es: " + itemsListSize);
    }

    @Cuando("Ingreso los datos primero: {string} y segundo: {string} para dividir con la opción {string}")
    public void Ingreso_los_datos_para_dividir(String primero, String segundo, String resultado) {
        VariableSteps loginSteps = new VariableSteps(driver);
        loginSteps.typeUserInput1(primero);
        loginSteps.typeUserInput2(segundo);
        loginSteps.typeUserInput3(resultado);
        loginSteps.calculate();
        screenShot();
    }

    @Entonces("valido que deberia aparecerme la división")
    public void valido_que_deberia_aparecerme_la_dividir() {
        int itemsListSize = inventorySteps(driver).getItemSize();
        screenShot();
        Assertions.assertTrue(itemsListSize > 0, "El resultado es: " + itemsListSize);
    }

    @Cuando("Ingreso los datos primero: {string} y segundo: {string} para concatenar con la opción {string}")
    public void Ingreso_los_datos_para_concatenar(String primero, String segundo, String resultado) {
        VariableSteps loginSteps = new VariableSteps(driver);
        loginSteps.typeUserInput1(primero);
        loginSteps.typeUserInput2(segundo);
        loginSteps.typeUserInput3(resultado);
        loginSteps.calculate();
        screenShot();
    }

    @Entonces("valido que deberia aparecerme la concatenación")
    public void valido_que_deberia_aparecerme_la_concatenar() {
        int itemsListSize = inventorySteps(driver).getItemSize();
        screenShot();
        Assertions.assertTrue(itemsListSize > 0, "El resultado es: " + itemsListSize);
    }


    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }



}
