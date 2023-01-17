package com.javasession.bms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javasession.bms.entities.PaymentLinks;

@Repository
public interface  PaymentLinksDAO extends CrudRepository<PaymentLinks, Long> {

}
