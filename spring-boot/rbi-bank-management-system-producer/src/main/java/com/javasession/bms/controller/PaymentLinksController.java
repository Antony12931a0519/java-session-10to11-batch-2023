package com.javasession.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasession.bms.dao.PaymentLinksDAO;
import com.javasession.bms.entities.PaymentLinks;
import com.javasession.bms.service.PaymentLinkService;

@RestController
@RequestMapping("/rbi")
public class PaymentLinksController {
	@Autowired
	private PaymentLinkService paymentLinkService;

	@Autowired
	private PaymentLinksDAO paymentLinksDAO;

	@GetMapping("paymentslinks/list")
	public List<PaymentLinks> getPaymentLinks() {
		return paymentLinkService.getPaymentsLinkList();

	}

	@PostMapping("paymentslinks/add")
	public PaymentLinks createBranch(@RequestBody PaymentLinks paymentLink) {

		return paymentLinksDAO.save(paymentLink);
	}
}
