package com.juaracoding.ProjectSiloam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ProjectSiloam.drivers.DriverSingleton;

public class UploadDocumentPage {

private static WebDriver driver;
	
	public UploadDocumentPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
	}
	//span[normalize-space()='Foto Faskes Awal']
	@FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
	   WebElement btnAwal;
	//span[normalize-space()='Foto Faskes Tujuan']
	@FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
	   WebElement btnTujuan;
	@FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
	   WebElement btnTTD;
	@FindBy(xpath = "//button[@id='btnSave']")
	   WebElement btnSimpan;
	//button[normalize-space()='Cancel']
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	   WebElement btnCancel;
	@FindBy(xpath = "//button[@data-dismiss='modal']//span[@aria-hidden='true'][normalize-space()='×']")
	   WebElement btnClose;
	@FindBy(xpath = "//input[@id='file']")
	   WebElement btnChoose;
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	   WebElement btnOK;
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	   WebElement btnLanjut;
	
	//Alert
	@FindBy(xpath = "//div[@id='message'")
	   WebElement txtUploadError;
	@FindBy(xpath = "//h1[@class='page-header']")
	   WebElement txtFormInput;
	@FindBy(xpath = "//code[contains(text(),'UNTUK KE TAHAP SELANJUTNYA, DOKUMEN YANG WAJIB DIU')]")
	   WebElement txtUploadKurang;
	
	
	public void clickBtnAwal(){
        btnAwal.click();
	}
    public void clickBtnTujuan(){
        btnTujuan.click();
    }
    public void clickBtnTTD(){
        btnTTD.click();
    }
    public void clickBtnSimpan(){
        btnSimpan.click();
    }
    public void clickBtnCancel(){
        btnCancel.click();
    }
    public void clickBtnChooseAwal(){
        btnChoose.sendKeys("C:\\Users\\yovrday\\filetest\\faskes_awal.jpg");
    }
    public void clickBtnChooseTujuan(){
        btnChoose.sendKeys("C:\\Users\\yovrday\\filetest\\faskes_awal.jpg");
    }
    public void clickBtnChooseTTD(){
        btnChoose.sendKeys("C:\\Users\\yovrday\\filetest\\ttd_digital.jpg");
    }
    public void clickBtnChooseOversize(){
        btnChoose.sendKeys("C:\\Users\\yovrday\\filetest\\Oversize.jpg");
    }
    public void clickBtnOK(){
        btnOK.click();
	}
    public void clickBtnLanjut(){
        btnLanjut.click();
    }
    public void clickBtnClose(){
        btnClose.click();
    }
    public String getTxtUploadError1(){
       return "Upload error: You did not select a file to upload.";
    }
    public String getTxtUploadError2(){
        return "Upload error: The file you are attempting to upload is larger than the permitted size.";
     }   
    public String getTxtFormInput(){
        return txtFormInput.getText();
}
    public String getTxtUploadK(){
        return txtUploadKurang.getText();
}
}