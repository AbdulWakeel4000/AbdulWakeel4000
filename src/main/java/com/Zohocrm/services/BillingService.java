package com.Zohocrm.services;

import java.util.List;

import com.Zohocrm.entities.Billing;
import com.Zohocrm.entities.Lead;

public interface BillingService {

	public void generateOneBill(Billing bill);

	public Billing getBilling(long id);

//1
	public List<Billing> findAllBills();

	
}
