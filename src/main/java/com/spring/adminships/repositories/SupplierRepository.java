package com.spring.adminships.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.adminships.models.*;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
