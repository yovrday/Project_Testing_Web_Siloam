package com.juaracoding.ProjectSiloam.utils;

public enum TestScenarios {
	//Login Admin
    T1("Url Invalid"),
	T2("Url Valid"),
	T3("Field Username dan Password Kosong pada Admin"),
    T4("Field Username Kosong dan Password Salah pada Admin"),
    T5("Field Username Salah dan Password Kosong pada Admin"),
    T6("Field Username dan Password Salah pada Admin"),
    T7("Field Username Salah dan Password Benar pada Admin"),
    T8("Field Username Benar dan Password Salah pada Admin"),
    T9("Field Username Kapital Benar dan Password Salah pada Admin"),
    T10("Field Username Benar dan Password Kapital Benar pada Admin"),
	T11("Field Username dan Password Benar pada Admin"),
 
	//View&Export
	T12("Field Start date dan End date kosong ketika View"),
	T13("Field Start date benar dan End date kosong ketika View"),
	T14("Field Start date kosong dan End date benar ketika View"),
	T15("Field End Date lebih lama dari Start Date ketika View"),
    T16("Field Start date dan End date benar ketika View"),
    T17("Foto Faskes Awal"),
    T18("Foto Faskes Tujuan"),
    T19("PDF Aggrement"),
    T20("View Data"),
    T21("View Data Before"),
    T22("View Data After"),
	T23("Preview Data"),
	T24("Back View Data"),
	T25("Field Start date dan End date kosong ketika Export"),
    T26("Field Start date benar dan End date kosong ketika Export"),
    T27("Field Start date kosong dan End date benar ketika Export"),
    T28("Field Start date dan End date benar ketika Export"),
    T29("Export Data"),
    T30("Field Start date dan End date kosong ketika Download"),
    T31("Field Start date benar dan End date kosong ketika Download"),
    T32("Field Start date kosong dan End date benar ketika Download"),
	T33("Field Start date dan End date benar ketika Download"),
	T34("Download Data"),
	T35("Refresh Data"),
	
	//Logout Admin
	T36("Logout Admin"),
	
	//Login Sales
	T37("Field Username dan Password Kosong pada Sales"),
    T38("Field Username Kosong dan Password Salah pada Sales"),
    T39("Field Username Salah dan Password Kosong pada Sales"),
    T40("Field Username dan Password Salah pada Sales"),
    T41("Field Username Salah dan Password Benar pada Sales"),
    T42("Field Username Benar dan Password Salah pada Sales"),
	T43("Field Username dan Password Benar pada Sales"),
	
	//Return
	T44("Input End Date Lebih Lama Dari Start Date"),
	T45("Input Semua dengan Status Pending"),
	T46("Input Semua dengan Status Complete"),
    T47("Reset Data"),
    T48("Search Data Tidak Terdaftar"),
    T49("Search Data Terdaftar"),
    T50("Upload Document Data"),
    T51("Refresh Data"),
    T52 ("Show Entries 10"),
    T53 ("Show Entries 25"),
    T54 ("Show Entries 50"),
    T55 ("Show Entries 100"),
  //Logout Sales
  	T56("Logout Sales");
	
	//Upload Ducument
//	T44("Mengisi Input Data Valid"),
//	T45("Tidak Upload Foto Faskes Awal dan Klik Cancel"),
//	T46("Tidak Upload Foto Faskes Tujuan dan Klik Cancel"),
//    T47("Tidak Upload Foto TTD Digital dan Klik Cancel"),
//    T48("Tidak Upload Foto Faskes Awal dan Klik Simpan"),
//    T49("Tidak Upload Foto Faskes Tujuan dan Klik Simpan"),
//    T50("Tidak Upload Foto TTD Digital dan Klik Simpan"),
//    T51("Upload Foto Faskes Awal dan Klik Cancel"),
//    T52("Upload Foto Faskes Tujuan dan Klik Cancel"),
//	T53("Upload Foto TTD Digital dan Klik Cancel"),
//	T54("Upload Foto Faskes Awal File Oversize"),
//    T55("Upload Foto Fakses Tujuan File Oversize "),
//    T56("Upload Foto TTD Digital File Oversize"),
//    T57("Hanya Upload Foto Faskes Awal"),
//    T58("Upload Foto Faskes Awal dan Foto Faskes Tujuan"),
//    T59("Upload Semua Foto"),
//	
//	//Return
//	T60("Input End Date Lebih Lama Dari Start Date"),
//	T61("Input Semua dengan Status Pending"),
//	T62("Input Semua dengan Status Complete"),
//    T63("Reset Data"),
//    T64("Search Data Tidak Terdaftar"),
//    T65("Search Data Terdaftar"),
//    T66("Upload Document Data"),
//    T67("Refresh Data"),
//    
//	//Logout Sales
//	T68("Logout Sales");
	
    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
