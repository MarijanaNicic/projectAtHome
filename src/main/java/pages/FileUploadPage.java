package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private final WebDriver driver;
    private final By inputField = By.id("file-upload");
    private final By uploadButton = By.id("file-submit");
    private final By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    /**
     * Provides path of file to the form then click Upload button
     *
     * @parm absolutePathOfFile The complete path of the file to upload
     */
    public void uploadFile(String absolutePathOfFile) {
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFile() {
        return driver.findElement(uploadedFiles).getText();
    }
}