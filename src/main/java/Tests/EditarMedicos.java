package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class EditarMedicos {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Documents\\Ingeniería en Computación\\Ingeniería en Computación IV Cuatrimestre\\Calidad del Software\\BookTesting\\Project\\BookTest\\src\\main\\java\\Driver\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        //Abrir Dirección 
        driver.get("https://drasilvia.srdosis.com/?view=medics");
        
        //Configuraciones
        driver.manage().window().maximize();
        
        //Opcion editar
        WebElement editarmedicoBtn = driver.findElement(By.className("btn-warning"));
        editarmedicoBtn.click();
        
        //Formulario
        String Nombre = "Walter";
        String Apellido = "Alejandro";
        String Direccion = "100 norte y 25 este del parque de Desamparados";
        String Email = "walter17@gmail.com";
        String Telefono = "88223366";

        //Localizar
        Select areaMenu = new Select(driver.findElement(By.name("category_id")));
        WebElement nameInput = driver.findElement(By.name("name"));
        WebElement lastnameInput = driver.findElement(By.name("lastname"));
        WebElement addressInput = driver.findElement(By.name("address"));
        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement phoneInput = driver.findElement(By.name("phone"));
        WebElement actualizarmedicoBtn = driver.findElement(By.className("btn-primary"));

        //Limpiar espacios
        areaMenu.selectByIndex(2);
        nameInput.clear();
        lastnameInput.clear();
        addressInput.clear();
        emailInput.clear();
        phoneInput.clear();
        
        //Llenar
        areaMenu.selectByIndex(2);
        nameInput.sendKeys(Nombre);
        lastnameInput.sendKeys(Apellido);
        addressInput.sendKeys(Direccion);
        emailInput.sendKeys(Email);
        phoneInput.sendKeys(Telefono);
        actualizarmedicoBtn.click();
    }
    
}
