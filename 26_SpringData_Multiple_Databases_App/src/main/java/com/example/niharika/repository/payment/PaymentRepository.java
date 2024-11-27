package com.example.niharika.repository.payment;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.niharika.entity.payment.PaymentDetails;

public interface PaymentRepository extends JpaRepository<PaymentDetails,Long>{

}
