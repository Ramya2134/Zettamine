package com.zettamine.rainfal.dao;

import java.util.List;

import com.zettamine.rainfal.dto.AnnualRainfall;

public interface AnnualRainfallDAO {
int addRainfallReport(int pincode, String cityName, double avgRainfall);
	
	List<AnnualRainfall> getMaxRainFall();

}
