package com.burpup.demo.model.dto;

public class Injury {
	private Injury injury = new Injury();
	private Injury() {}
	public Injury getInjury() {
		return injury;
	}
	
/////////////////////////////////////
	
	int injury_id;
	String injury_name;
	
	public int getInjury_id() {
		return injury_id;
	}
	public void setInjury_id(int injury_id) {
		this.injury_id = injury_id;
	}
	public String getInjury_name() {
		return injury_name;
	}
	public void setInjury_name(String injury_name) {
		this.injury_name = injury_name;
	}
	@Override
	public String toString() {
		return "Injury [injury=" + injury + ", injury_id=" + injury_id + ", injury_name=" + injury_name + "]";
	}
	
	

}
