package br.com.customer.controller;

import br.com.customer.controller.DTO.CustomerDTO;
import br.com.customer.domain.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController (CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void createCustomer(@RequestBody CustomerDTO customerDTO) {
        log.info("Calling controller to create customer {}", customerDTO);

        this.customerService.createCustomer(customerDTO);
    }
}
