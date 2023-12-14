package com.zettamine.java.day4;

public class Vehicle  implements Loan, Insurance{
	 private String vehicleNumber;
	    private String modelName;
	    private String vehicleType;
	    private double price;

	    public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
	        this.vehicleNumber = vehicleNumber;
	        this.modelName = modelName;
	        this.vehicleType = vehicleType;
	        this.price = price;
	    }

	    // Getters and setters for the attributes

	    public String getVehicleNumber() {
	        return vehicleNumber;
	    }

	    public void setVehicleNumber(String vehicleNumber) {
	        this.vehicleNumber = vehicleNumber;
	    }

	    public String getModelName() {
	        return modelName;
	    }
	    public void setModelName(String modelName) {
	        this.modelName = modelName;
	    }

	    public String getVehicleType() {
	        return vehicleType;
	    }

	    public void setVehicleType(String vehicleType) {
	        this.vehicleType = vehicleType;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    // Implementation of the Loan interface

	    @Override
	    public double issueLoan( String vehicleType ) {
	    	if (vehicleType.equals("4wheeler")) {
	            return 0.8 * price;
	        } else if (vehicleType.equals("3wheeler")) {
	            return 0.75 * price;
	        } else if (vehicleType.equals("2wheeler")) {
	            return 0.5 * price;
	        } else {
	            return 0;
	        }
	    }

	    // Implementation of the Insurance interface

	    @Override
	    public double takeInsurance(double price) {
	        if (price <= 150000) {
	            return 3500;
	        } else if(price>=150000 && price<=300000 )
	        	return 4000;
	        else if(price >300000 )
	        return  50000;
	        {
	        	return 0;
	            
	    }
	    }

		@Override
		public double issueLoan() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double takeInsurance() {
			// TODO Auto-generated method stub
			return 0;
		}



}
