package com.zettamine.rainfall.dto;

public class AnnualRainfall {
	private int cityPincode;
	private String cityName;
	private double averageAnnualRainfall;

	public int getCityPincode() {
		return cityPincode;
	}

	public void setCityPincode(int cityPincode) {
		this.cityPincode = cityPincode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getAverageAnnualRainfall() {
		return averageAnnualRainfall;
	}

	public void setAverageAnnualRainfall(double averageAnnualRainfall) {
		this.averageAnnualRainfall = averageAnnualRainfall;
	}

	public AnnualRainfall(int cityPincode, String cityName, double averageAnnualRainfall) {
		super();
		this.cityPincode = cityPincode;
		this.cityName = cityName;
		this.averageAnnualRainfall = averageAnnualRainfall;
	}
	public AnnualRainfall(int cityPincode, String cityName) {
		super();
		this.cityPincode = cityPincode;
		this.cityName = cityName;
	}
	
	
	
	
	public void calculateAnnualAverageRainfall(double[] rainfall) {
		
		double avgRainfall = 0;
		for(double rain : rainfall)
		{
			avgRainfall = avgRainfall+rain;
		}
		
		this.averageAnnualRainfall = avgRainfall/rainfall.length;
		
	}

	@Override
	public String toString() {
		return "AnnualRainfall [cityPincode=" + cityPincode + ", cityName=" + cityName + ", averageAnnualRainfall="
				+ averageAnnualRainfall + "]";
	}

}
