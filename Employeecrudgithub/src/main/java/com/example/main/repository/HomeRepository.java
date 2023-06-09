package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.model.Employee;

@Repository
public interface HomeRepository extends JpaRepository<Employee, Integer>
{

}
