package br.com.customer.controller.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerDTO {

    private Long id;
    private String name;
    private String email;
}
