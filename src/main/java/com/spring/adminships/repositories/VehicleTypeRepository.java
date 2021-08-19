package com.kindsonthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetapp.models.*;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
