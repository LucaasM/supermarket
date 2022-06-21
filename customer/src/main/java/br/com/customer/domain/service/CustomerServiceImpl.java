package br.com.customer.domain.service;

import br.com.customer.controller.DTO.CustomerDTO;
import br.com.customer.domain.entity.CustomerEntity;
import br.com.customer.domain.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository repository;
    private final ModelMapper modelMapper;

    public CustomerServiceImpl (CustomerRepository customerRepository, ModelMapper modelMapper) {
        this.repository = customerRepository;
        this.modelMapper = modelMapper;
    }

    public void createCustomer (CustomerDTO customerDTO) {
        log.info("Calling the method to create customer {}", customerDTO);

        CustomerEntity customerEntity = modelMapper.map(customerDTO, CustomerEntity.class);
        repository.save(customerEntity);
    }
}
