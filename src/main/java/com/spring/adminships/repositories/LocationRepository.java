package com.spring.adminships.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.repository.CrudRepository;*/
import org.springframework.stereotype.Repository;

import com.spring.adminships.models.*;
@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
