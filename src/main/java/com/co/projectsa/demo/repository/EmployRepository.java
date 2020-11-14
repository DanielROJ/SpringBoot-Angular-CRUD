package com.co.projectsa.demo.repository;

import com.co.projectsa.demo.model.Employ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployRepository extends JpaRepository<Employ,Integer> {
}
