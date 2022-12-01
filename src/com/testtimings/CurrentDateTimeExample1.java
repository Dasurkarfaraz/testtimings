package com.testtimings;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
public class CurrentDateTimeExample1 {  
  public static void main(String[] args) {  
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyy");
   LocalDateTime now = LocalDateTime.now();
   System.out.println(dtf.format(now));
   DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");
   LocalDateTime now1 = LocalDateTime.now();
   System.out.println(dtf1.format(now1));
   DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
   LocalDateTime now2 = LocalDateTime.now();
   System.out.println(dtf2.format(now2));
   
  }  
}  
