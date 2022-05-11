package com.Zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Zohocrm.entities.Billing;
import com.Zohocrm.entities.Lead;
import com.Zohocrm.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void generateOneBill(Billing bill) {

		billingRepo.save(bill);
	}

	@Override
	public Billing getBilling(long id) {

		Billing bill = billingRepo.getById(id);
		return bill;
	}

	//1
	@Override
	public List<Billing> findAllBills() {
		List<Billing> bills = billingRepo.findAll();
		return bills;
	}

	

}
