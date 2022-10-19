package com.vehicle.assignment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bike")
public class BikeEntity  {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bikeid;
	private String bike_name;
	private int noOftyre;
	public int getBikeid() {
		return bikeid;
	}
	public void setBikeid(int bikeid) {
		this.bikeid = bikeid;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public int getNoOftyre() {
		return noOftyre;
	}
	public void setNoOftyre(int noOftyre) {
		this.noOftyre = noOftyre;
	}
	


}
