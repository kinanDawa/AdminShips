package com.kindsonthegenius.fleetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.fleetapp.models.*;
@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
