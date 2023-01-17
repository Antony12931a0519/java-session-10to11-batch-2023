package com.javasession.bms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasession.bms.dao.PaymentLinksDAO;
import com.javasession.bms.entities.PaymentLinks;
import com.javasession.bms.service.PaymentLinkService;

@Service
public class PaymentLinksServiceImpl implements PaymentLinkService {

	@Autowired
	private PaymentLinksDAO paymanetsLinkDAO;

	@Override
	public List<PaymentLinks> getPaymentsLinkList() {

		List<PaymentLinks> paymentsLinksLst = (List<PaymentLinks>) paymanetsLinkDAO.findAll();

		return paymentsLinksLst;
	}
}
