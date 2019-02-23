package com.marlabs.tostring;

public class MarlabsTrainee {
	int tarineeNumber;
	String traineeName;
	String TraineeLocation;
	String PrefferedLocation;
	String TraineeDep;
	public MarlabsTrainee(int tarineeNumber, String traineeName, String traineeLocation, String prefferedLocation,
			String traineeDep) {
	
		this.tarineeNumber = tarineeNumber;
		this.traineeName = traineeName;
		TraineeLocation = traineeLocation;
		PrefferedLocation = prefferedLocation;
		TraineeDep = traineeDep;
	}
	
	
	public MarlabsTrainee() {
		TraineeLocation = "New York";
		PrefferedLocation = "London";
		TraineeDep = "UI";
	}


	public MarlabsTrainee(int tarineeNumber, String traineeName) {
		this();
		this.tarineeNumber = tarineeNumber;
		this.traineeName = traineeName;
		
		//display();
	}
	
	public void display() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return String.format(
				"MarlabsTrainee [tarineeNumber=%s, traineeName=%s, TraineeLocation=%s, PrefferedLocation=%s, TraineeDep=%s]",
				tarineeNumber, traineeName, TraineeLocation, PrefferedLocation, TraineeDep);
	}
	
	

}
