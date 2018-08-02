package com.fb.DataHandler;

import com.fb.DataRepository.LandingPageData;

public class LandingPageDataHandler extends ExcelHandler{
	
	private static String SheetName="LandingPage";
	
	
	public static LandingPageData get(String rowName) {
		LandingPageData LPdata=new  LandingPageData();
		LPdata.setLoginUserName(xls.getCellData(SheetName, rowName, "loginUserName"));
		LPdata.setLoginPassword(xls.getCellData(SheetName, rowName, "loginPassword"));
		LPdata.setFirstName(xls.getCellData(SheetName, rowName, "FirstName"));
		return LPdata;
	}
	
	

}
