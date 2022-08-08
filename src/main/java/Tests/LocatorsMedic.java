package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsMedic {


    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Documents\\Ingeniería en Computación\\Ingeniería en Computación IV Cuatrimestre\\Calidad del Software\\BookTesting\\Project\\BookTest\\src\\main\\java\\Driver\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        //Abrir Dirección 
        driver.get("https://drasilvia.srdosis.com/index.php?view=newmedic");
        
        //Configuraciones
        driver.manage().window().maximize();

        //Formulario
        String Nombre = "Pedro";
        String Apellido = "Gonzales";
        String Direccion = "100 norte y 25 este del Multicentro de Desamparados";
        String Email = "pabloferc09@gmail.com";
        String Telefono = "88226633";

        //Localizar
        Select areaMenu = new Select(driver.findElement(By.name("category_id")));
        WebElement nameInput = driver.findElement(By.name("name"));
        WebElement lastnameInput = driver.findElement(By.name("lastname"));
        WebElement addressInput = driver.findElement(By.name("address"));
        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement phoneInput = driver.findElement(By.name("phone"));
        WebElement agregarmedicoBtn = driver.findElement(By.className("btn-primary"));

        //Llenar
        areaMenu.selectByIndex(1);
        nameInput.sendKeys(Nombre);
        lastnameInput.sendKeys(Apellido);
        addressInput.sendKeys(Direccion);
        emailInput.sendKeys(Email);
        phoneInput.sendKeys(Telefono);
        agregarmedicoBtn.click();
    }

}
