package com.Zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Zohocrm.entities.Billing;
import com.Zohocrm.services.BillingService;

@Controller
public class BillingController {

	@Autowired
	private BillingService billingService;

	@RequestMapping("/generate")
	public String generateBill(@ModelAttribute("bill") Billing bill, ModelMap model) {
		billingService.generateOneBill(bill);
		model.addAttribute("bill", bill);

		return "billing_info";
	}

	// 1
	@RequestMapping("/billing")
	public String listAllLeads(ModelMap model) {
		List<Billing> bills = billingService.findAllBills();
		model.addAttribute("bills", bills);
		return "billing_result";
	}
	
}
