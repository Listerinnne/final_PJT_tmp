package com.burpup.demo.model.dto;

public class Muscle {
	private Muscle muscle = new Muscle();
	private Muscle() {};
	public Muscle getMuscle() {
		return muscle;
	}

	/////////////////////////////////////
	
	int muscle_id;
	String muscle_name;
	
	public int getMuscle_id() {
		return muscle_id;
	}
	public void setMuscle_id(int muscle_id) {
		this.muscle_id = muscle_id;
	}
	public String getMuscle_name() {
		return muscle_name;
	}
	public void setMuscle_name(String muscle_name) {
		this.muscle_name = muscle_name;
	}
	@Override
	public String toString() {
		return "Muscle [muscle=" + muscle + ", muscle_id=" + muscle_id + ", muscle_name=" + muscle_name + "]";
	}
	
	
}
