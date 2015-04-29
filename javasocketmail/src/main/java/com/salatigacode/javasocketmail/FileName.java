package com.salatigacode.javasocketmail;

import java.util.Calendar;


/*
 * Created on Dec 4, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author hendro
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class FileName {
	private String fileName;
	private String currDate;
	public FileName(){}
	
	public String getFileName(){
		Calendar rightNow = Calendar.getInstance();
		String bulan="";
		String AM_PM="";	
		switch(rightNow.get(Calendar.MONTH)){
			case 0 : bulan="Januari";break;
			case 1 : bulan="Februari";break;
			case 2 : bulan="Maret";break;
			case 3 : bulan="April";break;
			case 4 : bulan="Mey";break;
			case 5 : bulan="Juni";break;
			case 6 : bulan="Juli";break;
			case 7 : bulan="Agustus";break;
			case 8 : bulan="September";break;
			case 9: bulan="Oktober";break;
			case 10: bulan="November";break;
			case 11: bulan="Desember";break;
		}
		switch(rightNow.get(Calendar.AM_PM)){
			case 0 : AM_PM = "AM";break;
			case 1 : AM_PM = "PM";break;
		}		
		fileName = "MailBank/"+rightNow.get(Calendar.YEAR)+"_"+rightNow.get(Calendar.DATE)+"_"+
					bulan+"_"+rightNow.get(Calendar.HOUR)+"_"+
					rightNow.get(Calendar.MINUTE)+"_"+rightNow.get(Calendar.SECOND)+"_"+AM_PM+".mail";	
		return fileName;
	}	
	public String getCurrDate(){
		Calendar rightNow = Calendar.getInstance();
		String bulan="";
		String AM_PM="";		
		switch(rightNow.get(Calendar.MONTH)){
			case 0 : bulan="Januari";break;
			case 1 : bulan="Februari";break;
			case 2 : bulan="Maret";break;
			case 3 : bulan="April";break;
			case 4 : bulan="Mey";break;
			case 5 : bulan="Juni";break;
			case 6 : bulan="Juli";break;
			case 7 : bulan="Agustus";break;
			case 8 : bulan="September";break;
			case 9: bulan="Oktober";break;
			case 10: bulan="November";break;
			case 11: bulan="Desember";break;
		}
		switch(rightNow.get(Calendar.AM_PM)){
			case 0 : AM_PM = "AM";break;
			case 1 : AM_PM = "PM";break;
		}		
		currDate = rightNow.get(Calendar.DATE)+"/"+bulan+"/"+
					rightNow.get(Calendar.YEAR)+" "+rightNow.get(Calendar.HOUR)+":"+
					rightNow.get(Calendar.MINUTE)+":"+rightNow.get(Calendar.SECOND)+" "+AM_PM;	
		return currDate;
		
	}	
}
