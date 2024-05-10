@DBUS11Log
 Feature:Log Sutun İsimleri ve Bilgileri Dogrulama
   @DBUS11LogTC01
    Scenario:TC_01 Log Sutun İsimlerini Dogrulama
      Given Database baglantisi kurulur suleyman
      And Sutun isimleri datasi duzenlenir
      When Sutun İsimleri datasini almak icin query gonderilir
      Then Sutun isimleri dogrulanir
   @DBUS11LogTC02
   Scenario:TC_02 Log Sutun Bilgilerini Dogrulama
     Given Database baglantisi kurulur suleyman
     And Sutun Bilgileri datasi duzenlenir
     When Sutun bilgileri datasini almak icin query gonderilir
     Then Sutun bilgileri dogrulanir