package com.juaracoding.ProjectSiloam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.ProjectSiloam.drivers.DriverSingleton;

public class ReturnPage {
	
	private static WebDriver driver;
	
	  public ReturnPage() {
	        this.driver = DriverSingleton.getDriver();
	        PageFactory.initElements(driver, this);
	    }
	  //LogOut
	  @FindBy(xpath = "//span[@class='d-none d-md-inline']")
	   WebElement btnUserSales;
	@FindBy(xpath = "//a[@class='dropdown-item']")
	   WebElement btnLogout;
	  
	  @FindBy(xpath = "//span[normalize-space()='New']")
	   WebElement New;
	  @FindBy(xpath = "//input[@id='tgl']")
	   WebElement sdate;
	  @FindBy(xpath = "//input[@id='tgl2'] ")
	   WebElement edate;
	  
	  @FindBy(xpath = "/html/body/div[7]/div[1]/table/tbody/tr[4]/td[7]")
	   WebElement sdate24;
	  @FindBy(xpath = "/html/body/div[7]/div[1]/table/tbody/tr[4]/td[7]")
	   WebElement edate24;
	  @FindBy(xpath = "/html/body/div[7]/div[1]/table/tbody/tr[4]/td[5]")
	   WebElement edate22;
	  @FindBy(xpath = "//span[@id='select2-status-container']")
	   WebElement status;
	  @FindBy(xpath = "//input[@role='textbox']")
	   WebElement status2;
	  @FindBy(xpath = "//button[@id='btn-filter']")
	   WebElement btnFilter;
	  @FindBy(xpath = "//button[@id='btn-reset']")
	   WebElement btnReset;
	
	  @FindBy(xpath = "//select[@name='table_length']")
	   WebElement selEntries;
	  
	  @FindBy(xpath = "//input[@type='search'] ")
	   WebElement Search;
	  @FindBy(xpath = "//i[@class='fa fa-search']")
	   WebElement btnSearch;
	  @FindBy(xpath = "//span[@id='btnRefresh']")
	   WebElement btnRefresh;
	  @FindBy(xpath = "//tbody/tr[1]/td[7]/center[1]/a[1]/span[1]")
	   WebElement btnIcon;
	
	  //Alert
	  @FindBy(xpath = "//h1[@class='page-header']")
	   WebElement txtFormReturn;
	  @FindBy(xpath = "//tbody/tr[1]/td[7]/span[1]")
	   WebElement txtDataCom;
	  @FindBy(xpath = " /html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/center[1]/a[1]/span[1]")
	   WebElement txtDataPen;
	  @FindBy(xpath = "//td[@class='dataTables_empty']")
	   WebElement txtNoData;
	  @FindBy(xpath = "//td[normalize-space()='HANDI SETIAWAN']")
	   WebElement txtSearch;
	  @FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
	   WebElement txtUpload;
	  @FindBy(xpath = "//b[normalize-space()='DIKA | SILOAM']")
	   WebElement txtLogin;
	  
	  //Filter Data
	  
	  public void clickbtnNew(){
	      	 New.click();
	      	}
	  public void setStartDate() {
		  sdate.click();
		  sdate24.click();
	     }
	  public void setEndDate(){
		  edate.click();
		  edate24.click();
	    }
	  public void setEndDate22(){
		  edate.click();
		  edate22.click();
	    }
	  public void setStatusComp(){
		  //new Select(driver.findElement(By.xpath("//span[@id='select2-status-container']")));
		  //new Select(status).selectByValue("Complete");
		  status.click();
		  status2.sendKeys("Complete");
		  this.status2.sendKeys(Keys.ENTER);
	    }
	  public void setStatusPen(){
		  //new Select(status).selectByValue("Pending");
		  status.click();
		  status2.sendKeys("Pending");
		  this.status2.sendKeys(Keys.ENTER);
      	}
	  
	  public void setEntries10(){
		  new Select(selEntries).selectByValue("10");
		  
      	}
	  public void setEntries25(){
		  new Select(selEntries).selectByValue("25");
		  
      	}
	  public void setEntries50(){
		  new Select(selEntries).selectByValue("50");
		  
      	}
	  public void setEntries100(){
		  new Select(selEntries).selectByValue("100");
		  
      	}
	  public void clickbtnFil(){
	      	 btnFilter.click();
	      	}
	  public void clickbtnRes(){
	      	 btnReset.click();
	      	}
	  public void clickbtnIcon(){
	      	 btnIcon.click();
	      	}
	  //Search Data
	  public void setSearch(String search) {
		    this.Search.sendKeys(search);
		    this.Search.sendKeys(Keys.TAB);
		     }
	  public void clickbtnSearch(){
	      	 btnSearch.click();
	      	}
	  public void clickbtnRef(){
	      	 btnRefresh.click();
	      	}
	  
	  //LogOut
	  public void clickBtnAdm(){
	        btnUserSales.click();
	    }public void clickBtnLogout(){
	        btnLogout.click();
	    }
	    public String getTxtLogin(){
	        return txtLogin.getText();
	    }
	  
	  public String getTxtReset(){
		    return sdate.getText();
		    }
	  public String getTxtPen(){
		    return txtDataPen.getText();
		    }
	  public String getTxtCom(){
		    return txtDataCom.getText();
		    }
	  public String getTxtFormReturn(){
		    return txtFormReturn.getText();
		    }
	  public String getTxtNoData(){
		    return txtNoData.getText();
		    }
	  public String getTxtSearch(){
		    return txtSearch.getText();
		    }
	  public String getTxtUpload(){
		    return txtUpload.getText();
		    }
}
