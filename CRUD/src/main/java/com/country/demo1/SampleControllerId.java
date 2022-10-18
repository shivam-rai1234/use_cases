package com.country.demo1;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleControllerId {
	@Autowired
	private EmployeeRepo er;
	
	@GetMapping("/Id") 
	public List<Integer> getSample(){
		ArrayList<Integer> transformedvalues=new ArrayList<Integer>();
    	for(EmployeeEntity emt:er.findAll()) {
    		
    		
    		transformedvalues.add(emt.getId());
    	}
    	return transformedvalues;
	}

	

	@GetMapping("/employeename") 
	public List<String> getSample1(){
		List<String> transformedvalues=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		
    		
    		transformedvalues.add(emt.getEmployee_name());
    	}
    	return transformedvalues;
	}
	@GetMapping("/A") 
	public List<EmployeeEntity> getSample3(){
		ArrayList<EmployeeEntity> transformedvalues=new ArrayList<EmployeeEntity>();
    	
		for(EmployeeEntity emt:er.findAll()) {
    		EmployeeEntity temp=new EmployeeEntity();
    		if(emt.getEmployee_name().startsWith("a")) {
    		temp.setId(emt.getId());
    		temp.setEmployee_name(emt.getEmployee_name());
    		transformedvalues.add(temp);
    		}
    	}
    	return transformedvalues;
	
	}
	
	@GetMapping("/department") 
	public List<String> getSample4(){
		ArrayList<String> transformedvalues=new ArrayList<String>();
    	
		for(EmployeeEntity emt:er.findAll()) {
    		EmployeeEntity temp=new EmployeeEntity();
    		;
    		transformedvalues.add(emt.getDepartment());
    		}
    	
    	return transformedvalues;
	
	}
}
