package com.javasession.bms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.javasession.bms.model.PaymentLinks;
import com.javasession.bms.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<PaymentLinks> getPaymentLinks() {

		ResponseEntity<List> links = restTemplate.getForEntity("http://localhost:8081/rbi/paymentslinks/list",
				List.class);

		return links.getBody();
	}
}
