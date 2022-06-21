package br.com.customer.domain.service;

import br.com.customer.controller.DTO.CustomerDTO;
import br.com.customer.domain.entity.CustomerEntity;
import br.com.customer.domain.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository repository;
    private final ModelMapper modelMapper;

    public CustomerServiceImpl (CustomerRepository customerRepository, ModelMapper modelMapper) {
        this.repository = customerRepository;
        this.modelMapper = modelMapper;
    }

    public CustomerDTO createCustomer (CustomerDTO customerDTO) {
        log.info("Calling the method to create customer");

        CustomerEntity customerEntity = modelMapper.map(customerDTO, CustomerEntity.class);
        repository.save(customerEntity);
        return modelMapper.map(repository.save(customerEntity), CustomerDTO.class);
    }

    public List<CustomerDTO> findAllCustomer() {
        return repository.findAll().stream().map(
                customerEntity -> modelMapper.map(customerEntity, CustomerDTO.class)).collect(Collectors.toList());
    }
}
