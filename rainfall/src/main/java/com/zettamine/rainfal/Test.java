package com.zettamine.rainfal;

import com.zettamine.rainfal.services.AnnualRainfallServices;
import com.zettamine.rainfal.services.AnnualRainfallServicesImpl;
import com.zettamine.rainfal.services.RainFallReport;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		AnnualRainfallServices services = new AnnualRainfallServicesImpl();

		services.addRainfallReport(RainFallReport.generateRainfallReport(
				"D:\\advjava-projects\\zettamine-main\\zettamine\\jdbc\\case study\\AllCityMonthlyRainfall1.txt"));

		services.getMaxRainFall();
	}

}
