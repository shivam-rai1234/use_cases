package com.vehicle.assignment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TruckRepo extends JpaRepository<TruckEntity,Integer>{
	@Query(value="SELECT * from car c JOIN truck t ON c.noOftyres=t.noOfTyre;",nativeQuery=true)
	public List<TruckEntity> getjoin2();

}
