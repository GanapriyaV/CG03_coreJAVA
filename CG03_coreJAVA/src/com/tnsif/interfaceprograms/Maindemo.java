package com.tnsif.interfaceprograms;

interface GPS{
	void TrackLocation();
	void CalculateRoute(String Destination);
}

interface VehicleSafety{
	void DetectCollision(boolean CollisionDetected);
	void ApplyEmergenceBrake();
}

class SmartVehicle implements GPS, VehicleSafety{
	
	private String VehicleNumber;
	private String VehicleModel;
	private double CurrentSpeed;
	private String Location;
	private final double SpeedLimit = 100.0;
	private boolean safetyStatus;
	
	

	public SmartVehicle(String vehicleNumber, String vehicleModel, double currentSpeed, String location) {
		super();
		VehicleNumber = vehicleNumber;
		VehicleModel = vehicleModel;
		CurrentSpeed = currentSpeed;
		Location = location;
		this.safetyStatus = true;
	}

	@Override
	public void DetectCollision(boolean CollisionDetected) {
		if(CollisionDetected) {
			System.out.println("Alert. Collision detected!");
			ApplyEmergenceBrake();
		}else {
			System.out.println("Collision sensor scan. Clear");
		}
	}

	@Override
	public void ApplyEmergenceBrake() {
		System.out.println("Automatically activating emergency braking system!");
		this.CurrentSpeed = 0;
		this.safetyStatus = false;
	}
	
	public void checkSpeedLimit() {
		if(this.CurrentSpeed>SpeedLimit) {
			System.out.println("[WARNING] Speed Limit exceeded! Your speed: "+CurrentSpeed+" km/h (Limit: "+SpeedLimit+" km/h)");
		}else {
			System.out.println("Speed is within safe limits.");
		}
	}

	@Override
	public void TrackLocation() {
		System.out.println("Tracking Location: Current Location is: "+Location);
	}

	@Override
	public void CalculateRoute(String Destination) {
		System.out.println("Calculating optimal route from "+Location+" to "+Destination+"...");
	}
	
	void display() {
		System.out.println("Vehicle details ");
		System.out.println("Vehicle Number: "+VehicleNumber);
		System.out.println("Vehicle Model: "+VehicleModel);
		System.out.println("Vehicle Location: "+Location);
		System.out.println("Current Speed: "+CurrentSpeed);
		System.out.println("Safety Status: "+(safetyStatus ? "SECURE" : "CRITICAL/BRAKES APPIED"));
	}
	
}
public class Maindemo {
public static void main(String[] args) {
	SmartVehicle v=new SmartVehicle("KA03LA9084", "Mahindra Thar", 90.0, "Electronic City");
	v.display();
	v.checkSpeedLimit();
	
	System.out.println("Activation GPS Navigatio....");
	v.TrackLocation();
	v.CalculateRoute("Whitefield");
	
	System.out.println("Running safety Checks....");
	v.DetectCollision(false);
	
	v.DetectCollision(true);
}
}
