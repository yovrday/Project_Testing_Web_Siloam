package com.juaracoding.ProjectSiloam.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.ProjectSiloam.pages.LoginSalesPage;
import com.juaracoding.ProjectSiloam.pages.ViewAndExportPage;
import com.juaracoding.ProjectSiloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestViewAndReport {
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private ViewAndExportPage ViewExportPage = new ViewAndExportPage();
    public TestViewAndReport() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
   
	// Test Case 1
	@Given("Masuk Ke Halaman View&Export")
	public void masuk_ke_halaman_view_export() {
		driver.get(Constants.URLVR);
	    extentTest.log(LogStatus.PASS,"Masuk Ke Halaman View&Export");
	}
	@When("Start date kosong")
	public void start_date_kosong() throws InterruptedException {
	    ViewExportPage.setStartDate("");
        extentTest.log(LogStatus.PASS, "Start date kosong");
        Thread.sleep(500);
	}
	@When("End date kosong")
	public void end_date_kosong() throws InterruptedException {
		ViewExportPage.setEndDate("");
        extentTest.log(LogStatus.PASS, "End date kosong");
        Thread.sleep(500);
	}
	@When("Klik button filter")
	public void klik_button_filter() {
		ViewExportPage.clickBtnFilter();
	    extentTest.log(LogStatus.PASS, "Klik button filter");
	}
	@Then("Start Date dan End Date Tidak Boleh Kosong")
	public void start_date_dan_end_date_tidak_boleh_kosong() {
		Assert.assertEquals(ViewExportPage.getTxtViewExport(), "View & Export");
	   	extentTest.log(LogStatus.PASS, "Start Date dan End Date Tidak Boleh Kosong");
	}
	//Test Case 2
	@When("Start date benar")
	public void start_date_benar() throws InterruptedException {
	    ViewExportPage.setStartDate("2022-12-24");
        extentTest.log(LogStatus.PASS, "Start date benar");
        Thread.sleep(500);
	}
	@Then("End Date Tidak Boleh Kosong")
	public void end_date_tidak_boleh_kosong() {
		Assert.assertEquals(ViewExportPage.getTxtViewExport(), "View & Export");
	   	extentTest.log(LogStatus.PASS, "End Date Tidak Boleh Kosong");
	}
	//Test Case 3
	@When("End date benar")
	public void end_date_benar() throws InterruptedException {
	    ViewExportPage.setEndDate("2022-12-24");
        extentTest.log(LogStatus.PASS, "End date benar");
        Thread.sleep(500);
	}
	@Then("Start Date Tidak Boleh Kosong")
	public void start_date_tidak_boleh_kosong() {
		Assert.assertEquals(ViewExportPage.getTxtViewExport(), "View & Export");
	   	extentTest.log(LogStatus.PASS, "Start Date Tidak Boleh Kosong");
	}
	//Tes Case 4
	@When("End date lebih lama")
	public void end_date_lebih_lama() throws InterruptedException {
		ViewExportPage.setEndDate("");
        extentTest.log(LogStatus.PASS, "End date lebih lama");
        Thread.sleep(500);
	}
	@Then("Tidak Menampilkan Daftar Data Input")
	public void tidak_menampilkan_daftar_data_input() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertEquals(ViewExportPage.getTxtViewExport(), "View & Export");
	   	extentTest.log(LogStatus.PASS, "Tidak Menampilkan Daftar Data Input");
	}
	//Test Case 5
	@Then("Menampilkan Daftar Data Input")
	public void menampilkan_daftar_data_input() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertEquals(ViewExportPage.getTxtViewExport(), "View & Export");
	   	extentTest.log(LogStatus.PASS, "Menampilkan Daftar Data Input");
	}
	
	// Test Case Fakses Awal
	@Given("Berada view data")
	public void berada_view_data () {
		driver.get(Constants.URLV);
	    extentTest.log(LogStatus.PASS,"Berada view data");
	}

	@When("Klik foto fakses awal")
	public void klik_foto_fakses_awal() throws InterruptedException {
		ViewExportPage.clickBtnAwal();
	    extentTest.log(LogStatus.PASS, "Klik foto fakses awal");
	    Thread.sleep(1000);
	}
	@Then("Menampilkan gambar fakses awal")
	public void menampilkan_gambar_fakses_awal() {
		Assert.assertEquals(ViewExportPage.getTxtPreview(),"");
	   	extentTest.log(LogStatus.PASS, "Menampilkan Gambar Fakses Awal");
	}
	
	//Test Case Fakses Tujuan
	
	@When("Klik foto fakses tujuan")
	public void klik_foto_fakses_tujuan() throws InterruptedException {
		ViewExportPage.clickBtnTujuan();
	    extentTest.log(LogStatus.PASS, "Klik foto fakses tujuan");
	    Thread.sleep(1000);
	}
	@Then("Menampilkan gambar fakses tujuan")
	public void menampilkan_gambar_fakses_tujuan() {
		Assert.assertEquals(ViewExportPage.getTxtPreview(),"");
	   	extentTest.log(LogStatus.PASS, "Menampilkan Gambar Fakses Tujuan");
	}
	
	//Test Case PDF
	@When("Klik pdf aggrement")
	public void klik_pdf_aggrement() throws InterruptedException {
		ViewExportPage.clickBtnPDF();
	    extentTest.log(LogStatus.PASS, "Klik PDF aggrement");
	    Thread.sleep(1000);
	}
	@Then("Menampilkan PDF Aggrement")
	public void menampilkan_pdf_aggrement() { 
		Assert.assertEquals(ViewExportPage.getTxtPreview(),"");
	   	extentTest.log(LogStatus.PASS, "Menampilkan PDF Aggrement");
	}
	
	//Test View Data
	@When("Klik view")
	public void klik_view_data() {
		ViewExportPage.clickBtnView();
	    extentTest.log(LogStatus.PASS, "Klik View Data");
	}
	@Then("Menampilkan View Data")
	public void menampilkan_view_data() {
		Assert.assertEquals(ViewExportPage.getTxtViewExport(),"View & Export");
	   	extentTest.log(LogStatus.PASS, "Menampilkan View Data");
	}
	
	//Test View Data Before
	@When("Klik gambar before")
	public void klik_gambar_before () throws InterruptedException {
		ViewExportPage.clickBefore();
		extentTest.log(LogStatus.PASS, "Klik Gambar Before");
		Thread.sleep(1000);
	}
	@Then("Menampilkan Gambar Before")
	public void menampilkan_gambar_before () {
		Assert.assertEquals(ViewExportPage.getTxtPreview(),"");
	   	extentTest.log(LogStatus.PASS, "Menampilkan Gambar Before");
		}
	//Test View Data After
		@When("Klik gambar after")
		public void klik_gambar_after () throws InterruptedException {
			ViewExportPage.clickAfter();
			extentTest.log(LogStatus.PASS, "Klik Gambar After");
			Thread.sleep(1000);
		}
		@Then("Menampilkan Gambar After")
		public void menampilkan_gambar_after() {
			Assert.assertEquals(ViewExportPage.getTxtPreview(),"");
		   	extentTest.log(LogStatus.PASS, "Menampilkan Gambar After");
			}
	//Test Preview Data
		@When("Klik preview data")
		public void klik_preview_data() throws InterruptedException  {
			ViewExportPage.clickBtnPreview();
			extentTest.log(LogStatus.PASS, "Klik preview data");
			Thread.sleep(1000);
			}
		@Then("Menampilkan PDF gambar Before dan After")
		public void menampilkan_pdf_tapi_tidak_menampilkan_gambar_Before_dan_After() {
			Assert.assertEquals(ViewExportPage.getTxtPreview2(),"Tidak Menampilkan gambar Before dan After");
			extentTest.log(LogStatus.PASS,"Menampilkan PDF gambar Before dan After");
				}
			
		// Test Back View Data
			@When("Klik button back")
			public void klik_button_back() {
				ViewExportPage.clickBtnViewBack();
				extentTest.log(LogStatus.PASS, "Klik button back");
			}
			@Then("Kembali Ke Halaman View & Export")
			public void kembali_ke_halaman_view_export() {
				Assert.assertEquals(ViewExportPage.getTxtViewExport(),"View & Export");
			   	extentTest.log(LogStatus.PASS,"Kembali Ke Halaman View & Export");
				}
			
			//Test Export
			@When("Klik button export")
			public void klik_button_export() {
				ViewExportPage.clickBtnExport();
				extentTest.log(LogStatus.PASS, "Klik button export");
}
			@Then("Menampilkan Notice Harus Klik button filter")
			public void menampilkan_notice_harus_klik_button_filter() {
				Assert.assertEquals(ViewExportPage.getTxtViewExport(),"DANGER! Harus klik button filter dahulu");
			   	extentTest.log(LogStatus.PASS,"Menampilkan Notice Harus Klik button filter");
				}
			
			@Then("Data Terdownload format xls")
			public void data_terdownload_format_xls() {
				Assert.assertEquals(ViewExportPage.getTxtViewExport(),"View & Export");
			   	extentTest.log(LogStatus.PASS,"Data Terdownload format xls");
				}
			
			//Test Download
			@When("Klik button download")
			public void klik_button_download() {
				ViewExportPage.clickBtnDownload();
				extentTest.log(LogStatus.PASS, "Klik button download");
				}
			@Then("Data Terdownload format zip")
			public void data_terdownload_format_zip() {
				Assert.assertEquals(ViewExportPage.getTxtViewExport(),"View & Export");
			   	extentTest.log(LogStatus.PASS,"Data Terdownload format zip");
				}
			
			//Test Refresh
			@When("Klik button refresh")
			public void klik_button_refresh() {
				ViewExportPage.clickBtnRefresh();
				extentTest.log(LogStatus.PASS, "Klik button refresh");
				}
			@Then("Refresh Pada Halaman View & Export")
			public void refresh_pada_halaman_view_export() {
				Assert.assertEquals(ViewExportPage.getTxtViewExport(),"View & Export");
			   	extentTest.log(LogStatus.PASS,"Refresh Pada Halaman View & Export");
				}
			
			//Logout
			@Given("Berada Di Halaman Home Admin")
			public void Berada_Di_Halaman_Home_Admin() {
				driver.get(Constants.URLH);
			    extentTest.log(LogStatus.PASS,"Berada Di Halaman Home Admin");
			}
			@When("klik User Administrator")
			public void klik_User_Administrator() {
				ViewExportPage.clickBtnAdm();
				extentTest.log(LogStatus.PASS, "klik User Administrator");
				}
			@When("klik logout")
			public void klik_logout() {
				ViewExportPage.clickBtnLogout();
				extentTest.log(LogStatus.PASS, "klik logout");
				}
			@Then("Kembali Ke Halaman Login")
			public void Kembali_Ke_Halaman_Login() {
				String expected = ViewExportPage.getTxtLogin();
				Assert.assertEquals(ViewExportPage.getTxtLogin(),expected);
			   	extentTest.log(LogStatus.PASS,"Kembali Ke Halaman Login");
				}
}
