package com.assignment20oct.insurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance_client")

public class ClientEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String client_name;
	private String sex;
	private Integer age;
	private String Insurance_plan;
	private Integer year_plan;
	private String plan_issue;
	private String plan_expire;
	private String Insurance_type;
	public String getInsurance_type() {
		return Insurance_type;
	}
	public void setInsurance_type(String insurance_type) {
		Insurance_type = insurance_type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getInsurance_plan() {
		return Insurance_plan;
	}
	public void setInsurance_plan(String insurance_plan) {
		Insurance_plan = insurance_plan;
	}
	public Integer getYear_plan() {
		return year_plan;
	}
	public void setYear_plan(Integer year_plan) {
		this.year_plan = year_plan;
	}
	public String getPlan_issue() {
		return plan_issue;
	}
	public void setPlan_issue(String plan_issue) {
		this.plan_issue = plan_issue;
	}
	public String getPlan_expire() {
		return plan_expire;
	}
	public void setPlan_expire(String plan_expire) {
		this.plan_expire = plan_expire;
	}
}
