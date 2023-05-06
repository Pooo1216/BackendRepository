package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.model.Applicant;

@Repository
public interface applicantRepository extends JpaRepository<Applicant, Integer>
{

}
