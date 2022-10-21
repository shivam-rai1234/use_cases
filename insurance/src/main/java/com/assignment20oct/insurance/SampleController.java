package com.assignment20oct.insurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SampleController {
	
	@Autowired
	private ClientRepo c1;
	@Autowired
	private ClientRepo c2;
	@Autowired
	private ClientRepo c3;
	@Autowired
	private ClientRepo c4;
	@Autowired
	private ClientRepo c5;
	
	@GetMapping("/abhitayu sharma")
	public List<ClientEntity> getjoi(){
		return c1.getjoin(1);
	
	}
	@GetMapping("/akshit anand")
	public List<ClientEntity> getjoi2(){
		return c2.getjoin(2);
	
	}
	@GetMapping("/shivam rai")
	public List<ClientEntity> getjoi3(){
		return c3.getjoin(2);
	
	}
	@GetMapping("/arghya")
	public List<ClientEntity> getjoi4(){
		return c4.getjoin(2);
	
	}
	@GetMapping("/chachi 420")
	public List<ClientEntity> getjoi5(){
		return c5.getjoin(2);
	
	}
	@GetMapping("/client_discount/{ten}/{premium}")
	public int discount(@PathVariable String ten, @PathVariable int premium) {
			
			final String type1="greaterthan5";
			final String type2="equalthan5";
			final String type3="lessthan5";
			
			final int percentage=12;
			final int percentag=10;
			int a=0;
		
					if (ten==type1)
					   {
							
							a=(premium*percentage)/100;
							premium=premium-a;
							return premium;
					   }
					if (ten.equals(type2))
					   {
							a=(premium*percentag)/100;
							premium=premium-a;
							return premium;
					   }
					else if (ten.equals(type3)) 
						{
							return premium;
						}
			return 0;
		
	}

}
