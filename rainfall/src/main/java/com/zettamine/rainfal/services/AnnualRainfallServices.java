package com.zettamine.rainfal.services;

import java.util.List;

import com.zettamine.rainfal.dto.AnnualRainfall;

public interface AnnualRainfallServices {
	void getMaxRainFall();

	void addRainfallReport(List<AnnualRainfall> rainfallList);

	void addRainfallReport1(List<AnnualRainfall> rainfallList);


}
