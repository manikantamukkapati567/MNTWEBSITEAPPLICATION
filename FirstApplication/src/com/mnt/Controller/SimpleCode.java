package com.mnt.Controller;

import java.util.Calendar;
import java.util.Date;

public class SimpleCode 
{
   public void getOutput()
   {
	   Calendar cal=Calendar.getInstance();
	   int c=cal.getFirstDayOfWeek();
	   System.out.println(c);
	   Date date=new Date();
	   System.out.println(date.getHours());
	   System.out.println(date.getTime());
   }
}
