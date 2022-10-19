package com.vehicle.assignment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "car")
public class CarEntity {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int carid;
		public int getCarid() {
			return carid;
		}
		public void setCarid(int carid) {
			this.carid = carid;
		}
		public String getCar_name() {
			return car_name;
		}
		public void setCar_name(String car_name) {
			this.car_name = car_name;
		}
		public int getNooftyres() {
			return nooftyres;
		}
		public void setNooftyres(int nooftyres) {
			this.nooftyres = nooftyres;
		}
		private String car_name;
		private int nooftyres;
}
