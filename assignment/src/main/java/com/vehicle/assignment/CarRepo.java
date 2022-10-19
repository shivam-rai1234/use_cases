package com.vehicle.assignment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarRepo extends JpaRepository<CarEntity,Integer>{

	@Query(value="SELECT * from car c JOIN Truck t ON c.noOftyre=t.noOftyre;",nativeQuery=true)
	public List<CarEntity> getjoin();

	}
