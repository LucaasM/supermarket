package br.com.customer.domain.service;

import br.com.customer.controller.DTO.CustomerDTO;

import java.util.List;

public interface CustomerService {

    CustomerDTO createCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> findAllCustomer();
}
