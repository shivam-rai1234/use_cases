package com.vehicle.assignment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BikeRepo extends JpaRepository<BikeEntity,Integer>{
	@Query(value="SELECT * from car c JOIN bike b ON c.nooftyres=b.noOfTyre group by car_name order by;",nativeQuery=true)
	public List<BikeEntity> getjoin1();

}
