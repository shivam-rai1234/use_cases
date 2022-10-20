package com.assignment20oct.insurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/abhitayu_sharma")
	public List<ClientEntity> getjoi(){
		return c1.getjoin(1);
	}
	@GetMapping("/akshit_anand")
	public List<ClientEntity> getjo(){
		return c2.getjoin(2);
	}
	@GetMapping("/shivam_rai")
	public List<ClientEntity> getjoy(){
		return c3.getjoin(3);
	}
	@GetMapping("/arghya")
	public List<ClientEntity> getji(){
		return c4.getjoin(5);
	}
	@GetMapping("/chachi_420")
	public List<ClientEntity> getoi(){
		return c5.getjoin(5);
	}
	

}
