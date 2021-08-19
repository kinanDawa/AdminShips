package com.spring.adminships.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.adminships.models.*;
@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
