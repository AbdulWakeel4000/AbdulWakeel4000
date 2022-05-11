package com.Zohocrm.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Zohocrm.entities.Lead;

@Service
public interface LeadService {

	public void savelead(Lead lead) ;

	public List<Lead> findAllLeads();

	public Lead getLead(long id);

	public void deleteLead(long id);

		

	
}
