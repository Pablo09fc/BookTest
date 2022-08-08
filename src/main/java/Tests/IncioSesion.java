package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncioSesion {
    
    
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Documents\\Ingeniería en Computación\\Ingeniería en Computación IV Cuatrimestre\\Calidad del Software\\BookTesting\\Project\\BookTest\\src\\main\\java\\Driver\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        //Abrir Dirección 
        driver.get("https://drasilvia.srdosis.com/index.php");
        
        //Configuraciones
        driver.manage().window().maximize();
        
        //Variables a asignar
        String username="admin";
        String password="admin";
        
        //Localizador
        WebElement userInput = driver.findElement(By.className("form-control"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.className("btn-primary"));
        
            //Llenar
        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
}
