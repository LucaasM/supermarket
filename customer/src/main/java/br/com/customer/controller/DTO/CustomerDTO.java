package br.com.customer.controller.DTO;

import lombok.Builder;

@Builder
public class CustomerDTO {

    private Long id;
    private String name;
    private String email;
}
