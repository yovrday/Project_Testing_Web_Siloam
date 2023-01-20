package com.juaracoding.ProjectSiloam.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.ProjectSiloam.pages.ReturnPage;
import com.juaracoding.ProjectSiloam.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestReturn {
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private ReturnPage returnPage = new ReturnPage();

   public TestReturn() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
   //
   @When("Isi end date lebih lama")
   public void isi_end_date_lebih_lama() {
	   returnPage.setEndDate22();
       extentTest.log(LogStatus.PASS,"Isi end date lebih lama");   
   }
   @Then("Tidak Menampilkan Data Return")
   public void tidak_menampilkan_data_return() {
	   Assert.assertEquals(returnPage.getTxtPen(),"");
	   extentTest.log(LogStatus.PASS, "Tidak Menampilkan Data Return");
   }
   //Test Case 1
   @Given("Masuk Ke Halaman Return")
   public void masuk_ke_halaman_return() {
	   driver.get(Constants.URLR);
	   extentTest.log(LogStatus.PASS,"Masuk ke Halaman Return");
   }
   @When("Isi start date")
   public void isi_start_date() {
       returnPage.setStartDate();
       extentTest.log(LogStatus.PASS,"Isi start date");
   }
   @When("Isi end date")
   public void isi_end_date() {
	   returnPage.setEndDate();
       extentTest.log(LogStatus.PASS,"Isi end date");
      
   }
   @When("Isi status pending")
   public void isi_status_pending() {
	   returnPage.setStatusPen();
	   extentTest.log(LogStatus.PASS,"Isi status pending");
   }
   @When("Klik button Filter")
   public void klik_button_filter() {
	   returnPage.clickbtnFil();
	   extentTest.log(LogStatus.PASS,"Klik button Filter");
       
   }
   @Then("Menampilkan Data Pending")
   public void menampilkan_data_pending() {
	   Assert.assertEquals(returnPage.getTxtPen(),"");
	   extentTest.log(LogStatus.PASS, "Menampilkan Data Pending");
   }
   //Test Case 2
   
   @When("Isi status complete")
   public void isi_status_complete() {
	   Hooks.delay(1);
	   returnPage.setStatusComp();
	   extentTest.log(LogStatus.PASS,"Isi status complete");
   }
   @Then("Menampilkan Data Complete")
   public void menampilkan_data_complete() {
	   Hooks.delay(1);
	   String expected = returnPage.getTxtFormReturn();
	   Assert.assertEquals(returnPage.getTxtFormReturn(),expected);
	   extentTest.log(LogStatus.PASS, "Menampilkan Data Complete");
       }
   
   //Test Case 3
   @When("Isi status")
   public void isi_status() {
	   returnPage.setStatusComp();
	   extentTest.log(LogStatus.PASS,"Isi status");
   }
   @When("Klik button reset")
   public void klik_button_reset() {
	   returnPage.clickbtnRes();
	   extentTest.log(LogStatus.PASS,"Klik button reset");
   }
   @Then("Semua Field Akan Reset")
   public void semua_field_akan_reset() {
	   Assert.assertEquals(returnPage.getTxtReset(),"");
	   extentTest.log(LogStatus.PASS, "Semua Field Akan Reset");
   }
   
   //Test Case 4
   
   @When("Isi search tidak terdaftar")
   public void isi_search_tidak_terdaftar() {
	   returnPage.setSearch("FANDI");
       extentTest.log(LogStatus.PASS,"Isi search tidak terdaftar");
   }
   @When("Klik button search")
   public void klik_button_search() {
	   returnPage.clickbtnSearch();
	   extentTest.log(LogStatus.PASS,"Klik button search");
   }
   @Then("Tidak Menampilkan Data")
   public void tidak_menampilkan_data() {
	   Assert.assertEquals(returnPage.getTxtNoData(), "No data available in table");
	   extentTest.log(LogStatus.PASS, "Tidak Menampilkan Data");
   }
   
   //Test Case 5
   
   @When("Isi search terdaftar")
   public void isi_search_terdaftar() {
	   returnPage.setSearch("HANDI");
       extentTest.log(LogStatus.PASS,"Isi search tidak terdaftar");
   }
   
   @Then("Menampilkan Data")
   public void menampilkan_data() {
	   Assert.assertEquals(returnPage.getTxtSearch(), "HANDI SETIAWAN");
	   extentTest.log(LogStatus.PASS, "Menampilkan Data");
   }
   //Test Case 6
   @When("Klik button icon")
   public void klik_button_icon() {
	   returnPage.clickbtnIcon();
	   extentTest.log(LogStatus.PASS,"Klik button icon");
   }
   @Then("Menampilkan Halaman Upload")
   public void menampilkan_halaman_upload() {
	   String expected = returnPage.getTxtUpload();
	   Assert.assertEquals(returnPage.getTxtUpload(), expected); 
	   extentTest.log(LogStatus.PASS, "Menampilkan Halaman Upload");
   }
   //Test Case 7
   @When("Klik button Refresh")
   public void klik_button_refresh() {
	   returnPage.clickbtnRef();
	   extentTest.log(LogStatus.PASS,"Klik button Refresh");
   }
   @Then("Halaman Return Akan Refresh")
   public void halaman_return_akan_refresh() {
	   Assert.assertEquals(returnPage.getTxtReset(),"");
	   extentTest.log(LogStatus.PASS, "Halaman Return Akan Refresh");
   }
   
   
   //Entries
   @When("set 10 entries")
	public void set_10_entries() {
		returnPage.setEntries10();
		extentTest.log(LogStatus.PASS, "set 10 entries");
		}
   @Then("Menampilkan 10 Baris Data")
   public void menampilkan_10_baris_data() {
	   Assert.assertEquals(returnPage.getTxtReset(),"");
	   extentTest.log(LogStatus.PASS, "Menampilkan 10 Baris Data");
   }
   @When("set 25 entries")
  	public void set_25_entries() {
  		returnPage.setEntries25();
  		extentTest.log(LogStatus.PASS, "set 25 entries");
  		}
     @Then("Menampilkan 25 Baris Data")
     public void menampilkan_25_baris_data() {
  	   Assert.assertEquals(returnPage.getTxtReset(),"");
  	   extentTest.log(LogStatus.PASS, "Menampilkan 25 Baris Data");
     }
     @When("set 50 entries")
 	public void set_50_entries() {
 		returnPage.setEntries50();
 		extentTest.log(LogStatus.PASS, "set 50 entries");
 		}
    @Then("Menampilkan 50 Baris Data")
    public void menampilkan_50_baris_data() {
 	   Assert.assertEquals(returnPage.getTxtReset(),"");
 	   extentTest.log(LogStatus.PASS, "Menampilkan 10 Baris Data");
    }
    @When("set 100 entries")
   	public void set_100_entries() {
   		returnPage.setEntries100();
   		extentTest.log(LogStatus.PASS, "set 100 entries");
   		}
      @Then("Menampilkan 100 Baris Data")
      public void menampilkan_100_baris_data() {
   	   Assert.assertEquals(returnPage.getTxtReset(),"");
   	   extentTest.log(LogStatus.PASS, "Menampilkan 10 Baris Data");
      }
   
   //LogOut
   @Given("Berada Di Halaman Home Sales")
	public void Berada_Di_Halaman_Home_Sales() {
		driver.get(Constants.URLH);
	    extentTest.log(LogStatus.PASS,"Berada Di Halaman Home Sales");
	}
	@When("klik user Elva Yundra")
	public void klik_user_Elva_Yundra() {
		returnPage.clickBtnAdm();
		extentTest.log(LogStatus.PASS, "klik user Elva Yundra");
		}
}
