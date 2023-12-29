package com.zettamine.rainfal;

public class Snippet {
	AnnualRainfallServices services = new AnnualRainfallServicesImpl();
	
			services.addRainfallReport(RainFallReport.generateRainfallReport(
					"D:\\advjava-projects\\zettamine-main\\zettamine\\jdbc\\case study\\AllCityMonthlyRainfall1.txt"));
	
			services.getMaxRainFall();
}

