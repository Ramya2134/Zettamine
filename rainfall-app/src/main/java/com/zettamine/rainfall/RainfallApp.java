package com.zettamine.rainfall;

import com.zettamine.rainfall.services.AnnualRainfallServices;
import com.zettamine.rainfall.services.AnnualRainfallServicesImpl;
import com.zettamine.rainfall.services.RainFallReport;

public class RainfallApp {

	public static void main(String[] args) throws ClassNotFoundException {
		AnnualRainfallServices services = new AnnualRainfallServicesImpl();

		services.addRainfallReport(RainFallReport.generateRainfallReport(
				"D:\\advjava-projects\\zettamine-main\\zettamine\\jdbc\\case study\\AllCityMonthlyRainfall1.txt"));

		services.getMaxRainFall();
	}

}
