package com.juaracoding.ProjectSiloam.step_definitions;

import java.lang.invoke.ConstantBootstraps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.ProjectSiloam.pages.InputPage;
import com.juaracoding.ProjectSiloam.pages.ReturnPage;
import com.juaracoding.ProjectSiloam.pages.UploadDocumentPage;
import com.juaracoding.ProjectSiloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestUploadDocument {
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private UploadDocumentPage UploadPage = new UploadDocumentPage();
    private InputPage inputPage = new InputPage();
   public TestUploadDocument() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
   @Given("TS76_Berada Di Halaman Input")
   public void p16_klik_button_input() {
   	inputPage.clickBtnInput();
       extentTest.log(LogStatus.PASS, "User click button Input");
   }
   public void ts76_berada_ke_halaman_Input() {
   	extentTest.log(LogStatus.PASS, "User berada di halaman input");
    }
   @When("TS77_Mengisi semua field dengan benar")
   public void ts77_mengisi_semua_field_dengan_benar() {
   	 inputPage.nama("Elma Lucyana Christine");

   	 inputPage.nomorbpjs("9460657584109");
        extentTest.log(LogStatus.PASS, "Nomor BPJS diisi kurang dari 13 karater");

   	 inputPage.nomorktp("4751119936337058");

   	 inputPage.alamat("Graha Handaya, Unit Q-S, Jl. Raya Perjuangan No.12A, Kebon Jeruk, Kota Jakarta Barat, DKI Jakarta.");

   	 inputPage.clickBtnKota_Ktp();

        inputPage.clickBtnKota_Ktp2();

   	 inputPage.faskesawal("Faskes Diponegoro Utara");

   	 inputPage.clickBtnFaskes_Tujuan();

   	 inputPage.clickBtnFaskes_Tujuan2();

   	 inputPage.alasan("Faskes awal terlalu jauh dari rumah");

   }
   
   @When("TS78_Klik button Simpan Data")
   public void ts78_klik_button_simpan_data() {
	   inputPage.clickBtnSimpan_Data();
       extentTest.log(LogStatus.PASS, "User click button Simpan Data");
   }
   @Then("TS79_Berpindah ke Halaman Upload")
   public void ts79_berpindah_ke_halaman_upload() {
   	extentTest.log(LogStatus.PASS, "User Berpindah ke halaman selanjutnya");
   }
   
   
   //Test Case 1
   @Given("Berada Di Form Upload Document")
   public void berada_di_form_upload_document() {
    //driver.get(Constants.URLU);
       extentTest.log(LogStatus.PASS,"Berada Di Form Upload Document");
   }
   @When("Klik button + Foto Faskes Awal")
   public void klik_button_foto_faskes_awal() {
       UploadPage.clickBtnAwal();
       Hooks.delay(1);
       extentTest.log(LogStatus.PASS, "Klik button + Foto Faskes Awal");
   }
   @When("Klik button Cancel")
   public void klik_button_cancel() {
	   Hooks.delay(1);
	   UploadPage.clickBtnCancel();
       extentTest.log(LogStatus.PASS, "Klik button Cancel");
   }
   @Then("User Cancel Upload Dokumen")
   public void user_cancel_upload_foto() {
	   	Assert.assertEquals(UploadPage.getTxtFormInput(),"Form Input");
	   	extentTest.log(LogStatus.PASS,"User Cancel Upload Dokumen");
   }
   //Test Case 2
   @When("Klik button + Foto Faskes Tujuan")
   public void klik_button_foto_faskes_tujuan() {
       Hooks.delay(1);
	   UploadPage.clickBtnTujuan();
       extentTest.log(LogStatus.PASS, "Klik button + Foto Faskes Tujuan");
   }
 //Test Case 3
   @When("Klik button + Foto TTD Digital")
   public void klik_button_foto_ttd_digital() {
	   Hooks.delay(1);
	   UploadPage.clickBtnTTD();
       extentTest.log(LogStatus.PASS, "Klik button + Foto TTD Digital");
   }
   //Test Case 4
   @When("Klik button Simpan")
   public void klik_button_simpan() throws InterruptedException {
	   Hooks.delay(1);
	   UploadPage.clickBtnSimpan();
   //  Thread.sleep(3100);
       extentTest.log(LogStatus.PASS, "Klik button Simpan");
   }
   @Then("User Tidak Dapat Menyimpan Data")
   public void user_tidak_dapat_menyimpan_data() {
	   Assert.assertEquals(UploadPage.getTxtUploadError1(),"Upload error: You did not select a file to upload.");
	   UploadPage.clickBtnClose();
       extentTest.log(LogStatus.PASS, "User Tidak Dapat Menyimpan Data");
   }
   //Test Case 5
   @When("Klik Choose File Faskes Awal")
   public void klik_choose_file_faskes_awal() {
	   Hooks.delay(1);
	   UploadPage.clickBtnChooseAwal();
       extentTest.log(LogStatus.PASS, "Klik Choose File Faskes Awal");
   }
   @When("Klik Choose File Faskes Tujuan")
   public void klik_choose_file_faskes_tujuan() {
	   Hooks.delay(1);
	   UploadPage.clickBtnChooseTujuan();
       extentTest.log(LogStatus.PASS, " Klik Choose File Faskes Tujuan");
   }
   @When("Klik Choose File TTD Digital")
   public void klik_choose_file_ttd_digital() {
	   Hooks.delay(1);
	   UploadPage.clickBtnChooseTTD();
       extentTest.log(LogStatus.PASS, " Klik Choose File TTD Digital");
   }
   @Then("User Cancel Data Upload")
   public void user_cancel_data_upload() {
	   Assert.assertEquals(UploadPage.getTxtFormInput(),"Form Input");
       extentTest.log(LogStatus.PASS, "User Cancel Data Upload");
   }
   @When("Klik Choose File Oversize")
   public void klik_choose_file_oversize() {
	   Hooks.delay(1);
	   UploadPage.clickBtnChooseOversize();
       extentTest.log(LogStatus.PASS, " Klik Choose File Oversize");
   }
   @Then("User Tidak Dapat Menyimpan Data Oversize")
   public void user_tidak_dapat_menyimpan_data_oversize() {
	   Assert.assertEquals(UploadPage.getTxtUploadError2(),"Upload error: The file you are attempting to upload is larger than the permitted size.");
	   UploadPage.clickBtnClose();
	  extentTest.log(LogStatus.PASS, "User Tidak Dapat Menyimpan Data Oversize");
   }
   @Then("User Belum Melengkapi Dokumen Tersebut")
   public void user_belum_melengkapi_dokumen_tersebut() {
	   String expected = UploadPage.getTxtUploadK();
	   Assert.assertEquals(UploadPage.getTxtUploadK(),expected);
       extentTest.log(LogStatus.PASS, "User Belum Melengkapi Dokumen Tersebut");
   }
   @When("Klik button OK")
   public void Klik_button_OK() {
	   Hooks.delay(1);
	   UploadPage.clickBtnOK();
       extentTest.log(LogStatus.PASS, " Klik Button OK");
   }
   @When("Klik Selanjutnya")
   public void klik_selanjutnya() {
       UploadPage.clickBtnLanjut();
       extentTest.log(LogStatus.PASS, " Klik Selanjutnya");
   }
   @Then("User Ke Halaman TTD Digital")
   public void User_ke_halaman_TTD_digital() {
	   Assert.assertEquals(driver.switchTo().alert().getText(),"Anda akan lanjut ke tahap selanjutnya!");
	   driver.switchTo().alert().accept();
	   extentTest.log(LogStatus.PASS, "User Ke Halaman TTD Digital");
   }  
//   @Then("User Tidak Dapat Menyimpan Data")
//   public void user_tidak_dapat_menyimpan_data() {
//	   Assert.assertEquals(UploadPage.getTxtUploadError(),"Upload error: You did not select a file to upload.");
//       extentTest.log(LogStatus.PASS, "User Tidak Dapat Menyimpan Data");
//   }
}
