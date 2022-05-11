package com.Zohocrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Zohocrm.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
