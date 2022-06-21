package br.com.customer.controller;

import br.com.customer.controller.DTO.CustomerDTO;
import br.com.customer.domain.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Target;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/customers")
public class CustomerController {


    private final CustomerService customerService;

    public CustomerController (CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customerDTO) {
        log.info("Calling controller to create customer");
        return new ResponseEntity<>(this.customerService.createCustomer(customerDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CustomerDTO>> findAllCustomer(){
        return ResponseEntity.ok(customerService.findAllCustomer());
    }
}
