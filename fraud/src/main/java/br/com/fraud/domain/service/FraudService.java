package br.com.fraud.domain.service;

import br.com.fraud.controller.DTO.FraudDTO;

public interface FraudService {

    Boolean isFraud(Long customerId);
    FraudDTO createFraud(FraudDTO fraudDTO);
}
