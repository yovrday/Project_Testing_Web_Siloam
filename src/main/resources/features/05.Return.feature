Feature: Form Return Sales

Scenario: Input End Date Lebih Lama Dari Start Date
Given Masuk Ke Halaman Return
When Isi start date 
When Isi end date lebih lama
When Isi status pending
And Klik button Filter
Then Tidak Menampilkan Data Return

Scenario: Input Semua dengan Status Pending
Given Masuk Ke Halaman Return
When Isi start date 
When Isi end date
When Isi status pending
And Klik button Filter
Then Menampilkan Data Pending

Scenario: Input Semua dengan Status Complete
Given Masuk Ke Halaman Return
When Isi start date 
When Isi end date
When Isi status complete
And Klik button Filter
Then Menampilkan Data Complete

Scenario: Reset Data
Given Masuk Ke Halaman Return
When Isi start date 
When Isi end date
When Isi status
When Klik button Filter
And Klik button reset
Then Semua Field Akan Reset

Scenario: Search Data Tidak Terdaftar
Given Masuk Ke Halaman Return
When Isi search tidak terdaftar
And Klik button search
Then Tidak Menampilkan Data

Scenario: Search Data Terdaftar
Given Masuk Ke Halaman Return
When Isi search terdaftar
And Klik button search
Then Menampilkan Data

Scenario: Upload Document Data
Given Masuk Ke Halaman Return
When Klik button icon
Then Menampilkan Halaman Upload 

Scenario: Refresh Data
Given  Masuk Ke Halaman Return
When Isi start date 
When Isi end date
When Isi status
When Klik button Filter
And Klik button Refresh
Then Halaman Return Akan Refresh

Scenario: Show Entries Data 10
Given  Masuk Ke Halaman Return
When set 10 entries
Then Menampilkan 10 Baris Data

Scenario: Show Entries Data 25
Given  Masuk Ke Halaman Return
When set 25 entries
Then Menampilkan 25 Baris Data

Scenario: Show Entries Data 50
Given  Masuk Ke Halaman Return
When set 50 entries
Then Menampilkan 50 Baris Data

Scenario: Show Entries Data 100
Given  Masuk Ke Halaman Return
When set 100 entries
Then Menampilkan 100 Baris Data


  Scenario: Logout Sales
   	Given Berada Di Halaman Home Sales
   	When klik user Elva Yundra
    When klik logout
    Then Kembali Ke Halaman Login